package typings
package microsoftDashAjaxLib.SysNs.WebFormsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Manages client partial-page updates of server UpdatePanel controls. In addition, defines properties, events, and methods that can be used to customize a Web page with client script.
  * @see {@link http://msdn.microsoft.com/en-us/library/bb311028(v=vs.100).aspx}
  */
@JSGlobal("Sys.WebForms.PageRequestManager")
@js.native
//#region Constructors
/**
  * Initializes a new instance of the Sys.WebForms.PageRequestManager Class.
  */
class PageRequestManager () extends js.Object {
  /**
    * Stops all updates that would occur as a result of an asynchronous postback.
    * The abortPostBack method stops the currently executing postback. To cancel a new postback, provide an event handler for the initializeRequest event and use the cancel event of the Sys.CancelEventArgs class.
    */
  def abortPostBack(): scala.Unit = js.native
  //#endregion
  //#region Events
  /**
    * Raised before the processing of an asynchronous postback starts and the postback request is sent to the server.
    * @param beginRequestHandler
    *               The name of the handler method that will be called.
    */
  def add_beginRequest(
    beginRequestHandler: js.Function2[/* sender */ js.Any, /* args */ BeginRequestEventArgs, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Raised after an asynchronous postback is finished and control has been returned to the browser.
    * @param endRequestHandler
    *               The name of the handler method that will be called.
    */
  def add_endRequest(endRequestHandler: js.Function2[/* sender */ js.Any, /* args */ EndRequestEventArgs, scala.Unit]): scala.Unit = js.native
  /**
    * Raised during the initialization of the asynchronous postback.
    * @param initializeRequestHandler
    *               The name of the handler method that will be called.
    */
  def add_initializeRequest(
    initializeRequestHandler: js.Function2[/* sender */ js.Any, /* args */ InitializeRequestEventArgs, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Raised after all content on the page is refreshed as a result of either a synchronous or an asynchronous postback.
    * @param pageLoadedHandler
    *               The name of the handler method that will be called.
    */
  def add_pageLoaded(pageLoadedHandler: js.Function2[/* sender */ js.Any, /* args */ PageLoadedEventArgs, scala.Unit]): scala.Unit = js.native
  /**
    * Raised after the response from the server to an asynchronous postback is received but before any content on the page is updated.
    * @param pageLoadedHandler
    *               The name of the handler method that will be called.
    */
  def add_pageLoading(pageLoadingHandler: js.Function2[/* sender */ js.Any, /* args */ PageLoadingEventArgs, scala.Unit]): scala.Unit = js.native
  /**
    * Begins an asynchronous postback.
    * @param updatePanelsToUpdate
    *                   (Optional) An array of UniqueID values or ClientID values for UpdatePanel controls that must be re-rendered.
    * @param eventTarget
    *                   (Optional) A string that contains the target of the event.
    * @param eventArgument
    *                   (Optional) A string that contains an argument for the event.
    * @param causesValidation
    *                   (Optional) true to cause validation.
    * @param validationGroup
    *                   (Optional) A string that contains the name of the validation group.
    */
  def beginAsyncPostBack(): scala.Unit = js.native
  def beginAsyncPostBack(updatePanelsToUpdate: js.Array[java.lang.String]): scala.Unit = js.native
  def beginAsyncPostBack(updatePanelsToUpdate: js.Array[java.lang.String], eventTarget: java.lang.String): scala.Unit = js.native
  def beginAsyncPostBack(
    updatePanelsToUpdate: js.Array[java.lang.String],
    eventTarget: java.lang.String,
    eventArgument: java.lang.String
  ): scala.Unit = js.native
  def beginAsyncPostBack(
    updatePanelsToUpdate: js.Array[java.lang.String],
    eventTarget: java.lang.String,
    eventArgument: java.lang.String,
    causesValidation: scala.Boolean
  ): scala.Unit = js.native
  def beginAsyncPostBack(
    updatePanelsToUpdate: js.Array[java.lang.String],
    eventTarget: java.lang.String,
    eventArgument: java.lang.String,
    causesValidation: scala.Boolean,
    validationGroup: java.lang.String
  ): scala.Unit = js.native
  /**
    * Releases ECMAScript (JavaScript) resources and detaches events.
    * the dispose method to free client resources. The PageRequestManager instance calls the dispose method during the window.unload event of the browser.
    * If you call the dispose method and then reference members of the PageRequestManager class, an error occurs. In typical page developer scenarios, you do not have to call the dispose method.
    */
  def dispose(): scala.Unit = js.native
  //#endregion
  //#region Properties
  def get_isInAsyncPostBack(): scala.Boolean = js.native
  /**
    * Raised before the processing of an asynchronous postback starts and the postback request is sent to the server.
    *  @param beginRequestHandler
    *               The handler method that will be removed.
    */
  def remove_beginRequest(beginRequestHandler: js.Function): scala.Unit = js.native
  /**
    * Raised after an asynchronous postback is finished and control has been returned to the browser.
    * @param endRequestHandler
    *               The name of the handler method that will be removed.
    */
  def remove_endRequest(endRequestHandler: js.Function2[/* sender */ js.Any, /* args */ EndRequestEventArgs, scala.Unit]): scala.Unit = js.native
  /**
    * Raised during the initialization of the asynchronous postback.
    * @param initializeRequestHandler
    *               The name of the handler method that will be called.
    */
  def remove_initializeRequest(
    initializeRequestHandler: js.Function2[/* sender */ js.Any, /* args */ InitializeRequestEventArgs, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Raised after all content on the page is refreshed as a result of either a synchronous or an asynchronous postback.
    * @param pageLoadedHandler
    *               The name of the handler method that will be called.
    */
  def remove_pageLoaded(pageLoadedHandler: js.Function2[/* sender */ js.Any, /* args */ PageLoadedEventArgs, scala.Unit]): scala.Unit = js.native
  /**
    * Raised after the response from the server to an asynchronous postback is received but before any content on the page is updated.
    * @param pageLoadedHandler
    *               The name of the handler method that will be called.
    */
  def remove_pageLoading(pageLoadingHandler: js.Function2[/* sender */ js.Any, /* args */ PageLoadingEventArgs, scala.Unit]): scala.Unit = js.native
}

/* static members */
@JSGlobal("Sys.WebForms.PageRequestManager")
@js.native
object PageRequestManager extends js.Object {
  //#endregion
  //#region Methods
  /**
    * Returns the instance of the PageRequestManager class for the page.
    * @return The current instance of the PageRequestManager class. You do not create a new instance of the PageRequestManager class directly. Instead, an instance is available when partial-page rendering is enabled.
    */
  def getInstance(): microsoftDashAjaxLib.SysNs.WebFormsNs.PageRequestManager = js.native
}

