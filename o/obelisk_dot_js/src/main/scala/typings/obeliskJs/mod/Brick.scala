package typings.obeliskJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("obelisk.js", "Brick")
@js.native
class Brick () extends AbstractPrimitive {
  def this(dimension: BrickDimension) = this()
  def this(dimension: BrickDimension, color: SideColor) = this()
  def this(dimension: BrickDimension, color: SideColor, border: Boolean) = this()
  def this(dimension: BrickDimension, color: SideColor, border: Boolean, useDefaultCanvas: Boolean) = this()
}

