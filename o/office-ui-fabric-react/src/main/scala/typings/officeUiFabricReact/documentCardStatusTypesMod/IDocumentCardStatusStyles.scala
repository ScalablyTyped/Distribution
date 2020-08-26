package typings.officeUiFabricReact.documentCardStatusTypesMod

import typings.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDocumentCardStatusStyles extends js.Object {
  var root: IStyle = js.native
}

object IDocumentCardStatusStyles {
  @scala.inline
  def apply(): IDocumentCardStatusStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDocumentCardStatusStyles]
  }
  @scala.inline
  implicit class IDocumentCardStatusStylesOps[Self <: IDocumentCardStatusStyles] (val x: Self) extends AnyVal {
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
    def setRoot(value: IStyle): Self = this.set("root", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
    @scala.inline
    def setRootNull: Self = this.set("root", null)
  }
  
}

