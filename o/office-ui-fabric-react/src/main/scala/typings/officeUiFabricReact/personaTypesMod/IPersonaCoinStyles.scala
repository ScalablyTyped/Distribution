package typings.officeUiFabricReact.personaTypesMod

import typings.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPersonaCoinStyles extends js.Object {
  var coin: IStyle = js.native
  var image: IStyle = js.native
  var imageArea: IStyle = js.native
  var initials: IStyle = js.native
  var size10WithoutPresenceIcon: IStyle = js.native
}

object IPersonaCoinStyles {
  @scala.inline
  def apply(): IPersonaCoinStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPersonaCoinStyles]
  }
  @scala.inline
  implicit class IPersonaCoinStylesOps[Self <: IPersonaCoinStyles] (val x: Self) extends AnyVal {
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
    def setCoin(value: IStyle): Self = this.set("coin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCoin: Self = this.set("coin", js.undefined)
    @scala.inline
    def setCoinNull: Self = this.set("coin", null)
    @scala.inline
    def setImage(value: IStyle): Self = this.set("image", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImage: Self = this.set("image", js.undefined)
    @scala.inline
    def setImageNull: Self = this.set("image", null)
    @scala.inline
    def setImageArea(value: IStyle): Self = this.set("imageArea", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageArea: Self = this.set("imageArea", js.undefined)
    @scala.inline
    def setImageAreaNull: Self = this.set("imageArea", null)
    @scala.inline
    def setInitials(value: IStyle): Self = this.set("initials", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitials: Self = this.set("initials", js.undefined)
    @scala.inline
    def setInitialsNull: Self = this.set("initials", null)
    @scala.inline
    def setSize10WithoutPresenceIcon(value: IStyle): Self = this.set("size10WithoutPresenceIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize10WithoutPresenceIcon: Self = this.set("size10WithoutPresenceIcon", js.undefined)
    @scala.inline
    def setSize10WithoutPresenceIconNull: Self = this.set("size10WithoutPresenceIcon", null)
  }
  
}

