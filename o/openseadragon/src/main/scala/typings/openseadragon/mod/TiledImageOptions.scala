package typings.openseadragon.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TiledImageOptions extends ImageOptions {
  var tileSource: String | js.Object = js.native
}

object TiledImageOptions {
  @scala.inline
  def apply(tileSource: String | js.Object): TiledImageOptions = {
    val __obj = js.Dynamic.literal(tileSource = tileSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[TiledImageOptions]
  }
  @scala.inline
  implicit class TiledImageOptionsOps[Self <: TiledImageOptions] (val x: Self) extends AnyVal {
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
    def setTileSource(value: String | js.Object): Self = this.set("tileSource", value.asInstanceOf[js.Any])
  }
  
}

