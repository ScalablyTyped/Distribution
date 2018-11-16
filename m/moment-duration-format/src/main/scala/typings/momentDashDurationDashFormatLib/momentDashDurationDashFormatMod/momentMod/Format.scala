package typings
package momentDashDurationDashFormatLib.momentDashDurationDashFormatMod.momentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Format extends js.Object {
  var defaults: DurationFormatSettings = js.native
  def apply(): java.lang.String = js.native
  def apply(settings: DurationFormatSettings): java.lang.String = js.native
  def apply(template: java.lang.String): java.lang.String = js.native
  def apply(template: java.lang.String, precision: scala.Double): java.lang.String = js.native
  def apply(template: java.lang.String, precision: scala.Double, settings: DurationFormatSettings): java.lang.String = js.native
  def apply(template: java.lang.String, settings: DurationFormatSettings): java.lang.String = js.native
  def apply(template: TemplateFunction): java.lang.String = js.native
  def apply(template: TemplateFunction, precision: scala.Double): java.lang.String = js.native
  def apply(template: TemplateFunction, precision: scala.Double, settings: DurationFormatSettings): java.lang.String = js.native
  def apply(template: TemplateFunction, settings: DurationFormatSettings): java.lang.String = js.native
}

