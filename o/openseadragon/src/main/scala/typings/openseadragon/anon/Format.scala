package typings.openseadragon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Format extends js.Object {
  var Format: String = js.native
  var Overlap: String = js.native
  var Size: Width = js.native
  var TileSize: String = js.native
  var Url: String = js.native
  var xmlns: js.UndefOr[String] = js.native
}

object Format {
  @scala.inline
  def apply(Format: String, Overlap: String, Size: Width, TileSize: String, Url: String): Format = {
    val __obj = js.Dynamic.literal(Format = Format.asInstanceOf[js.Any], Overlap = Overlap.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], TileSize = TileSize.asInstanceOf[js.Any], Url = Url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Format]
  }
  @scala.inline
  implicit class FormatOps[Self <: Format] (val x: Self) extends AnyVal {
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
    def setFormat(value: String): Self = this.set("Format", value.asInstanceOf[js.Any])
    @scala.inline
    def setOverlap(value: String): Self = this.set("Overlap", value.asInstanceOf[js.Any])
    @scala.inline
    def setSize(value: Width): Self = this.set("Size", value.asInstanceOf[js.Any])
    @scala.inline
    def setTileSize(value: String): Self = this.set("TileSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("Url", value.asInstanceOf[js.Any])
    @scala.inline
    def setXmlns(value: String): Self = this.set("xmlns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXmlns: Self = this.set("xmlns", js.undefined)
  }
  
}

