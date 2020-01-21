package typings.nivoScales.mod

import typings.nivoScales.nivoScalesStrings.point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PointScale extends Scale {
  var `type`: point
}

object PointScale {
  @scala.inline
  def apply(`type`: point): PointScale = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointScale]
  }
}

