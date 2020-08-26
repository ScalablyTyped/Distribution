package typings.officeUiFabricReact.beakStylesMod

import typings.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBeakStyles extends js.Object {
  var beak: js.UndefOr[IStyle] = js.native
  /**
    * Style for the root element in the default enabled/unchecked state.
    */
  var root: js.UndefOr[IStyle] = js.native
}

object IBeakStyles {
  @scala.inline
  def apply(): IBeakStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBeakStyles]
  }
  @scala.inline
  implicit class IBeakStylesOps[Self <: IBeakStyles] (val x: Self) extends AnyVal {
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
    def setBeak(value: IStyle): Self = this.set("beak", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBeak: Self = this.set("beak", js.undefined)
    @scala.inline
    def setBeakNull: Self = this.set("beak", null)
    @scala.inline
    def setRoot(value: IStyle): Self = this.set("root", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
    @scala.inline
    def setRootNull: Self = this.set("root", null)
  }
  
}

