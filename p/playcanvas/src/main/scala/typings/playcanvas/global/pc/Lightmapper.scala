package typings.playcanvas.global.pc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The lightmapper is used to bake scene lights into textures.
  * @param device - The grahpics device used by the lightmapper.
  * @param root - The root entity of the scene.
  * @param scene - The scene to lightmap.
  * @param renderer - The renderer.
  * @param assets - Registry of assets to lightmap.
  */
@JSGlobal("pc.Lightmapper")
@js.native
class Lightmapper protected ()
  extends typings.playcanvas.pc.Lightmapper {
  def this(
    device: typings.playcanvas.pc.GraphicsDevice,
    root: typings.playcanvas.pc.Entity,
    scene: typings.playcanvas.pc.Scene,
    renderer: typings.playcanvas.pc.ForwardRenderer,
    assets: typings.playcanvas.pc.AssetRegistry
  ) = this()
}
