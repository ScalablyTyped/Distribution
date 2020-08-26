package typings.officeUiFabricReact.facepileTypesMod

import typings.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFacepileStyles extends js.Object {
  var addButton: IStyle = js.native
  var descriptiveOverflowButton: IStyle = js.native
  var itemButton: IStyle = js.native
  var itemContainer: IStyle = js.native
  var member: IStyle = js.native
  var members: IStyle = js.native
  var overflowButton: IStyle = js.native
  var overflowInitialsIcon: IStyle = js.native
  /**
    * Style for the root element.
    */
  var root: IStyle = js.native
  var screenReaderOnly: IStyle = js.native
}

object IFacepileStyles {
  @scala.inline
  def apply(): IFacepileStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFacepileStyles]
  }
  @scala.inline
  implicit class IFacepileStylesOps[Self <: IFacepileStyles] (val x: Self) extends AnyVal {
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
    def setAddButton(value: IStyle): Self = this.set("addButton", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddButton: Self = this.set("addButton", js.undefined)
    @scala.inline
    def setAddButtonNull: Self = this.set("addButton", null)
    @scala.inline
    def setDescriptiveOverflowButton(value: IStyle): Self = this.set("descriptiveOverflowButton", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescriptiveOverflowButton: Self = this.set("descriptiveOverflowButton", js.undefined)
    @scala.inline
    def setDescriptiveOverflowButtonNull: Self = this.set("descriptiveOverflowButton", null)
    @scala.inline
    def setItemButton(value: IStyle): Self = this.set("itemButton", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemButton: Self = this.set("itemButton", js.undefined)
    @scala.inline
    def setItemButtonNull: Self = this.set("itemButton", null)
    @scala.inline
    def setItemContainer(value: IStyle): Self = this.set("itemContainer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemContainer: Self = this.set("itemContainer", js.undefined)
    @scala.inline
    def setItemContainerNull: Self = this.set("itemContainer", null)
    @scala.inline
    def setMember(value: IStyle): Self = this.set("member", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMember: Self = this.set("member", js.undefined)
    @scala.inline
    def setMemberNull: Self = this.set("member", null)
    @scala.inline
    def setMembers(value: IStyle): Self = this.set("members", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMembers: Self = this.set("members", js.undefined)
    @scala.inline
    def setMembersNull: Self = this.set("members", null)
    @scala.inline
    def setOverflowButton(value: IStyle): Self = this.set("overflowButton", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverflowButton: Self = this.set("overflowButton", js.undefined)
    @scala.inline
    def setOverflowButtonNull: Self = this.set("overflowButton", null)
    @scala.inline
    def setOverflowInitialsIcon(value: IStyle): Self = this.set("overflowInitialsIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverflowInitialsIcon: Self = this.set("overflowInitialsIcon", js.undefined)
    @scala.inline
    def setOverflowInitialsIconNull: Self = this.set("overflowInitialsIcon", null)
    @scala.inline
    def setRoot(value: IStyle): Self = this.set("root", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
    @scala.inline
    def setRootNull: Self = this.set("root", null)
    @scala.inline
    def setScreenReaderOnly(value: IStyle): Self = this.set("screenReaderOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScreenReaderOnly: Self = this.set("screenReaderOnly", js.undefined)
    @scala.inline
    def setScreenReaderOnlyNull: Self = this.set("screenReaderOnly", null)
  }
  
}

