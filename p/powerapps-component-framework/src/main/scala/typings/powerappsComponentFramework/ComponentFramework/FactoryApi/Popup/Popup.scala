package typings.powerappsComponentFramework.ComponentFramework.FactoryApi.Popup

import typings.powerappsComponentFramework.ComponentFramework.FactoryApi.Popup.Types.PopupType
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Popup extends js.Object {
  /**
    * Indicates whether popup close on an outside mouse click.
    * When it's false, the popup will not be closed on an outside mouse click.
    */
  var closeOnOutsideClick: js.UndefOr[Boolean] = js.native
  /**
    * Static DOM element to be inserted
    */
  var content: HTMLElement = js.native
  /**
    * The id to be set to the anchor control if any.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * The name of the Popup. Used as the reference to open Popups.
    */
  var name: String = js.native
  /**
    * The name of Popup which should be opened.
    * Should be defined ONLY in a Root Popup.
    * To open nested Popups, should be provided string like "rootName.nestedName.[allOtherNestedNames]".
    * To close Popups, should be provided empty string.
    * This prop will be automatically propagated to children.
    */
  var popupToOpen: js.UndefOr[String] = js.native
  /**
    * The type of Popup, which is described in PopupType enum. Should be only one "root" Popup for each set of Popups.
    */
  var `type`: PopupType = js.native
}

object Popup {
  @scala.inline
  def apply(content: HTMLElement, name: String, `type`: PopupType): Popup = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Popup]
  }
  @scala.inline
  implicit class PopupOps[Self <: typings.powerappsComponentFramework.ComponentFramework.FactoryApi.Popup.Popup] (val x: Self) extends AnyVal {
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
    def setContent(value: HTMLElement): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: PopupType): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setCloseOnOutsideClick(value: Boolean): Self = this.set("closeOnOutsideClick", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloseOnOutsideClick: Self = this.set("closeOnOutsideClick", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setPopupToOpen(value: String): Self = this.set("popupToOpen", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePopupToOpen: Self = this.set("popupToOpen", js.undefined)
  }
  
}

