package typings.microsoftAjax.Sys

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait NotifyCollectionChangedAction extends js.Object
//#endregion
//#region Enumerations
/**
  * Describes how a collection has changed.
  * @see {@link http://msdn.microsoft.com/en-us/library/dd393774(v=vs.100).aspx}
  */
@JSGlobal("Sys.NotifyCollectionChangedAction")
@js.native
object NotifyCollectionChangedAction extends js.Object {
  
  /**
    * The integer 0, indicating the changed action to the collection is add.
    */
  @js.native
  sealed trait add extends NotifyCollectionChangedAction
  
  /**
    * The integer 1, indicating the changed action to the collection is remove.
    */
  @js.native
  sealed trait remove extends NotifyCollectionChangedAction
  
  /**
    * The integer 2, indicating the changed action to the collection is reset.
    */
  @js.native
  sealed trait reset extends NotifyCollectionChangedAction
}
