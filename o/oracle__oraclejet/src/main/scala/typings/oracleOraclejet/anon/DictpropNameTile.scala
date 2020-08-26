package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DictpropNameTile
  extends /* key */ StringDictionary[js.Any] {
  var tile: typings.std.Element = js.native
}

object DictpropNameTile {
  @scala.inline
  def apply(tile: typings.std.Element): DictpropNameTile = {
    val __obj = js.Dynamic.literal(tile = tile.asInstanceOf[js.Any])
    __obj.asInstanceOf[DictpropNameTile]
  }
  @scala.inline
  implicit class DictpropNameTileOps[Self <: DictpropNameTile] (val x: Self) extends AnyVal {
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
    def setTile(value: typings.std.Element): Self = this.set("tile", value.asInstanceOf[js.Any])
  }
  
}

