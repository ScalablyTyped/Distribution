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
  * Resource type for DepthTexture.
  * @class
  * @extends PIXI.resources.BufferResource
  * @memberof PIXI.resources
  */
trait DepthResource extends BufferResource

object DepthResource {
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
  ): DepthResource = {
    val __obj = js.Dynamic.literal(_height = _height.asInstanceOf[js.Any], _width = _width.asInstanceOf[js.Any], bind = js.Any.fromFunction1(bind), data = data.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), destroyed = destroyed.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), height = height.asInstanceOf[js.Any], internal = internal.asInstanceOf[js.Any], load = js.Any.fromFunction0(load), resize = js.Any.fromFunction2(resize), style = js.Any.fromFunction3(style), unbind = js.Any.fromFunction1(unbind), update = js.Any.fromFunction0(update), upload = js.Any.fromFunction3(upload), valid = valid.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[DepthResource]
  }
}

