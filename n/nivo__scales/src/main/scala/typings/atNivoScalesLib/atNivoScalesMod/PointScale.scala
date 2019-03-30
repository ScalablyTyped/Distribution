package typings
package atNivoScalesLib.atNivoScalesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PointScale extends Scale {
  var `type`: atNivoScalesLib.atNivoScalesLibStrings.point
}

object PointScale {
  @scala.inline
  def apply(`type`: atNivoScalesLib.atNivoScalesLibStrings.point): PointScale = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[PointScale]
  }
}

