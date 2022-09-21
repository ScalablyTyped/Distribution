package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @typedef {import('./handler.js').ResourceHandler} ResourceHandler */
/**
  * Resource handler used for loading {@link Animation} resources.
  *
  * @implements {ResourceHandler}
  */
@JSImport("playcanvas", "AnimationHandler")
@js.native
open class AnimationHandler protected ()
  extends StObject
     with ResourceHandler {
  /** @hideconstructor */
  def this(app: Any) = this()
  
  def _parseAnimationV3(data: Any): Animation = js.native
  
  def _parseAnimationV4(data: Any): Animation = js.native
  
  /**
    * Type of the resource the handler handles.
    *
    * @type {string}
    */
  var handlerType: String = js.native
  
  def load(url: Any, callback: Any): Unit = js.native
  
  var maxRetries: Double = js.native
  
  def open(url: Any, data: Any, asset: Any): Any = js.native
  
  @JSName("patch")
  def patch_MAnimationHandler(asset: Any, assets: Any): Unit = js.native
}
