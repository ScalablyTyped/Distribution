package typings.pixiJs.mod.resources

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
@JSImport("pixi.js", "resources.Resource")
@js.native
class Resource ()
  extends typings.pixiJs.PIXI.resources.Resource {
  def this(width: Double) = this()
  def this(width: Double, height: Double) = this()
  /**
    * Internal height of the resource
    * @member {number} PIXI.resources.Resource#_height
    * @protected
    */
  /* CompleteClass */
  override var _height: Double = js.native
  /**
    * Internal width of the resource
    * @member {number} PIXI.resources.Resource#_width
    * @protected
    */
  /* CompleteClass */
  override var _width: Double = js.native
  /**
    * If resource has been destroyed
    * @member {boolean} PIXI.resources.Resource#destroyed
    * @readonly
    * @default false
    */
  /* CompleteClass */
  override val destroyed: Boolean = js.native
  /**
    * The height of the resource.
    *
    * @member {number}
    * @readonly
    */
  /* CompleteClass */
  override val height: Double = js.native
  /**
    * `true` if resource is created by BaseTexture
    * useful for doing cleanup with BaseTexture destroy
    * and not cleaning up resources that were created
    * externally.
    * @member {boolean} PIXI.resources.Resource#internal
    * @protected
    */
  /* CompleteClass */
  override var internal: Boolean = js.native
  /**
    * Has been validated
    * @readonly
    * @member {boolean}
    */
  /* CompleteClass */
  override val valid: Boolean = js.native
  /**
    * The width of the resource.
    *
    * @member {number}
    * @readonly
    */
  /* CompleteClass */
  override val width: Double = js.native
  /**
    * Bind to a parent BaseTexture
    *
    * @param {PIXI.BaseTexture} baseTexture - Parent texture
    */
  /* CompleteClass */
  override def bind(baseTexture: BaseTexture): Unit = js.native
  /**
    * Call when destroying resource, unbind any BaseTexture object
    * before calling this method, as reference counts are maintained
    * internally.
    */
  /* CompleteClass */
  override def destroy(): Unit = js.native
  /**
    * Clean up anything, this happens when destroying is ready.
    *
    * @protected
    */
  /* CompleteClass */
  /* protected */ override def dispose(): Unit = js.native
  /**
    * This can be overridden to start preloading a resource
    * or do any other prepare step.
    * @protected
    * @return {Promise<void>} Handle the validate event
    */
  /* CompleteClass */
  /* protected */ override def load(): js.Promise[Unit] = js.native
  /**
    * Trigger a resize event
    * @param {number} width - X dimension
    * @param {number} height - Y dimension
    */
  /* CompleteClass */
  override def resize(width: Double, height: Double): Unit = js.native
  /**
    * Set the style, optional to override
    *
    * @param {PIXI.Renderer} renderer - yeah, renderer!
    * @param {PIXI.BaseTexture} baseTexture - the texture
    * @param {PIXI.GLTexture} glTexture - texture instance for this webgl context
    * @returns {boolean} `true` is success
    */
  /* CompleteClass */
  override def style(renderer: Renderer, baseTexture: BaseTexture, glTexture: GLTexture): Boolean = js.native
  /**
    * Unbind to a parent BaseTexture
    *
    * @param {PIXI.BaseTexture} baseTexture - Parent texture
    */
  /* CompleteClass */
  override def unbind(baseTexture: BaseTexture): Unit = js.native
  /**
    * Has been updated trigger event
    */
  /* CompleteClass */
  override def update(): Unit = js.native
}

/* static members */
@JSImport("pixi.js", "resources.Resource")
@js.native
object Resource extends js.Object {
  /**
    * Abstract, used to auto-detect resource type
    *
    * @static
    * @param {*} source - The source object
    * @param {string} extension - The extension of source, if set
    */
  def test(source: js.Any, extension: String): Unit = js.native
}

