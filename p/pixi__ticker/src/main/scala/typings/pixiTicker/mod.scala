package typings.pixiTicker

import typings.pixiExtensions.mod.ExtensionMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@pixi/ticker", "Ticker")
  @js.native
  open class Ticker ()
    extends typings.pixiTicker.libTickerMod.Ticker
  /* static members */
  object Ticker {
    
    @JSImport("@pixi/ticker", "Ticker")
    @js.native
    val ^ : js.Any = js.native
    
    /** The private shared ticker instance */
    @JSImport("@pixi/ticker", "Ticker._shared")
    @js.native
    def _shared: Any = js.native
    inline def _shared_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_shared")(x.asInstanceOf[js.Any])
    
    /** The private system ticker instance  */
    @JSImport("@pixi/ticker", "Ticker._system")
    @js.native
    def _system: Any = js.native
    inline def _system_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_system")(x.asInstanceOf[js.Any])
    
    /**
      * Target frames per millisecond.
      * @static
      */
    @JSImport("@pixi/ticker", "Ticker.targetFPMS")
    @js.native
    def targetFPMS: Double = js.native
    inline def targetFPMS_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("targetFPMS")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@pixi/ticker", "TickerPlugin")
  @js.native
  open class TickerPlugin ()
    extends typings.pixiTicker.libTickerPluginMod.TickerPlugin
  /* static members */
  object TickerPlugin {
    
    @JSImport("@pixi/ticker", "TickerPlugin")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@pixi/ticker", "TickerPlugin._ticker")
    @js.native
    def _ticker: typings.pixiTicker.libTickerMod.Ticker = js.native
    inline def _ticker_=(x: typings.pixiTicker.libTickerMod.Ticker): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_ticker")(x.asInstanceOf[js.Any])
    
    /**
      * Clean up the ticker, scoped to application.
      * @static
      * @private
      */
    inline def destroy(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("destroy")().asInstanceOf[Unit]
    
    /** @ignore */
    @JSImport("@pixi/ticker", "TickerPlugin.extension")
    @js.native
    val `extension`: ExtensionMetadata = js.native
    
    /**
      * Initialize the plugin with scope of application instance
      * @static
      * @private
      * @param {object} [options] - See application options
      */
    inline def init(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("init")().asInstanceOf[Unit]
    inline def init(
      options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GlobalMixins.IApplicationOptions */ Any
    ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def start(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("start")().asInstanceOf[Unit]
    
    inline def stop(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("stop")().asInstanceOf[Unit]
    
    @JSImport("@pixi/ticker", "TickerPlugin.ticker")
    @js.native
    def ticker: typings.pixiTicker.libTickerMod.Ticker = js.native
    inline def ticker_=(x: typings.pixiTicker.libTickerMod.Ticker): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ticker")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@pixi/ticker", "UPDATE_PRIORITY")
  @js.native
  object UPDATE_PRIORITY extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.pixiTicker.libConstMod.UPDATE_PRIORITY & Double] = js.native
    
    /* 25 */ val HIGH: typings.pixiTicker.libConstMod.UPDATE_PRIORITY.HIGH & Double = js.native
    
    /* 50 */ val INTERACTION: typings.pixiTicker.libConstMod.UPDATE_PRIORITY.INTERACTION & Double = js.native
    
    /* -25 */ val LOW: typings.pixiTicker.libConstMod.UPDATE_PRIORITY.LOW & Double = js.native
    
    /* 0 */ val NORMAL: typings.pixiTicker.libConstMod.UPDATE_PRIORITY.NORMAL & Double = js.native
    
    /* -50 */ val UTILITY: typings.pixiTicker.libConstMod.UPDATE_PRIORITY.UTILITY & Double = js.native
  }
}
