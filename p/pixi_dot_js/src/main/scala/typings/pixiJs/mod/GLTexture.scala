package typings.pixiJs.mod

import typings.std.WebGLTexture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Internal texture for WebGL context
  * @class
  * @memberof PIXI
  */
@JSImport("pixi.js", "GLTexture")
@js.native
class GLTexture ()
  extends typings.pixiJs.PIXI.GLTexture {
  /**
    * Texture contents dirty flag
    * @member {number} PIXI.GLTexture#dirtyId
    */
  /* CompleteClass */
  override var dirtyId: Double = js.native
  /**
    * Texture style dirty flag
    * @member {number} PIXI.GLTexture#dirtyStyleId
    */
  /* CompleteClass */
  override var dirtyStyleId: Double = js.native
  /**
    * Height of texture that was used in texImage2D
    * @member {number} PIXI.GLTexture#height
    */
  /* CompleteClass */
  override var height: Double = js.native
  /**
    * Type copied from baseTexture
    * @member {number} PIXI.GLTexture#internalFormat
    */
  /* CompleteClass */
  override var internalFormat: Double = js.native
  /**
    * Whether mip levels has to be generated
    * @member {boolean} PIXI.GLTexture#mipmap
    */
  /* CompleteClass */
  override var mipmap: Boolean = js.native
  /**
    * The WebGL texture
    * @member {WebGLTexture} PIXI.GLTexture#texture
    */
  /* CompleteClass */
  override var texture: WebGLTexture = js.native
  /**
    * Type copied from baseTexture
    * @member {number} PIXI.GLTexture#type
    */
  /* CompleteClass */
  override var `type`: Double = js.native
  /**
    * Width of texture that was used in texImage2D
    * @member {number} PIXI.GLTexture#width
    */
  /* CompleteClass */
  override var width: Double = js.native
  /**
    * WrapMode copied from baseTexture
    * @member {number} PIXI.GLTexture#wrapMode
    */
  /* CompleteClass */
  override var wrapMode: Double = js.native
}

