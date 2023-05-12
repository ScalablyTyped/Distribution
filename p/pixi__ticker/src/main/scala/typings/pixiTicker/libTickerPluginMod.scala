package typings.pixiTicker

import typings.pixiExtensions.mod.ExtensionMetadata
import typings.pixiTicker.libTickerMod.Ticker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTickerPluginMod {
  
  @JSImport("@pixi/ticker/lib/TickerPlugin", "TickerPlugin")
  @js.native
  open class TickerPlugin () extends StObject
  /* static members */
  object TickerPlugin {
    
    @JSImport("@pixi/ticker/lib/TickerPlugin", "TickerPlugin")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@pixi/ticker/lib/TickerPlugin", "TickerPlugin._ticker")
    @js.native
    def _ticker: Ticker = js.native
    inline def _ticker_=(x: Ticker): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_ticker")(x.asInstanceOf[js.Any])
    
    /**
      * Clean up the ticker, scoped to application.
      * @static
      * @private
      */
    inline def destroy(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("destroy")().asInstanceOf[Unit]
    
    /** @ignore */
    @JSImport("@pixi/ticker/lib/TickerPlugin", "TickerPlugin.extension")
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
    
    @JSImport("@pixi/ticker/lib/TickerPlugin", "TickerPlugin.ticker")
    @js.native
    def ticker: Ticker = js.native
    inline def ticker_=(x: Ticker): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ticker")(x.asInstanceOf[js.Any])
  }
  
  trait TickerPluginOptions extends StObject {
    
    /**
      * Automatically starts the rendering after the construction.
      *  **Note**: Setting this parameter to `false` does NOT stop the shared ticker even if you set
      *  `options.sharedTicker` to `true` in case that it is already started. Stop it by your own.
      * @memberof PIXI.IApplicationOptions
      * @default true
      */
    var autoStart: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Set`true` to use `Ticker.shared`, `false` to create new ticker.
      *  If set to `false`, you cannot register a handler to occur before anything that runs on the shared ticker.
      *  The system ticker will always run before both the shared ticker and the app ticker.
      * @memberof PIXI.IApplicationOptions
      * @default false
      */
    var sharedTicker: js.UndefOr[Boolean] = js.undefined
  }
  object TickerPluginOptions {
    
    inline def apply(): TickerPluginOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TickerPluginOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TickerPluginOptions] (val x: Self) extends AnyVal {
      
      inline def setAutoStart(value: Boolean): Self = StObject.set(x, "autoStart", value.asInstanceOf[js.Any])
      
      inline def setAutoStartUndefined: Self = StObject.set(x, "autoStart", js.undefined)
      
      inline def setSharedTicker(value: Boolean): Self = StObject.set(x, "sharedTicker", value.asInstanceOf[js.Any])
      
      inline def setSharedTickerUndefined: Self = StObject.set(x, "sharedTicker", js.undefined)
    }
  }
}
