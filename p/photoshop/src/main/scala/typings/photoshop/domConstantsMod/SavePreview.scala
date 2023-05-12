package typings.photoshop.domConstantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SavePreview extends StObject
@JSImport("photoshop/dom/Constants", "SavePreview")
@js.native
object SavePreview extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[SavePreview & String] = js.native
  
  /**
    * Always save the item with the file.
    */
  @js.native
  sealed trait ALWAYSSAVE
    extends StObject
       with SavePreview
  /* "queryAlways" */ val ALWAYSSAVE: typings.photoshop.domConstantsMod.SavePreview.ALWAYSSAVE & String = js.native
  
  /**
    * Prompt the user whether to save the item with the file.
    */
  @js.native
  sealed trait ASKWHENSAVING
    extends StObject
       with SavePreview
  /* "queryAsk" */ val ASKWHENSAVING: typings.photoshop.domConstantsMod.SavePreview.ASKWHENSAVING & String = js.native
  
  /**
    * Never save the item with the file.
    */
  @js.native
  sealed trait NEVERSAVE
    extends StObject
       with SavePreview
  /* "queryNever" */ val NEVERSAVE: typings.photoshop.domConstantsMod.SavePreview.NEVERSAVE & String = js.native
}
