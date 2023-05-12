package typings.pixiCore.mod

import typings.pixiCore.libIrendererMod.IRendererOptions
import typings.pixiCore.libPluginPluginSystemMod.IRendererPlugins
import typings.pixiExtensions.mod.ExtensionMetadata
import typings.std.Partial
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pixi/core", "Renderer")
@js.native
/**
  * @param {PIXI.IRendererOptions} [options] - See {@link PIXI.settings.RENDER_OPTIONS} for defaults.
  */
open class Renderer ()
  extends typings.pixiCore.libRendererMod.Renderer {
  def this(options: Partial[IRendererOptions]) = this()
}
/* static members */
object Renderer {
  
  @JSImport("@pixi/core", "Renderer")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Collection of installed plugins. These are included by default in PIXI, but can be excluded
    * by creating a custom build. Consult the README for more information about creating custom
    * builds and excluding plugins.
    * @private
    */
  @JSImport("@pixi/core", "Renderer.__plugins")
  @js.native
  val __plugins: IRendererPlugins = js.native
  
  /**
    * The collection of installed systems.
    * @private
    */
  @JSImport("@pixi/core", "Renderer.__systems")
  @js.native
  val __systems: Record[String, Any] = js.native
  
  /** @ignore */
  @JSImport("@pixi/core", "Renderer.extension")
  @js.native
  val `extension`: ExtensionMetadata = js.native
  
  /**
    * Create renderer if WebGL is available. Overrideable
    * by the **@pixi/canvas-renderer** package to allow fallback.
    * throws error if WebGL is not available.
    * @param options
    * @private
    */
  inline def test(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("test")().asInstanceOf[Boolean]
  inline def test(options: Partial[IRendererOptions]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("test")(options.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
