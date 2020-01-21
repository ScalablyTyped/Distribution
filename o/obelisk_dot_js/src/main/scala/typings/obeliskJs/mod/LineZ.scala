package typings.obeliskJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("obelisk.js", "LineZ")
@js.native
class LineZ () extends AbstractPrimitive {
  def this(dimension: LineZDimension) = this()
  def this(dimension: LineZDimension, color: LineColor) = this()
  def this(dimension: LineZDimension, color: LineColor, useDefaultCanvas: Boolean) = this()
}

