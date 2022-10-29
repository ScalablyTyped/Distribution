package typings.pixiCore

import typings.pixiCore.libBackgroundBackgroundSystemMod.BackgroundOptions
import typings.pixiCore.libContextContextSystemMod.ContextOptions
import typings.pixiCore.libIrendererMod.IRenderer
import typings.pixiCore.libPluginPluginSystemMod.IRendererPlugins
import typings.pixiCore.libSystemIsystemMod.ISystem
import typings.pixiCore.libViewViewSystemMod.ViewOptions
import typings.pixiExtensions.mod.ExtensionMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libStartupStartupSystemMod {
  
  @JSImport("@pixi/core/lib/startup/StartupSystem", "StartupSystem")
  @js.native
  open class StartupSystem protected ()
    extends StObject
       with ISystem[Null, Null] {
    def this(renderer: IRenderer) = this()
    
    @JSName("destroy")
    def destroy_MStartupSystem(): Unit = js.native
    
    val renderer: IRenderer = js.native
    
    /**
      * It all starts here! This initiates every system, passing in the options for any system by name.
      * @param options - the config for the renderer and all its systems
      */
    def run(options: StartupOptions): Unit = js.native
  }
  /* static members */
  object StartupSystem {
    
    /** @ignore */
    @JSImport("@pixi/core/lib/startup/StartupSystem", "StartupSystem.extension")
    @js.native
    val `extension`: ExtensionMetadata = js.native
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in string ]: unknown} */ trait StartupOptions extends StObject {
    
    var _plugin: IRendererPlugins
    
    var _view: ViewOptions
    
    var background: BackgroundOptions
    
    var context: js.UndefOr[ContextOptions] = js.undefined
    
    var hello: Boolean
  }
  object StartupOptions {
    
    inline def apply(_plugin: IRendererPlugins, _view: ViewOptions, background: BackgroundOptions, hello: Boolean): StartupOptions = {
      val __obj = js.Dynamic.literal(_plugin = _plugin.asInstanceOf[js.Any], _view = _view.asInstanceOf[js.Any], background = background.asInstanceOf[js.Any], hello = hello.asInstanceOf[js.Any])
      __obj.asInstanceOf[StartupOptions]
    }
    
    extension [Self <: StartupOptions](x: Self) {
      
      inline def setBackground(value: BackgroundOptions): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      inline def setContext(value: ContextOptions): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      inline def setHello(value: Boolean): Self = StObject.set(x, "hello", value.asInstanceOf[js.Any])
      
      inline def set_plugin(value: IRendererPlugins): Self = StObject.set(x, "_plugin", value.asInstanceOf[js.Any])
      
      inline def set_view(value: ViewOptions): Self = StObject.set(x, "_view", value.asInstanceOf[js.Any])
    }
  }
}
