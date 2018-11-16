package typings
package monacoDashEditorLib.monacoDashEditorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CancellationToken extends js.Object {
  val isCancellationRequested: scala.Boolean = js.native
  /**
       * An event emitted when cancellation is requested
       * @event
       */
  def onCancellationRequested(listener: js.Function1[/* e */ js.Any, _]): IDisposable = js.native
  /**
       * An event emitted when cancellation is requested
       * @event
       */
  def onCancellationRequested(listener: js.Function1[/* e */ js.Any, _], thisArg: js.Any): IDisposable = js.native
}

