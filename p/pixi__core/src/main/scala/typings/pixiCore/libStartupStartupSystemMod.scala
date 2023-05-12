package typings.pixiCore

import typings.pixiCore.libIrendererMod.IRenderer
import typings.pixiCore.libSystemIsystemMod.ISystem
import typings.pixiExtensions.mod.ExtensionMetadata
import typings.pixiSettings.libIcanvasMod.ICanvas
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libStartupStartupSystemMod {
  
  @JSImport("@pixi/core/lib/startup/StartupSystem", "StartupSystem")
  @js.native
  open class StartupSystem protected ()
    extends StObject
       with ISystem[StartupSystemOptions, Null] {
    def this(renderer: IRenderer[ICanvas]) = this()
    
    @JSName("destroy")
    def destroy_MStartupSystem(): Unit = js.native
    
    val renderer: IRenderer[ICanvas] = js.native
    
    /**
      * It all starts here! This initiates every system, passing in the options for any system by name.
      * @param options - the config for the renderer and all its systems
      */
    def run(options: StartupSystemOptions): Unit = js.native
  }
  /* static members */
  object StartupSystem {
    
    @JSImport("@pixi/core/lib/startup/StartupSystem", "StartupSystem")
    @js.native
    val ^ : js.Any = js.native
    
    /** @ignore */
    @JSImport("@pixi/core/lib/startup/StartupSystem", "StartupSystem.defaultOptions")
    @js.native
    def defaultOptions: StartupSystemOptions = js.native
    inline def defaultOptions_=(x: StartupSystemOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultOptions")(x.asInstanceOf[js.Any])
    
    /** @ignore */
    @JSImport("@pixi/core/lib/startup/StartupSystem", "StartupSystem.extension")
    @js.native
    val `extension`: ExtensionMetadata = js.native
  }
  
  trait StartupSystemOptions extends StObject {
    
    /**
      * Whether to log the version and type information of renderer to console.
      * @memberof PIXI.IRendererOptions
      */
    var hello: Boolean
  }
  object StartupSystemOptions {
    
    inline def apply(hello: Boolean): StartupSystemOptions = {
      val __obj = js.Dynamic.literal(hello = hello.asInstanceOf[js.Any])
      __obj.asInstanceOf[StartupSystemOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StartupSystemOptions] (val x: Self) extends AnyVal {
      
      inline def setHello(value: Boolean): Self = StObject.set(x, "hello", value.asInstanceOf[js.Any])
    }
  }
}
