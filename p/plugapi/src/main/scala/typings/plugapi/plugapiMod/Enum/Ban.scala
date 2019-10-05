package typings.plugapi.plugapiMod.Enum

import typings.plugapi.plugapiStrings.d
import typings.plugapi.plugapiStrings.f
import typings.plugapi.plugapiStrings.h
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Ban extends js.Object {
  var DAY: d
  var HOUR: h
  var PERMA: f
}

object Ban {
  @scala.inline
  def apply(DAY: d, HOUR: h, PERMA: f): Ban = {
    val __obj = js.Dynamic.literal(DAY = DAY, HOUR = HOUR, PERMA = PERMA)
  
    __obj.asInstanceOf[Ban]
  }
}

