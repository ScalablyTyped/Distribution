package typings
package plottableLib.buildSrcAxesCategoryAxisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDownsampleInfo extends js.Object {
  var domain: js.Array[java.lang.String]
  var stepWidth: scala.Double
}

object IDownsampleInfo {
  @scala.inline
  def apply(domain: js.Array[java.lang.String], stepWidth: scala.Double): IDownsampleInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("domain")(domain)
    __obj.updateDynamic("stepWidth")(stepWidth)
    __obj.asInstanceOf[IDownsampleInfo]
  }
}

