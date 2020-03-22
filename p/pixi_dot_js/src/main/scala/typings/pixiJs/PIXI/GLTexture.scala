package typings.pixiJs.PIXI

import typings.std.WebGLTexture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Internal texture for WebGL context
  * @class
  * @memberof PIXI
  */
@JSGlobal("PIXI.GLTexture")
@js.native
class GLTexture () extends js.Object {
  /**
    * Texture contents dirty flag
    * @member {number} PIXI.GLTexture#dirtyId
    */
  var dirtyId: Double = js.native
  /**
    * Texture style dirty flag
    * @member {number} PIXI.GLTexture#dirtyStyleId
    */
  var dirtyStyleId: Double = js.native
  /**
    * Height of texture that was used in texImage2D
    * @member {number} PIXI.GLTexture#height
    */
  var height: Double = js.native
  /**
    * Type copied from baseTexture
    * @member {number} PIXI.GLTexture#internalFormat
    */
  var internalFormat: Double = js.native
  /**
    * Whether mip levels has to be generated
    * @member {boolean} PIXI.GLTexture#mipmap
    */
  var mipmap: Boolean = js.native
  /**
    * The WebGL texture
    * @member {WebGLTexture} PIXI.GLTexture#texture
    */
  var texture: WebGLTexture = js.native
  /**
    * Type copied from baseTexture
    * @member {number} PIXI.GLTexture#type
    */
  var `type`: Double = js.native
  /**
    * Width of texture that was used in texImage2D
    * @member {number} PIXI.GLTexture#width
    */
  var width: Double = js.native
  /**
    * WrapMode copied from baseTexture
    * @member {number} PIXI.GLTexture#wrapMode
    */
  var wrapMode: Double = js.native
}

