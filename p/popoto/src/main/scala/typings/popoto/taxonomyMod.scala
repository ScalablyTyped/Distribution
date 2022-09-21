package typings.popoto

import typings.popoto.graphMod.Node
import typings.std.Element
import typings.std.SVGGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object taxonomyMod {
  
  object Taxonomy {
    
    @JSImport("popoto/taxonomy", "Taxonomy")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Add children providers data.
      * @param parentData
      * @param id
      */
    inline def addChildrenData(parentData: Node, id: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("addChildrenData")(parentData.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * Recursively generate the taxonomy children elements.
      *
      * @param selection
      */
    inline def addTaxonomyChildren(selection: js.Array[Element]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addTaxonomyChildren")(selection.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @JSImport("popoto/taxonomy", "Taxonomy.containerId")
    @js.native
    val containerId: String = js.native
    
    /**
      * Create the taxonomy panel HTML elements.
      */
    inline def createTaxonomyPanel(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("createTaxonomyPanel")().asInstanceOf[Unit]
    
    /**
      * Recursive function to flatten data content.
      */
    inline def flattenChildren(d: SVGGElement, vals: js.Array[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("flattenChildren")(d.asInstanceOf[js.Any], vals.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Parse the list of label providers and return a list of data object containing only searchable labels.
      * @returns Array
      */
    inline def generateTaxonomiesData(): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("generateTaxonomiesData")().asInstanceOf[js.Array[Any]]
    
    inline def onClick(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onClick")().asInstanceOf[Unit]
    
    /**
      * Updates the count number on a taxonomy.
      *
      * @param taxonomyData
      */
    inline def updateCount(taxonomyData: js.Array[Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("updateCount")(taxonomyData.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
}
