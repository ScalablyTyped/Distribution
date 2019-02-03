package typings
package mochaLib.mochaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// #endregion Runner "pending" event
// #region Runner untyped events
// #endregion Runner "fail" event
// #region Runner "pending" event
// #endregion Runner "pass" event
// #region Runner "fail" event
// #endregion Runner "hook end" event
// #region Runner "pass" event
// #endregion Runner "hook" event
// #region Runner "hook end" event
// #endregion Runner "test end" event
// #region Runner "hook" event
// #endregion Runner "test" event
// #region Runner "test end" event
// #endregion Runner "suite end" event
// #region Runner "test" event
// #endregion Runner "suite" event
// #region Runner "suite end" event
// #endregion Runner "end" event
// #region Runner "suite" event
// #endregion Runner "start" event
// #region Runner "end" event
// #endregion Runner "waiting" event
// #region Runner "start" event
// #region Runner "waiting" event
/**
  * Initialize a `Runner` for the given `suite`.
  *
  * @see https://mochajs.org/api/Mocha.Runner.html
  */
@JSImport("mocha", "Runner")
@js.native
class Runner protected ()
  extends mochaLib.MochaNs.Runner {
  /** @deprecated Use the overload that accepts `Mocha.Suite` instead. */
  def this(suite: mochaLib.MochaNs.ISuite, delay: scala.Boolean) = this()
  def this(suite: mochaLib.MochaNs.Suite, delay: scala.Boolean) = this()
}

/* static members */
@JSImport("mocha", "Runner")
@js.native
object Runner extends js.Object {
  /**
    * Wrapper for setImmediate, process.nextTick, or browser polyfill.
    */
  /* protected */ def immediately(callback: js.Function): scala.Unit = js.native
}

