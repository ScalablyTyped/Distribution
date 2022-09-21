package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Resource handler used for loading {@link Font} resources.
  *
  * @implements {ResourceHandler}
  */
@JSImport("playcanvas", "FontHandler")
@js.native
open class FontHandler protected ()
  extends StObject
     with ResourceHandler {
  /**
    * Create a new FontHandler instance.
    *
    * @param {AppBase} app - The running {@link AppBase}.
    * @hideconstructor
    */
  def this(app: AppBase) = this()
  
  def _loadTextures(url: Any, data: Any, callback: Any): Unit = js.native
  
  var _loader: ResourceLoader = js.native
  
  /**
    * Type of the resource the handler handles.
    *
    * @type {string}
    */
  var handlerType: String = js.native
  
  def load(url: Any, callback: Any, asset: Any): Unit = js.native
  
  var maxRetries: Double = js.native
  
  def open(url: Any, data: Any, asset: Any): Font = js.native
  
  @JSName("patch")
  def patch_MFontHandler(asset: Any, assets: Any): Unit = js.native
}
