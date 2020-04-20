package typings.plugapi.mod.Enum

import typings.plugapi.plugapiStrings.l
import typings.plugapi.plugapiStrings.m
import typings.plugapi.plugapiStrings.s
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Mute extends js.Object {
  var LONG: l
  var MEDIUM: m
  var SHORT: s
}

object Mute {
  @scala.inline
  def apply(LONG: l, MEDIUM: m, SHORT: s): Mute = {
    val __obj = js.Dynamic.literal(LONG = LONG.asInstanceOf[js.Any], MEDIUM = MEDIUM.asInstanceOf[js.Any], SHORT = SHORT.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mute]
  }
}

