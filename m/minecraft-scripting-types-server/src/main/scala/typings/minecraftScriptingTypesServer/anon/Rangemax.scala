package typings.minecraftScriptingTypesServer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Rangemax extends js.Object {
  /**
    * The maximum amount of damage the entity will deal
    * @default 0.0
    */
  var range_max: Double = js.native
  /**
    * The minimum amount of damage the entity will deal
    * @default 0.0
    */
  var range_min: Double = js.native
}

object Rangemax {
  @scala.inline
  def apply(range_max: Double, range_min: Double): Rangemax = {
    val __obj = js.Dynamic.literal(range_max = range_max.asInstanceOf[js.Any], range_min = range_min.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rangemax]
  }
  @scala.inline
  implicit class RangemaxOps[Self <: Rangemax] (val x: Self) extends AnyVal {
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
    def setRange_max(value: Double): Self = this.set("range_max", value.asInstanceOf[js.Any])
    @scala.inline
    def setRange_min(value: Double): Self = this.set("range_min", value.asInstanceOf[js.Any])
  }
  
}

