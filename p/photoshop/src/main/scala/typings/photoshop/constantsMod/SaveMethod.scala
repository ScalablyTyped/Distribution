package typings.photoshop.constantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SaveMethod extends StObject
@JSImport("photoshop/dom/Constants", "SaveMethod")
@js.native
object SaveMethod extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[SaveMethod & String] = js.native
  
  /**
    * Saves the current document at the current format
    */
  @js.native
  sealed trait SAVE
    extends StObject
       with SaveMethod
  /* "save" */ val SAVE: typings.photoshop.constantsMod.SaveMethod.SAVE & String = js.native
  
  /**
    * Changes the format of document, changing the file
    */
  @js.native
  sealed trait SAVEAS
    extends StObject
       with SaveMethod
  /* "saveAs" */ val SAVEAS: typings.photoshop.constantsMod.SaveMethod.SAVEAS & String = js.native
  
  /**
    * Creates a copy of the document in the new format
    */
  @js.native
  sealed trait SAVEASCOPY
    extends StObject
       with SaveMethod
  /* "saveAsCopy" */ val SAVEASCOPY: typings.photoshop.constantsMod.SaveMethod.SAVEASCOPY & String = js.native
}
