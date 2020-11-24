package typings.pixiJs.PIXI.resources

import typings.pixiJs.PIXI.BaseTexture
import typings.pixiJs.PIXI.GLTexture
import typings.pixiJs.PIXI.Renderer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Resource for a CubeTexture which contains six resources.
  *
  * @class
  * @extends PIXI.resources.ArrayResource
  * @memberof PIXI.resources
  * @param {Array<string|PIXI.resources.Resource>} [source] - Collection of URLs or resources
  *        to use as the sides of the cube.
  * @param {object} [options] - ImageResource options
  * @param {number} [options.width] - Width of resource
  * @param {number} [options.height] - Height of resource
  * @param {number} [options.autoLoad=true] - Whether to auto-load resources
  * @param {number} [options.linkBaseTexture=true] - In case BaseTextures are supplied,
  *   whether to copy them or use
  */
@js.native
trait CubeResource extends ArrayResource {
  
  /**
    * In case BaseTextures are supplied, whether to use same resource or bind baseTexture itself
    * @member {boolean} PIXI.resources.CubeResource#linkBaseTexture
    * @protected
    */
  var linkBaseTexture: Boolean = js.native
  
  /**
    * Upload the resource
    *
    * @returns {boolean} true is success
    */
  def upload(): Boolean = js.native
}
object CubeResource {
  
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
    linkBaseTexture: Boolean,
    load: () => js.Promise[Unit],
    resize: (Double, Double) => Unit,
    style: (Renderer, BaseTexture, GLTexture) => Boolean,
    unbind: BaseTexture => Unit,
    update: () => Unit,
    upload: () => Boolean,
    valid: Boolean,
    width: Double
  ): CubeResource = {
    val __obj = js.Dynamic.literal(_height = _height.asInstanceOf[js.Any], _width = _width.asInstanceOf[js.Any], addBaseTextureAt = js.Any.fromFunction2(addBaseTextureAt), bind = js.Any.fromFunction1(bind), destroy = js.Any.fromFunction0(destroy), destroyed = destroyed.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), height = height.asInstanceOf[js.Any], internal = internal.asInstanceOf[js.Any], linkBaseTexture = linkBaseTexture.asInstanceOf[js.Any], load = js.Any.fromFunction0(load), resize = js.Any.fromFunction2(resize), style = js.Any.fromFunction3(style), unbind = js.Any.fromFunction1(unbind), update = js.Any.fromFunction0(update), upload = js.Any.fromFunction0(upload), valid = valid.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[CubeResource]
  }
  
  @scala.inline
  implicit class CubeResourceOps[Self <: CubeResource] (val x: Self) extends AnyVal {
    
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
    def setLinkBaseTexture(value: Boolean): Self = this.set("linkBaseTexture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpload(value: () => Boolean): Self = this.set("upload", js.Any.fromFunction0(value))
  }
}
