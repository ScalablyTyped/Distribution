package typings
package nodeDashMailjetLib.nodeDashMailjetMod.SMSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExportParams extends js.Object {
  var FromTS: scala.Double
  var ToTS: scala.Double
}

object ExportParams {
  @scala.inline
  def apply(FromTS: scala.Double, ToTS: scala.Double): ExportParams = {
    val __obj = js.Dynamic.literal(FromTS = FromTS, ToTS = ToTS)
  
    __obj.asInstanceOf[ExportParams]
  }
}

