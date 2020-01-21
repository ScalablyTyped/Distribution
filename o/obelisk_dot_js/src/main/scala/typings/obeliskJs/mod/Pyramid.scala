package typings.obeliskJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("obelisk.js", "Pyramid")
@js.native
class Pyramid () extends AbstractPrimitive {
  def this(dimension: PyramidDimension) = this()
  def this(dimension: PyramidDimension, color: PyramidColor) = this()
  def this(dimension: PyramidDimension, color: PyramidColor, border: Boolean) = this()
  def this(dimension: PyramidDimension, color: PyramidColor, border: Boolean, useDefaultCanvas: Boolean) = this()
}

