package typings.openseadragon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Format extends js.Object {
  var Format: String
  var Overlap: String
  var Size: Width
  var TileSize: String
  var Url: String
  var xmlns: js.UndefOr[String] = js.undefined
}

object Format {
  @scala.inline
  def apply(Format: String, Overlap: String, Size: Width, TileSize: String, Url: String, xmlns: String = null): Format = {
    val __obj = js.Dynamic.literal(Format = Format.asInstanceOf[js.Any], Overlap = Overlap.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], TileSize = TileSize.asInstanceOf[js.Any], Url = Url.asInstanceOf[js.Any])
    if (xmlns != null) __obj.updateDynamic("xmlns")(xmlns.asInstanceOf[js.Any])
    __obj.asInstanceOf[Format]
  }
}

