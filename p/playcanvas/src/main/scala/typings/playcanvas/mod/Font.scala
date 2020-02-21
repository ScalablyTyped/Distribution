package typings.playcanvas.mod

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
@JSImport("playcanvas", "Font")
@js.native
class Font protected ()
  extends typings.playcanvas.pc.Font {
  def this(textures: js.Array[typings.playcanvas.pc.Texture], data: js.Any) = this()
}

