package typings
package pixiDotJsLib.PIXINs.filtersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.filters.DisplacementFilter")
@js.native
class DisplacementFilter protected ()
  extends pixiDotJsLib.PIXINs.Filter[DisplacementFilterUniforms] {
  def this(sprite: pixiDotJsLib.PIXINs.Sprite) = this()
  def this(sprite: pixiDotJsLib.PIXINs.Sprite, scale: scala.Double) = this()
  var map: pixiDotJsLib.PIXINs.Texture = js.native
  var scale: pixiDotJsLib.PIXINs.Point = js.native
}

