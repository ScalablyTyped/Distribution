package typings
package popperDotJsLib.popperDotJsMod.PopperNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReferenceObject extends js.Object {
  var clientHeight: scala.Double
  var clientWidth: scala.Double
  def getBoundingClientRect(): stdLib.ClientRect
}

object ReferenceObject {
  @scala.inline
  def apply(
    clientHeight: scala.Double,
    clientWidth: scala.Double,
    getBoundingClientRect: js.Function0[stdLib.ClientRect]
  ): ReferenceObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("clientHeight")(clientHeight)
    __obj.updateDynamic("clientWidth")(clientWidth)
    __obj.updateDynamic("getBoundingClientRect")(getBoundingClientRect)
    __obj.asInstanceOf[ReferenceObject]
  }
}

