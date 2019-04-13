package typings
package plugapiLib.plugapiMod.EnumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Mute extends js.Object {
  var LONG: plugapiLib.plugapiLibStrings.l
  var MEDIUM: plugapiLib.plugapiLibStrings.m
  var SHORT: plugapiLib.plugapiLibStrings.s
}

object Mute {
  @scala.inline
  def apply(
    LONG: plugapiLib.plugapiLibStrings.l,
    MEDIUM: plugapiLib.plugapiLibStrings.m,
    SHORT: plugapiLib.plugapiLibStrings.s
  ): Mute = {
    val __obj = js.Dynamic.literal(LONG = LONG, MEDIUM = MEDIUM, SHORT = SHORT)
  
    __obj.asInstanceOf[Mute]
  }
}

