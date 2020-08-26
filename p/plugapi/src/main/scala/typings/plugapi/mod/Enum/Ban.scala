package typings.plugapi.mod.Enum

import typings.plugapi.plugapiStrings.d
import typings.plugapi.plugapiStrings.f
import typings.plugapi.plugapiStrings.h
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Ban extends js.Object {
  var DAY: d = js.native
  var HOUR: h = js.native
  var PERMA: f = js.native
}

object Ban {
  @scala.inline
  def apply(DAY: d, HOUR: h, PERMA: f): Ban = {
    val __obj = js.Dynamic.literal(DAY = DAY.asInstanceOf[js.Any], HOUR = HOUR.asInstanceOf[js.Any], PERMA = PERMA.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ban]
  }
  @scala.inline
  implicit class BanOps[Self <: Ban] (val x: Self) extends AnyVal {
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
    def setDAY(value: d): Self = this.set("DAY", value.asInstanceOf[js.Any])
    @scala.inline
    def setHOUR(value: h): Self = this.set("HOUR", value.asInstanceOf[js.Any])
    @scala.inline
    def setPERMA(value: f): Self = this.set("PERMA", value.asInstanceOf[js.Any])
  }
  
}

