package typings.nanotimer.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NanoTimer extends js.Object {
  /**
    * Clears current running interval.
    */
  def clearInterval(): Unit = js.native
  /**
    * Clears current running timeOut.
    */
  def clearTimeout(): Unit = js.native
  /**
    * Returns true if the timer currently has a scheduled timeout, or false otherwise
    */
  def hasTimeout(): Boolean = js.native
  def setInterval(task: js.Function1[/* repeated */ js.Any, Unit], args: String, interval: String): Unit = js.native
  def setInterval(
    task: js.Function1[/* repeated */ js.Any, Unit],
    args: String,
    interval: String,
    callback: js.Function1[/* error */ Error, Unit]
  ): Unit = js.native
  /**
    * Call the task at the regular interval specified in interval.
    */
  def setInterval(task: js.Function1[/* repeated */ js.Any, Unit], args: js.Array[_], interval: String): Unit = js.native
  def setInterval(
    task: js.Function1[/* repeated */ js.Any, Unit],
    args: js.Array[_],
    interval: String,
    callback: js.Function1[/* error */ Error, Unit]
  ): Unit = js.native
  def setTimeout(task: js.Function1[/* repeated */ js.Any, Unit], args: String, timeout: String): Unit = js.native
  def setTimeout(
    task: js.Function1[/* repeated */ js.Any, Unit],
    args: String,
    timeout: String,
    callback: js.Function1[/* results */ TimeoutResults, Unit]
  ): Unit = js.native
  /**
    * Call the task after the waiting the the timeout specified.
    */
  def setTimeout(task: js.Function1[/* repeated */ js.Any, Unit], args: js.Array[_], timeout: String): Unit = js.native
  def setTimeout(
    task: js.Function1[/* repeated */ js.Any, Unit],
    args: js.Array[_],
    timeout: String,
    callback: js.Function1[/* results */ TimeoutResults, Unit]
  ): Unit = js.native
  /**
    * Calculate the time it tooks to execute the task.
    */
  def time(task: js.Function1[/* cb */ js.Function0[Unit], Unit], args: String, interval: String): Double = js.native
  def time(
    task: js.Function1[/* cb */ js.Function0[Unit], Unit],
    args: String,
    interval: String,
    callback: js.Function1[/* error */ Error, Unit]
  ): Double = js.native
  def time(task: js.Function1[/* cb */ js.Function0[Unit], Unit], args: js.Array[_], interval: String): Double = js.native
  def time(
    task: js.Function1[/* cb */ js.Function0[Unit], Unit],
    args: js.Array[_],
    interval: String,
    callback: js.Function1[/* error */ Error, Unit]
  ): Double = js.native
}

