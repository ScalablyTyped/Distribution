package typings.plottable.buildSrcAxesCategoryAxisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDownsampleInfo extends js.Object {
  var domain: js.Array[String]
  var stepWidth: Double
}

object IDownsampleInfo {
  @scala.inline
  def apply(domain: js.Array[String], stepWidth: Double): IDownsampleInfo = {
    val __obj = js.Dynamic.literal(domain = domain, stepWidth = stepWidth)
  
    __obj.asInstanceOf[IDownsampleInfo]
  }
}

