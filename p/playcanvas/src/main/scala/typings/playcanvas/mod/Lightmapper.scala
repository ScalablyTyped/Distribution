package typings.playcanvas.mod

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
  extends typings.playcanvas.pc.Lightmapper {
  def this(
    device: typings.playcanvas.pc.GraphicsDevice,
    root: typings.playcanvas.pc.Entity,
    scene: typings.playcanvas.pc.Scene,
    renderer: typings.playcanvas.pc.ForwardRenderer,
    assets: typings.playcanvas.pc.AssetRegistry
  ) = this()
}

