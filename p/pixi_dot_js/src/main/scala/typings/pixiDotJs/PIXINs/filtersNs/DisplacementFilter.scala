package typings.pixiDotJs.PIXINs.filtersNs

import typings.pixiDotJs.PIXINs.Filter
import typings.pixiDotJs.PIXINs.Point
import typings.pixiDotJs.PIXINs.Sprite
import typings.pixiDotJs.PIXINs.Texture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.filters.DisplacementFilter")
@js.native
class DisplacementFilter protected () extends Filter[DisplacementFilterUniforms] {
  def this(sprite: Sprite) = this()
  def this(sprite: Sprite, scale: Double) = this()
  var map: Texture = js.native
  var scale: Point = js.native
}

