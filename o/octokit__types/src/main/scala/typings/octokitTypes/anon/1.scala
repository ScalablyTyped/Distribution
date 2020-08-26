package typings.octokitTypes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `1` extends js.Object {
  var `-1`: Double = js.native
  @JSName("+1")
  var Plussign1: Double = js.native
  var confused: Double = js.native
  var heart: Double = js.native
  var hooray: Double = js.native
  var laugh: Double = js.native
  var total_count: Double = js.native
  var url: String = js.native
}

object `1` {
  @scala.inline
  def apply(
    `-1`: Double,
    Plussign1: Double,
    confused: Double,
    heart: Double,
    hooray: Double,
    laugh: Double,
    total_count: Double,
    url: String
  ): `1` = {
    val __obj = js.Dynamic.literal(confused = confused.asInstanceOf[js.Any], heart = heart.asInstanceOf[js.Any], hooray = hooray.asInstanceOf[js.Any], laugh = laugh.asInstanceOf[js.Any], total_count = total_count.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("-1")(`-1`.asInstanceOf[js.Any])
    __obj.updateDynamic("+1")(Plussign1.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1`]
  }
  @scala.inline
  implicit class `1Ops`[Self <: `1`] (val x: Self) extends AnyVal {
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
    def `set-1`(value: Double): Self = this.set("-1", value.asInstanceOf[js.Any])
    @scala.inline
    def setPlussign1(value: Double): Self = this.set("+1", value.asInstanceOf[js.Any])
    @scala.inline
    def setConfused(value: Double): Self = this.set("confused", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeart(value: Double): Self = this.set("heart", value.asInstanceOf[js.Any])
    @scala.inline
    def setHooray(value: Double): Self = this.set("hooray", value.asInstanceOf[js.Any])
    @scala.inline
    def setLaugh(value: Double): Self = this.set("laugh", value.asInstanceOf[js.Any])
    @scala.inline
    def setTotal_count(value: Double): Self = this.set("total_count", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
  
}

