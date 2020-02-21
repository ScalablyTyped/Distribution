package typings.playcanvas.pc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class
  * @name pc.Font
  * @classdesc Represents the resource of a font asset.
  * @param {pc.Texture[]} textures - The font textures.
  * @param {object} data - The font data.
  * @property {number} intensity The font intensity.
  * @property {pc.Texture[]} textures The font textures.
  */
@JSGlobal("pc.Font")
@js.native
class Font protected () extends js.Object {
  def this(textures: js.Array[Texture], data: js.Any) = this()
  /**
    * The font intensity.
    */
  var intensity: Double = js.native
  /**
    * The font textures.
    */
  var textures: js.Array[Texture] = js.native
}

