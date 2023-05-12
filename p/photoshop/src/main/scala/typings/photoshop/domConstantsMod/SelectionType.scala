package typings.photoshop.domConstantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SelectionType extends StObject
@JSImport("photoshop/dom/Constants", "SelectionType")
@js.native
object SelectionType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[SelectionType & String] = js.native
  
  /**
    * Remove the selection from the already selected area
    */
  @js.native
  sealed trait DIMINISH
    extends StObject
       with SelectionType
  /* "subtractFrom" */ val DIMINISH: typings.photoshop.domConstantsMod.SelectionType.DIMINISH & String = js.native
  
  /**
    * Add the selection to an already selected area
    */
  @js.native
  sealed trait EXTEND
    extends StObject
       with SelectionType
  /* "addTo" */ val EXTEND: typings.photoshop.domConstantsMod.SelectionType.EXTEND & String = js.native
  
  /**
    * Make the selection only the area where the new selection intersectes the already selected area
    */
  @js.native
  sealed trait INTERSECT
    extends StObject
       with SelectionType
  /* "intersectWith" */ val INTERSECT: typings.photoshop.domConstantsMod.SelectionType.INTERSECT & String = js.native
  
  /**
    * Replace the selected area
    */
  @js.native
  sealed trait REPLACE
    extends StObject
       with SelectionType
  /* "set" */ val REPLACE: typings.photoshop.domConstantsMod.SelectionType.REPLACE & String = js.native
}
