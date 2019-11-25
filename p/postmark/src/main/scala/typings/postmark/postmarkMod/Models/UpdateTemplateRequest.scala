package typings.postmark.postmarkMod.Models

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("postmark", "Models.UpdateTemplateRequest")
@js.native
class UpdateTemplateRequest protected ()
  extends typings.postmark.distClientModelsMod.UpdateTemplateRequest {
  def this(
    Name: js.UndefOr[String],
    Subject: js.UndefOr[String],
    HtmlBody: js.UndefOr[String],
    TextBody: js.UndefOr[String],
    Alias: js.UndefOr[Null | String],
    TemplateType: js.UndefOr[typings.postmark.distClientModelsTemplatesTemplateMod.TemplateTypes],
    LayoutTemplate: js.UndefOr[String]
  ) = this()
}

