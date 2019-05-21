package typings
package nightwatchLib.nightwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NightwatchTypedCallbackResult[T] extends NightwatchCallbackResult[T] {
  var state: stdLib.Error | java.lang.String
  var status: nightwatchLib.nightwatchLibNumbers.`0`
  var value: T
}

object NightwatchTypedCallbackResult {
  @scala.inline
  def apply[T](state: stdLib.Error | java.lang.String, status: nightwatchLib.nightwatchLibNumbers.`0`, value: T): NightwatchTypedCallbackResult[T] = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any], status = status, value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NightwatchTypedCallbackResult[T]]
  }
}

