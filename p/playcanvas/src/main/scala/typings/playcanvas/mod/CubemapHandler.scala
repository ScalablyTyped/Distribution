package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @typedef {import('./handler.js').ResourceHandler} ResourceHandler */
/** @typedef {import('../framework/app-base.js').AppBase} AppBase */
/**
  * Resource handler used for loading cubemap {@link Texture} resources.
  *
  * @implements {ResourceHandler}
  */
@JSImport("playcanvas", "CubemapHandler")
@js.native
open class CubemapHandler protected ()
  extends StObject
     with ResourceHandler {
  /**
    * Create a new CubemapHandler instance.
    *
    * @param {AppBase} app - The running {@link AppBase}.
    * @hideconstructor
    */
  def this(app: AppBase) = this()
  
  var _device: GraphicsDevice = js.native
  
  var _loader: ResourceLoader = js.native
  
  var _registry: AssetRegistry = js.native
  
  def cmpArrays(arr1: Any, arr2: Any): Boolean = js.native
  
  def compareAssetIds(assetIdA: Any, assetIdB: Any): Boolean = js.native
  
  def getAssetIds(cubemapAsset: Any): js.Array[Any] = js.native
  
  /**
    * Type of the resource the handler handles.
    *
    * @type {string}
    */
  var handlerType: String = js.native
  
  def load(url: Any, callback: Any, asset: Any): Unit = js.native
  
  def loadAssets(cubemapAsset: Any, callback: Any): Unit = js.native
  
  def open(url: Any, data: Any, asset: Any): Any = js.native
  
  @JSName("patch")
  def patch_MCubemapHandler(asset: Any, registry: Any): Unit = js.native
  
  def resolveId(value: Any): Any = js.native
  
  def update(cubemapAsset: Any, assetIds: Any, assets: Any): Unit = js.native
}
