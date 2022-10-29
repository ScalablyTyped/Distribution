package typings.pixiCore.mod

import typings.pixiExtensions.mod.ExtensionMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pixi/core", "TickerPlugin")
@js.native
open class TickerPlugin ()
  extends typings.pixiTicker.mod.TickerPlugin
/* static members */
object TickerPlugin {
  
  @JSImport("@pixi/core", "TickerPlugin")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@pixi/core", "TickerPlugin._ticker")
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
  @JSImport("@pixi/core", "TickerPlugin.extension")
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
  
  @JSImport("@pixi/core", "TickerPlugin.ticker")
  @js.native
  def ticker: typings.pixiTicker.libTickerMod.Ticker = js.native
  inline def ticker_=(x: typings.pixiTicker.libTickerMod.Ticker): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ticker")(x.asInstanceOf[js.Any])
}
