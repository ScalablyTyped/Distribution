package typings.playcanvas.global.pc

import typings.playcanvas.pc.ResourceHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Resource handler used for loading cubemap {@link pc.Texture} resources.
  * @param device - The graphics device.
  * @param assets - The asset registry.
  * @param loader - The resource loader.
  */
@JSGlobal("pc.CubemapHandler")
@js.native
class CubemapHandler protected () extends ResourceHandler {
  def this(
    device: typings.playcanvas.pc.GraphicsDevice,
    assets: typings.playcanvas.pc.AssetRegistry,
    loader: typings.playcanvas.pc.ResourceLoader
  ) = this()
}
