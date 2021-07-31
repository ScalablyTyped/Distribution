package typings.plottable

import typings.plottable.scalesMod.ITransformableScale
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deferredRendererMod {
  
  @JSImport("plottable/build/src/plots/deferredRenderer", "DeferredRenderer")
  @js.native
  class DeferredRenderer[X, Y] protected () extends StObject {
    def this(
      renderCallback: js.Function0[Unit],
      applyTransformCallback: js.Function4[/* tx */ Double, /* ty */ Double, /* sx */ Double, /* sy */ Double, Unit]
    ) = this()
    
    /* private */ def applyTransform(): js.Any = js.native
    
    var applyTransformCallback: js.Any = js.native
    
    var domainTransformX: js.Any = js.native
    
    var domainTransformY: js.Any = js.native
    
    var renderCallback: js.Any = js.native
    
    var renderDeferred: js.Any = js.native
    
    def resetTransforms(): Unit = js.native
    
    def setDomains(): Unit = js.native
    def setDomains(scaleX: Unit, scaleY: ITransformableScale): Unit = js.native
    def setDomains(scaleX: ITransformableScale): Unit = js.native
    def setDomains(scaleX: ITransformableScale, scaleY: ITransformableScale): Unit = js.native
    
    var timeoutToken: js.Any = js.native
    
    def updateDomains(): Unit = js.native
    def updateDomains(scaleX: Unit, scaleY: ITransformableScale): Unit = js.native
    def updateDomains(scaleX: ITransformableScale): Unit = js.native
    def updateDomains(scaleX: ITransformableScale, scaleY: ITransformableScale): Unit = js.native
  }
  /* static members */
  object DeferredRenderer {
    
    @JSImport("plottable/build/src/plots/deferredRenderer", "DeferredRenderer")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("plottable/build/src/plots/deferredRenderer", "DeferredRenderer.DEFERRED_RENDERING_DELAY")
    @js.native
    def DEFERRED_RENDERING_DELAY: Double = js.native
    @scala.inline
    def DEFERRED_RENDERING_DELAY_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFERRED_RENDERING_DELAY")(x.asInstanceOf[js.Any])
  }
}
