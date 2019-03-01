package typings
package nodeDashSpriteDashGeneratorLib.nodeDashSpriteDashGeneratorMod.NodeSpriteGeneratorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Layout extends js.Object {
  var height: scala.Double
  var images: js.Array[nodeDashSpriteDashGeneratorLib.Anon_X with Image]
  var width: scala.Double
}

object Layout {
  @scala.inline
  def apply(
    height: scala.Double,
    images: js.Array[nodeDashSpriteDashGeneratorLib.Anon_X with Image],
    width: scala.Double
  ): Layout = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("height")(height)
    __obj.updateDynamic("images")(images)
    __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[Layout]
  }
}

