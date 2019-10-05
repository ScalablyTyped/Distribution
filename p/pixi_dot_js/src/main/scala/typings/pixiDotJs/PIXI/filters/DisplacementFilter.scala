package typings.pixiDotJs.PIXI.filters

import typings.pixiDotJs.PIXI.Filter
import typings.pixiDotJs.PIXI.Point
import typings.pixiDotJs.PIXI.Sprite
import typings.pixiDotJs.PIXI.Texture
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

