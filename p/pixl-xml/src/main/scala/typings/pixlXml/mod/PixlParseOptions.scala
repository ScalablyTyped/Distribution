package typings.pixlXml.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PixlParseOptions extends js.Object {
  var forceArrays: js.UndefOr[Boolean] = js.native
  var lowerCase: js.UndefOr[Boolean] = js.native
  var preserveAttributes: js.UndefOr[Boolean] = js.native
  var preserveDocumentNode: js.UndefOr[Boolean] = js.native
  var preserveWhitespace: js.UndefOr[Boolean] = js.native
}

object PixlParseOptions {
  @scala.inline
  def apply(): PixlParseOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PixlParseOptions]
  }
  @scala.inline
  implicit class PixlParseOptionsOps[Self <: PixlParseOptions] (val x: Self) extends AnyVal {
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
    def setForceArrays(value: Boolean): Self = this.set("forceArrays", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForceArrays: Self = this.set("forceArrays", js.undefined)
    @scala.inline
    def setLowerCase(value: Boolean): Self = this.set("lowerCase", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLowerCase: Self = this.set("lowerCase", js.undefined)
    @scala.inline
    def setPreserveAttributes(value: Boolean): Self = this.set("preserveAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreserveAttributes: Self = this.set("preserveAttributes", js.undefined)
    @scala.inline
    def setPreserveDocumentNode(value: Boolean): Self = this.set("preserveDocumentNode", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreserveDocumentNode: Self = this.set("preserveDocumentNode", js.undefined)
    @scala.inline
    def setPreserveWhitespace(value: Boolean): Self = this.set("preserveWhitespace", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreserveWhitespace: Self = this.set("preserveWhitespace", js.undefined)
  }
  
}

