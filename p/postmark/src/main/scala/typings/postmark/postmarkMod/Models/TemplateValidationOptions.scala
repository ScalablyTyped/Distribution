package typings.postmark.postmarkMod.Models

import typings.postmark.distClientModelsTemplatesTemplateMod.TemplateTypes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("postmark", "Models.TemplateValidationOptions")
@js.native
class TemplateValidationOptions protected ()
  extends typings.postmark.distClientModelsMod.TemplateValidationOptions {
  def this(
    Subject: js.UndefOr[String],
    HtmlBody: js.UndefOr[String],
    TextBody: js.UndefOr[String],
    TestRenderModel: js.UndefOr[js.Object],
    TemplateType: js.UndefOr[TemplateTypes],
    LayoutTemplate: js.UndefOr[String],
    InlineCssForHtmlTestRender: js.UndefOr[Boolean]
  ) = this()
}

