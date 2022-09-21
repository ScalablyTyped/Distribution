package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @typedef {import('../framework/app-base.js').AppBase} AppBase */
/** @typedef {import('./handler.js').ResourceHandler} ResourceHandler */
/**
  * Resource handler used for loading {@link Scene} resources.
  *
  * @implements {ResourceHandler}
  */
@JSImport("playcanvas", "SceneHandler")
@js.native
open class SceneHandler protected ()
  extends StObject
     with ResourceHandler {
  /**
    * Create a new SceneHandler instance.
    *
    * @param {AppBase} app - The running {@link AppBase}.
    * @hideconstructor
    */
  def this(app: AppBase) = this()
  
  var _app: AppBase = js.native
  
  /**
    * Type of the resource the handler handles.
    *
    * @type {string}
    */
  var handlerType: String = js.native
  
  def load(url: Any, callback: Any): Unit = js.native
  
  var maxRetries: Double = js.native
  
  def open(url: Any, data: Any): Scene_ = js.native
  
  @JSName("patch")
  def patch_MSceneHandler(asset: Any, assets: Any): Unit = js.native
}
