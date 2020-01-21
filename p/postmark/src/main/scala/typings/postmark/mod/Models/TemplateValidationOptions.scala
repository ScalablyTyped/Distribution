package typings.postmark.mod.Models

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("postmark", "Models.TemplateValidationOptions")
@js.native
class TemplateValidationOptions protected ()
  extends typings.postmark.modelsMod.TemplateValidationOptions {
  def this(
    Subject: js.UndefOr[String],
    HtmlBody: js.UndefOr[String],
    TextBody: js.UndefOr[String],
    TestRenderModel: js.UndefOr[js.Object],
    TemplateType: js.UndefOr[typings.postmark.templateMod.TemplateTypes],
    LayoutTemplate: js.UndefOr[String],
    InlineCssForHtmlTestRender: js.UndefOr[Boolean]
  ) = this()
}

