package typings.playcanvas

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Components extends js.Object {
  var components: Double
  var normalize: js.UndefOr[Boolean] = js.undefined
  var semantic: String
  var `type`: Double
}

object Anon_Components {
  @scala.inline
  def apply(
    components: Double,
    semantic: String,
    `type`: Double,
    normalize: js.UndefOr[Boolean] = js.undefined
  ): Anon_Components = {
    val __obj = js.Dynamic.literal(components = components, semantic = semantic)
    __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(normalize)) __obj.updateDynamic("normalize")(normalize)
    __obj.asInstanceOf[Anon_Components]
  }
}

