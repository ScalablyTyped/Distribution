package typings.officeUiFabricReact.tagPickerTypesMod

import typings.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITagItemStyles extends js.Object {
  /** Refers to the cancel action button on a picked TagItem. */
  var close: IStyle = js.native
  /** Root element of picked TagItem */
  var root: IStyle = js.native
  /** Refers to the text element of the TagItem already picked. */
  var text: IStyle = js.native
}

object ITagItemStyles {
  @scala.inline
  def apply(): ITagItemStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITagItemStyles]
  }
  @scala.inline
  implicit class ITagItemStylesOps[Self <: ITagItemStyles] (val x: Self) extends AnyVal {
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
    def setClose(value: IStyle): Self = this.set("close", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClose: Self = this.set("close", js.undefined)
    @scala.inline
    def setCloseNull: Self = this.set("close", null)
    @scala.inline
    def setRoot(value: IStyle): Self = this.set("root", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
    @scala.inline
    def setRootNull: Self = this.set("root", null)
    @scala.inline
    def setText(value: IStyle): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    @scala.inline
    def setTextNull: Self = this.set("text", null)
  }
  
}

