package typings.obeliskDotJs.obeliskDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("obelisk.js", "Cube")
@js.native
class Cube () extends AbstractPrimitive {
  def this(dimension: CubeDimension) = this()
  def this(dimension: CubeDimension, color: CubeColor) = this()
  def this(dimension: CubeDimension, color: CubeColor, border: Boolean) = this()
  def this(dimension: CubeDimension, color: CubeColor, border: Boolean, useDefaultCanvas: Boolean) = this()
}

