package typings.plotlyDotJs

import typings.plotlyDotJs.plotlyDotJsStrings.constant
import typings.plotlyDotJs.plotlyDotJsStrings.percent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Constant extends js.Object {
  var `type`: constant | percent
  var value: Double
  var valueminus: js.UndefOr[Double] = js.undefined
}

object Anon_Constant {
  @scala.inline
  def apply(`type`: constant | percent, value: Double, valueminus: Int | Double = null): Anon_Constant = {
    val __obj = js.Dynamic.literal(value = value)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (valueminus != null) __obj.updateDynamic("valueminus")(valueminus.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Constant]
  }
}

