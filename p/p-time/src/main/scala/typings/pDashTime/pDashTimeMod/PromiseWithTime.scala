package typings.pDashTime.pDashTimeMod

import typings.std.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PromiseWithTime[ValueType] extends Promise[ValueType] {
  /**
  		The elapsed time in milliseconds.
  		*/
  val time: js.UndefOr[Double] = js.native
}

