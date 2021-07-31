package typings.playcanvas.mod

import typings.playcanvas.pc.ResourceHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Resource handler used for loading {@link pc.Sprite} resources.
  * @param assets - The asset registry.
  * @param device - The graphics device.
  */
@JSImport("playcanvas", "SpriteHandler")
@js.native
class SpriteHandler protected ()
  extends StObject
     with ResourceHandler {
  def this(assets: typings.playcanvas.pc.AssetRegistry, device: typings.playcanvas.pc.GraphicsDevice) = this()
}
