package typings.popmotion

import typings.popmotion.libObserverTypesMod.IObserver
import typings.popmotion.libObserverTypesMod.ObserverCandidate
import typings.popmotion.libObserverTypesMod.ObserverProps
import typings.popmotion.libObserverTypesMod.PartialObserver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("popmotion/lib/observer", JSImport.Namespace)
@js.native
object libObserverMod extends js.Object {
  @js.native
  class Observer protected () extends IObserver {
    def this(hasMiddlewareOnComplete: ObserverProps, observer: PartialObserver) = this()
    var isActive: js.Any = js.native
    var observer: js.Any = js.native
    var onComplete: js.Any = js.native
    var updateObserver: js.Any = js.native
    @JSName("update")
    def update_MObserver(v: js.Any): Unit = js.native
  }
  
  def default(observerCandidate: ObserverCandidate, hasMiddleware: ObserverProps): Observer = js.native
  def default(observerCandidate: ObserverCandidate, hasMiddleware: ObserverProps, onComplete: js.Function): Observer = js.native
}

