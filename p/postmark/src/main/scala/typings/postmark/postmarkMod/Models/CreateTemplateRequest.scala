package typings.postmark.postmarkMod.Models

import typings.postmark.distClientModelsTemplatesTemplateMod.TemplateTypes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("postmark", "Models.CreateTemplateRequest")
@js.native
class CreateTemplateRequest protected ()
  extends typings.postmark.distClientModelsMod.CreateTemplateRequest {
  def this(
    Name: String,
    Subject: js.UndefOr[String],
    HtmlBody: js.UndefOr[String],
    TextBody: js.UndefOr[String],
    Alias: js.UndefOr[Null | String],
    TemplateType: js.UndefOr[TemplateTypes],
    LayoutTemplate: js.UndefOr[String]
  ) = this()
}

