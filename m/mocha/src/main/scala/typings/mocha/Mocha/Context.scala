package typings.mocha.Mocha

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// #endregion Runnable untyped events
/**
  * Test context
  *
  * @see https://mochajs.org/api/module-Context.html#~Context
  */
@JSGlobal("Mocha.Context")
@js.native
class Context ()
  extends /* key */ StringDictionary[js.Any] {
  var _runnable: js.Any = js.native
  var currentTest: js.UndefOr[Test] = js.native
  var test: js.UndefOr[Runnable] = js.native
  /**
    * Get whether timeouts are enabled.
    */
  def enableTimeouts(): Boolean = js.native
  /**
    * Set whether timeouts are enabled.
    */
  def enableTimeouts(enabled: Boolean): this.type = js.native
  /**
    * Get the number of allowed retries on failed tests.
    */
  def retries(): Double = js.native
  /**
    * Set the number of allowed retries on failed tests.
    */
  def retries(n: Double): this.type = js.native
  /**
    * Get the context `Runnable`.
    */
  def runnable(): Runnable = js.native
  /** @deprecated Use the overload that accepts `Mocha.Runnable` instead. */
  def runnable(runnable: IRunnable): this.type = js.native
  /**
    * Set the context `Runnable`.
    */
  def runnable(runnable: Runnable): this.type = js.native
  /**
    * Mark a test as skipped.
    */
  def skip(): scala.Nothing = js.native
  /**
    * Get test slowness threshold.
    */
  def slow(): Double = js.native
  /**
    * Set test slowness threshold.
    */
  def slow(ms: String): this.type = js.native
  def slow(ms: Double): this.type = js.native
  /**
    * Get test timeout.
    */
  def timeout(): Double = js.native
  /**
    * Set test timeout.
    */
  def timeout(ms: String): this.type = js.native
  def timeout(ms: Double): this.type = js.native
}

