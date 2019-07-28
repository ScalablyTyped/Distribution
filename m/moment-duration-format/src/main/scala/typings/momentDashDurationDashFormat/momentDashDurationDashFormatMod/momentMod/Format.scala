package typings.momentDashDurationDashFormat.momentDashDurationDashFormatMod.momentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Format extends js.Object {
  var defaults: DurationFormatSettings = js.native
  def apply(): String = js.native
  def apply(settings: DurationFormatSettings): String = js.native
  def apply(template: String): String = js.native
  def apply(template: String, precision: Double): String = js.native
  def apply(template: String, precision: Double, settings: DurationFormatSettings): String = js.native
  def apply(template: String, settings: DurationFormatSettings): String = js.native
  def apply(template: TemplateFunction): String = js.native
  def apply(template: TemplateFunction, precision: Double): String = js.native
  def apply(template: TemplateFunction, precision: Double, settings: DurationFormatSettings): String = js.native
  def apply(template: TemplateFunction, settings: DurationFormatSettings): String = js.native
}

