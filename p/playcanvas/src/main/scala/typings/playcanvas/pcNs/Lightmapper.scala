package typings.playcanvas.pcNs

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
@JSGlobal("pc.Lightmapper")
@js.native
class Lightmapper protected () extends js.Object {
  def this(
    device: GraphicsDevice,
    root: Entity,
    scene: Scene,
    renderer: ForwardRenderer,
    assets: AssetRegistry
  ) = this()
  /**
    * @function
    * @name pc.Lightmapper#bake
    * @description Generates and applies the lightmaps.
    * @param {pc.Entity} nodes An array of models to render lightmaps for. If not supplied, full scene will be baked.
    * @param {Number} mode Baking mode. Possible values:
    * <ul>
    *     <li>pc.BAKE_COLOR: single color lightmap
    *     <li>pc.BAKE_COLORDIR: single color lightmap + dominant light direction (used for bump/specular)
    * </ul>
    * Only lights with bakeDir=true will be used for generating the dominant light direction.
    */
  def bake(nodes: Entity, mode: Double): Unit = js.native
}

