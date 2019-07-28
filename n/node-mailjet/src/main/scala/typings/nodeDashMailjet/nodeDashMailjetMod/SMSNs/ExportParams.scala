package typings.nodeDashMailjet.nodeDashMailjetMod.SMSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExportParams extends js.Object {
  var FromTS: Double
  var ToTS: Double
}

object ExportParams {
  @scala.inline
  def apply(FromTS: Double, ToTS: Double): ExportParams = {
    val __obj = js.Dynamic.literal(FromTS = FromTS, ToTS = ToTS)
  
    __obj.asInstanceOf[ExportParams]
  }
}

