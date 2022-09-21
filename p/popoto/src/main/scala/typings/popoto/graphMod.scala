package typings.popoto

import org.scalablytyped.runtime.StringDictionary
import typings.d3.mod.Voronoi
import typings.d3Force.mod.Simulation
import typings.d3Force.mod.SimulationNodeDatum
import typings.d3Selection.mod.Selection_
import typings.d3Zoom.mod.ZoomBehavior
import typings.popoto.anon.GRAPHNODEADDVALUE
import typings.std.Element
import typings.std.SVGDefsElement
import typings.std.SVGElement
import typings.std.SVGGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object graphMod {
  
  trait Graph extends StObject {
    
    var CHARGE: Double
    
    var DISABLE_COUNT: Boolean
    
    var DISABLE_RELATION: Boolean
    
    /**
      * Define the list of listenable events on graph.
      */
    var Events: GRAPHNODEADDVALUE
    
    var USE_DONUT_FORCE: Boolean
    
    var USE_FIT_TEXT: Boolean
    
    var USE_VORONOI_LAYOUT: Boolean
    
    var WHEEL_ZOOM_ENABLED: Boolean
    
    /**
      *
      * @param n
      * @param l
      * @param callback
      * @param values
      * @param isNegative
      */
    def addRelationshipData(n: Any, l: Any, callback: js.Function0[Unit], values: js.Array[Any], isNegative: Boolean): Unit
    
    /**
      * Adds graph root nodes using the label set as parameter.
      * All the other nodes should have been removed first to avoid inconsistent data.
      *
      * @param label label of the node to add as root.
      */
    def addRootNode(label: String): Unit
    
    /**
      * Adds a complete graph from schema.
      * All the other nodes should have been removed first to avoid inconsistent data.
      *
      * @param graphSchema schema of the graph to add.
      */
    def addSchema(graphSchema: GraphSchema): Unit
    
    def addSchemaNode(
      nodeSchema: NodeSchema,
      parentNode: Node,
      index: Double,
      parentLinkTotalCount: Double,
      parentRel: js.Array[Any]
    ): Unit
    
    def addSchemaRelation(
      relationSchema: GraphSchemaRelation,
      parentNode: Node,
      linkIndex: Double,
      parentLinkTotalCount: Double
    ): Unit
    
    def centerRootNode(): Unit
    
    /**
      * Compute the angle in radian between the node and its parent.
      *
      * @param n node to compute angle.
      * @returns angle in radian.
      */
    def computeParentAngle(n: Node): Double
    
    /**
      * ID of the HTML component where the graph query builder elements will be generated in.
      */
    var containerId: String
    
    /**
      *  Create the D3.js force simultation for the graph query builder.
      */
    def createForceLayout(): Unit
    
    /**
      * Generates all the HTML and SVG element needed to display the graph query builder.
      * Everything will be generated in the container with id defined by graph.containerId.
      */
    def createGraphArea(): Unit
    
    var force: Simulation[SimulationNodeDatum, Unit]
    
    def getRootNode(): Node
    
    /**
      * Get the actual height of the SVG element containing the graph query builder.
      * @returns svg height
      */
    def getSVGHeight(): Double
    
    /**
      * Get the actual width of the SVG element containing the graph query builder.
      * @returns svg width
      */
    def getSVGWidth(): Double
    
    /**
      * Get the current schema of the graph.
      * @returns graph schema
      */
    def getSchema(): GraphSchema
    
    var hasGraphChanged: Boolean
    
    var ignoreCount: Boolean
    
    var link: Link
    
    var listerners: StringDictionary[js.Array[js.Function0[Unit]]]
    
    def loadSchema(graphToLoad: GraphSchema): Unit
    
    def loadSchemaNode(
      nodeSchema: NodeSchema,
      parentNode: Node,
      index: Double,
      parentLinkTotalCount: Double,
      parentRel: js.Array[Any],
      isReverse: Boolean
    ): Unit
    
    def loadSchemaRelation(
      relationSchema: GraphSchemaRelation,
      parentNode: Node,
      linkIndex: Double,
      parentLinkTotalCount: Double
    ): Unit
    
    var node: Node
    
    /**
      * Notify the listeners.
      *
      * @param event
      * @param parametersArray
      */
    def notifyListeners(event: String, parametersArray: js.Array[Any]): Unit
    
    /**
      * Add a listener to the specified event.
      *
      * @param event name of the event to add the listener.
      * @param listener the listener to add.
      */
    def on(event: String, listener: js.Function0[Unit]): Unit
    
    /**
      * Add a listener on graph reset event.
      * @param listener
      */
    def onReset(listener: js.Function0[Unit]): Unit
    
    /**
      * Add a listener on graph save event.
      * @param listener
      */
    def onSave(listener: js.Function0[Unit]): Unit
    
    def recenterVoronoi(nodes: js.Array[Node]): js.Array[js.Tuple2[Double, Double]]
    
    /**
      * Function to call on SVG zoom event to update the svg transform attribute.
      */
    def rescale(): Unit
    
    /**
      * Set default graph to a predefined value.
      * @param graph
      */
    def setDefaultGraph(graph: Graph): Unit
    
    var svg: SVGGElement
    
    var svgTag: SVGElement
    
    var svgdefs: SVGDefsElement
    
    /**
      * Function to call on D3.js force layout tick event.
      * This function will update the position of all links and nodes elements in the graph with the force layout computed coordinate.
      */
    def tick(): Unit
    
    var voronoi: Voronoi[Any]
    
    /**
      * Applies this zoom behavior to the specified selection, binding the necessary event listeners to
      * allow panning and zooming, and initializing the zoom transform on each selected element to the identity transform if not already defined. This function is typically not invoked directly,
      * and is instead invoked via selection.call.
      *
      * For details see: {@link https://github.com/d3/d3-zoom#_zoom}
      *
      * @param selection A D3 selection of elements.
      * @param args Optional arguments to be passed in.
      */
    def zoom(selection: Selection_[Element, Any, Any, Any], args: Any*): Unit
    @JSName("zoom")
    var zoom_Original: ZoomBehavior[Element, Any]
  }
  object Graph {
    
    inline def apply(
      CHARGE: Double,
      DISABLE_COUNT: Boolean,
      DISABLE_RELATION: Boolean,
      Events: GRAPHNODEADDVALUE,
      USE_DONUT_FORCE: Boolean,
      USE_FIT_TEXT: Boolean,
      USE_VORONOI_LAYOUT: Boolean,
      WHEEL_ZOOM_ENABLED: Boolean,
      addRelationshipData: (Any, Any, js.Function0[Unit], js.Array[Any], Boolean) => Unit,
      addRootNode: String => Unit,
      addSchema: GraphSchema => Unit,
      addSchemaNode: (NodeSchema, Node, Double, Double, js.Array[Any]) => Unit,
      addSchemaRelation: (GraphSchemaRelation, Node, Double, Double) => Unit,
      centerRootNode: () => Unit,
      computeParentAngle: Node => Double,
      containerId: String,
      createForceLayout: () => Unit,
      createGraphArea: () => Unit,
      force: Simulation[SimulationNodeDatum, Unit],
      getRootNode: () => Node,
      getSVGHeight: () => Double,
      getSVGWidth: () => Double,
      getSchema: () => GraphSchema,
      hasGraphChanged: Boolean,
      ignoreCount: Boolean,
      link: Link,
      listerners: StringDictionary[js.Array[js.Function0[Unit]]],
      loadSchema: GraphSchema => Unit,
      loadSchemaNode: (NodeSchema, Node, Double, Double, js.Array[Any], Boolean) => Unit,
      loadSchemaRelation: (GraphSchemaRelation, Node, Double, Double) => Unit,
      node: Node,
      notifyListeners: (String, js.Array[Any]) => Unit,
      on: (String, js.Function0[Unit]) => Unit,
      onReset: js.Function0[Unit] => Unit,
      onSave: js.Function0[Unit] => Unit,
      recenterVoronoi: js.Array[Node] => js.Array[js.Tuple2[Double, Double]],
      rescale: () => Unit,
      setDefaultGraph: Graph => Unit,
      svg: SVGGElement,
      svgTag: SVGElement,
      svgdefs: SVGDefsElement,
      tick: () => Unit,
      voronoi: Voronoi[Any],
      zoom: ZoomBehavior[Element, Any]
    ): Graph = {
      val __obj = js.Dynamic.literal(CHARGE = CHARGE.asInstanceOf[js.Any], DISABLE_COUNT = DISABLE_COUNT.asInstanceOf[js.Any], DISABLE_RELATION = DISABLE_RELATION.asInstanceOf[js.Any], Events = Events.asInstanceOf[js.Any], USE_DONUT_FORCE = USE_DONUT_FORCE.asInstanceOf[js.Any], USE_FIT_TEXT = USE_FIT_TEXT.asInstanceOf[js.Any], USE_VORONOI_LAYOUT = USE_VORONOI_LAYOUT.asInstanceOf[js.Any], WHEEL_ZOOM_ENABLED = WHEEL_ZOOM_ENABLED.asInstanceOf[js.Any], addRelationshipData = js.Any.fromFunction5(addRelationshipData), addRootNode = js.Any.fromFunction1(addRootNode), addSchema = js.Any.fromFunction1(addSchema), addSchemaNode = js.Any.fromFunction5(addSchemaNode), addSchemaRelation = js.Any.fromFunction4(addSchemaRelation), centerRootNode = js.Any.fromFunction0(centerRootNode), computeParentAngle = js.Any.fromFunction1(computeParentAngle), containerId = containerId.asInstanceOf[js.Any], createForceLayout = js.Any.fromFunction0(createForceLayout), createGraphArea = js.Any.fromFunction0(createGraphArea), force = force.asInstanceOf[js.Any], getRootNode = js.Any.fromFunction0(getRootNode), getSVGHeight = js.Any.fromFunction0(getSVGHeight), getSVGWidth = js.Any.fromFunction0(getSVGWidth), getSchema = js.Any.fromFunction0(getSchema), hasGraphChanged = hasGraphChanged.asInstanceOf[js.Any], ignoreCount = ignoreCount.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], listerners = listerners.asInstanceOf[js.Any], loadSchema = js.Any.fromFunction1(loadSchema), loadSchemaNode = js.Any.fromFunction6(loadSchemaNode), loadSchemaRelation = js.Any.fromFunction4(loadSchemaRelation), node = node.asInstanceOf[js.Any], notifyListeners = js.Any.fromFunction2(notifyListeners), on = js.Any.fromFunction2(on), onReset = js.Any.fromFunction1(onReset), onSave = js.Any.fromFunction1(onSave), recenterVoronoi = js.Any.fromFunction1(recenterVoronoi), rescale = js.Any.fromFunction0(rescale), setDefaultGraph = js.Any.fromFunction1(setDefaultGraph), svg = svg.asInstanceOf[js.Any], svgTag = svgTag.asInstanceOf[js.Any], svgdefs = svgdefs.asInstanceOf[js.Any], tick = js.Any.fromFunction0(tick), voronoi = voronoi.asInstanceOf[js.Any], zoom = zoom.asInstanceOf[js.Any])
      __obj.asInstanceOf[Graph]
    }
    
    extension [Self <: Graph](x: Self) {
      
      inline def setAddRelationshipData(value: (Any, Any, js.Function0[Unit], js.Array[Any], Boolean) => Unit): Self = StObject.set(x, "addRelationshipData", js.Any.fromFunction5(value))
      
      inline def setAddRootNode(value: String => Unit): Self = StObject.set(x, "addRootNode", js.Any.fromFunction1(value))
      
      inline def setAddSchema(value: GraphSchema => Unit): Self = StObject.set(x, "addSchema", js.Any.fromFunction1(value))
      
      inline def setAddSchemaNode(value: (NodeSchema, Node, Double, Double, js.Array[Any]) => Unit): Self = StObject.set(x, "addSchemaNode", js.Any.fromFunction5(value))
      
      inline def setAddSchemaRelation(value: (GraphSchemaRelation, Node, Double, Double) => Unit): Self = StObject.set(x, "addSchemaRelation", js.Any.fromFunction4(value))
      
      inline def setCHARGE(value: Double): Self = StObject.set(x, "CHARGE", value.asInstanceOf[js.Any])
      
      inline def setCenterRootNode(value: () => Unit): Self = StObject.set(x, "centerRootNode", js.Any.fromFunction0(value))
      
      inline def setComputeParentAngle(value: Node => Double): Self = StObject.set(x, "computeParentAngle", js.Any.fromFunction1(value))
      
      inline def setContainerId(value: String): Self = StObject.set(x, "containerId", value.asInstanceOf[js.Any])
      
      inline def setCreateForceLayout(value: () => Unit): Self = StObject.set(x, "createForceLayout", js.Any.fromFunction0(value))
      
      inline def setCreateGraphArea(value: () => Unit): Self = StObject.set(x, "createGraphArea", js.Any.fromFunction0(value))
      
      inline def setDISABLE_COUNT(value: Boolean): Self = StObject.set(x, "DISABLE_COUNT", value.asInstanceOf[js.Any])
      
      inline def setDISABLE_RELATION(value: Boolean): Self = StObject.set(x, "DISABLE_RELATION", value.asInstanceOf[js.Any])
      
      inline def setEvents(value: GRAPHNODEADDVALUE): Self = StObject.set(x, "Events", value.asInstanceOf[js.Any])
      
      inline def setForce(value: Simulation[SimulationNodeDatum, Unit]): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
      
      inline def setGetRootNode(value: () => Node): Self = StObject.set(x, "getRootNode", js.Any.fromFunction0(value))
      
      inline def setGetSVGHeight(value: () => Double): Self = StObject.set(x, "getSVGHeight", js.Any.fromFunction0(value))
      
      inline def setGetSVGWidth(value: () => Double): Self = StObject.set(x, "getSVGWidth", js.Any.fromFunction0(value))
      
      inline def setGetSchema(value: () => GraphSchema): Self = StObject.set(x, "getSchema", js.Any.fromFunction0(value))
      
      inline def setHasGraphChanged(value: Boolean): Self = StObject.set(x, "hasGraphChanged", value.asInstanceOf[js.Any])
      
      inline def setIgnoreCount(value: Boolean): Self = StObject.set(x, "ignoreCount", value.asInstanceOf[js.Any])
      
      inline def setLink(value: Link): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
      
      inline def setListerners(value: StringDictionary[js.Array[js.Function0[Unit]]]): Self = StObject.set(x, "listerners", value.asInstanceOf[js.Any])
      
      inline def setLoadSchema(value: GraphSchema => Unit): Self = StObject.set(x, "loadSchema", js.Any.fromFunction1(value))
      
      inline def setLoadSchemaNode(value: (NodeSchema, Node, Double, Double, js.Array[Any], Boolean) => Unit): Self = StObject.set(x, "loadSchemaNode", js.Any.fromFunction6(value))
      
      inline def setLoadSchemaRelation(value: (GraphSchemaRelation, Node, Double, Double) => Unit): Self = StObject.set(x, "loadSchemaRelation", js.Any.fromFunction4(value))
      
      inline def setNode(value: Node): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      inline def setNotifyListeners(value: (String, js.Array[Any]) => Unit): Self = StObject.set(x, "notifyListeners", js.Any.fromFunction2(value))
      
      inline def setOn(value: (String, js.Function0[Unit]) => Unit): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
      
      inline def setOnReset(value: js.Function0[Unit] => Unit): Self = StObject.set(x, "onReset", js.Any.fromFunction1(value))
      
      inline def setOnSave(value: js.Function0[Unit] => Unit): Self = StObject.set(x, "onSave", js.Any.fromFunction1(value))
      
      inline def setRecenterVoronoi(value: js.Array[Node] => js.Array[js.Tuple2[Double, Double]]): Self = StObject.set(x, "recenterVoronoi", js.Any.fromFunction1(value))
      
      inline def setRescale(value: () => Unit): Self = StObject.set(x, "rescale", js.Any.fromFunction0(value))
      
      inline def setSetDefaultGraph(value: Graph => Unit): Self = StObject.set(x, "setDefaultGraph", js.Any.fromFunction1(value))
      
      inline def setSvg(value: SVGGElement): Self = StObject.set(x, "svg", value.asInstanceOf[js.Any])
      
      inline def setSvgTag(value: SVGElement): Self = StObject.set(x, "svgTag", value.asInstanceOf[js.Any])
      
      inline def setSvgdefs(value: SVGDefsElement): Self = StObject.set(x, "svgdefs", value.asInstanceOf[js.Any])
      
      inline def setTick(value: () => Unit): Self = StObject.set(x, "tick", js.Any.fromFunction0(value))
      
      inline def setUSE_DONUT_FORCE(value: Boolean): Self = StObject.set(x, "USE_DONUT_FORCE", value.asInstanceOf[js.Any])
      
      inline def setUSE_FIT_TEXT(value: Boolean): Self = StObject.set(x, "USE_FIT_TEXT", value.asInstanceOf[js.Any])
      
      inline def setUSE_VORONOI_LAYOUT(value: Boolean): Self = StObject.set(x, "USE_VORONOI_LAYOUT", value.asInstanceOf[js.Any])
      
      inline def setVoronoi(value: Voronoi[Any]): Self = StObject.set(x, "voronoi", value.asInstanceOf[js.Any])
      
      inline def setWHEEL_ZOOM_ENABLED(value: Boolean): Self = StObject.set(x, "WHEEL_ZOOM_ENABLED", value.asInstanceOf[js.Any])
      
      inline def setZoom(value: ZoomBehavior[Element, Any]): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
    }
  }
  
  trait GraphSchema extends StObject {
    
    var label: String
    
    var rel: js.Array[Any]
    
    var value: js.Array[Any]
  }
  object GraphSchema {
    
    inline def apply(label: String, rel: js.Array[Any], value: js.Array[Any]): GraphSchema = {
      val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], rel = rel.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[GraphSchema]
    }
    
    extension [Self <: GraphSchema](x: Self) {
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setRel(value: js.Array[Any]): Self = StObject.set(x, "rel", value.asInstanceOf[js.Any])
      
      inline def setRelVarargs(value: Any*): Self = StObject.set(x, "rel", js.Array(value*))
      
      inline def setValue(value: js.Array[Any]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueVarargs(value: Any*): Self = StObject.set(x, "value", js.Array(value*))
    }
  }
  
  trait GraphSchemaRelation extends StObject {
    
    var isReverse: Boolean
    
    var label: String
    
    var rel: js.Array[Any]
    
    var target: Any
  }
  object GraphSchemaRelation {
    
    inline def apply(isReverse: Boolean, label: String, rel: js.Array[Any], target: Any): GraphSchemaRelation = {
      val __obj = js.Dynamic.literal(isReverse = isReverse.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], rel = rel.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[GraphSchemaRelation]
    }
    
    extension [Self <: GraphSchemaRelation](x: Self) {
      
      inline def setIsReverse(value: Boolean): Self = StObject.set(x, "isReverse", value.asInstanceOf[js.Any])
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setRel(value: js.Array[Any]): Self = StObject.set(x, "rel", value.asInstanceOf[js.Any])
      
      inline def setRelVarargs(value: Any*): Self = StObject.set(x, "rel", js.Array(value*))
      
      inline def setTarget(value: Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
  
  trait Link extends StObject {
    
    var id: String
    
    var label: String
    
    var source: Node
    
    var target: Node
    
    var `type`: Double
  }
  object Link {
    
    inline def apply(id: String, label: String, source: Node, target: Node, `type`: Double): Link = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Link]
    }
    
    extension [Self <: Link](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setSource(value: Node): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setTarget(value: Node): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Node extends StObject {
    
    var fixed: Boolean
    
    var fx: Double
    
    var fy: Double
    
    var id: String
    
    var internalLabel: String
    
    var isAutoLoadValue: Boolean
    
    var label: String
    
    var parent: Node
    
    var parentRel: js.Array[Any]
    
    var relationships: js.Array[Any]
    
    var tx: Double
    
    var ty: Double
    
    var `type`: Double
    
    var x: Double
    
    var y: Double
  }
  object Node {
    
    inline def apply(
      fixed: Boolean,
      fx: Double,
      fy: Double,
      id: String,
      internalLabel: String,
      isAutoLoadValue: Boolean,
      label: String,
      parent: Node,
      parentRel: js.Array[Any],
      relationships: js.Array[Any],
      tx: Double,
      ty: Double,
      `type`: Double,
      x: Double,
      y: Double
    ): Node = {
      val __obj = js.Dynamic.literal(fixed = fixed.asInstanceOf[js.Any], fx = fx.asInstanceOf[js.Any], fy = fy.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], internalLabel = internalLabel.asInstanceOf[js.Any], isAutoLoadValue = isAutoLoadValue.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], parentRel = parentRel.asInstanceOf[js.Any], relationships = relationships.asInstanceOf[js.Any], tx = tx.asInstanceOf[js.Any], ty = ty.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Node]
    }
    
    extension [Self <: Node](x: Self) {
      
      inline def setFixed(value: Boolean): Self = StObject.set(x, "fixed", value.asInstanceOf[js.Any])
      
      inline def setFx(value: Double): Self = StObject.set(x, "fx", value.asInstanceOf[js.Any])
      
      inline def setFy(value: Double): Self = StObject.set(x, "fy", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setInternalLabel(value: String): Self = StObject.set(x, "internalLabel", value.asInstanceOf[js.Any])
      
      inline def setIsAutoLoadValue(value: Boolean): Self = StObject.set(x, "isAutoLoadValue", value.asInstanceOf[js.Any])
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setParent(value: Node): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      inline def setParentRel(value: js.Array[Any]): Self = StObject.set(x, "parentRel", value.asInstanceOf[js.Any])
      
      inline def setParentRelVarargs(value: Any*): Self = StObject.set(x, "parentRel", js.Array(value*))
      
      inline def setRelationships(value: js.Array[Any]): Self = StObject.set(x, "relationships", value.asInstanceOf[js.Any])
      
      inline def setRelationshipsVarargs(value: Any*): Self = StObject.set(x, "relationships", js.Array(value*))
      
      inline def setTx(value: Double): Self = StObject.set(x, "tx", value.asInstanceOf[js.Any])
      
      inline def setTy(value: Double): Self = StObject.set(x, "ty", value.asInstanceOf[js.Any])
      
      inline def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  trait NodeSchema extends StObject {
    
    var isNegative: Boolean
    
    var label: String
    
    var value: js.Array[Any]
  }
  object NodeSchema {
    
    inline def apply(isNegative: Boolean, label: String, value: js.Array[Any]): NodeSchema = {
      val __obj = js.Dynamic.literal(isNegative = isNegative.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[NodeSchema]
    }
    
    extension [Self <: NodeSchema](x: Self) {
      
      inline def setIsNegative(value: Boolean): Self = StObject.set(x, "isNegative", value.asInstanceOf[js.Any])
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setValue(value: js.Array[Any]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueVarargs(value: Any*): Self = StObject.set(x, "value", js.Array(value*))
    }
  }
}
