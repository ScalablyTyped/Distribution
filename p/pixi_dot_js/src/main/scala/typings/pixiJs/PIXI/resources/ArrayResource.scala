package typings.pixiJs.PIXI.resources

import typings.pixiJs.PIXI.BaseTexture
import typings.pixiJs.PIXI.GLTexture
import typings.pixiJs.PIXI.Renderer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A resource that contains a number of sources.
  *
  * @class
  * @extends PIXI.resources.Resource
  * @memberof PIXI.resources
  * @param {number|Array<*>} source - Number of items in array or the collection
  *        of image URLs to use. Can also be resources, image elements, canvas, etc.
  * @param {object} [options] - Options to apply to {@link PIXI.resources.autoDetectResource}
  * @param {number} [options.width] - Width of the resource
  * @param {number} [options.height] - Height of the resource
  */
trait ArrayResource extends Resource {
  /**
    * Set a baseTexture by ID,
    * ArrayResource just takes resource from it, nothing more
    *
    * @param {PIXI.BaseTexture} baseTexture
    * @param {number} index - Zero-based index of resource to set
    * @return {PIXI.resources.ArrayResource} Instance for chaining
    */
  def addBaseTextureAt(baseTexture: BaseTexture, index: Double): ArrayResource
  /**
    * Upload the resources to the GPU.
    * @param {PIXI.Renderer} renderer
    * @param {PIXI.BaseTexture} texture
    * @param {PIXI.GLTexture} glTexture
    * @returns {boolean} whether texture was uploaded
    */
  def upload(renderer: Renderer, texture: BaseTexture, glTexture: GLTexture): Boolean
}

object ArrayResource {
  @scala.inline
  def apply(
    _height: Double,
    _width: Double,
    addBaseTextureAt: (BaseTexture, Double) => ArrayResource,
    bind: BaseTexture => Unit,
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
  ): ArrayResource = {
    val __obj = js.Dynamic.literal(_height = _height.asInstanceOf[js.Any], _width = _width.asInstanceOf[js.Any], addBaseTextureAt = js.Any.fromFunction2(addBaseTextureAt), bind = js.Any.fromFunction1(bind), destroy = js.Any.fromFunction0(destroy), destroyed = destroyed.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), height = height.asInstanceOf[js.Any], internal = internal.asInstanceOf[js.Any], load = js.Any.fromFunction0(load), resize = js.Any.fromFunction2(resize), style = js.Any.fromFunction3(style), unbind = js.Any.fromFunction1(unbind), update = js.Any.fromFunction0(update), upload = js.Any.fromFunction3(upload), valid = valid.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrayResource]
  }
}

