package typings
package microsoftDashAjaxLib.SysNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  sealed trait add
    extends microsoftDashAjaxLib.SysNs.NotifyCollectionChangedAction
  
  /**
          * The integer 1, indicating the changed action to the collection is remove.
          */
  @js.native
  sealed trait remove
    extends microsoftDashAjaxLib.SysNs.NotifyCollectionChangedAction
  
  /**
          * The integer 2, indicating the changed action to the collection is reset.
          */
  @js.native
  sealed trait reset
    extends microsoftDashAjaxLib.SysNs.NotifyCollectionChangedAction
  
  /* 0 */ val add: add with scala.Double = js.native
  /* 1 */ val remove: remove with scala.Double = js.native
  /* 2 */ val reset: reset with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[microsoftDashAjaxLib.SysNs.NotifyCollectionChangedAction with scala.Double] = js.native
}

