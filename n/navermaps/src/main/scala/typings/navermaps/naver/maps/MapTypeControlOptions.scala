package typings.navermaps.naver.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MapTypeControlOptions extends js.Object {
  var mapTypeIds: js.Array[MapTypeId] | Null = js.native
  var position: Position = js.native
  var style: MapTypeControlStyle = js.native
}

object MapTypeControlOptions {
  @scala.inline
  def apply(position: Position, style: MapTypeControlStyle): MapTypeControlOptions = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapTypeControlOptions]
  }
  @scala.inline
  implicit class MapTypeControlOptionsOps[Self <: MapTypeControlOptions] (val x: Self) extends AnyVal {
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
    def setPosition(value: Position): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def setStyle(value: MapTypeControlStyle): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def setMapTypeIdsVarargs(value: MapTypeId*): Self = this.set("mapTypeIds", js.Array(value :_*))
    @scala.inline
    def setMapTypeIds(value: js.Array[MapTypeId]): Self = this.set("mapTypeIds", value.asInstanceOf[js.Any])
    @scala.inline
    def setMapTypeIdsNull: Self = this.set("mapTypeIds", null)
  }
  
}

