package typings.officeJs.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CloseBehavior extends StObject
/**
  * Specifies the close behavior for `Document.close`.
  *
  * @remarks
  * [Api set: WordApi 1.5]
  */
@JSGlobal("Word.CloseBehavior")
@js.native
object CloseBehavior extends StObject {
  
  /**
    * Save the changes before closing the document.
    * @remarks
    * [Api set: WordApi 1.5]
    */
  @js.native
  sealed trait save
    extends StObject
       with CloseBehavior
  
  /**
    * Discard the possible changes when closing the document.
    * @remarks
    * [Api set: WordApi 1.5]
    */
  @js.native
  sealed trait skipSave
    extends StObject
       with CloseBehavior
}
