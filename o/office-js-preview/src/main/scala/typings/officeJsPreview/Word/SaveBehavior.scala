package typings.officeJsPreview.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SaveBehavior extends StObject
/**
  * Specifies the save behavior for `Document.save`.
  *
  * @remarks
  * [Api set: WordApi 1.1]
  */
@JSGlobal("Word.SaveBehavior")
@js.native
object SaveBehavior extends StObject {
  
  /**
    * Displays the "Save As" dialog to the user if the document hasn't been saved.
    Won't take effect if the document was previously saved.
    * @remarks
    * [Api set: WordApi 1.1]
    */
  @js.native
  sealed trait prompt
    extends StObject
       with SaveBehavior
  
  /**
    * Saves the document without prompting the user. If it's a new document,
    it will be saved with the default name or specified name in the default location.
    * @remarks
    * [Api set: WordApi 1.1]
    */
  @js.native
  sealed trait save
    extends StObject
       with SaveBehavior
}
