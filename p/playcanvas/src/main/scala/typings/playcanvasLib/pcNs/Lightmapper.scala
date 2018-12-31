package typings
package playcanvasLib.pcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @name pc.Lightmapper
  * @class The lightmapper is used to bake scene lights into textures.
  */
@JSGlobal("pc.Lightmapper")
@js.native
class Lightmapper protected () extends js.Object {
  def this(device: GraphicsDevice, root: Entity, scene: Scene, renderer: js.Any, assets: js.Array[Asset]) = this()
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
  def bake(nodes: Entity, mode: scala.Double): scala.Unit = js.native
}

