package typings.nodeMailjet.mod.SMS

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
    val __obj = js.Dynamic.literal(FromTS = FromTS.asInstanceOf[js.Any], ToTS = ToTS.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ExportParams]
  }
}

