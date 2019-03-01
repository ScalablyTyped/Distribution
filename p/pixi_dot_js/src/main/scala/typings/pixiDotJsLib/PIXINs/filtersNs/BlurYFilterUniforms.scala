package typings
package pixiDotJsLib.PIXINs.filtersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BlurYFilterUniforms extends js.Object {
  var strength: scala.Double
}

object BlurYFilterUniforms {
  @scala.inline
  def apply(strength: scala.Double): BlurYFilterUniforms = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("strength")(strength)
    __obj.asInstanceOf[BlurYFilterUniforms]
  }
}

