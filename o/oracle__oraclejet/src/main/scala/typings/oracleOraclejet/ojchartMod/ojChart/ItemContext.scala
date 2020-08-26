package typings.oracleOraclejet.ojchartMod.ojChart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
@js.native
trait ItemContext extends js.Object {
  var itemIndex: Double = js.native
  var seriesIndex: Double = js.native
  var subId: String = js.native
}

object ItemContext {
  @scala.inline
  def apply(itemIndex: Double, seriesIndex: Double, subId: String): ItemContext = {
    val __obj = js.Dynamic.literal(itemIndex = itemIndex.asInstanceOf[js.Any], seriesIndex = seriesIndex.asInstanceOf[js.Any], subId = subId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemContext]
  }
  @scala.inline
  implicit class ItemContextOps[Self <: ItemContext] (val x: Self) extends AnyVal {
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
    def setItemIndex(value: Double): Self = this.set("itemIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setSeriesIndex(value: Double): Self = this.set("seriesIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubId(value: String): Self = this.set("subId", value.asInstanceOf[js.Any])
  }
  
}

