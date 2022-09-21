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
@JSImport("playcanvas", "ScriptHandler")
@js.native
open class ScriptHandler protected ()
  extends StObject
     with ResourceHandler {
  /**
    * Create a new ScriptHandler instance.
    *
    * @param {AppBase} app - The running {@link AppBase}.
    * @hideconstructor
    */
  def this(app: AppBase) = this()
  
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
object ScriptHandler {
  
  @JSImport("playcanvas", "ScriptHandler")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def push(Type: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_push")(Type.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /* static member */
  @JSImport("playcanvas", "ScriptHandler._types")
  @js.native
  def types: js.Array[Any] = js.native
  
  inline def types_=(x: js.Array[Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_types")(x.asInstanceOf[js.Any])
}
