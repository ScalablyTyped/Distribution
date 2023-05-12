package typings.photoshop.domConstantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ElementPlacement extends StObject
@JSImport("photoshop/dom/Constants", "ElementPlacement")
@js.native
object ElementPlacement extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ElementPlacement & String] = js.native
  
  /**
    * Place below a layer, below group if group layer
    */
  @js.native
  sealed trait PLACEAFTER
    extends StObject
       with ElementPlacement
  /* "placeAfter" */ val PLACEAFTER: typings.photoshop.domConstantsMod.ElementPlacement.PLACEAFTER & String = js.native
  
  /**
    * Place at the top
    */
  @js.native
  sealed trait PLACEATBEGINNING
    extends StObject
       with ElementPlacement
  /* "placeAtBeginning" */ val PLACEATBEGINNING: typings.photoshop.domConstantsMod.ElementPlacement.PLACEATBEGINNING & String = js.native
  
  /**
    * Place at the bottom, above background if background layer exists
    */
  @js.native
  sealed trait PLACEATEND
    extends StObject
       with ElementPlacement
  /* "placeAtEnd" */ val PLACEATEND: typings.photoshop.domConstantsMod.ElementPlacement.PLACEATEND & String = js.native
  
  /**
    * Place above a layer, above group if group layer
    */
  @js.native
  sealed trait PLACEBEFORE
    extends StObject
       with ElementPlacement
  /* "placeBefore" */ val PLACEBEFORE: typings.photoshop.domConstantsMod.ElementPlacement.PLACEBEFORE & String = js.native
  
  /**
    * Place inside a group layer, throws error if not group layer
    */
  @js.native
  sealed trait PLACEINSIDE
    extends StObject
       with ElementPlacement
  /* "placeInside" */ val PLACEINSIDE: typings.photoshop.domConstantsMod.ElementPlacement.PLACEINSIDE & String = js.native
}
