package typings.plottable

import typings.plottable.scalesMod.ITransformableScale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable/build/src/plots/deferredRenderer", JSImport.Namespace)
@js.native
object deferredRendererMod extends js.Object {
  @js.native
  class DeferredRenderer[X, Y] protected () extends js.Object {
    def this(
      renderCallback: js.Function0[Unit],
      applyTransformCallback: js.Function4[/* tx */ Double, /* ty */ Double, /* sx */ Double, /* sy */ Double, Unit]
    ) = this()
    var applyTransformCallback: js.Any = js.native
    var domainTransformX: js.Any = js.native
    var domainTransformY: js.Any = js.native
    var renderCallback: js.Any = js.native
    var renderDeferred: js.Any = js.native
    var timeoutToken: js.Any = js.native
    /* private */ def applyTransform(): js.Any = js.native
    def resetTransforms(): Unit = js.native
    def setDomains(): Unit = js.native
    def setDomains(scaleX: js.UndefOr[scala.Nothing], scaleY: ITransformableScale): Unit = js.native
    def setDomains(scaleX: ITransformableScale): Unit = js.native
    def setDomains(scaleX: ITransformableScale, scaleY: ITransformableScale): Unit = js.native
    def updateDomains(): Unit = js.native
    def updateDomains(scaleX: js.UndefOr[scala.Nothing], scaleY: ITransformableScale): Unit = js.native
    def updateDomains(scaleX: ITransformableScale): Unit = js.native
    def updateDomains(scaleX: ITransformableScale, scaleY: ITransformableScale): Unit = js.native
  }
  
  /* static members */
  @js.native
  object DeferredRenderer extends js.Object {
    var DEFERRED_RENDERING_DELAY: Double = js.native
  }
  
}

