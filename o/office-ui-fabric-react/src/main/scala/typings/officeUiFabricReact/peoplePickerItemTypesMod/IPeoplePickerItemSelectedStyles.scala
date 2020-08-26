package typings.officeUiFabricReact.peoplePickerItemTypesMod

import typings.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPeoplePickerItemSelectedStyles extends js.Object {
  /** Refers to the element holding the content (Persona) of the PeoplePicker item already picked. */
  var itemContent: IStyle = js.native
  /** Refers to the remove action button on a picked PeoplePicker item. */
  var removeButton: IStyle = js.native
  /** Root element of picked PeoplePicker item */
  var root: IStyle = js.native
  /** SubComponent (Persona, PersonaCoin) styles. */
  var subComponentStyles: IPeoplePickerItemSelectedSubComponentStyles = js.native
}

object IPeoplePickerItemSelectedStyles {
  @scala.inline
  def apply(subComponentStyles: IPeoplePickerItemSelectedSubComponentStyles): IPeoplePickerItemSelectedStyles = {
    val __obj = js.Dynamic.literal(subComponentStyles = subComponentStyles.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPeoplePickerItemSelectedStyles]
  }
  @scala.inline
  implicit class IPeoplePickerItemSelectedStylesOps[Self <: IPeoplePickerItemSelectedStyles] (val x: Self) extends AnyVal {
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
    def setSubComponentStyles(value: IPeoplePickerItemSelectedSubComponentStyles): Self = this.set("subComponentStyles", value.asInstanceOf[js.Any])
    @scala.inline
    def setItemContent(value: IStyle): Self = this.set("itemContent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemContent: Self = this.set("itemContent", js.undefined)
    @scala.inline
    def setItemContentNull: Self = this.set("itemContent", null)
    @scala.inline
    def setRemoveButton(value: IStyle): Self = this.set("removeButton", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemoveButton: Self = this.set("removeButton", js.undefined)
    @scala.inline
    def setRemoveButtonNull: Self = this.set("removeButton", null)
    @scala.inline
    def setRoot(value: IStyle): Self = this.set("root", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
    @scala.inline
    def setRootNull: Self = this.set("root", null)
  }
  
}

