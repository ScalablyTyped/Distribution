package typings.playcanvas.pc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @constructor
  * @name pc.BasicMaterial
  * @extends pc.Material
  * @classdesc A Basic material is for rendering unlit geometry, either using a constant color or a
  * color map modulated with a color.
  * @property {pc.Color} color The flat color of the material (RGBA, where each component is 0 to 1).
  * @property {pc.Texture|Null} colorMap The color map of the material (default is null). If specified, the color map is
  * modulated by the color property.
  * @example
  * // Create a new Basic material
  * var material = new pc.BasicMaterial();
  *
  * // Set the material to have a texture map that is multiplied by a red color
  * material.color.set(1, 0, 0);
  * material.colorMap = diffuseMap;
  *
  * // Notify the material that it has been modified
  * material.update();
  */
@JSGlobal("pc.BasicMaterial")
@js.native
class BasicMaterial () extends Material {
  /**
    * The flat color of the material (RGBA, where each component is 0 to 1).
    */
  var color: Color = js.native
  /**
    * The color map of the material (default is null). If specified, the color map is
    * modulated by the color property.
    */
  var colorMap: Texture | Null = js.native
}

