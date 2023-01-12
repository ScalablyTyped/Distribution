package typings.pixiCore

import typings.pixiConstants.mod.GC_MODES
import typings.pixiCore.libRenderTextureRenderTextureMod.RenderTexture
import typings.pixiCore.libRendererMod.Renderer
import typings.pixiCore.libSystemIsystemMod.ISystem
import typings.pixiCore.libTexturesResourcesResourceMod.Resource
import typings.pixiCore.libTexturesTextureMod.Texture
import typings.pixiExtensions.mod.ExtensionMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTexturesTextureGCSystemMod {
  
  @JSImport("@pixi/core/lib/textures/TextureGCSystem", "TextureGCSystem")
  @js.native
  open class TextureGCSystem protected ()
    extends StObject
       with ISystem[Null, Null] {
    /** @param renderer - The renderer this System works for. */
    def this(renderer: Renderer) = this()
    
    /**
      * Check count
      * @readonly
      */
    var checkCount: Double = js.native
    
    /**
      * Maximum number of item to check
      * @see PIXI.settings.GC_MAX_CHECK_COUNT
      */
    var checkCountMax: Double = js.native
    
    /**
      * Count
      * @readonly
      */
    var count: Double = js.native
    
    @JSName("destroy")
    def destroy_MTextureGCSystem(): Unit = js.native
    
    /**
      * Maximum idle time, in seconds
      * @see PIXI.settings.GC_MAX_IDLE
      */
    var maxIdle: Double = js.native
    
    /**
      * Current garbage collection mode
      * @see PIXI.settings.GC_MODE
      */
    var mode: GC_MODES = js.native
    
    /**
      * Checks to see when the last time a texture was used
      * if the texture has not been used for a specified amount of time it will be removed from the GPU
      */
    /* protected */ def postrender(): Unit = js.native
    
    /* private */ var renderer: Any = js.native
    
    /**
      * Checks to see when the last time a texture was used
      * if the texture has not been used for a specified amount of time it will be removed from the GPU
      */
    def run(): Unit = js.native
    
    /**
      * Removes all the textures within the specified displayObject and its children from the GPU
      * @param {PIXI.DisplayObject} displayObject - the displayObject to remove the textures from.
      */
    def unload(displayObject: IUnloadableTexture): Unit = js.native
  }
  /* static members */
  object TextureGCSystem {
    
    /** @ignore */
    @JSImport("@pixi/core/lib/textures/TextureGCSystem", "TextureGCSystem.extension")
    @js.native
    val `extension`: ExtensionMetadata = js.native
  }
  
  trait IUnloadableTexture extends StObject {
    
    var _texture: Texture[Resource] | RenderTexture
    
    var children: js.Array[IUnloadableTexture]
  }
  object IUnloadableTexture {
    
    inline def apply(_texture: Texture[Resource] | RenderTexture, children: js.Array[IUnloadableTexture]): IUnloadableTexture = {
      val __obj = js.Dynamic.literal(_texture = _texture.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[IUnloadableTexture]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IUnloadableTexture] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: js.Array[IUnloadableTexture]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenVarargs(value: IUnloadableTexture*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def set_texture(value: Texture[Resource] | RenderTexture): Self = StObject.set(x, "_texture", value.asInstanceOf[js.Any])
    }
  }
}
