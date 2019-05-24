package typings
package operationDashRetrierLib.operationDashRetrierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides retrier service
  */
@JSImport("operation-retrier", "Retrier")
@js.native
class Retrier protected ()
  extends nodeLib.eventsMod.EventEmitter {
  /**
    * Creates a new Retrier instance
    */
  def this(options: operationDashRetrierLib.Anon_Initial) = this()
  var attempt: js.Any = js.native
  var attemptNum: js.Any = js.native
  var cleanup: js.Any = js.native
  var currDelay: js.Any = js.native
  var inProgress: js.Any = js.native
  val initialDelay: js.Any = js.native
  val maxAttemptsCount: js.Any = js.native
  val maxAttemptsTime: js.Any = js.native
  var maxDelay: js.Any = js.native
  val minDelay: js.Any = js.native
  var nextDelay: js.Any = js.native
  var prevDelay: js.Any = js.native
  var randomize: js.Any = js.native
  val randomness: js.Any = js.native
  var reject: js.Any = js.native
  var resolve: js.Any = js.native
  var scheduleAttempt: js.Any = js.native
  var startTimestamp: js.Any = js.native
  var timeout: js.Any = js.native
  def cancel(): scala.Unit = js.native
  def failed(err: stdLib.Error): scala.Unit = js.native
  def failed(err: stdLib.Error, nextAttemptDelayOverride: scala.Double): scala.Unit = js.native
  def run[T](handler: js.Function0[js.Promise[T]]): js.Promise[T] = js.native
  def start(): js.Promise[js.Object] = js.native
  def succeeded(): scala.Unit = js.native
  def succeeded(arg: js.Any): scala.Unit = js.native
}

