package typings.nightwatch.nightwatchMod

import typings.nightwatch.Anon_Class
import typings.nightwatch.nightwatchNumbers.`0`
import typings.nightwatch.nightwatchNumbers.`1`
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.nightwatch.nightwatchMod.NightwatchTypedCallbackResult[T]
  - typings.nightwatch.nightwatchMod.NightwatchCallbackResultError
*/
trait NightwatchCallbackResult[T] extends js.Object

object NightwatchCallbackResult {
  @scala.inline
  def NightwatchTypedCallbackResult[T](state: Error | String, status: `0`, value: T): NightwatchCallbackResult[T] = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NightwatchCallbackResult[T]]
  }
  @scala.inline
  def NightwatchCallbackResultError[T](state: Error | String, status: `1`, value: Anon_Class): NightwatchCallbackResult[T] = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NightwatchCallbackResult[T]]
  }
}

