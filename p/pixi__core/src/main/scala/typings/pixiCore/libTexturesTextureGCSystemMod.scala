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
      * Frame count since last garbage collection.
      * @readonly
      */
    var checkCount: Double = js.native
    
    /**
      * Frames between two garbage collections.
      * @see PIXI.TextureGCSystem.defaultCheckCountMax
      */
    var checkCountMax: Double = js.native
    
    /**
      * Frame count since started.
      * @readonly
      */
    var count: Double = js.native
    
    @JSName("destroy")
    def destroy_MTextureGCSystem(): Unit = js.native
    
    /**
      * Maximum idle frames before a texture is destroyed by garbage collection.
      * @see PIXI.TextureGCSystem.defaultMaxIdle
      */
    var maxIdle: Double = js.native
    
    /**
      * Current garbage collection mode.
      * @see PIXI.TextureGCSystem.defaultMode
      */
    var mode: GC_MODES = js.native
    
    /**
      * Checks to see when the last time a texture was used.
      * If the texture has not been used for a specified amount of time, it will be removed from the GPU.
      */
    /* protected */ def postrender(): Unit = js.native
    
    /* private */ var renderer: Any = js.native
    
    /**
      * Checks to see when the last time a texture was used.
      * If the texture has not been used for a specified amount of time, it will be removed from the GPU.
      */
    def run(): Unit = js.native
    
    /**
      * Removes all the textures within the specified displayObject and its children from the GPU.
      * @param {PIXI.DisplayObject} displayObject - the displayObject to remove the textures from.
      */
    def unload(displayObject: IUnloadableTexture): Unit = js.native
  }
  /* static members */
  object TextureGCSystem {
    
    @JSImport("@pixi/core/lib/textures/TextureGCSystem", "TextureGCSystem")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Default frames between two garbage collections.
      * @static
      * @default 600
      * @see PIXI.TextureGCSystem#checkCountMax
      */
    @JSImport("@pixi/core/lib/textures/TextureGCSystem", "TextureGCSystem.defaultCheckCountMax")
    @js.native
    def defaultCheckCountMax: Double = js.native
    inline def defaultCheckCountMax_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultCheckCountMax")(x.asInstanceOf[js.Any])
    
    /**
      * Default maximum idle frames before a texture is destroyed by garbage collection.
      * @static
      * @default 3600
      * @see PIXI.TextureGCSystem#maxIdle
      */
    @JSImport("@pixi/core/lib/textures/TextureGCSystem", "TextureGCSystem.defaultMaxIdle")
    @js.native
    def defaultMaxIdle: Double = js.native
    inline def defaultMaxIdle_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultMaxIdle")(x.asInstanceOf[js.Any])
    
    /**
      * Default garbage collection mode.
      * @static
      * @type {PIXI.GC_MODES}
      * @default PIXI.GC_MODES.AUTO
      * @see PIXI.TextureGCSystem#mode
      */
    @JSImport("@pixi/core/lib/textures/TextureGCSystem", "TextureGCSystem.defaultMode")
    @js.native
    def defaultMode: GC_MODES = js.native
    inline def defaultMode_=(x: GC_MODES): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultMode")(x.asInstanceOf[js.Any])
    
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
