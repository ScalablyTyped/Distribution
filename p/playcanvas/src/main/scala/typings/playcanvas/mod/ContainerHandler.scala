package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Loads files that contain multiple resources. For example glTF files can contain textures, models
  * and animations.
  *
  * For glTF files, the asset options object can be used to pass load time callbacks for handling
  * the various resources at different stages of loading. The table below lists the resource types
  * and the corresponding supported process functions.
  *
  * ```
  * |---------------------------------------------------------------------|
  * |  resource   |  preprocess |   process   |processAsync | postprocess |
  * |-------------+-------------+-------------+-------------+-------------|
  * | global      |      x      |             |             |      x      |
  * | node        |      x      |      x      |             |      x      |
  * | light       |      x      |      x      |             |      x      |
  * | camera      |      x      |      x      |             |      x      |
  * | animation   |      x      |             |             |      x      |
  * | material    |      x      |      x      |             |      x      |
  * | image       |      x      |             |      x      |      x      |
  * | texture     |      x      |             |      x      |      x      |
  * | buffer      |      x      |             |      x      |      x      |
  * | bufferView  |      x      |             |      x      |      x      |
  * |---------------------------------------------------------------------|
  * ```
  *
  * Additional options that can be passed for glTF files:
  * [options.morphPreserveData] - When true, the morph target keeps its data passed using the options,
  * allowing the clone operation.
  *
  * For example, to receive a texture preprocess callback:
  *
  * ```javascript
  * var containerAsset = new pc.Asset(filename, 'container', { url: url, filename: filename }, null, {
  *     texture: {
  *         preprocess(gltfTexture) { console.log("texture preprocess"); }
  *     },
  * });
  * ```
  *
  * @implements {ResourceHandler}
  */
@JSImport("playcanvas", "ContainerHandler")
@js.native
open class ContainerHandler protected ()
  extends StObject
     with ResourceHandler {
  /**
    * Create a new ContainerResource instance.
    *
    * @param {AppBase} app - The running {@link AppBase}.
    * @hideconstructor
    */
  def this(app: AppBase) = this()
  
  /**
    * @param {string} url - The resource URL.
    * @returns {*} A suitable parser to parse the resource.
    * @private
    */
  /* private */ var _getParser: Any = js.native
  
  /**
    * @param {string} url - The resource URL.
    * @returns {string} The URL with query parameters removed.
    * @private
    */
  /* private */ var _getUrlWithoutParams: Any = js.native
  
  var glbParser: GlbParser = js.native
  
  /**
    * Type of the resource the handler handles.
    *
    * @type {string}
    */
  var handlerType: String = js.native
  
  def maxRetries: Any = js.native
  def maxRetries_=(arg: Any): Unit = js.native
  
  /**
    * @param {Asset} asset - The asset to patch.
    * @param {AssetRegistry} assets - The asset registry.
    */
  @JSName("patch")
  def patch_MContainerHandler(asset: Asset_, assets: AssetRegistry): Unit = js.native
}
