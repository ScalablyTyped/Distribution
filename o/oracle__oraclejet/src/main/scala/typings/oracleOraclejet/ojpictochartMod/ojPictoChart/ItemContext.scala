package typings.oracleOraclejet.ojpictochartMod.ojPictoChart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
@js.native
trait ItemContext[K] extends js.Object {
  var color: String = js.native
  var count: Double = js.native
  var id: K = js.native
  var name: String = js.native
  var selected: Boolean = js.native
  var tooltip: String = js.native
}

object ItemContext {
  @scala.inline
  def apply[K](color: String, count: Double, id: K, name: String, selected: Boolean, tooltip: String): ItemContext[K] = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemContext[K]]
  }
  @scala.inline
  implicit class ItemContextOps[Self <: ItemContext[_], K] (val x: Self with ItemContext[K]) extends AnyVal {
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
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def setCount(value: Double): Self = this.set("count", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: K): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelected(value: Boolean): Self = this.set("selected", value.asInstanceOf[js.Any])
    @scala.inline
    def setTooltip(value: String): Self = this.set("tooltip", value.asInstanceOf[js.Any])
  }
  
}

