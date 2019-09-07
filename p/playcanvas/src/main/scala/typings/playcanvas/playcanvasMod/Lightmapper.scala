package typings.playcanvas.playcanvasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @constructor
  * @name pc.Lightmapper
  * @classdesc The lightmapper is used to bake scene lights into textures.
  * @param {pc.GraphicsDevice} device The grahpics device used by the lightmapper.
  * @param {pc.Entity} root The root entity of the scene.
  * @param {pc.Scene} scene The scene to lightmap.
  * @param {pc.ForwardRenderer} renderer The renderer.
  * @param {pc.AssetRegistry} assets Registry of assets to lightmap.
  */
@JSImport("playcanvas", "Lightmapper")
@js.native
class Lightmapper protected ()
  extends typings.playcanvas.pcNs.Lightmapper {
  def this(
    device: typings.playcanvas.pcNs.GraphicsDevice,
    root: typings.playcanvas.pcNs.Entity,
    scene: typings.playcanvas.pcNs.Scene,
    renderer: typings.playcanvas.pcNs.ForwardRenderer,
    assets: typings.playcanvas.pcNs.AssetRegistry
  ) = this()
}

