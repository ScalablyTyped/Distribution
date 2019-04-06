package typings
package pDashThrottleLib.pDashThrottleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object pThrottleNs {
  type AbortError = pDashThrottleLib.pDashThrottleMod.AbortErrorClass
  type ThrottledFunction[Arguments /* <: js.Array[_] */, Return] = (js.Function1[/* arguments */ Arguments, js.Promise[Return]]) with pDashThrottleLib.Anon_Abort
}
