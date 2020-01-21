package typings.obeliskJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("obelisk.js", "LineX")
@js.native
class LineX () extends AbstractPrimitive {
  def this(dimension: LineXDimension) = this()
  def this(dimension: LineXDimension, color: LineColor) = this()
  def this(dimension: LineXDimension, color: LineColor, useDefaultCanvas: Boolean) = this()
}

