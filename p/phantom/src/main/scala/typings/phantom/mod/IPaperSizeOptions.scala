package typings.phantom.mod

import typings.phantom.anon.Bottom
import typings.phantom.anon.Contents
import typings.phantom.phantomStrings.A3
import typings.phantom.phantomStrings.A4
import typings.phantom.phantomStrings.A5
import typings.phantom.phantomStrings.Legal
import typings.phantom.phantomStrings.Letter
import typings.phantom.phantomStrings.Tabloid
import typings.phantom.phantomStrings.landscape
import typings.phantom.phantomStrings.portrait
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPaperSizeOptions extends js.Object {
  var footer: js.UndefOr[Contents] = js.native
  var format: js.UndefOr[A3 | A4 | A5 | Legal | Letter | Tabloid] = js.native
  var header: js.UndefOr[Contents] = js.native
  var height: js.UndefOr[String] = js.native
  var margin: js.UndefOr[String | Bottom] = js.native
  var orientation: js.UndefOr[portrait | landscape] = js.native
  var width: js.UndefOr[String] = js.native
}

object IPaperSizeOptions {
  @scala.inline
  def apply(): IPaperSizeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPaperSizeOptions]
  }
  @scala.inline
  implicit class IPaperSizeOptionsOps[Self <: IPaperSizeOptions] (val x: Self) extends AnyVal {
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
    def setFooter(value: Contents): Self = this.set("footer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFooter: Self = this.set("footer", js.undefined)
    @scala.inline
    def setFormat(value: A3 | A4 | A5 | Legal | Letter | Tabloid): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    @scala.inline
    def setHeader(value: Contents): Self = this.set("header", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeader: Self = this.set("header", js.undefined)
    @scala.inline
    def setHeight(value: String): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setMargin(value: String | Bottom): Self = this.set("margin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMargin: Self = this.set("margin", js.undefined)
    @scala.inline
    def setOrientation(value: portrait | landscape): Self = this.set("orientation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrientation: Self = this.set("orientation", js.undefined)
    @scala.inline
    def setWidth(value: String): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

