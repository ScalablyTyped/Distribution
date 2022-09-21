package typings.playcanvas.mod

import typings.playcanvas.anon.Basis
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Resource handler used for loading 2D and 3D {@link Texture} resources.
  *
  * @implements {ResourceHandler}
  */
@JSImport("playcanvas", "TextureHandler")
@js.native
open class TextureHandler protected ()
  extends StObject
     with ResourceHandler {
  /**
    * Create a new TextureHandler instance.
    *
    * @param {AppBase} app - The running {@link AppBase}.
    * @hideconstructor
    */
  def this(app: AppBase) = this()
  
  var _assets: AssetRegistry = js.native
  
  var _device: GraphicsDevice = js.native
  
  def _getParser(url: Any): Any = js.native
  
  def _getUrlWithoutParams(url: Any): Any = js.native
  
  var _loader: ResourceLoader = js.native
  
  def crossOrigin: String = js.native
  def crossOrigin_=(arg: String): Unit = js.native
  
  /**
    * Type of the resource the handler handles.
    *
    * @type {string}
    */
  var handlerType: String = js.native
  
  var imgParser: ImgParser = js.native
  
  def load(url: Any, callback: Any, asset: Any): Unit = js.native
  
  def maxRetries: Double = js.native
  def maxRetries_=(arg: Double): Unit = js.native
  
  def open(url: Any, data: Any, asset: Any): Any = js.native
  
  var parsers: Basis = js.native
  
  @JSName("patch")
  def patch_MTextureHandler(asset: Any, assets: Any): Unit = js.native
}
