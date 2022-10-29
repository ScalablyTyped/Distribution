package typings.pixiCore

import typings.pixiConstants.mod.BUFFER_BITS
import typings.pixiConstants.mod.MSAA_QUALITY
import typings.pixiCore.anon.Height
import typings.pixiCore.libFramebufferFramebufferMod.Framebuffer
import typings.pixiCore.libFramebufferGlframebufferMod.GLFramebuffer
import typings.pixiCore.libIrendererMod.IRenderingContext
import typings.pixiCore.libRendererMod.Renderer
import typings.pixiCore.libSystemIsystemMod.ISystem
import typings.pixiExtensions.mod.ExtensionMetadata
import typings.pixiMath.mod.Rectangle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFramebufferFramebufferSystemMod {
  
  @JSImport("@pixi/core/lib/framebuffer/FramebufferSystem", "FramebufferSystem")
  @js.native
  open class FramebufferSystem protected ()
    extends StObject
       with ISystem[Null, Null] {
    /**
      * @param renderer - The renderer this System works for.
      */
    def this(renderer: Renderer) = this()
    
    /* protected */ var CONTEXT_UID: Double = js.native
    
    /**
      * Bind a framebuffer.
      * @param framebuffer
      * @param frame - frame, default is framebuffer size
      * @param mipLevel - optional mip level to set on the framebuffer - defaults to 0
      */
    def bind(): Unit = js.native
    def bind(framebuffer: Unit, frame: Unit, mipLevel: Double): Unit = js.native
    def bind(framebuffer: Unit, frame: Rectangle): Unit = js.native
    def bind(framebuffer: Unit, frame: Rectangle, mipLevel: Double): Unit = js.native
    def bind(framebuffer: Framebuffer): Unit = js.native
    def bind(framebuffer: Framebuffer, frame: Unit, mipLevel: Double): Unit = js.native
    def bind(framebuffer: Framebuffer, frame: Rectangle): Unit = js.native
    def bind(framebuffer: Framebuffer, frame: Rectangle, mipLevel: Double): Unit = js.native
    
    /**
      * Only works with WebGL2
      *
      * blits framebuffer to another of the same or bigger size
      * after that target framebuffer is bound
      *
      * Fails with WebGL warning if blits multisample framebuffer to different size
      * @param framebuffer - by default it blits "into itself", from renderBuffer to texture.
      * @param sourcePixels - source rectangle in pixels
      * @param destPixels - dest rectangle in pixels, assumed to be the same as sourcePixels
      */
    def blit(): Unit = js.native
    def blit(framebuffer: Unit, sourcePixels: Unit, destPixels: Rectangle): Unit = js.native
    def blit(framebuffer: Unit, sourcePixels: Rectangle): Unit = js.native
    def blit(framebuffer: Unit, sourcePixels: Rectangle, destPixels: Rectangle): Unit = js.native
    def blit(framebuffer: Framebuffer): Unit = js.native
    def blit(framebuffer: Framebuffer, sourcePixels: Unit, destPixels: Rectangle): Unit = js.native
    def blit(framebuffer: Framebuffer, sourcePixels: Rectangle): Unit = js.native
    def blit(framebuffer: Framebuffer, sourcePixels: Rectangle, destPixels: Rectangle): Unit = js.native
    
    /**
      * Returns true if the frame buffer can be multisampled.
      * @param framebuffer
      */
    /* protected */ def canMultisampleFramebuffer(framebuffer: Framebuffer): Boolean = js.native
    
    /**
      * Clear the color of the context
      * @param r - Red value from 0 to 1
      * @param g - Green value from 0 to 1
      * @param b - Blue value from 0 to 1
      * @param a - Alpha value from 0 to 1
      * @param {PIXI.BUFFER_BITS} [mask=BUFFER_BITS.COLOR | BUFFER_BITS.DEPTH] - Bitwise OR of masks
      *  that indicate the buffers to be cleared, by default COLOR and DEPTH buffers.
      */
    def clear(r: Double, g: Double, b: Double, a: Double): Unit = js.native
    def clear(r: Double, g: Double, b: Double, a: Double, mask: BUFFER_BITS): Unit = js.native
    
    /** Sets up the renderer context and necessary buffers. */
    /* protected */ def contextChange(): Unit = js.native
    
    var current: Framebuffer = js.native
    
    @JSName("destroy")
    def destroy_MFramebufferSystem(): Unit = js.native
    
    /**
      * Detects number of samples that is not more than a param but as close to it as possible
      * @param samples - number of samples
      * @returns - recommended number of samples
      */
    /* protected */ def detectSamples(samples: MSAA_QUALITY): MSAA_QUALITY = js.native
    
    /**
      * Disposes all framebuffers, but not textures bound to them.
      * @param [contextLost=false] - If context was lost, we suppress all delete function calls
      */
    def disposeAll(): Unit = js.native
    def disposeAll(contextLost: Boolean): Unit = js.native
    
    /**
      * Disposes framebuffer.
      * @param framebuffer - framebuffer that has to be disposed of
      * @param contextLost - If context was lost, we suppress all delete function calls
      */
    def disposeFramebuffer(framebuffer: Framebuffer): Unit = js.native
    def disposeFramebuffer(framebuffer: Framebuffer, contextLost: Boolean): Unit = js.native
    
    /**
      * Forcing creation of stencil buffer for current framebuffer, if it wasn't done before.
      * Used by MaskSystem, when its time to use stencil mask for Graphics element.
      *
      * Its an alternative for public lazy `framebuffer.enableStencil`, in case we need stencil without rebind.
      * @private
      */
    def forceStencil(): Unit = js.native
    
    /* protected */ var gl: IRenderingContext = js.native
    
    var hasMRT: Boolean = js.native
    
    /**
      * Initialize framebuffer for this context
      * @protected
      * @param framebuffer
      * @returns - created GLFramebuffer
      */
    def initFramebuffer(framebuffer: Framebuffer): GLFramebuffer = js.native
    
    /** A list of managed framebuffers. */
    val managedFramebuffers: js.Array[Framebuffer] = js.native
    
    /* protected */ var msaaSamples: js.Array[Double] = js.native
    
    var renderer: Renderer = js.native
    
    /** Resets framebuffer stored state, binds screen framebuffer. Should be called before renderTexture reset(). */
    def reset(): Unit = js.native
    
    /**
      * Resize the framebuffer
      * @param framebuffer
      * @protected
      */
    def resizeFramebuffer(framebuffer: Framebuffer): Unit = js.native
    
    /**
      * Set the WebGLRenderingContext's viewport.
      * @param x - X position of viewport
      * @param y - Y position of viewport
      * @param width - Width of viewport
      * @param height - Height of viewport
      */
    def setViewport(x: Double, y: Double, width: Double, height: Double): Unit = js.native
    
    /**
      * Get the size of the current width and height. Returns object with `width` and `height` values.
      * @readonly
      */
    def size: Height = js.native
    
    /** Framebuffer value that shows that we don't know what is bound. */
    /* protected */ var unknownFramebuffer: Framebuffer = js.native
    
    /**
      * Update the framebuffer
      * @param framebuffer
      * @param mipLevel
      * @protected
      */
    def updateFramebuffer(framebuffer: Framebuffer, mipLevel: Double): Unit = js.native
    
    var viewport: Rectangle = js.native
    
    var writeDepthTexture: Boolean = js.native
  }
  /* static members */
  object FramebufferSystem {
    
    /** @ignore */
    @JSImport("@pixi/core/lib/framebuffer/FramebufferSystem", "FramebufferSystem.extension")
    @js.native
    val `extension`: ExtensionMetadata = js.native
  }
}
