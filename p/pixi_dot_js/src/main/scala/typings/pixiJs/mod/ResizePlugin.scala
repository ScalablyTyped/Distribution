package typings.pixiJs.mod

import typings.pixiApp.mod.IApplicationOptions
import typings.pixiApp.mod.ResizeableRenderer
import typings.pixiExtensions.mod.ExtensionMetadata
import typings.std.HTMLElement
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pixi.js", "ResizePlugin")
@js.native
open class ResizePlugin ()
  extends typings.pixiApp.mod.ResizePlugin
/* static members */
object ResizePlugin {
  
  @JSImport("pixi.js", "ResizePlugin")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("pixi.js", "ResizePlugin._resizeId")
  @js.native
  def _resizeId: Any = js.native
  inline def _resizeId_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_resizeId")(x.asInstanceOf[js.Any])
  
  @JSImport("pixi.js", "ResizePlugin._resizeTo")
  @js.native
  def _resizeTo: Any = js.native
  inline def _resizeTo_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_resizeTo")(x.asInstanceOf[js.Any])
  
  @JSImport("pixi.js", "ResizePlugin.cancelResize")
  @js.native
  def cancelResize: Any = js.native
  inline def cancelResize_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cancelResize")(x.asInstanceOf[js.Any])
  
  /**
    * Clean up the ticker, scoped to application
    * @static
    * @private
    */
  inline def destroy(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("destroy")().asInstanceOf[Unit]
  
  /** @ignore */
  @JSImport("pixi.js", "ResizePlugin.extension")
  @js.native
  val `extension`: ExtensionMetadata = js.native
  
  /**
    * Initialize the plugin with scope of application instance
    * @static
    * @private
    * @param {object} [options] - See application options
    */
  inline def init(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("init")().asInstanceOf[Unit]
  inline def init(options: IApplicationOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def queueResize(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("queueResize")().asInstanceOf[Unit]
  
  @JSImport("pixi.js", "ResizePlugin.renderer")
  @js.native
  def renderer: ResizeableRenderer = js.native
  inline def renderer_=(x: ResizeableRenderer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("renderer")(x.asInstanceOf[js.Any])
  
  inline def resize(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resize")().asInstanceOf[Unit]
  
  @JSImport("pixi.js", "ResizePlugin.resizeTo")
  @js.native
  def resizeTo: Window | HTMLElement = js.native
  inline def resizeTo_=(x: Window | HTMLElement): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("resizeTo")(x.asInstanceOf[js.Any])
}
