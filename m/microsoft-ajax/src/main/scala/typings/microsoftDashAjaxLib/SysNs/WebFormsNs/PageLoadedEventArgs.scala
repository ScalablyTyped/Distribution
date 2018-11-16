package typings
package microsoftDashAjaxLib.SysNs.WebFormsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
        * Used by the pageLoaded event of the PageRequestManager class to send event data that represents the UpdatePanel controls that were updated and created in the most recent postback.
        * @see {@link http://msdn.microsoft.com/en-us/library/bb397476(v=vs.100).aspx}
        */
@JSGlobal("Sys.WebForms.PageLoadedEventArgs")
@js.native
class PageLoadedEventArgs ()
  extends microsoftDashAjaxLib.SysNs.EventArgs {
  //#endregion
  //#region Properties
  /**
              * Gets a JSON data structure that contains data items that were registered by using the RegisterDataItem method of the ScriptManager class.
              * A page or control must be in partial-page rendering mode to register data items that use the RegisterDataItem method of the ScriptManager class
              * Use the IsInAsyncPostBack property to check whether the page is in partial-page rendering mode.The dataItems property returns a JSON data structure that contains name/value pairs.
              * The name is the unique ID of the control that is used in the control parameter of the RegisterDataItem method. The value is the dataItem parameter of the RegisterDataItem method.
              *
              * @return A JSON data structure that contains name/value pairs that were registered as data items that use the RegisterDataItem method of the ScriptManager class.
              */
  def get_dataItems(): js.Any = js.native
  /**
              * Gets an array of HTML div elements that represent UpdatePanel controls that were created when the DOM was updated during the last asynchronous postback.
              * If an UpdatePanel control is updated as a result of a partial-page update, the array referenced in the panelsCreated property of the PageLoadedEventArgs class contains a reference to the corresponding div element.
              * The pageLoaded event of the Sys.WebForms.PageRequestManager class uses a PageLoadedEventArgs object to return its event data.
              * @return An array of div elements that were created during the DOM manipulation that was caused by the last asynchronous postback. If no elements were created, the property returns null.
              */
  def get_panelsCreated(): js.Array[stdLib.HTMLDivElement] = js.native
  /**
              * Gets an array of HTML <div> elements that represent UpdatePanel controls that were updated when the DOM was updated during the last asynchronous postback.
              * If an UpdatePanel control is updated as a result of a partial-page update, the array referenced in the panelsUpdated property of the PageLoadedEventArgs class contains a reference to the corresponding <div> element.
              * The pageLoaded event of the Sys.WebForms.PageRequestManager class uses a PageLoadedEventArgs object to return its event data.
              * @return An array of <div> elements that were updated during the DOM manipulation that was the result of the last asynchronous postback. If no elements were created, the property returns null.
              */
  def get_panelsUpdated(): js.Array[stdLib.HTMLDivElement] = js.native
}

