package typings.pixiCore

import typings.pixiCore.libIrendererMod.IRenderableObject
import typings.pixiCore.libIrendererMod.IRendererRenderOptions
import typings.pixiCore.libRendererMod.Renderer
import typings.pixiCore.libSystemIsystemMod.ISystem
import typings.pixiExtensions.mod.ExtensionMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRenderObjectRendererSystemMod {
  
  @JSImport("@pixi/core/lib/render/ObjectRendererSystem", "ObjectRendererSystem")
  @js.native
  open class ObjectRendererSystem protected ()
    extends StObject
       with ISystem[Null, Null] {
    def this(renderer: Renderer) = this()
    
    @JSName("destroy")
    def destroy_MObjectRendererSystem(): Unit = js.native
    
    /**
      * the last object rendered by the renderer. Useful for other plugins like interaction managers
      * @readonly
      */
    var lastObjectRendered: IRenderableObject = js.native
    
    /**
      * Renders the object to its WebGL view.
      * @param displayObject - The object to be rendered.
      * @param options - the options to be passed to the renderer
      */
    def render(displayObject: IRenderableObject): Unit = js.native
    def render(displayObject: IRenderableObject, options: IRendererRenderOptions): Unit = js.native
    
    var renderer: Renderer = js.native
    
    /**
      * Flag if we are rendering to the screen vs renderTexture
      * @readonly
      * @default true
      */
    var renderingToScreen: Boolean = js.native
  }
  /* static members */
  object ObjectRendererSystem {
    
    /** @ignore */
    @JSImport("@pixi/core/lib/render/ObjectRendererSystem", "ObjectRendererSystem.extension")
    @js.native
    val `extension`: ExtensionMetadata = js.native
  }
}
