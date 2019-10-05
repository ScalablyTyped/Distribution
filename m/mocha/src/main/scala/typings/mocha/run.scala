package typings.mocha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("run")
@js.native
object run extends js.Object {
  // #region Test interface augmentations
  /**
    * Triggers root suite execution.
    *
    * - _Only available if flag --delay is passed into Mocha._
    * - _Only available when invoked via the mocha CLI._
    *
    * @see https://mochajs.org/api/global.html#runWithSuite
    */
  def apply(): Unit = js.native
}

