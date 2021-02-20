package typings.playcanvas.pc

import typings.playcanvas.anon.Original
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface to a texture parser. Implementations of this interface handle the loading
  * and opening of texture assets.
  */
@js.native
trait TextureParser extends StObject {
  
  /**
    * Load the texture from the remote URL. When loaded (or failed),
    * use the callback to return an the raw resource data (or error).
    * @param url - The URL of the resource to load.
    * @param url.load - The URL to use for loading the resource
    * @param url.original - The original URL useful for identifying the resource type
    * @param callback - The callback used when the resource is loaded or an error occurs.
    * @param [asset] - Optional asset that is passed by ResourceLoader.
    */
  def load(url: Original, callback: typings.playcanvas.pc.callbacks.ResourceHandler): Unit = js.native
  def load(url: Original, callback: typings.playcanvas.pc.callbacks.ResourceHandler, asset: Asset): Unit = js.native
  
  def open(url: String, data: js.Any, asset: Null, device: GraphicsDevice): Texture = js.native
  /**
    * Convert raw resource data into a resource instance. E.g. Take 3D model format JSON and return a pc.Model.
    * @param url - The URL of the resource to open.
    * @param data - The raw resource data passed by callback from {@link pc.ResourceHandler#load}.
    * @param asset - Optional asset which is passed in by ResourceLoader.
    * @param device - The graphics device
    * @returns The parsed resource data.
    */
  def open(url: String, data: js.Any, asset: Asset, device: GraphicsDevice): Texture = js.native
}
