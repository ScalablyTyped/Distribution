package typings.momentDurationFormat.mod.momentAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Format extends js.Object {
  
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
  
  var defaults: DurationFormatSettings = js.native
}
