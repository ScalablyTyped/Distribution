package typings.playcanvas.pcNs

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
@JSGlobal("pc.Font")
@js.native
class Font protected () extends js.Object {
  def this(textures: js.Array[Texture], data: js.Any) = this()
  /**
    * The font intensity
    */
  var intensity: Double = js.native
  /**
    * The font textures
    */
  var textures: js.Array[Texture] = js.native
}

