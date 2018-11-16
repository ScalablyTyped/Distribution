package typings
package momentDashDurationDashFormatLib.momentDashDurationDashFormatMod.momentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Duration extends js.Object {
  @JSName("format")
  var format_Original: Format = js.native
  def format(): java.lang.String = js.native
  def format(settings: DurationFormatSettings): java.lang.String = js.native
  def format(template: java.lang.String): java.lang.String = js.native
  def format(template: java.lang.String, precision: scala.Double): java.lang.String = js.native
  def format(template: java.lang.String, precision: scala.Double, settings: DurationFormatSettings): java.lang.String = js.native
  def format(template: java.lang.String, settings: DurationFormatSettings): java.lang.String = js.native
  def format(template: TemplateFunction): java.lang.String = js.native
  def format(template: TemplateFunction, precision: scala.Double): java.lang.String = js.native
  def format(template: TemplateFunction, precision: scala.Double, settings: DurationFormatSettings): java.lang.String = js.native
  def format(template: TemplateFunction, settings: DurationFormatSettings): java.lang.String = js.native
}

