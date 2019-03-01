package typings
package playcanvasLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Components extends js.Object {
  var components: scala.Double
  var normalize: js.UndefOr[scala.Boolean] = js.undefined
  var semantic: java.lang.String
  var `type`: scala.Double
}

object Anon_Components {
  @scala.inline
  def apply(
    components: scala.Double,
    semantic: java.lang.String,
    `type`: scala.Double,
    normalize: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_Components = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("components")(components)
    __obj.updateDynamic("semantic")(semantic)
    if (!js.isUndefined(normalize)) __obj.updateDynamic("normalize")(normalize)
    __obj.asInstanceOf[Anon_Components]
  }
}

