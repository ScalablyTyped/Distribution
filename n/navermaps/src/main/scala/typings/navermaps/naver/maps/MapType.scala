package typings.navermaps.naver.maps

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MapType extends js.Object {
  var maxZoom: Double = js.native
  var minZoom: Double = js.native
  var name: String = js.native
  var projection: Projection = js.native
  var tileSize: Size = js.native
  def getTile(x: Double, y: Double, z: Double): HTMLElement | Tile = js.native
}

object MapType {
  @scala.inline
  def apply(
    getTile: (Double, Double, Double) => HTMLElement | Tile,
    maxZoom: Double,
    minZoom: Double,
    name: String,
    projection: Projection,
    tileSize: Size
  ): MapType = {
    val __obj = js.Dynamic.literal(getTile = js.Any.fromFunction3(getTile), maxZoom = maxZoom.asInstanceOf[js.Any], minZoom = minZoom.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], projection = projection.asInstanceOf[js.Any], tileSize = tileSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapType]
  }
  @scala.inline
  implicit class MapTypeOps[Self <: MapType] (val x: Self) extends AnyVal {
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
    def setGetTile(value: (Double, Double, Double) => HTMLElement | Tile): Self = this.set("getTile", js.Any.fromFunction3(value))
    @scala.inline
    def setMaxZoom(value: Double): Self = this.set("maxZoom", value.asInstanceOf[js.Any])
    @scala.inline
    def setMinZoom(value: Double): Self = this.set("minZoom", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setProjection(value: Projection): Self = this.set("projection", value.asInstanceOf[js.Any])
    @scala.inline
    def setTileSize(value: Size): Self = this.set("tileSize", value.asInstanceOf[js.Any])
  }
  
}

