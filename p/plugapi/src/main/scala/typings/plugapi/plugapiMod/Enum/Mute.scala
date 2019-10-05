package typings.plugapi.plugapiMod.Enum

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
    val __obj = js.Dynamic.literal(LONG = LONG, MEDIUM = MEDIUM, SHORT = SHORT)
  
    __obj.asInstanceOf[Mute]
  }
}

