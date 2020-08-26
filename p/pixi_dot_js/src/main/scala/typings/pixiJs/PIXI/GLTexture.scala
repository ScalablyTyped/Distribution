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
@js.native
trait GLTexture extends js.Object {
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

object GLTexture {
  @scala.inline
  def apply(
    dirtyId: Double,
    dirtyStyleId: Double,
    height: Double,
    internalFormat: Double,
    mipmap: Boolean,
    texture: WebGLTexture,
    `type`: Double,
    width: Double,
    wrapMode: Double
  ): GLTexture = {
    val __obj = js.Dynamic.literal(dirtyId = dirtyId.asInstanceOf[js.Any], dirtyStyleId = dirtyStyleId.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], internalFormat = internalFormat.asInstanceOf[js.Any], mipmap = mipmap.asInstanceOf[js.Any], texture = texture.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], wrapMode = wrapMode.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GLTexture]
  }
  @scala.inline
  implicit class GLTextureOps[Self <: GLTexture] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDirtyId(value: Double): Self = this.set("dirtyId", value.asInstanceOf[js.Any])
    @scala.inline
    def setDirtyStyleId(value: Double): Self = this.set("dirtyStyleId", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def setInternalFormat(value: Double): Self = this.set("internalFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def setMipmap(value: Boolean): Self = this.set("mipmap", value.asInstanceOf[js.Any])
    @scala.inline
    def setTexture(value: WebGLTexture): Self = this.set("texture", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: Double): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def setWrapMode(value: Double): Self = this.set("wrapMode", value.asInstanceOf[js.Any])
  }
  
}

