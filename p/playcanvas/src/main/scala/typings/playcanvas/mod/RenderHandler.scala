package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Resource handler used for loading {@link Render} resources.
  *
  * @implements {ResourceHandler}
  */
@JSImport("playcanvas", "RenderHandler")
@js.native
open class RenderHandler protected ()
  extends StObject
     with ResourceHandler {
  /**
    * Create a new RenderHandler instance.
    *
    * @param {AppBase} app - The running {@link AppBase}.
    * @hideconstructor
    */
  def this(app: AppBase) = this()
  
  var _registry: AssetRegistry = js.native
  
  /**
    * Type of the resource the handler handles.
    *
    * @type {string}
    */
  var handlerType: String = js.native
  
  def load(url: Any, callback: Any, asset: Any): Unit = js.native
  
  def open(url: Any, data: Any): Render = js.native
  
  @JSName("patch")
  def patch_MRenderHandler(asset: Any, registry: Any): Unit = js.native
}
