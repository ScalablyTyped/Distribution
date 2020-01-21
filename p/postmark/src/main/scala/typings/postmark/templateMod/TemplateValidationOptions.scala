package typings.postmark.templateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("postmark/dist/client/models/templates/Template", "TemplateValidationOptions")
@js.native
class TemplateValidationOptions protected () extends js.Object {
  def this(
    Subject: js.UndefOr[String],
    HtmlBody: js.UndefOr[String],
    TextBody: js.UndefOr[String],
    TestRenderModel: js.UndefOr[js.Object],
    TemplateType: js.UndefOr[TemplateTypes],
    LayoutTemplate: js.UndefOr[String],
    InlineCssForHtmlTestRender: js.UndefOr[Boolean]
  ) = this()
  var HtmlBody: js.UndefOr[String] = js.native
  var InlineCssForHtmlTestRender: js.UndefOr[Boolean] = js.native
  var LayoutTemplate: js.UndefOr[String] = js.native
  var Subject: js.UndefOr[String] = js.native
  var TemplateType: js.UndefOr[TemplateTypes] = js.native
  var TestRenderModel: js.UndefOr[js.Object] = js.native
  var TextBody: js.UndefOr[String] = js.native
}

