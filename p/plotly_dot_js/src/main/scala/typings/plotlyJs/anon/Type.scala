package typings.plotlyJs.anon

import typings.plotlyJs.plotlyJsStrings.constant
import typings.plotlyJs.plotlyJsStrings.percent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Type extends js.Object {
  var `type`: constant | percent
  var value: Double
  var valueminus: js.UndefOr[Double] = js.undefined
}

object Type {
  @scala.inline
  def apply(`type`: constant | percent, value: Double, valueminus: js.UndefOr[Double] = js.undefined): Type = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(valueminus)) __obj.updateDynamic("valueminus")(valueminus.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type]
  }
}

