package typings.monacoEditor.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CancellationToken extends StObject {
  
  /**
    * A flag signalling is cancellation has been requested.
    */
  val isCancellationRequested: Boolean = js.native
  
  /**
    * An event which fires when cancellation is requested. This event
    * only ever fires `once` as cancellation can only happen once. Listeners
    * that are registered after cancellation will be called (next event loop run),
    * but also only once.
    *
    * @event
    */
  def onCancellationRequested(listener: js.Function1[/* e */ js.Any, _]): IDisposable = js.native
  def onCancellationRequested(
    listener: js.Function1[/* e */ js.Any, _],
    thisArgs: js.UndefOr[scala.Nothing],
    disposables: js.Array[IDisposable]
  ): IDisposable = js.native
  def onCancellationRequested(listener: js.Function1[/* e */ js.Any, _], thisArgs: js.Any): IDisposable = js.native
  def onCancellationRequested(listener: js.Function1[/* e */ js.Any, _], thisArgs: js.Any, disposables: js.Array[IDisposable]): IDisposable = js.native
}
