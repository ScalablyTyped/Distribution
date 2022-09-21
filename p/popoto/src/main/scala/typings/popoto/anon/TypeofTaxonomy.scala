package typings.popoto.anon

import typings.popoto.graphMod.Node
import typings.std.Element
import typings.std.SVGGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofTaxonomy extends StObject {
  
  /**
    * Add children providers data.
    * @param parentData
    * @param id
    */
  def addChildrenData(parentData: Node, id: Double): Double
  
  /**
    * Recursively generate the taxonomy children elements.
    *
    * @param selection
    */
  def addTaxonomyChildren(selection: js.Array[Element]): Unit
  
  val containerId: String
  
  /**
    * Create the taxonomy panel HTML elements.
    */
  def createTaxonomyPanel(): Unit
  
  /**
    * Recursive function to flatten data content.
    */
  def flattenChildren(d: SVGGElement, vals: js.Array[Any]): Unit
  
  /**
    * Parse the list of label providers and return a list of data object containing only searchable labels.
    * @returns Array
    */
  def generateTaxonomiesData(): js.Array[Any]
  
  def onClick(): Unit
  
  /**
    * Updates the count number on a taxonomy.
    *
    * @param taxonomyData
    */
  def updateCount(taxonomyData: js.Array[Any]): Unit
}
object TypeofTaxonomy {
  
  inline def apply(
    addChildrenData: (Node, Double) => Double,
    addTaxonomyChildren: js.Array[Element] => Unit,
    containerId: String,
    createTaxonomyPanel: () => Unit,
    flattenChildren: (SVGGElement, js.Array[Any]) => Unit,
    generateTaxonomiesData: () => js.Array[Any],
    onClick: () => Unit,
    updateCount: js.Array[Any] => Unit
  ): TypeofTaxonomy = {
    val __obj = js.Dynamic.literal(addChildrenData = js.Any.fromFunction2(addChildrenData), addTaxonomyChildren = js.Any.fromFunction1(addTaxonomyChildren), containerId = containerId.asInstanceOf[js.Any], createTaxonomyPanel = js.Any.fromFunction0(createTaxonomyPanel), flattenChildren = js.Any.fromFunction2(flattenChildren), generateTaxonomiesData = js.Any.fromFunction0(generateTaxonomiesData), onClick = js.Any.fromFunction0(onClick), updateCount = js.Any.fromFunction1(updateCount))
    __obj.asInstanceOf[TypeofTaxonomy]
  }
  
  extension [Self <: TypeofTaxonomy](x: Self) {
    
    inline def setAddChildrenData(value: (Node, Double) => Double): Self = StObject.set(x, "addChildrenData", js.Any.fromFunction2(value))
    
    inline def setAddTaxonomyChildren(value: js.Array[Element] => Unit): Self = StObject.set(x, "addTaxonomyChildren", js.Any.fromFunction1(value))
    
    inline def setContainerId(value: String): Self = StObject.set(x, "containerId", value.asInstanceOf[js.Any])
    
    inline def setCreateTaxonomyPanel(value: () => Unit): Self = StObject.set(x, "createTaxonomyPanel", js.Any.fromFunction0(value))
    
    inline def setFlattenChildren(value: (SVGGElement, js.Array[Any]) => Unit): Self = StObject.set(x, "flattenChildren", js.Any.fromFunction2(value))
    
    inline def setGenerateTaxonomiesData(value: () => js.Array[Any]): Self = StObject.set(x, "generateTaxonomiesData", js.Any.fromFunction0(value))
    
    inline def setOnClick(value: () => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction0(value))
    
    inline def setUpdateCount(value: js.Array[Any] => Unit): Self = StObject.set(x, "updateCount", js.Any.fromFunction1(value))
  }
}
