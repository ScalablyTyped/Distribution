package typings.officeUiFabricReact.iconTypesMod

import typings.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IIconStyles extends js.Object {
  /**
    * Deprecated. Use `root`.
    * @deprecated Use `root`.
    */
  var imageContainer: js.UndefOr[IStyle] = js.native
  var root: js.UndefOr[IStyle] = js.native
}

object IIconStyles {
  @scala.inline
  def apply(): IIconStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IIconStyles]
  }
  @scala.inline
  implicit class IIconStylesOps[Self <: IIconStyles] (val x: Self) extends AnyVal {
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
    def setImageContainer(value: IStyle): Self = this.set("imageContainer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageContainer: Self = this.set("imageContainer", js.undefined)
    @scala.inline
    def setImageContainerNull: Self = this.set("imageContainer", null)
    @scala.inline
    def setRoot(value: IStyle): Self = this.set("root", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
    @scala.inline
    def setRootNull: Self = this.set("root", null)
  }
  
}

