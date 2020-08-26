package typings.natural.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubstringDistanceResult extends js.Object {
  var distance: Double = js.native
  var substring: String = js.native
}

object SubstringDistanceResult {
  @scala.inline
  def apply(distance: Double, substring: String): SubstringDistanceResult = {
    val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any], substring = substring.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubstringDistanceResult]
  }
  @scala.inline
  implicit class SubstringDistanceResultOps[Self <: SubstringDistanceResult] (val x: Self) extends AnyVal {
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
    def setDistance(value: Double): Self = this.set("distance", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubstring(value: String): Self = this.set("substring", value.asInstanceOf[js.Any])
  }
  
}

