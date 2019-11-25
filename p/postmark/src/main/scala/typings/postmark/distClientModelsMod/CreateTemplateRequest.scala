package typings.postmark.distClientModelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("postmark/dist/client/models", "CreateTemplateRequest")
@js.native
class CreateTemplateRequest protected ()
  extends typings.postmark.distClientModelsTemplatesTemplateMod.CreateTemplateRequest {
  def this(
    Name: String,
    Subject: js.UndefOr[String],
    HtmlBody: js.UndefOr[String],
    TextBody: js.UndefOr[String],
    Alias: js.UndefOr[Null | String],
    TemplateType: js.UndefOr[typings.postmark.distClientModelsTemplatesTemplateMod.TemplateTypes],
    LayoutTemplate: js.UndefOr[String]
  ) = this()
}

