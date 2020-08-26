package typings.naverWhale.whale.contextMenus

import typings.chrome.chrome.tabs.Tab
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateProperties extends js.Object {
  /** Optional. The initial state of a checkbox or radio item: true for selected and false for unselected. Only one radio item can be selected at a time in a given group of radio items.  */
  var checked: js.UndefOr[Boolean] = js.native
  /** Optional. List of contexts this menu item will appear in. Defaults to ['page'] if not specified.  */
  var contexts: js.UndefOr[js.Array[String]] = js.native
  /** Optional. Lets you restrict the item to apply only to documents whose URL matches one of the given patterns. (This applies to frames as well.) For details on the format of a pattern, see Match Patterns.  */
  var documentUrlPatterns: js.UndefOr[js.Array[String]] = js.native
  /**
    * Optional.
    * Since Chrome 20.
    * Whether this context menu item is enabled or disabled. Defaults to true.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /**
    * Optional.
    * Since Chrome 21.
    * The unique ID to assign to this item. Mandatory for event pages. Cannot be the same as another ID for this extension.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Optional.
    * A function that will be called back when the menu item is clicked. Event pages cannot use this; instead, they should register a listener for chrome.contextMenus.onClicked.
    * @param info Information sent when a context menu item is clicked.
    * @param tab The details of the tab where the click took place. Note: this parameter only present for extensions.
    */
  var onclick: js.UndefOr[
    js.Function2[/* info */ typings.chrome.chrome.contextMenus.OnClickData, /* tab */ Tab, Unit]
  ] = js.native
  /** Optional. The ID of a parent menu item; this makes the item a child of a previously added item.  */
  var parentId: js.UndefOr[js.Any] = js.native
  /** Optional. Similar to documentUrlPatterns, but lets you filter based on the src attribute of img/audio/video tags and the href of anchor tags.  */
  var targetUrlPatterns: js.UndefOr[js.Array[String]] = js.native
  /** Optional. The text to be displayed in the item; this is required unless type is 'separator'. When the context is 'selection', you can use %s within the string to show the selected text. For example, if this parameter's value is "Translate '%s' to Pig Latin" and the user selects the word "cool", the context menu item for the selection is "Translate 'cool' to Pig Latin".  */
  var title: js.UndefOr[String] = js.native
  /** Optional. The type of menu item. Defaults to 'normal' if not specified.  */
  var `type`: js.UndefOr[String] = js.native
  /**
    * Optional.
    * Since Chrome 62.
    * Whether the item is visible in the menu.
    */
  var visible: js.UndefOr[Boolean] = js.native
}

object CreateProperties {
  @scala.inline
  def apply(): CreateProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateProperties]
  }
  @scala.inline
  implicit class CreatePropertiesOps[Self <: CreateProperties] (val x: Self) extends AnyVal {
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
    def setChecked(value: Boolean): Self = this.set("checked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChecked: Self = this.set("checked", js.undefined)
    @scala.inline
    def setContextsVarargs(value: String*): Self = this.set("contexts", js.Array(value :_*))
    @scala.inline
    def setContexts(value: js.Array[String]): Self = this.set("contexts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContexts: Self = this.set("contexts", js.undefined)
    @scala.inline
    def setDocumentUrlPatternsVarargs(value: String*): Self = this.set("documentUrlPatterns", js.Array(value :_*))
    @scala.inline
    def setDocumentUrlPatterns(value: js.Array[String]): Self = this.set("documentUrlPatterns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDocumentUrlPatterns: Self = this.set("documentUrlPatterns", js.undefined)
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setOnclick(value: (/* info */ typings.chrome.chrome.contextMenus.OnClickData, /* tab */ Tab) => Unit): Self = this.set("onclick", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnclick: Self = this.set("onclick", js.undefined)
    @scala.inline
    def setParentId(value: js.Any): Self = this.set("parentId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParentId: Self = this.set("parentId", js.undefined)
    @scala.inline
    def setTargetUrlPatternsVarargs(value: String*): Self = this.set("targetUrlPatterns", js.Array(value :_*))
    @scala.inline
    def setTargetUrlPatterns(value: js.Array[String]): Self = this.set("targetUrlPatterns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetUrlPatterns: Self = this.set("targetUrlPatterns", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
  }
  
}

