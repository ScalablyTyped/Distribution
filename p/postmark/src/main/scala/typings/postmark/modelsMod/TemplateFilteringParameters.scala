package typings.postmark.modelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("postmark/dist/client/models", "TemplateFilteringParameters")
@js.native
class TemplateFilteringParameters ()
  extends typings.postmark.templateMod.TemplateFilteringParameters {
  def this(count: Double) = this()
  def this(count: Double, offset: Double) = this()
  def this(count: Double, offset: Double, templateType: typings.postmark.templateMod.TemplateTypes) = this()
  def this(
    count: Double,
    offset: Double,
    templateType: typings.postmark.templateMod.TemplateTypes,
    layoutTemplate: String
  ) = this()
}

