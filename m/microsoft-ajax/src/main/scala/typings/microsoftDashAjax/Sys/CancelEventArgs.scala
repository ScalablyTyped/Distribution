package typings.microsoftDashAjax.Sys

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides the base class for events that can be canceled.
  * @see {@link http://msdn.microsoft.com/en-us/library/bb311009(v=vs.100).aspx}
  */
@JSGlobal("Sys.CancelEventArgs")
@js.native
//#region Constructors
/**
  * Initializes a new instance of the CancelEventArgs class.
  */
class CancelEventArgs () extends EventArgs {
  /*
    * true to request that the event be canceled; otherwise, false. The default is false.
    * @return if the event is to be canceled; otherwise, false.
    */
  def get_cancel(): Boolean = js.native
  //#endregion
  //#region Properties
  /**
    * true to request that the event be canceled; otherwise, false. The default is false.
    */
  def set_cancel(value: Boolean): Unit = js.native
}

