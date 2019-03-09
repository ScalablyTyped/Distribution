package typings
package offscreencanvasLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Quality extends js.Object {
  var quality: js.UndefOr[scala.Double] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Quality {
  @scala.inline
  def apply(quality: scala.Int | scala.Double = null, `type`: java.lang.String = null): Anon_Quality = {
    val __obj = js.Dynamic.literal()
    if (quality != null) __obj.updateDynamic("quality")(quality.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Quality]
  }
}

