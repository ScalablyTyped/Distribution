package typings.pixiCore

import typings.pixiConstants.mod.MSAA_QUALITY
import typings.pixiConstants.mod.SCALE_MODES
import typings.pixiCore.libIrendererMod.IRenderableObject
import typings.pixiCore.libIrendererMod.IRenderer
import typings.pixiCore.libRenderTextureRenderTextureMod.RenderTexture
import typings.pixiCore.libSystemIsystemMod.ISystem
import typings.pixiExtensions.mod.ExtensionMetadata
import typings.pixiMath.mod.Rectangle
import typings.pixiSettings.libIcanvasMod.ICanvas
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRenderTextureGenerateTextureSystemMod {
  
  @JSImport("@pixi/core/lib/renderTexture/GenerateTextureSystem", "GenerateTextureSystem")
  @js.native
  open class GenerateTextureSystem protected ()
    extends StObject
       with ISystem[Null, Null] {
    def this(renderer: IRenderer[ICanvas]) = this()
    
    /* private */ val _tempMatrix: Any = js.native
    
    @JSName("destroy")
    def destroy_MGenerateTextureSystem(): Unit = js.native
    
    /**
      * A Useful function that returns a texture of the display object that can then be used to create sprites
      * This can be quite useful if your displayObject is complicated and needs to be reused multiple times.
      * @param displayObject - The displayObject the object will be generated from.
      * @param {IGenerateTextureOptions} options - Generate texture options.
      * @returns a shiny new texture of the display object passed in
      */
    def generateTexture(displayObject: IRenderableObject): RenderTexture = js.native
    def generateTexture(displayObject: IRenderableObject, options: IGenerateTextureOptions): RenderTexture = js.native
    
    var renderer: IRenderer[ICanvas] = js.native
  }
  /* static members */
  object GenerateTextureSystem {
    
    /** @ignore */
    @JSImport("@pixi/core/lib/renderTexture/GenerateTextureSystem", "GenerateTextureSystem.extension")
    @js.native
    val `extension`: ExtensionMetadata = js.native
  }
  
  trait IGenerateTextureOptions extends StObject {
    
    /** The number of samples of the frame buffer. */
    var multisample: js.UndefOr[MSAA_QUALITY] = js.undefined
    
    /**
      * The region of the displayObject, that shall be rendered,
      * if no region is specified, defaults to the local bounds of the displayObject.
      */
    var region: js.UndefOr[Rectangle] = js.undefined
    
    /** The resolution / device pixel ratio of the texture being generated. Optional defaults to Renderer resolution. */
    var resolution: js.UndefOr[Double] = js.undefined
    
    /** The scale mode of the texture. Optional, defaults to `PIXI.BaseTexture.defaultOptions.scaleMode`. */
    var scaleMode: js.UndefOr[SCALE_MODES] = js.undefined
  }
  object IGenerateTextureOptions {
    
    inline def apply(): IGenerateTextureOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IGenerateTextureOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IGenerateTextureOptions] (val x: Self) extends AnyVal {
      
      inline def setMultisample(value: MSAA_QUALITY): Self = StObject.set(x, "multisample", value.asInstanceOf[js.Any])
      
      inline def setMultisampleUndefined: Self = StObject.set(x, "multisample", js.undefined)
      
      inline def setRegion(value: Rectangle): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
      
      inline def setResolution(value: Double): Self = StObject.set(x, "resolution", value.asInstanceOf[js.Any])
      
      inline def setResolutionUndefined: Self = StObject.set(x, "resolution", js.undefined)
      
      inline def setScaleMode(value: SCALE_MODES): Self = StObject.set(x, "scaleMode", value.asInstanceOf[js.Any])
      
      inline def setScaleModeUndefined: Self = StObject.set(x, "scaleMode", js.undefined)
    }
  }
}
