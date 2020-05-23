package typings.nightwatch.mod

import typings.nightwatch.anon.Class
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
  var value: Class
}

object NightwatchCallbackResultError {
  @scala.inline
  def apply(state: Error | String, status: `1`, value: Class): NightwatchCallbackResultError = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[NightwatchCallbackResultError]
  }
}

