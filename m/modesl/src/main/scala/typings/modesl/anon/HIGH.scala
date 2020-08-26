package typings.modesl.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HIGH extends js.Object {
  var HIGH: String = js.native
  var LOW: String = js.native
  var NORMAL: String = js.native
}

object HIGH {
  @scala.inline
  def apply(HIGH: String, LOW: String, NORMAL: String): HIGH = {
    val __obj = js.Dynamic.literal(HIGH = HIGH.asInstanceOf[js.Any], LOW = LOW.asInstanceOf[js.Any], NORMAL = NORMAL.asInstanceOf[js.Any])
    __obj.asInstanceOf[HIGH]
  }
  @scala.inline
  implicit class HIGHOps[Self <: HIGH] (val x: Self) extends AnyVal {
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
    def setHIGH(value: String): Self = this.set("HIGH", value.asInstanceOf[js.Any])
    @scala.inline
    def setLOW(value: String): Self = this.set("LOW", value.asInstanceOf[js.Any])
    @scala.inline
    def setNORMAL(value: String): Self = this.set("NORMAL", value.asInstanceOf[js.Any])
  }
  
}

