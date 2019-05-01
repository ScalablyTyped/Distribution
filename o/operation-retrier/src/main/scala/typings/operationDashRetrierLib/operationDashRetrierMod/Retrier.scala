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
  var attemptNum: js.Any = js.native
  var currDelay: js.Any = js.native
  var inProgress: js.Any = js.native
  var initialDelay: js.Any = js.native
  var maxAttemptsCount: js.Any = js.native
  var maxAttemptsTime: js.Any = js.native
  var maxDelay: js.Any = js.native
  var minDelay: js.Any = js.native
  var prevDelay: js.Any = js.native
  var randomness: js.Any = js.native
  var reject: js.Any = js.native
  var resolve: js.Any = js.native
  var startTimestamp: js.Any = js.native
  var timeout: js.Any = js.native
  /* private */ def attempt(): js.Any = js.native
  def cancel(): scala.Unit = js.native
  /* private */ def cleanup(): js.Any = js.native
  def failed(err: stdLib.Error): scala.Unit = js.native
  def failed(err: stdLib.Error, nextAttemptDelayOverride: scala.Double): scala.Unit = js.native
  /* private */ def nextDelay(): js.Any = js.native
  /* private */ def nextDelay(delayOverride: js.Any): js.Any = js.native
  /* private */ def randomize(delay: js.Any): js.Any = js.native
  def run[T](handler: js.Function0[js.Promise[T]]): js.Promise[T] = js.native
  /* private */ def scheduleAttempt(): js.Any = js.native
  /* private */ def scheduleAttempt(delayOverride: js.Any): js.Any = js.native
  def start(): js.Promise[js.Object] = js.native
  def succeeded(): scala.Unit = js.native
  def succeeded(arg: js.Any): scala.Unit = js.native
}

