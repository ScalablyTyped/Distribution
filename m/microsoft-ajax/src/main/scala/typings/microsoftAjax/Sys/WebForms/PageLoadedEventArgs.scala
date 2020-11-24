package typings.microsoftAjax.Sys.WebForms

import typings.microsoftAjax.Sys.EventArgs
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Used by the pageLoaded event of the PageRequestManager class to send event data that represents the UpdatePanel controls that were updated and created in the most recent postback.
  * @see {@link http://msdn.microsoft.com/en-us/library/bb397476(v=vs.100).aspx}
  */
@js.native
trait PageLoadedEventArgs extends EventArgs {
  
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
  def get_panelsCreated(): js.Array[HTMLDivElement] = js.native
  
  /**
    * Gets an array of HTML <div> elements that represent UpdatePanel controls that were updated when the DOM was updated during the last asynchronous postback.
    * If an UpdatePanel control is updated as a result of a partial-page update, the array referenced in the panelsUpdated property of the PageLoadedEventArgs class contains a reference to the corresponding <div> element.
    * The pageLoaded event of the Sys.WebForms.PageRequestManager class uses a PageLoadedEventArgs object to return its event data.
    * @return An array of <div> elements that were updated during the DOM manipulation that was the result of the last asynchronous postback. If no elements were created, the property returns null.
    */
  def get_panelsUpdated(): js.Array[HTMLDivElement] = js.native
}
object PageLoadedEventArgs {
  
  @scala.inline
  def apply(
    Empty: EventArgs,
    get_dataItems: () => js.Any,
    get_panelsCreated: () => js.Array[HTMLDivElement],
    get_panelsUpdated: () => js.Array[HTMLDivElement]
  ): PageLoadedEventArgs = {
    val __obj = js.Dynamic.literal(Empty = Empty.asInstanceOf[js.Any], get_dataItems = js.Any.fromFunction0(get_dataItems), get_panelsCreated = js.Any.fromFunction0(get_panelsCreated), get_panelsUpdated = js.Any.fromFunction0(get_panelsUpdated))
    __obj.asInstanceOf[PageLoadedEventArgs]
  }
  
  @scala.inline
  implicit class PageLoadedEventArgsOps[Self <: PageLoadedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGet_dataItems(value: () => js.Any): Self = this.set("get_dataItems", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_panelsCreated(value: () => js.Array[HTMLDivElement]): Self = this.set("get_panelsCreated", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_panelsUpdated(value: () => js.Array[HTMLDivElement]): Self = this.set("get_panelsUpdated", js.Any.fromFunction0(value))
  }
}
