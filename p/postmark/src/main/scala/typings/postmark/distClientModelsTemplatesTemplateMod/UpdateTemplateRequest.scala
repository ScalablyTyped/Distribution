package typings.postmark.distClientModelsTemplatesTemplateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("postmark/dist/client/models/templates/Template", "UpdateTemplateRequest")
@js.native
class UpdateTemplateRequest protected () extends js.Object {
  def this(
    Name: js.UndefOr[String],
    Subject: js.UndefOr[String],
    HtmlBody: js.UndefOr[String],
    TextBody: js.UndefOr[String],
    Alias: js.UndefOr[Null | String],
    TemplateType: js.UndefOr[TemplateTypes],
    LayoutTemplate: js.UndefOr[String]
  ) = this()
  var Alias: js.UndefOr[String | Null] = js.native
  var HtmlBody: js.UndefOr[String] = js.native
  var LayoutTemplate: js.UndefOr[String] = js.native
  var Name: js.UndefOr[String] = js.native
  var Subject: js.UndefOr[String] = js.native
  var TemplateType: js.UndefOr[TemplateTypes] = js.native
  var TextBody: js.UndefOr[String] = js.native
}

