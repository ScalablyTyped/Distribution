package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @typedef {import('../../framework/app-base.js').AppBase} AppBase */
/** @typedef {import('./handler.js').ResourceHandler} ResourceHandler */
/**
  * Loads Bundle Assets.
  *
  * @implements {ResourceHandler}
  * @ignore
  */
@JSImport("playcanvas", "BundleHandler")
@js.native
open class BundleHandler protected ()
  extends StObject
     with ResourceHandler {
  /**
    * Create a new BundleHandler instance.
    *
    * @param {AppBase} app - The running {@link AppBase}.
    * @hideconstructor
    */
  def this(app: AppBase) = this()
  
  var _assets: AssetRegistry = js.native
  
  def _untar(response: Any, callback: Any): Unit = js.native
  
  var _worker: Any = js.native
  
  /**
    * Type of the resource the handler handles.
    *
    * @type {string}
    */
  var handlerType: String = js.native
  
  def load(url: Any, callback: Any): Unit = js.native
  
  var maxRetries: Double = js.native
  
  def open(url: Any, data: Any): Bundle = js.native
  
  @JSName("patch")
  def patch_MBundleHandler(asset: Any, assets: Any): Unit = js.native
}
