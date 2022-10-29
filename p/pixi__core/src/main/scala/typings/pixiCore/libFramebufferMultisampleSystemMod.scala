package typings.pixiCore

import typings.pixiConstants.mod.MSAA_QUALITY
import typings.pixiCore.libIrendererMod.IRenderingContext
import typings.pixiCore.libRendererMod.Renderer
import typings.pixiCore.libSystemIsystemMod.ISystem
import typings.pixiExtensions.mod.ExtensionMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFramebufferMultisampleSystemMod {
  
  @JSImport("@pixi/core/lib/framebuffer/MultisampleSystem", "MultisampleSystem")
  @js.native
  open class MultisampleSystem protected ()
    extends StObject
       with ISystem[Null, Null] {
    def this(renderer: Renderer) = this()
    
    /* protected */ def contextChange(gl: IRenderingContext): Unit = js.native
    
    @JSName("destroy")
    def destroy_MMultisampleSystem(): Unit = js.native
    
    /**
      * The number of msaa samples of the canvas.
      * @readonly
      */
    var multisample: MSAA_QUALITY = js.native
    
    /* private */ var renderer: Any = js.native
  }
  /* static members */
  object MultisampleSystem {
    
    /** @ignore */
    @JSImport("@pixi/core/lib/framebuffer/MultisampleSystem", "MultisampleSystem.extension")
    @js.native
    val `extension`: ExtensionMetadata = js.native
  }
}
