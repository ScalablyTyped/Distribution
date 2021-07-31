package typings.pixiJs.PIXI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Frame buffer used by the BaseRenderTexture
  *
  * @class
  * @memberof PIXI
  */
@js.native
trait Framebuffer extends StObject {
  
  /**
    * Add texture to the colorTexture array
    *
    * @param {number} [index=0] - Index of the array to add the texture to
    * @param {PIXI.BaseTexture} [texture] - Texture to add to the array
    */
  def addColorTexture(): Unit = js.native
  def addColorTexture(index: Double): Unit = js.native
  def addColorTexture(index: Double, texture: BaseTexture): Unit = js.native
  def addColorTexture(index: Unit, texture: BaseTexture): Unit = js.native
  
  /**
    * Add a depth texture to the frame buffer
    *
    * @param {PIXI.BaseTexture} [texture] - Texture to add
    */
  def addDepthTexture(): Unit = js.native
  def addDepthTexture(texture: BaseTexture): Unit = js.native
  
  /**
    * Reference to the colorTexture.
    *
    * @member {PIXI.BaseTexture[]}
    * @readonly
    */
  val colorTexture: js.Array[BaseTexture] = js.native
  
  /**
    * Destroys and removes the depth texture added to this framebuffer.
    */
  def destroyDepthTexture(): Unit = js.native
  
  /**
    * Disposes WebGL resources that are connected to this geometry
    */
  def dispose(): Unit = js.native
  
  /**
    * Enable depth on the frame buffer
    */
  def enableDepth(): Unit = js.native
  
  /**
    * Enable stencil on the frame buffer
    */
  def enableStencil(): Unit = js.native
  
  /**
    * Height of framebuffer in pixels
    * @member {number} PIXI.Framebuffer#height
    */
  var height: Double = js.native
  
  /**
    * Desired number of samples for antialiasing. 0 means AA should not be used.
    *
    * Experimental WebGL2 feature, allows to use antialiasing in individual renderTextures.
    * Antialiasing is the same as for main buffer with renderer `antialias:true` options.
    * Seriously affects GPU memory consumption and GPU performance.
    *
    *```js
    * renderTexture.framebuffer.multisample = PIXI.MSAA_QUALITY.HIGH;
    * //...
    * renderer.render(renderTexture, myContainer);
    * renderer.framebuffer.blit(); // copies data from MSAA framebuffer to texture
    *  ```
    *
    * @member {PIXI.MSAA_QUALITY} PIXI.Framebuffer#multisample
    * @default PIXI.MSAA_QUALITY.NONE
    */
  var multisample: MSAA_QUALITY = js.native
  
  /**
    * Resize the frame buffer
    *
    * @param {number} width - Width of the frame buffer to resize to
    * @param {number} height - Height of the frame buffer to resize to
    */
  def resize(width: Double, height: Double): Unit = js.native
  
  /**
    * Width of framebuffer in pixels
    * @member {number} PIXI.Framebuffer#width
    */
  var width: Double = js.native
}
