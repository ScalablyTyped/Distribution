package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Resource handler used for loading {@link Sprite} resources.
  *
  * @implements {ResourceHandler}
  */
@JSImport("playcanvas", "SpriteHandler")
@js.native
open class SpriteHandler protected ()
  extends StObject
     with ResourceHandler {
  /**
    * Create a new SpriteHandler instance.
    *
    * @param {import('../app-base.js').AppBase} app - The running {@link AppBase}.
    * @hideconstructor
    */
  def this(app: AppBase) = this()
  
  var _assets: AssetRegistry = js.native
  
  var _device: GraphicsDevice = js.native
  
  def _onAssetChange(asset: Any, attribute: Any, value: Any, oldValue: Any): Unit = js.native
  
  def _updateAtlas(asset: Any): Unit = js.native
  
  /**
    * Type of the resource the handler handles.
    *
    * @type {string}
    */
  var handlerType: String = js.native
  
  def load(url: Any, callback: Any): Unit = js.native
  
  var maxRetries: Double = js.native
  
  def open(url: Any, data: Any): Sprite = js.native
  
  @JSName("patch")
  def patch_MSpriteHandler(asset: Any, assets: Any): Unit = js.native
}
