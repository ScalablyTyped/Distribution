package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Resource handler used for loading {@link TextureAtlas} resources.
  *
  * @implements {ResourceHandler}
  */
@JSImport("playcanvas", "TextureAtlasHandler")
@js.native
open class TextureAtlasHandler protected ()
  extends StObject
     with ResourceHandler {
  /**
    * Create a new TextureAtlasHandler instance.
    *
    * @param {AppBase} app - The running {@link AppBase}.
    * @hideconstructor
    */
  def this(app: AppBase) = this()
  
  var _loader: ResourceLoader = js.native
  
  def _onAssetChange(asset: Any, attribute: Any, value: Any): Unit = js.native
  
  /**
    * Type of the resource the handler handles.
    *
    * @type {string}
    */
  var handlerType: String = js.native
  
  def load(url: Any, callback: Any): Unit = js.native
  
  var maxRetries: Double = js.native
  
  def open(url: Any, data: Any): TextureAtlas = js.native
  
  @JSName("patch")
  def patch_MTextureAtlasHandler(asset: Any, assets: Any): Unit = js.native
}
