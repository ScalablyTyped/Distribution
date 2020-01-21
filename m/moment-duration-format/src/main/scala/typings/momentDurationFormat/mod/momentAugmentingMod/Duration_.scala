package typings.momentDurationFormat.mod.momentAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Duration_ extends js.Object {
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

