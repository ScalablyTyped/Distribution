package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @typedef {import('../framework/app-base.js').AppBase} AppBase */
/** @typedef {import('./handler.js').ResourceHandler} ResourceHandler */
/**
  * Resource handler for loading JavaScript files dynamically.  Two types of JavaScript files can be
  * loaded, PlayCanvas scripts which contain calls to {@link createScript}, or regular JavaScript
  * files, such as third-party libraries.
  *
  * @implements {ResourceHandler}
  */
@js.native
trait ScriptHandler
  extends StObject
     with ResourceHandler {
  
  var _app: AppBase = js.native
  
  def _loadScript(url: Any, callback: Any): Unit = js.native
  
  /**
    * Type of the resource the handler handles.
    *
    * @type {string}
    */
  var handlerType: String = js.native
  
  def load(url: Any, callback: Any): Unit = js.native
  
  def open(url: Any, data: Any): Any = js.native
  
  @JSName("patch")
  def patch_MScriptHandler(asset: Any, assets: Any): Unit = js.native
}
