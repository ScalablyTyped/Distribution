package typings.pixiCore.mod

import typings.pixiRunner.mod.Runner
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("@pixi/core", "Resource")
@js.native
/**
  * @param width - Width of the resource
  * @param height - Height of the resource
  */
open class Resource () extends StObject {
  def this(width: Double) = this()
  def this(width: Double, height: Double) = this()
  def this(width: Unit, height: Double) = this()
  
  /** Internal height of the resource. */
  /* protected */ var _height: Double = js.native
  
  /** Internal width of the resource. */
  /* protected */ var _width: Double = js.native
  
  /**
    * Bind to a parent BaseTexture
    * @param baseTexture - Parent texture
    */
  def bind(baseTexture: BaseTexture[Resource, IAutoDetectOptions]): Unit = js.native
  
  /**
    * Call when destroying resource, unbind any BaseTexture object
    * before calling this method, as reference counts are maintained
    * internally.
    */
  def destroy(): Unit = js.native
  
  /**
    * If resource has been destroyed.
    * @readonly
    * @default false
    */
  var destroyed: Boolean = js.native
  
  /** Clean up anything, this happens when destroying is ready. */
  def dispose(): Unit = js.native
  
  /**
    * The height of the resource.
    * @readonly
    */
  def height: Double = js.native
  
  /**
    * `true` if resource is created by BaseTexture
    * useful for doing cleanup with BaseTexture destroy
    * and not cleaning up resources that were created
    * externally.
    */
  var internal: Boolean = js.native
  
  /**
    * This can be overridden to start preloading a resource
    * or do any other prepare step.
    * @protected
    * @returns Handle the validate event
    */
  def load(): js.Promise[Resource] = js.native
  
  /**
    * Handle internal errors, such as loading errors
    * accepts 1 param: error
    * @member {Runner}
    * @private
    */
  /* protected */ var onError: Runner = js.native
  
  /**
    * Mini-runner for handling resize events
    * accepts 2 parameters: width, height
    * @member {Runner}
    * @private
    */
  /* protected */ var onResize: Runner = js.native
  
  /**
    * Mini-runner for handling update events
    * @member {Runner}
    * @private
    */
  /* protected */ var onUpdate: Runner = js.native
  
  /**
    * Trigger a resize event
    * @param width - X dimension
    * @param height - Y dimension
    */
  def resize(width: Double, height: Double): Unit = js.native
  
  /** The url of the resource */
  var src: String = js.native
  
  /**
    * Set the style, optional to override
    * @param _renderer - yeah, renderer!
    * @param _baseTexture - the texture
    * @param _glTexture - texture instance for this webgl context
    * @returns - `true` is success
    */
  def style(
    _renderer: Renderer,
    _baseTexture: BaseTexture[Resource, IAutoDetectOptions],
    _glTexture: GLTexture
  ): Boolean = js.native
  
  /**
    * Unbind to a parent BaseTexture
    * @param baseTexture - Parent texture
    */
  def unbind(baseTexture: BaseTexture[Resource, IAutoDetectOptions]): Unit = js.native
  
  /** Has been updated trigger event. */
  def update(): Unit = js.native
  
  /**
    * Uploads the texture or returns false if it cant for some reason. Override this.
    * @param renderer - yeah, renderer!
    * @param baseTexture - the texture
    * @param glTexture - texture instance for this webgl context
    * @returns - true is success
    */
  def upload(renderer: Renderer, baseTexture: BaseTexture[Resource, IAutoDetectOptions], glTexture: GLTexture): Boolean = js.native
  
  /**
    * Has been validated
    * @readonly
    */
  def valid: Boolean = js.native
  
  /**
    * The width of the resource.
    * @readonly
    */
  def width: Double = js.native
}
/* static members */
object Resource {
  
  @JSImport("@pixi/core", "Resource")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Abstract, used to auto-detect resource type.
    * @param {*} _source - The source object
    * @param {string} _extension - The extension of source, if set
    */
  inline def test(_source: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("test")(_source.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def test(_source: Any, _extension: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("test")(_source.asInstanceOf[js.Any], _extension.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
