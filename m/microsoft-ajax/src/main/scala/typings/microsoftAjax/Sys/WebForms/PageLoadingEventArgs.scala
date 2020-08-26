package typings.microsoftAjax.Sys.WebForms

import typings.microsoftAjax.Sys.EventArgs
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Used by the pageLoading event of the PageRequestManager class to send event data that represents the UpdatePanel controls that are being updated and deleted as a result of the most recent postback.
  * @see {@link http://msdn.microsoft.com/en-us/library/bb310960(v=vs.100).aspx}
  */
@js.native
trait PageLoadingEventArgs extends EventArgs {
  //#endregion
  //#region Properties
  /**
    * Gets a JSON data structure that contains data items that were registered by using the RegisterDataItem method of the ScriptManager class.
    * page or control must be in partial-page rendering mode to register data items that use the RegisterDataItem method of the ScriptManager class.
    * Use the IsInAsyncPostBack property to check whether the page is in partial-page rendering mode.
    * The dataItems property returns a JSON data structure that contains name/value pairs.
    * The name is the unique ID of the control that is used in the control parameter of the RegisterDataItem method. The value is the dataItem parameter of the RegisterDataItem method.
    * @return A JSON data structure that contains name/value pairs that were registered as data items by using the RegisterDataItem method of the ScriptManager class.
    */
  def get_dataItems(): js.Any = js.native
  /**
    * Gets an array of HTML <div> elements that represent UpdatePanel controls that will be deleted from the DOM as a result of the current asynchronous postback.
    * If the contents of an UpdatePanel control will be deleted as the result of a partial-page update, the array that is referenced in the panelsDeleting property of the PageLoadingEventArgs class contains a reference to the corresponding <div> element.
    * The pageLoading event of the Sys.WebForms.PageRequestManager class uses a PageLoadingEventArgs object to return its event data.
    * @return An array of <div> elements that will be deleted from the DOM. If no elements will be deleted, the property returns null.
    */
  def get_panelsDeleting(): js.Array[HTMLDivElement] = js.native
  /**
    * Gets an array of HTML <div> elements that represent UpdatePanel controls that will be updated in the DOM as a result of the current asynchronous postback.
    * If the contents of any UpdatePanel controls will be updated as the result of a partial-page update, the panelsUpdating property contains an array that references the corresponding <div> elements.
    * The pageLoading event of the Sys.WebForms.PageRequestManager class uses a PageLoadingEventArgs object to return its event data.
    * @return An array of <div> elements that will be updated in the DOM. If no elements will be updated, the property returns null.
    */
  def get_panelsUpdating(): js.Array[HTMLDivElement] = js.native
}

object PageLoadingEventArgs {
  @scala.inline
  def apply(
    Empty: EventArgs,
    get_dataItems: () => js.Any,
    get_panelsDeleting: () => js.Array[HTMLDivElement],
    get_panelsUpdating: () => js.Array[HTMLDivElement]
  ): PageLoadingEventArgs = {
    val __obj = js.Dynamic.literal(Empty = Empty.asInstanceOf[js.Any], get_dataItems = js.Any.fromFunction0(get_dataItems), get_panelsDeleting = js.Any.fromFunction0(get_panelsDeleting), get_panelsUpdating = js.Any.fromFunction0(get_panelsUpdating))
    __obj.asInstanceOf[PageLoadingEventArgs]
  }
  @scala.inline
  implicit class PageLoadingEventArgsOps[Self <: PageLoadingEventArgs] (val x: Self) extends AnyVal {
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
    def setGet_panelsDeleting(value: () => js.Array[HTMLDivElement]): Self = this.set("get_panelsDeleting", js.Any.fromFunction0(value))
    @scala.inline
    def setGet_panelsUpdating(value: () => js.Array[HTMLDivElement]): Self = this.set("get_panelsUpdating", js.Any.fromFunction0(value))
  }
  
}

