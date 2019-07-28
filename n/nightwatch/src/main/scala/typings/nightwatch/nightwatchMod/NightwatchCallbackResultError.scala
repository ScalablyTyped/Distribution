package typings.nightwatch.nightwatchMod

import typings.nightwatch.Anon_Class
import typings.nightwatch.nightwatchNumbers.`1`
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NightwatchCallbackResultError
  extends NightwatchCallbackResult[js.Any] {
  var state: Error | String
  var status: `1`
   // we cannot use `number` so giving it a "symbolic" value allows to disjoint the union
  var value: Anon_Class
}

object NightwatchCallbackResultError {
  @scala.inline
  def apply(state: Error | String, status: `1`, value: Anon_Class): NightwatchCallbackResultError = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any], status = status, value = value)
  
    __obj.asInstanceOf[NightwatchCallbackResultError]
  }
}

