package typings.playcanvas.mod

import typings.playcanvas.pc.ResourceHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Resource handler used for loading 2D and 3D {@link pc.Texture} resources.
  * @param device - The graphics device.
  * @param assets - The asset registry.
  * @param loader - The resource loader.
  */
@JSImport("playcanvas", "TextureHandler")
@js.native
class TextureHandler protected () extends ResourceHandler {
  def this(
    device: typings.playcanvas.pc.GraphicsDevice,
    assets: typings.playcanvas.pc.AssetRegistry,
    loader: typings.playcanvas.pc.ResourceLoader
  ) = this()
}
