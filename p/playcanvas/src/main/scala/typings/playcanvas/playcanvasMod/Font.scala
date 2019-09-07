package typings.playcanvas.playcanvasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @constructor
  * @name pc.Font
  * @classdesc Represents the resource of a font asset.
  * @param {pc.Texture[]} textures The font textures
  * @param {Object} data The font data
  * @property {Number} intensity The font intensity
  * @property {pc.Texture[]} textures The font textures
  */
@JSImport("playcanvas", "Font")
@js.native
class Font protected ()
  extends typings.playcanvas.pcNs.Font {
  def this(textures: js.Array[typings.playcanvas.pcNs.Texture], data: js.Any) = this()
}

