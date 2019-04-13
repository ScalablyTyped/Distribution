package typings
package pDashTimeLib.pDashTimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PromiseWithTime[ValueType]
  extends stdLib.Promise[ValueType] {
  /**
  		The elapsed time in milliseconds.
  		*/
  val time: js.UndefOr[scala.Double] = js.native
}

