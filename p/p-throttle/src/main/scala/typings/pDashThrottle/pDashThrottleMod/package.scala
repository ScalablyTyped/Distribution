package typings.pDashThrottle

import typings.pDashThrottle.Anon_Abort
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object pDashThrottleMod {
  type AbortError = AbortErrorClass
  type ThrottledFunction[Arguments /* <: js.Array[_] */, Return] = (js.Function1[/* arguments */ Arguments, js.Promise[Return]]) with Anon_Abort
}
