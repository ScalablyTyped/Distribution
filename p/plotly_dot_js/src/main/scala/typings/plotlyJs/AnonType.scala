package typings.plotlyJs

import typings.plotlyJs.plotlyJsStrings.constant
import typings.plotlyJs.plotlyJsStrings.percent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonType extends js.Object {
  var `type`: constant | percent
  var value: Double
  var valueminus: js.UndefOr[Double] = js.undefined
}

object AnonType {
  @scala.inline
  def apply(`type`: constant | percent, value: Double, valueminus: Int | Double = null): AnonType = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (valueminus != null) __obj.updateDynamic("valueminus")(valueminus.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonType]
  }
}

