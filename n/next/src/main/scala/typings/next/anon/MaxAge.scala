package typings.next.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MaxAge extends js.Object {
  /**
    * Specifies the number (in seconds) for the preview session to last for.
    * The given number will be converted to an integer by rounding down.
    * By default, no maximum age is set and the preview session finishes
    * when the client shuts down (browser is closed).
    */
  var maxAge: js.UndefOr[Double] = js.native
}

object MaxAge {
  @scala.inline
  def apply(): MaxAge = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaxAge]
  }
  @scala.inline
  implicit class MaxAgeOps[Self <: MaxAge] (val x: Self) extends AnyVal {
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
    def setMaxAge(value: Double): Self = this.set("maxAge", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxAge: Self = this.set("maxAge", js.undefined)
  }
  
}

