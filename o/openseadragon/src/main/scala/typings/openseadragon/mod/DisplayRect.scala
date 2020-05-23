package typings.openseadragon.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openseadragon", "DisplayRect")
@js.native
class DisplayRect protected () extends Rect {
  def this(x: Double, y: Double, width: Double, height: Double, minLevel: Double, maxLevel: Double) = this()
  var maxLevel: Double = js.native
  var minLevel: Double = js.native
}

