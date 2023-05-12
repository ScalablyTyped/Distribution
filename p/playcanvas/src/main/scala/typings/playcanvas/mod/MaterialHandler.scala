package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Resource handler used for loading {@link Material} resources.
  *
  * @implements {ResourceHandler}
  */
@JSImport("playcanvas", "MaterialHandler")
@js.native
open class MaterialHandler protected ()
  extends StObject
     with ResourceHandler {
  /**
    * Create a new MaterialHandler instance.
    *
    * @param {import('../app-base.js').AppBase} app - The running {@link AppBase}.
    * @hideconstructor
    */
  def this(app: AppBase) = this()
  
  var _assets: AssetRegistry = js.native
  
  def _assignCubemap(parameterName: Any, materialAsset: Any, textures: Any): Unit = js.native
  
  def _assignPlaceholderTexture(parameterName: Any, materialAsset: Any): Unit = js.native
  
  def _assignTexture(parameterName: Any, materialAsset: Any, texture: Any): Unit = js.native
  
  def _bindAndAssignAssets(materialAsset: Any, assets: Any): Unit = js.native
  
  def _createPlaceholders(): Unit = js.native
  
  var _device: GraphicsDevice = js.native
  
  def _getPlaceholderTexture(parameterName: Any): Any = js.native
  
  def _onAssetUnload(asset: Any): Unit = js.native
  
  def _onCubemapAdd(parameterName: Any, materialAsset: Any, cubemapAsset: Any): Unit = js.native
  
  def _onCubemapLoad(parameterName: Any, materialAsset: Any, cubemapAsset: Any): Unit = js.native
  
  def _onCubemapRemoveOrUnload(parameterName: Any, materialAsset: Any, cubemapAsset: Any): Unit = js.native
  
  def _onTextureAdd(parameterName: Any, materialAsset: Any, textureAsset: Any): Unit = js.native
  
  def _onTextureLoad(parameterName: Any, materialAsset: Any, textureAsset: Any): Unit = js.native
  
  def _onTextureRemoveOrUnload(parameterName: Any, materialAsset: Any, textureAsset: Any): Unit = js.native
  
  var _parser: JsonStandardMaterialParser = js.native
  
  /**
    * Type of the resource the handler handles.
    *
    * @type {string}
    */
  var handlerType: String = js.native
  
  def load(url: Any, callback: Any): Unit = js.native
  
  var maxRetries: Double = js.native
  
  def open(url: Any, data: Any): StandardMaterial = js.native
  
  @JSName("patch")
  def patch_MMaterialHandler(asset: Any, assets: Any): Unit = js.native
}
