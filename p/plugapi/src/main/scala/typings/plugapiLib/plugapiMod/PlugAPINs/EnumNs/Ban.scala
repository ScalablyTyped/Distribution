package typings
package plugapiLib.plugapiMod.PlugAPINs.EnumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Ban extends js.Object {
  var DAY: plugapiLib.plugapiLibStrings.d
  var HOUR: plugapiLib.plugapiLibStrings.h
  var PERMA: plugapiLib.plugapiLibStrings.f
}

object Ban {
  @scala.inline
  def apply(
    DAY: plugapiLib.plugapiLibStrings.d,
    HOUR: plugapiLib.plugapiLibStrings.h,
    PERMA: plugapiLib.plugapiLibStrings.f
  ): Ban = {
    val __obj = js.Dynamic.literal(DAY = DAY, HOUR = HOUR, PERMA = PERMA)
  
    __obj.asInstanceOf[Ban]
  }
}

