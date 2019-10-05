package typings.momentDashDurationDashFormat.momentDashDurationDashFormatMod.momentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Duration extends js.Object {
  @JSName("format")
  var format_Original: Format = js.native
  def format(): String = js.native
  def format(settings: DurationFormatSettings): String = js.native
  def format(template: String): String = js.native
  def format(template: String, precision: Double): String = js.native
  def format(template: String, precision: Double, settings: DurationFormatSettings): String = js.native
  def format(template: String, settings: DurationFormatSettings): String = js.native
  def format(template: TemplateFunction): String = js.native
  def format(template: TemplateFunction, precision: Double): String = js.native
  def format(template: TemplateFunction, precision: Double, settings: DurationFormatSettings): String = js.native
  def format(template: TemplateFunction, settings: DurationFormatSettings): String = js.native
}

@JSImport("moment", "duration")
@js.native
object duration extends js.Object {
  val fn: Duration = js.native
}

