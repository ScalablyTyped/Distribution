package typings.popoto

import org.scalablytyped.runtime.StringDictionary
import typings.d3Shape.mod.PieArcDatum
import typings.d3Shape.mod.Pie_
import typings.popoto.anon.H
import typings.popoto.anon.ReadonlyROOT0CHOOSE0VALUE
import typings.std.SVGGElement
import typings.std.ThisType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeMod {
  
  trait Node extends StObject {
    
    // Count box default size
    var CountBox: H
    
    var DONUTS_MARGIN: Double
    
    var DONUT_WIDTH: Double
    
    var NODE_MAX_CHARS: Double
    
    var NODE_TITLE_MAX_CHARS: Double
    
    // Number of nodes displayed per page during value selection.
    var PAGE_RESIZE: Double
    
    /**
      * Create the background for a new node element.
      * The background of a node is defined by a circle not visible by default (fill-opacity set to 0) but can be used to highlight a node with animation on this attribute.
      * This circle also define the node zone that can receive events like mouse clicks.
      *
      * @param gNewNodeElements
      */
    def addBackgroundElements(gNewNodeElements: SVGGElement): Unit
    
    /**
      * Add in all expanded choose nodes the value containing the specified value for the given attribute.
      * And remove it from the nodes data.
      *
      * @param attribute
      * @param value
      */
    def addExpandedValue(attribute: String, value: Any): Unit
    
    /**
      * Create the node foreground elements.
      * It contains node additional elements, count or tools like navigation arrows.
      *
      * @param gNewNodeElements
      */
    def addForegroundElements(gNewNodeElements: SVGGElement): Unit
    
    /**
      * Create the node main elements.
      *
      * @param gNewNodeElements
      */
    def addMiddlegroundElements(gNewNodeElements: SVGGElement): Unit
    
    /**
      * Add all new elements.
      * Only the skeleton of new nodes are added custom data will be added during the element update phase.
      * Should be called after updateData and before updateElements.
      */
    def addNewElements(enteringData: SVGGElement): Unit
    
    /**
      * Add a list of related value prefixed by a path of nodes.
      * A value is defined with the following structure
      * {
      *   id,
      *   rel,
      *   label
      * }
      *
      * @param n
      * @param relPath
      * @param values
      * @param isNegative
      */
    def addRelatedBranch(n: Node, relPath: js.Array[Node], values: js.Array[Node], isNegative: Boolean): Unit
    
    /**
      * Add a list of related value if not already found in node.
      * A value is defined with the following structure
      * {
      *   id,
      *   rel,
      *   label
      * }
      *
      * @param n
      * @param values
      * @param isNegative
      */
    def addRelatedValues(n: Node, values: js.Array[Node], isNegative: Boolean): Unit
    
    /**
      * Add a value in a node with the given id and the value of the first attribute if found in its data.
      *
      * @param nodeIds a list of node ids where to add the value.
      * @param displayAttributeValue the value to find in data and to add if found
      */
    def addValue(nodeIds: js.Array[String], displayAttributeValue: Any): Boolean
    
    /**
      * Add value in all CHOOSE nodes with specified label.
      *
      * @param label nodes where to insert
      * @param value
      */
    def addValueForLabel(label: String, value: Any): Boolean
    
    /**
      * Function called on choose node click.
      * In this case a query is executed to get all the possible value
      * @param clickedNode
      * TODO optimize with cached data?
      */
    def chooseNodeClick(clickedNode: Node): Unit
    
    // Store choose node state to avoid multiple node expand at the same time
    var chooseWaiting: Boolean
    
    /**
      * Function to add on node event to clear the selection.
      * Call to this function on a node will remove the selected value and trigger a graph update.
      */
    def clearSelection(): Unit
    
    /**
      * Collapse all nodes with value expanded.
      *
      */
    def collapseAllNode(): Unit
    
    /**
      * Remove all the value node directly linked to clicked node.
      *
      * @param clickedNode
      */
    def collapseNode(clickedNode: Node): Unit
    
    /**
      * Function called to expand a node containing values.
      * This function will create the value nodes with the clicked node internal data.
      * Only nodes corresponding to the current page index will be generated.
      *
      * @param clickedNode
      */
    def expandNode(clickedNode: Node): Unit
    
    /**
      * Expands all the relationships available in node.
      *
      * @param n
      * @param callback
      */
    def expandRelationships(n: Node, callback: js.Function0[Unit]): Unit
    
    /**
      * A value is defined with the following structure
      * {
      *   id,
      *   rel,
      *   label
      * }
      *
      * @param n
      * @param values
      */
    def filterExistingValues(n: Node, values: js.Array[Node]): js.Array[Node]
    
    // ID of the g element in SVG graph containing all the link elements.
    var gID: String
    
    /**
      * Create a normalized identifier from a node label.
      * Multiple calls with the same node label will generate different unique identifier.
      *
      * @param nodeLabel
      * @returns normalized identifier from a node label
      */
    def generateInternalLabel(nodeLabel: String): String
    
    /**
      * Return all nodes with isAutoLoadValue property set to true.
      */
    def getAutoLoadValueNodes(): js.Array[Node]
    
    /**
      * Get all nodes that contains a value.
      *
      * @param label If set return only node of this label.
      * @return Array of nodes containing at least one value.
      */
    def getContainingValue(label: String): js.Array[Node]
    
    def getDonutInnerRadius(): Double
    
    def getDonutOuterRadius(): Double
    
    /**
      * Get in the parent nodes the closest one to the root.
      *
      * @param n the node to start from.
      * @return the trunk node or the node in parameters if not found.
      */
    def getTrunkNode(n: Node): Any
    
    /**
      * Get the value in the provided nodeId for a specific value id.
      *
      * @param nodeId
      * @param constraintAttributeValue
      */
    def getValue(nodeId: String, constraintAttributeValue: Any): Any
    
    // Used to generate unique internal labels used for example as identifier in Cypher query.
    var internalLabels: StringDictionary[Double]
    
    /**
      * Fetches the list of relationships of a node and store them in the relationships property.
      *
      * @param n the node to fetch the relationships.
      * @param callback
      * @param directionAngle
      */
    def loadRelationshipData(n: Node, callback: js.Function0[Unit], directionAngle: Double): Unit
    
    /**
      * Handle mouse out event on nodes.
      */
    def mouseOutNode(): Unit
    
    /**
      * Handle the mouse over event on nodes.
      */
    def mouseOverNode(): Unit
    
    /**
      * Handle the click event on nodes.
      */
    def nodeClick(): Unit
    
    /**
      * Defines the list of possible nodes.
      * ROOT: Node used as graph root. It is the target of the query. Only one node of this type should be available in graph.
      * CHOOSE: Nodes defining a generic node label. From these node is is possible to select a value or explore relations.
      * VALUE: Unique node containing a value constraint. Usually replace CHOOSE nodes once a value as been selected.
      * GROUP: Empty node used to group relations. No value can be selected but relations can be explored. These nodes doesn't have count.
      */
    var nodeTypes: ReadonlyROOT0CHOOSE0VALUE
    
    /**
      * Generates a pie for the given array of data, returning an array of objects representing each datum’s arc angles.
      * Any additional arguments are arbitrary; they are simply propagated to the pie generator’s accessor functions along with the this object.
      * The length of the returned array is the same as data, and each element i in the returned array corresponds to the element i in the input data.
      *
      * This representation is designed to work with the arc generator’s default startAngle, endAngle and padAngle accessors.
      * The angular units are arbitrary, but if you plan to use the pie generator in conjunction with an arc generator,
      * you should specify angles in radians, with 0 at -y (12 o’clock) and positive angles proceeding clockwise.
      *
      * @param data Array of data elements.
      */
    def pie(data: js.Array[Double], args: Any*): js.Array[PieArcDatum[Double]]
    @JSName("pie")
    var pie_Original: Pie_[ThisType[Any], Double]
    
    /**
      * Remove old elements.
      * Should be called after updateData.
      */
    def removeElements(exitingData: js.Array[Node]): Unit
    
    /**
      * Remove empty branches containing a node.
      *
      * @param n the node to remove.
      * @return true if node have been removed
      */
    def removeEmptyBranches(n: Node): Boolean
    
    /**
      * Remove in all expanded nodes the value containing the specified value for the given attribute.
      * And move it back to nodes data.
      *
      * @param attribute
      * @param value
      */
    def removeExpandedValue(attribute: String, value: Any): Unit
    
    /**
      * Remove a node and its relationships (recursively) from the graph.
      *
      * @param n the node to remove.
      */
    def removeNode(n: Node): Boolean
    
    /**
      * Remove a value from a node.
      * If the value is not found nothing is done.
      *
      * @param n
      * @param value
      */
    def removeValue(n: Node, value: Any): Boolean
    
    def removeValues(n: Node): Boolean
    
    def segmentClick(d: Any): Unit
    
    /**
      * Update values for nodes having preloadData property
      */
    def updateAutoLoadValues(): Unit
    
    def updateBackgroundElements(): Unit
    
    /**
      * Update nodes and result counts by executing a query for every nodes with the new graph structure.
      */
    def updateCount(): Unit
    
    /**
      * Update node data with changes done in dataModel.nodes model.
      */
    def updateData(): Unit
    
    /**
      * Updates all elements.
      */
    def updateElements(): Unit
    
    /**
      * Updates the foreground elements
      */
    def updateForegroundElements(): Unit
    
    /**
      * Update the middle layer of nodes.
      * TODO refactor node generation to allow future extensions (for example add plugin with new node types...)
      */
    def updateMiddlegroundElements(): Unit
    
    def updateMiddlegroundElementsDisplayedText(middleG: js.Array[Node]): Unit
    
    def updateMiddlegroundElementsImage(gMiddlegroundImageNodes: SVGGElement): Unit
    
    def updateMiddlegroundElementsSVG(gMiddlegroundSVGNodes: SVGGElement): Unit
    
    def updateMiddlegroundElementsSymbol(gMiddlegroundSymbolNodes: SVGGElement): Unit
    
    def updateMiddlegroundElementsText(gMiddlegroundTextNodes: SVGGElement): Unit
    
    def updateMiddlegroundElementsTooltip(middleG: SVGGElement): Unit
    
    /**
      * Update Nodes SVG elements using D3.js update mechanisms.
      */
    def updateNodes(): Unit
    
    /**
      * Function called on a value node click.
      * In this case the value is added in the parent node and all the value nodes are collapsed.
      *
      * @param clickedNode
      */
    def valueNodeClick(clickedNode: Node): Unit
  }
  object Node {
    
    inline def apply(
      CountBox: H,
      DONUTS_MARGIN: Double,
      DONUT_WIDTH: Double,
      NODE_MAX_CHARS: Double,
      NODE_TITLE_MAX_CHARS: Double,
      PAGE_RESIZE: Double,
      addBackgroundElements: SVGGElement => Unit,
      addExpandedValue: (String, Any) => Unit,
      addForegroundElements: SVGGElement => Unit,
      addMiddlegroundElements: SVGGElement => Unit,
      addNewElements: SVGGElement => Unit,
      addRelatedBranch: (Node, js.Array[Node], js.Array[Node], Boolean) => Unit,
      addRelatedValues: (Node, js.Array[Node], Boolean) => Unit,
      addValue: (js.Array[String], Any) => Boolean,
      addValueForLabel: (String, Any) => Boolean,
      chooseNodeClick: Node => Unit,
      chooseWaiting: Boolean,
      clearSelection: () => Unit,
      collapseAllNode: () => Unit,
      collapseNode: Node => Unit,
      expandNode: Node => Unit,
      expandRelationships: (Node, js.Function0[Unit]) => Unit,
      filterExistingValues: (Node, js.Array[Node]) => js.Array[Node],
      gID: String,
      generateInternalLabel: String => String,
      getAutoLoadValueNodes: () => js.Array[Node],
      getContainingValue: String => js.Array[Node],
      getDonutInnerRadius: () => Double,
      getDonutOuterRadius: () => Double,
      getTrunkNode: Node => Any,
      getValue: (String, Any) => Any,
      internalLabels: StringDictionary[Double],
      loadRelationshipData: (Node, js.Function0[Unit], Double) => Unit,
      mouseOutNode: () => Unit,
      mouseOverNode: () => Unit,
      nodeClick: () => Unit,
      nodeTypes: ReadonlyROOT0CHOOSE0VALUE,
      pie: Pie_[ThisType[Any], Double],
      removeElements: js.Array[Node] => Unit,
      removeEmptyBranches: Node => Boolean,
      removeExpandedValue: (String, Any) => Unit,
      removeNode: Node => Boolean,
      removeValue: (Node, Any) => Boolean,
      removeValues: Node => Boolean,
      segmentClick: Any => Unit,
      updateAutoLoadValues: () => Unit,
      updateBackgroundElements: () => Unit,
      updateCount: () => Unit,
      updateData: () => Unit,
      updateElements: () => Unit,
      updateForegroundElements: () => Unit,
      updateMiddlegroundElements: () => Unit,
      updateMiddlegroundElementsDisplayedText: js.Array[Node] => Unit,
      updateMiddlegroundElementsImage: SVGGElement => Unit,
      updateMiddlegroundElementsSVG: SVGGElement => Unit,
      updateMiddlegroundElementsSymbol: SVGGElement => Unit,
      updateMiddlegroundElementsText: SVGGElement => Unit,
      updateMiddlegroundElementsTooltip: SVGGElement => Unit,
      updateNodes: () => Unit,
      valueNodeClick: Node => Unit
    ): Node = {
      val __obj = js.Dynamic.literal(CountBox = CountBox.asInstanceOf[js.Any], DONUTS_MARGIN = DONUTS_MARGIN.asInstanceOf[js.Any], DONUT_WIDTH = DONUT_WIDTH.asInstanceOf[js.Any], NODE_MAX_CHARS = NODE_MAX_CHARS.asInstanceOf[js.Any], NODE_TITLE_MAX_CHARS = NODE_TITLE_MAX_CHARS.asInstanceOf[js.Any], PAGE_RESIZE = PAGE_RESIZE.asInstanceOf[js.Any], addBackgroundElements = js.Any.fromFunction1(addBackgroundElements), addExpandedValue = js.Any.fromFunction2(addExpandedValue), addForegroundElements = js.Any.fromFunction1(addForegroundElements), addMiddlegroundElements = js.Any.fromFunction1(addMiddlegroundElements), addNewElements = js.Any.fromFunction1(addNewElements), addRelatedBranch = js.Any.fromFunction4(addRelatedBranch), addRelatedValues = js.Any.fromFunction3(addRelatedValues), addValue = js.Any.fromFunction2(addValue), addValueForLabel = js.Any.fromFunction2(addValueForLabel), chooseNodeClick = js.Any.fromFunction1(chooseNodeClick), chooseWaiting = chooseWaiting.asInstanceOf[js.Any], clearSelection = js.Any.fromFunction0(clearSelection), collapseAllNode = js.Any.fromFunction0(collapseAllNode), collapseNode = js.Any.fromFunction1(collapseNode), expandNode = js.Any.fromFunction1(expandNode), expandRelationships = js.Any.fromFunction2(expandRelationships), filterExistingValues = js.Any.fromFunction2(filterExistingValues), gID = gID.asInstanceOf[js.Any], generateInternalLabel = js.Any.fromFunction1(generateInternalLabel), getAutoLoadValueNodes = js.Any.fromFunction0(getAutoLoadValueNodes), getContainingValue = js.Any.fromFunction1(getContainingValue), getDonutInnerRadius = js.Any.fromFunction0(getDonutInnerRadius), getDonutOuterRadius = js.Any.fromFunction0(getDonutOuterRadius), getTrunkNode = js.Any.fromFunction1(getTrunkNode), getValue = js.Any.fromFunction2(getValue), internalLabels = internalLabels.asInstanceOf[js.Any], loadRelationshipData = js.Any.fromFunction3(loadRelationshipData), mouseOutNode = js.Any.fromFunction0(mouseOutNode), mouseOverNode = js.Any.fromFunction0(mouseOverNode), nodeClick = js.Any.fromFunction0(nodeClick), nodeTypes = nodeTypes.asInstanceOf[js.Any], pie = pie.asInstanceOf[js.Any], removeElements = js.Any.fromFunction1(removeElements), removeEmptyBranches = js.Any.fromFunction1(removeEmptyBranches), removeExpandedValue = js.Any.fromFunction2(removeExpandedValue), removeNode = js.Any.fromFunction1(removeNode), removeValue = js.Any.fromFunction2(removeValue), removeValues = js.Any.fromFunction1(removeValues), segmentClick = js.Any.fromFunction1(segmentClick), updateAutoLoadValues = js.Any.fromFunction0(updateAutoLoadValues), updateBackgroundElements = js.Any.fromFunction0(updateBackgroundElements), updateCount = js.Any.fromFunction0(updateCount), updateData = js.Any.fromFunction0(updateData), updateElements = js.Any.fromFunction0(updateElements), updateForegroundElements = js.Any.fromFunction0(updateForegroundElements), updateMiddlegroundElements = js.Any.fromFunction0(updateMiddlegroundElements), updateMiddlegroundElementsDisplayedText = js.Any.fromFunction1(updateMiddlegroundElementsDisplayedText), updateMiddlegroundElementsImage = js.Any.fromFunction1(updateMiddlegroundElementsImage), updateMiddlegroundElementsSVG = js.Any.fromFunction1(updateMiddlegroundElementsSVG), updateMiddlegroundElementsSymbol = js.Any.fromFunction1(updateMiddlegroundElementsSymbol), updateMiddlegroundElementsText = js.Any.fromFunction1(updateMiddlegroundElementsText), updateMiddlegroundElementsTooltip = js.Any.fromFunction1(updateMiddlegroundElementsTooltip), updateNodes = js.Any.fromFunction0(updateNodes), valueNodeClick = js.Any.fromFunction1(valueNodeClick))
      __obj.asInstanceOf[Node]
    }
    
    extension [Self <: Node](x: Self) {
      
      inline def setAddBackgroundElements(value: SVGGElement => Unit): Self = StObject.set(x, "addBackgroundElements", js.Any.fromFunction1(value))
      
      inline def setAddExpandedValue(value: (String, Any) => Unit): Self = StObject.set(x, "addExpandedValue", js.Any.fromFunction2(value))
      
      inline def setAddForegroundElements(value: SVGGElement => Unit): Self = StObject.set(x, "addForegroundElements", js.Any.fromFunction1(value))
      
      inline def setAddMiddlegroundElements(value: SVGGElement => Unit): Self = StObject.set(x, "addMiddlegroundElements", js.Any.fromFunction1(value))
      
      inline def setAddNewElements(value: SVGGElement => Unit): Self = StObject.set(x, "addNewElements", js.Any.fromFunction1(value))
      
      inline def setAddRelatedBranch(value: (Node, js.Array[Node], js.Array[Node], Boolean) => Unit): Self = StObject.set(x, "addRelatedBranch", js.Any.fromFunction4(value))
      
      inline def setAddRelatedValues(value: (Node, js.Array[Node], Boolean) => Unit): Self = StObject.set(x, "addRelatedValues", js.Any.fromFunction3(value))
      
      inline def setAddValue(value: (js.Array[String], Any) => Boolean): Self = StObject.set(x, "addValue", js.Any.fromFunction2(value))
      
      inline def setAddValueForLabel(value: (String, Any) => Boolean): Self = StObject.set(x, "addValueForLabel", js.Any.fromFunction2(value))
      
      inline def setChooseNodeClick(value: Node => Unit): Self = StObject.set(x, "chooseNodeClick", js.Any.fromFunction1(value))
      
      inline def setChooseWaiting(value: Boolean): Self = StObject.set(x, "chooseWaiting", value.asInstanceOf[js.Any])
      
      inline def setClearSelection(value: () => Unit): Self = StObject.set(x, "clearSelection", js.Any.fromFunction0(value))
      
      inline def setCollapseAllNode(value: () => Unit): Self = StObject.set(x, "collapseAllNode", js.Any.fromFunction0(value))
      
      inline def setCollapseNode(value: Node => Unit): Self = StObject.set(x, "collapseNode", js.Any.fromFunction1(value))
      
      inline def setCountBox(value: H): Self = StObject.set(x, "CountBox", value.asInstanceOf[js.Any])
      
      inline def setDONUTS_MARGIN(value: Double): Self = StObject.set(x, "DONUTS_MARGIN", value.asInstanceOf[js.Any])
      
      inline def setDONUT_WIDTH(value: Double): Self = StObject.set(x, "DONUT_WIDTH", value.asInstanceOf[js.Any])
      
      inline def setExpandNode(value: Node => Unit): Self = StObject.set(x, "expandNode", js.Any.fromFunction1(value))
      
      inline def setExpandRelationships(value: (Node, js.Function0[Unit]) => Unit): Self = StObject.set(x, "expandRelationships", js.Any.fromFunction2(value))
      
      inline def setFilterExistingValues(value: (Node, js.Array[Node]) => js.Array[Node]): Self = StObject.set(x, "filterExistingValues", js.Any.fromFunction2(value))
      
      inline def setGID(value: String): Self = StObject.set(x, "gID", value.asInstanceOf[js.Any])
      
      inline def setGenerateInternalLabel(value: String => String): Self = StObject.set(x, "generateInternalLabel", js.Any.fromFunction1(value))
      
      inline def setGetAutoLoadValueNodes(value: () => js.Array[Node]): Self = StObject.set(x, "getAutoLoadValueNodes", js.Any.fromFunction0(value))
      
      inline def setGetContainingValue(value: String => js.Array[Node]): Self = StObject.set(x, "getContainingValue", js.Any.fromFunction1(value))
      
      inline def setGetDonutInnerRadius(value: () => Double): Self = StObject.set(x, "getDonutInnerRadius", js.Any.fromFunction0(value))
      
      inline def setGetDonutOuterRadius(value: () => Double): Self = StObject.set(x, "getDonutOuterRadius", js.Any.fromFunction0(value))
      
      inline def setGetTrunkNode(value: Node => Any): Self = StObject.set(x, "getTrunkNode", js.Any.fromFunction1(value))
      
      inline def setGetValue(value: (String, Any) => Any): Self = StObject.set(x, "getValue", js.Any.fromFunction2(value))
      
      inline def setInternalLabels(value: StringDictionary[Double]): Self = StObject.set(x, "internalLabels", value.asInstanceOf[js.Any])
      
      inline def setLoadRelationshipData(value: (Node, js.Function0[Unit], Double) => Unit): Self = StObject.set(x, "loadRelationshipData", js.Any.fromFunction3(value))
      
      inline def setMouseOutNode(value: () => Unit): Self = StObject.set(x, "mouseOutNode", js.Any.fromFunction0(value))
      
      inline def setMouseOverNode(value: () => Unit): Self = StObject.set(x, "mouseOverNode", js.Any.fromFunction0(value))
      
      inline def setNODE_MAX_CHARS(value: Double): Self = StObject.set(x, "NODE_MAX_CHARS", value.asInstanceOf[js.Any])
      
      inline def setNODE_TITLE_MAX_CHARS(value: Double): Self = StObject.set(x, "NODE_TITLE_MAX_CHARS", value.asInstanceOf[js.Any])
      
      inline def setNodeClick(value: () => Unit): Self = StObject.set(x, "nodeClick", js.Any.fromFunction0(value))
      
      inline def setNodeTypes(value: ReadonlyROOT0CHOOSE0VALUE): Self = StObject.set(x, "nodeTypes", value.asInstanceOf[js.Any])
      
      inline def setPAGE_RESIZE(value: Double): Self = StObject.set(x, "PAGE_RESIZE", value.asInstanceOf[js.Any])
      
      inline def setPie(value: Pie_[ThisType[Any], Double]): Self = StObject.set(x, "pie", value.asInstanceOf[js.Any])
      
      inline def setRemoveElements(value: js.Array[Node] => Unit): Self = StObject.set(x, "removeElements", js.Any.fromFunction1(value))
      
      inline def setRemoveEmptyBranches(value: Node => Boolean): Self = StObject.set(x, "removeEmptyBranches", js.Any.fromFunction1(value))
      
      inline def setRemoveExpandedValue(value: (String, Any) => Unit): Self = StObject.set(x, "removeExpandedValue", js.Any.fromFunction2(value))
      
      inline def setRemoveNode(value: Node => Boolean): Self = StObject.set(x, "removeNode", js.Any.fromFunction1(value))
      
      inline def setRemoveValue(value: (Node, Any) => Boolean): Self = StObject.set(x, "removeValue", js.Any.fromFunction2(value))
      
      inline def setRemoveValues(value: Node => Boolean): Self = StObject.set(x, "removeValues", js.Any.fromFunction1(value))
      
      inline def setSegmentClick(value: Any => Unit): Self = StObject.set(x, "segmentClick", js.Any.fromFunction1(value))
      
      inline def setUpdateAutoLoadValues(value: () => Unit): Self = StObject.set(x, "updateAutoLoadValues", js.Any.fromFunction0(value))
      
      inline def setUpdateBackgroundElements(value: () => Unit): Self = StObject.set(x, "updateBackgroundElements", js.Any.fromFunction0(value))
      
      inline def setUpdateCount(value: () => Unit): Self = StObject.set(x, "updateCount", js.Any.fromFunction0(value))
      
      inline def setUpdateData(value: () => Unit): Self = StObject.set(x, "updateData", js.Any.fromFunction0(value))
      
      inline def setUpdateElements(value: () => Unit): Self = StObject.set(x, "updateElements", js.Any.fromFunction0(value))
      
      inline def setUpdateForegroundElements(value: () => Unit): Self = StObject.set(x, "updateForegroundElements", js.Any.fromFunction0(value))
      
      inline def setUpdateMiddlegroundElements(value: () => Unit): Self = StObject.set(x, "updateMiddlegroundElements", js.Any.fromFunction0(value))
      
      inline def setUpdateMiddlegroundElementsDisplayedText(value: js.Array[Node] => Unit): Self = StObject.set(x, "updateMiddlegroundElementsDisplayedText", js.Any.fromFunction1(value))
      
      inline def setUpdateMiddlegroundElementsImage(value: SVGGElement => Unit): Self = StObject.set(x, "updateMiddlegroundElementsImage", js.Any.fromFunction1(value))
      
      inline def setUpdateMiddlegroundElementsSVG(value: SVGGElement => Unit): Self = StObject.set(x, "updateMiddlegroundElementsSVG", js.Any.fromFunction1(value))
      
      inline def setUpdateMiddlegroundElementsSymbol(value: SVGGElement => Unit): Self = StObject.set(x, "updateMiddlegroundElementsSymbol", js.Any.fromFunction1(value))
      
      inline def setUpdateMiddlegroundElementsText(value: SVGGElement => Unit): Self = StObject.set(x, "updateMiddlegroundElementsText", js.Any.fromFunction1(value))
      
      inline def setUpdateMiddlegroundElementsTooltip(value: SVGGElement => Unit): Self = StObject.set(x, "updateMiddlegroundElementsTooltip", js.Any.fromFunction1(value))
      
      inline def setUpdateNodes(value: () => Unit): Self = StObject.set(x, "updateNodes", js.Any.fromFunction0(value))
      
      inline def setValueNodeClick(value: Node => Unit): Self = StObject.set(x, "valueNodeClick", js.Any.fromFunction1(value))
    }
  }
}
