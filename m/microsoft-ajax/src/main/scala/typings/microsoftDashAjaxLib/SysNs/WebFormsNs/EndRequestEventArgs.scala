package typings
package microsoftDashAjaxLib.SysNs.WebFormsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
        * Used by the endRequest event of the PageRequestManager class to pass argument information to event handlers.
        * @see {@link http://msdn.microsoft.com/en-us/library/bb397499.aspx}
        */
@JSGlobal("Sys.WebForms.EndRequestEventArgs")
@js.native
class EndRequestEventArgs protected ()
  extends microsoftDashAjaxLib.SysNs.EventArgs {
  //#region Constructors
  /**
              * Initializes a new instance of the EndRequestEventArgs class.
              * @param error
              *           An error object.
              * @param dataItems
              *           An object containing data items.
              * @param response
              *           An object of type Sys.Net.WebRequestExecutor.
              */
  def this(error: stdLib.Error, dataItems: js.Any, response: microsoftDashAjaxLib.SysNs.NetNs.WebRequestExecutor) = this()
  //#endregion
  //#region Properties
  /**
              * Gets a JSON data structure that contains data items that were registered by using the RegisterDataItem method of the ScriptManager class.
              * The JavaScript Error object exposes several properties that define the error. The Microsoft Ajax Library provides additional functions for the Error object.
              * @return A JSON data structure that contains name/value pairs that were registered as data items by using the RegisterDataItem method of the ScriptManager class.
              */
  def get_dataItems(): js.Any = js.native
  /**
              * Gets the Error object.
              * @return A base ECMAScript (JavaScript) Error object.
              */
  def get_error(): stdLib.Error = js.native
  /**
              * Get or sets a value that indicates whether the error has been handled.
              * Use this property to determine whether an asynchronous postback error has already been handled. If it has not and if you want to take action on the error, you can set the error as handled.
              * @return true if the error has been handled; otherwise false.
              */
  def get_errorHandled(): scala.Boolean = js.native
  /**
              * Gets a response object that is represented by the Sys.Net.WebRequestExecutor class.
              * @return A response object that is represented by the WebRequestExecutor class.
              */
  def get_response(): microsoftDashAjaxLib.SysNs.NetNs.WebRequestExecutor = js.native
  /**
              * Get or sets a value that indicates whether the error has been handled.
              * Use this property to determine whether an asynchronous postback error has already been handled. If it has not and if you want to take action on the error, you can set the error as handled.
              * @param value
              *         true or false.
              */
  def set_errorHandled(value: scala.Boolean): scala.Unit = js.native
}

