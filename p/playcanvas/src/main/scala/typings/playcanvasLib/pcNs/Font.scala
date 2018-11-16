package typings
package playcanvasLib.pcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
    * @name pc.Font
    * @class Represents the resource of a font asset.
    * @param {pc.Texture} texture The font texture
    * @param {Object} data The font data
    * @property {Number} intensity The font intensity
    */
@JSGlobal("pc.Font")
@js.native
class Font protected () extends js.Object {
  def this(texture: Texture, data: js.Object) = this()
  var intensity: scala.Double = js.native
}

