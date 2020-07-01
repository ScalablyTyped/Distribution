package typings.pixiJs.global.PIXI.resources

import typings.pixiJs.PIXI.BaseTexture
import typings.pixiJs.PIXI.GLTexture
import typings.pixiJs.PIXI.Renderer
import typings.pixiJs.anon.AutoLoad
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
@JSGlobal("PIXI.resources.CubeResource")
@js.native
class CubeResource ()
  extends typings.pixiJs.PIXI.resources.CubeResource {
  def this(source: js.Array[String | typings.pixiJs.PIXI.resources.Resource]) = this()
  def this(source: js.Array[String | typings.pixiJs.PIXI.resources.Resource], options: AutoLoad) = this()
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
    * In case BaseTextures are supplied, whether to use same resource or bind baseTexture itself
    * @member {boolean} PIXI.resources.CubeResource#linkBaseTexture
    * @protected
    */
  /* CompleteClass */
  override var linkBaseTexture: Boolean = js.native
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
    * Set a baseTexture by ID,
    * ArrayResource just takes resource from it, nothing more
    *
    * @param {PIXI.BaseTexture} baseTexture
    * @param {number} index - Zero-based index of resource to set
    * @return {PIXI.resources.ArrayResource} Instance for chaining
    */
  /* CompleteClass */
  override def addBaseTextureAt(baseTexture: BaseTexture, index: Double): typings.pixiJs.PIXI.resources.ArrayResource = js.native
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
  /**
    * Upload the resource
    *
    * @returns {boolean} true is success
    */
  /* CompleteClass */
  override def upload(): Boolean = js.native
  /**
    * Upload the resources to the GPU.
    * @param {PIXI.Renderer} renderer
    * @param {PIXI.BaseTexture} texture
    * @param {PIXI.GLTexture} glTexture
    * @returns {boolean} whether texture was uploaded
    */
  /* CompleteClass */
  override def upload(renderer: Renderer, texture: BaseTexture, glTexture: GLTexture): Boolean = js.native
}

/* static members */
@JSGlobal("PIXI.resources.CubeResource")
@js.native
object CubeResource extends js.Object {
  /**
    * Number of texture sides to store for CubeResources
    *
    * @name PIXI.resources.CubeResource.SIDES
    * @static
    * @member {number}
    * @default 6
    */
  var SIDES: Double = js.native
  /**
    * Used to auto-detect the type of resource.
    *
    * @static
    * @param {object} source - The source object
    * @return {boolean} `true` if source is an array of 6 elements
    */
  def test(source: js.Any): Boolean = js.native
}

