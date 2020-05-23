package typings.playcanvas.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Components extends js.Object {
  var components: Double
  var normalize: js.UndefOr[Boolean] = js.undefined
  var semantic: String
  var `type`: Double
}

object Components {
  @scala.inline
  def apply(
    components: Double,
    semantic: String,
    `type`: Double,
    normalize: js.UndefOr[Boolean] = js.undefined
  ): Components = {
    val __obj = js.Dynamic.literal(components = components.asInstanceOf[js.Any], semantic = semantic.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(normalize)) __obj.updateDynamic("normalize")(normalize.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Components]
  }
}

