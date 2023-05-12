package typings.playcanvas.mod

import typings.playcanvas.anon.Load
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @interface
  * @name TextureParser
  * @description Interface to a texture parser. Implementations of this interface handle the loading
  * and opening of texture assets.
  */
@JSImport("playcanvas", "TextureParser")
@js.native
open class TextureParser () extends StObject {
  
  /**
    * @function
    * @name TextureParser#load
    * @description Load the texture from the remote URL. When loaded (or failed),
    * use the callback to return an the raw resource data (or error).
    * @param {object} url - The URL of the resource to load.
    * @param {string} url.load - The URL to use for loading the resource.
    * @param {string} url.original - The original URL useful for identifying the resource type.
    * @param {import('./handler.js').ResourceHandlerCallback} callback - The callback used when
    * the resource is loaded or an error occurs.
    * @param {import('../asset/asset.js').Asset} [asset] - Optional asset that is passed by
    * ResourceLoader.
    */
  def load(url: Load, callback: ResourceHandlerCallback): Unit = js.native
  def load(url: Load, callback: ResourceHandlerCallback, asset: Asset_): Unit = js.native
  
  /**
    * @function
    * @name TextureParser#open
    * @description Convert raw resource data into a resource instance. E.g. Take 3D model format
    * JSON and return a {@link Model}.
    * @param {string} url - The URL of the resource to open.
    * @param {*} data - The raw resource data passed by callback from {@link ResourceHandler#load}.
    * @param {import('../../platform/graphics/graphics-device.js').GraphicsDevice} device - The
    * graphics device.
    * @returns {Texture} The parsed resource data.
    */
  def open(url: String, data: Any, device: GraphicsDevice): Texture = js.native
}
