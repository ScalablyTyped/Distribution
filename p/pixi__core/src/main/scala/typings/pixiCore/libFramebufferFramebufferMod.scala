package typings.pixiCore

import org.scalablytyped.runtime.StringDictionary
import typings.pixiConstants.mod.MSAA_QUALITY
import typings.pixiCore.libFramebufferGlframebufferMod.GLFramebuffer
import typings.pixiCore.libTexturesBaseTextureMod.BaseTexture
import typings.pixiCore.libTexturesResourcesAutoDetectResourceMod.IAutoDetectOptions
import typings.pixiCore.libTexturesResourcesResourceMod.Resource
import typings.pixiRunner.mod.Runner
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFramebufferFramebufferMod {
  
  @JSImport("@pixi/core/lib/framebuffer/Framebuffer", "Framebuffer")
  @js.native
  open class Framebuffer protected () extends StObject {
    /**
      * @param width - Width of the frame buffer
      * @param height - Height of the frame buffer
      */
    def this(width: Double, height: Double) = this()
    
    /**
      * Add texture to the colorTexture array.
      * @param index - Index of the array to add the texture to
      * @param texture - Texture to add to the array
      */
    def addColorTexture(): this.type = js.native
    def addColorTexture(index: Double): this.type = js.native
    def addColorTexture(index: Double, texture: BaseTexture[Resource, IAutoDetectOptions]): this.type = js.native
    def addColorTexture(index: Unit, texture: BaseTexture[Resource, IAutoDetectOptions]): this.type = js.native
    
    /**
      * Add a depth texture to the frame buffer.
      * @param texture - Texture to add.
      */
    def addDepthTexture(): this.type = js.native
    def addDepthTexture(texture: BaseTexture[Resource, IAutoDetectOptions]): this.type = js.native
    
    /**
      * Reference to the colorTexture.
      * @readonly
      */
    def colorTexture: BaseTexture[Resource, IAutoDetectOptions] = js.native
    
    var colorTextures: js.Array[BaseTexture[Resource, IAutoDetectOptions]] = js.native
    
    var depth: Boolean = js.native
    
    var depthTexture: BaseTexture[Resource, IAutoDetectOptions] = js.native
    
    /** Destroys and removes the depth texture added to this framebuffer. */
    def destroyDepthTexture(): Unit = js.native
    
    var dirtyFormat: Double = js.native
    
    var dirtyId: Double = js.native
    
    var dirtySize: Double = js.native
    
    /** Disposes WebGL resources that are connected to this geometry. */
    def dispose(): Unit = js.native
    
    var disposeRunner: Runner = js.native
    
    /** Enable depth on the frame buffer. */
    def enableDepth(): this.type = js.native
    
    /** Enable stencil on the frame buffer. */
    def enableStencil(): this.type = js.native
    
    var glFramebuffers: StringDictionary[GLFramebuffer] = js.native
    
    /** Height of framebuffer in pixels. */
    var height: Double = js.native
    
    /**
      * Desired number of samples for antialiasing. 0 means AA should not be used.
      *
      * Experimental WebGL2 feature, allows to use antialiasing in individual renderTextures.
      * Antialiasing is the same as for main buffer with renderer `antialias: true` options.
      * Seriously affects GPU memory consumption and GPU performance.
      * @example
      * import { MSAA_QUALITY } from 'pixi.js';
      *
      * renderTexture.framebuffer.multisample = MSAA_QUALITY.HIGH;
      * // ...
      * renderer.render(myContainer, { renderTexture });
      * renderer.framebuffer.blit(); // Copies data from MSAA framebuffer to texture
      * @default PIXI.MSAA_QUALITY.NONE
      */
    var multisample: MSAA_QUALITY = js.native
    
    /**
      * Resize the frame buffer
      * @param width - Width of the frame buffer to resize to
      * @param height - Height of the frame buffer to resize to
      */
    def resize(width: Double, height: Double): Unit = js.native
    
    var stencil: Boolean = js.native
    
    /** Width of framebuffer in pixels. */
    var width: Double = js.native
  }
}
