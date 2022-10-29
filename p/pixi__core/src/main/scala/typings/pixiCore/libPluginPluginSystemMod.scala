package typings.pixiCore

import org.scalablytyped.runtime.StringDictionary
import typings.pixiCore.libIrendererMod.IRenderer
import typings.pixiCore.libSystemIsystemMod.ISystem
import typings.pixiExtensions.mod.ExtensionMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPluginPluginSystemMod {
  
  @JSImport("@pixi/core/lib/plugin/PluginSystem", "PluginSystem")
  @js.native
  open class PluginSystem protected ()
    extends StObject
       with ISystem[IRendererPlugins, Null] {
    def this(renderer: IRenderer) = this()
    
    @JSName("destroy")
    def destroy_MPluginSystem(): Unit = js.native
    
    /**
      * Initialize the plugins.
      * @protected
      * @param {object} staticMap - The dictionary of statically saved plugins.
      */
    @JSName("init")
    def init_MPluginSystem(staticMap: IRendererPlugins): Unit = js.native
    
    /**
      * Collection of plugins.
      * @readonly
      * @member {object}
      */
    val plugins: IRendererPlugins = js.native
    
    /* private */ var renderer: Any = js.native
  }
  /* static members */
  object PluginSystem {
    
    /** @ignore */
    @JSImport("@pixi/core/lib/plugin/PluginSystem", "PluginSystem.extension")
    @js.native
    val `extension`: ExtensionMetadata = js.native
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GlobalMixins.IRendererPlugins * / any */ trait IRendererPlugins
    extends StObject
       with /* key */ StringDictionary[Any]
  object IRendererPlugins {
    
    inline def apply(): IRendererPlugins = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IRendererPlugins]
    }
  }
}
