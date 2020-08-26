package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IOCRZoneResults extends js.Object {
  val Count: Double = js.native
  def Item(Index: Double): IOCRZoneResult = js.native
}

object IOCRZoneResults {
  @scala.inline
  def apply(Count: Double, Item: Double => IOCRZoneResult): IOCRZoneResults = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item))
    __obj.asInstanceOf[IOCRZoneResults]
  }
  @scala.inline
  implicit class IOCRZoneResultsOps[Self <: IOCRZoneResults] (val x: Self) extends AnyVal {
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
    def setCount(value: Double): Self = this.set("Count", value.asInstanceOf[js.Any])
    @scala.inline
    def setItem(value: Double => IOCRZoneResult): Self = this.set("Item", js.Any.fromFunction1(value))
  }
  
}

