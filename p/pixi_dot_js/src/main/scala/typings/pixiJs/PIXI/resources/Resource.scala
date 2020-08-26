package typings.pixiJs.PIXI.resources

import typings.pixiJs.PIXI.BaseTexture
import typings.pixiJs.PIXI.GLTexture
import typings.pixiJs.PIXI.Renderer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Base resource class for textures that manages validation and uploading, depending on its type.
  *
  * Uploading of a base texture to the GPU is required.
  *
  * @class
  * @memberof PIXI.resources
  */
@js.native
trait Resource extends js.Object {
  /**
    * Internal height of the resource
    * @member {number} PIXI.resources.Resource#_height
    * @protected
    */
  var _height: Double = js.native
  /**
    * Internal width of the resource
    * @member {number} PIXI.resources.Resource#_width
    * @protected
    */
  var _width: Double = js.native
  /**
    * If resource has been destroyed
    * @member {boolean} PIXI.resources.Resource#destroyed
    * @readonly
    * @default false
    */
  val destroyed: Boolean = js.native
  /**
    * The height of the resource.
    *
    * @member {number}
    * @readonly
    */
  val height: Double = js.native
  /**
    * `true` if resource is created by BaseTexture
    * useful for doing cleanup with BaseTexture destroy
    * and not cleaning up resources that were created
    * externally.
    * @member {boolean} PIXI.resources.Resource#internal
    * @protected
    */
  var internal: Boolean = js.native
  /**
    * Has been validated
    * @readonly
    * @member {boolean}
    */
  val valid: Boolean = js.native
  /**
    * The width of the resource.
    *
    * @member {number}
    * @readonly
    */
  val width: Double = js.native
  /**
    * Bind to a parent BaseTexture
    *
    * @param {PIXI.BaseTexture} baseTexture - Parent texture
    */
  def bind(baseTexture: BaseTexture): Unit = js.native
  /**
    * Call when destroying resource, unbind any BaseTexture object
    * before calling this method, as reference counts are maintained
    * internally.
    */
  def destroy(): Unit = js.native
  /**
    * Clean up anything, this happens when destroying is ready.
    *
    * @protected
    */
  /* protected */ def dispose(): Unit = js.native
  /**
    * This can be overridden to start preloading a resource
    * or do any other prepare step.
    * @protected
    * @return {Promise<void>} Handle the validate event
    */
  /* protected */ def load(): js.Promise[Unit] = js.native
  /**
    * Trigger a resize event
    * @param {number} width - X dimension
    * @param {number} height - Y dimension
    */
  def resize(width: Double, height: Double): Unit = js.native
  /**
    * Set the style, optional to override
    *
    * @param {PIXI.Renderer} renderer - yeah, renderer!
    * @param {PIXI.BaseTexture} baseTexture - the texture
    * @param {PIXI.GLTexture} glTexture - texture instance for this webgl context
    * @returns {boolean} `true` is success
    */
  def style(renderer: Renderer, baseTexture: BaseTexture, glTexture: GLTexture): Boolean = js.native
  /**
    * Unbind to a parent BaseTexture
    *
    * @param {PIXI.BaseTexture} baseTexture - Parent texture
    */
  def unbind(baseTexture: BaseTexture): Unit = js.native
  /**
    * Has been updated trigger event
    */
  def update(): Unit = js.native
}

object Resource {
  @scala.inline
  def apply(
    _height: Double,
    _width: Double,
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
    valid: Boolean,
    width: Double
  ): Resource = {
    val __obj = js.Dynamic.literal(_height = _height.asInstanceOf[js.Any], _width = _width.asInstanceOf[js.Any], bind = js.Any.fromFunction1(bind), destroy = js.Any.fromFunction0(destroy), destroyed = destroyed.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), height = height.asInstanceOf[js.Any], internal = internal.asInstanceOf[js.Any], load = js.Any.fromFunction0(load), resize = js.Any.fromFunction2(resize), style = js.Any.fromFunction3(style), unbind = js.Any.fromFunction1(unbind), update = js.Any.fromFunction0(update), valid = valid.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  implicit class ResourceOps[Self <: Resource] (val x: Self) extends AnyVal {
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
    def set_height(value: Double): Self = this.set("_height", value.asInstanceOf[js.Any])
    @scala.inline
    def set_width(value: Double): Self = this.set("_width", value.asInstanceOf[js.Any])
    @scala.inline
    def setBind(value: BaseTexture => Unit): Self = this.set("bind", js.Any.fromFunction1(value))
    @scala.inline
    def setDestroy(value: () => Unit): Self = this.set("destroy", js.Any.fromFunction0(value))
    @scala.inline
    def setDestroyed(value: Boolean): Self = this.set("destroyed", value.asInstanceOf[js.Any])
    @scala.inline
    def setDispose(value: () => Unit): Self = this.set("dispose", js.Any.fromFunction0(value))
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def setInternal(value: Boolean): Self = this.set("internal", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoad(value: () => js.Promise[Unit]): Self = this.set("load", js.Any.fromFunction0(value))
    @scala.inline
    def setResize(value: (Double, Double) => Unit): Self = this.set("resize", js.Any.fromFunction2(value))
    @scala.inline
    def setStyle(value: (Renderer, BaseTexture, GLTexture) => Boolean): Self = this.set("style", js.Any.fromFunction3(value))
    @scala.inline
    def setUnbind(value: BaseTexture => Unit): Self = this.set("unbind", js.Any.fromFunction1(value))
    @scala.inline
    def setUpdate(value: () => Unit): Self = this.set("update", js.Any.fromFunction0(value))
    @scala.inline
    def setValid(value: Boolean): Self = this.set("valid", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
  }
  
}

