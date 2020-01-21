package typings.postmark.templateMod

import typings.postmark.filteringParametersMod.FilteringParameters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("postmark/dist/client/models/templates/Template", "TemplateFilteringParameters")
@js.native
class TemplateFilteringParameters () extends FilteringParameters {
  def this(count: Double) = this()
  def this(count: Double, offset: Double) = this()
  def this(count: Double, offset: Double, templateType: TemplateTypes) = this()
  def this(count: Double, offset: Double, templateType: TemplateTypes, layoutTemplate: String) = this()
  var layoutTemplate: js.UndefOr[String] = js.native
  var templateType: js.UndefOr[TemplateTypes] = js.native
}

