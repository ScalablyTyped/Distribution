package typings.postmark.postmarkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TemplateValidator[T /* <: js.Object */] extends js.Object {
  var HtmlBody: String
  var InlineCssForHtmlTestRender: js.UndefOr[Boolean] = js.undefined
  var Subject: String
  var TestRenderModel: js.UndefOr[T] = js.undefined
  var TextBody: String
}

object TemplateValidator {
  @scala.inline
  def apply[T /* <: js.Object */](
    HtmlBody: String,
    Subject: String,
    TextBody: String,
    InlineCssForHtmlTestRender: js.UndefOr[Boolean] = js.undefined,
    TestRenderModel: T = null
  ): TemplateValidator[T] = {
    val __obj = js.Dynamic.literal(HtmlBody = HtmlBody, Subject = Subject, TextBody = TextBody)
    if (!js.isUndefined(InlineCssForHtmlTestRender)) __obj.updateDynamic("InlineCssForHtmlTestRender")(InlineCssForHtmlTestRender)
    if (TestRenderModel != null) __obj.updateDynamic("TestRenderModel")(TestRenderModel.asInstanceOf[js.Any])
    __obj.asInstanceOf[TemplateValidator[T]]
  }
}

