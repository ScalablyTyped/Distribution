package typings
package pDashTimeLib.pDashTimeMod.pTimeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PromiseWithTime[T]
  extends stdLib.Promise[T] {
  var time: js.UndefOr[scala.Double] = js.native
}

