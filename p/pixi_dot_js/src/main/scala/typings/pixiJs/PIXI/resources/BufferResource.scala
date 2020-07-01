package typings.pixiJs.PIXI.resources

import typings.pixiJs.PIXI.BaseTexture
import typings.pixiJs.PIXI.GLTexture
import typings.pixiJs.PIXI.Renderer
import typings.std.Float32Array
import typings.std.Uint32Array
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Buffer resource with data of typed array.
  * @class
  * @extends PIXI.resources.Resource
  * @memberof PIXI.resources
  */
trait BufferResource extends Resource {
  /**
    * Source array
    * Cannot be ClampedUint8Array because it cant be uploaded to WebGL
    *
    * @member {Float32Array|Uint8Array|Uint32Array} PIXI.resources.BufferResource#data
    */
  var data: Float32Array | Uint8Array | Uint32Array
  /**
    * Upload the texture to the GPU.
    * @param {PIXI.Renderer} renderer - Upload to the renderer
    * @param {PIXI.BaseTexture} baseTexture - Reference to parent texture
    * @param {PIXI.GLTexture} glTexture - glTexture
    * @returns {boolean} true is success
    */
  def upload(renderer: Renderer, baseTexture: BaseTexture, glTexture: GLTexture): Boolean
}

object BufferResource {
  @scala.inline
  def apply(
    _height: Double,
    _width: Double,
    bind: BaseTexture => Unit,
    data: Float32Array | Uint8Array | Uint32Array,
    destroy: () => Unit,
    destroyed: Boolean,
    dispose: () => Unit,
    height: Double,
    internal: Boolean,
    load: () => js.Promise[Unit],
    resize: (Double, Double) => Unit,
    style: (Renderer, BaseTexture, GLTexture) => Boolean,
    unbind: BaseTexture => Unit,
    update: () => Unit,
    upload: (Renderer, BaseTexture, GLTexture) => Boolean,
    valid: Boolean,
    width: Double
  ): BufferResource = {
    val __obj = js.Dynamic.literal(_height = _height.asInstanceOf[js.Any], _width = _width.asInstanceOf[js.Any], bind = js.Any.fromFunction1(bind), data = data.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), destroyed = destroyed.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), height = height.asInstanceOf[js.Any], internal = internal.asInstanceOf[js.Any], load = js.Any.fromFunction0(load), resize = js.Any.fromFunction2(resize), style = js.Any.fromFunction3(style), unbind = js.Any.fromFunction1(unbind), update = js.Any.fromFunction0(update), upload = js.Any.fromFunction3(upload), valid = valid.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[BufferResource]
  }
}

