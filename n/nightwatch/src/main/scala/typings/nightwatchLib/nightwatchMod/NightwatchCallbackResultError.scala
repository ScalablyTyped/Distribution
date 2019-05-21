package typings
package nightwatchLib.nightwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NightwatchCallbackResultError
  extends NightwatchCallbackResult[js.Any] {
  var state: stdLib.Error | java.lang.String
  var status: nightwatchLib.nightwatchLibNumbers.`1`
   // we cannot use `number` so giving it a "symbolic" value allows to disjoint the union
  var value: nightwatchLib.Anon_Class
}

object NightwatchCallbackResultError {
  @scala.inline
  def apply(
    state: stdLib.Error | java.lang.String,
    status: nightwatchLib.nightwatchLibNumbers.`1`,
    value: nightwatchLib.Anon_Class
  ): NightwatchCallbackResultError = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any], status = status, value = value)
  
    __obj.asInstanceOf[NightwatchCallbackResultError]
  }
}

