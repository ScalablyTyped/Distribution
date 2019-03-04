package typings
package postmarkLib.postmarkMod.PostmarkNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TemplateValidator[T /* <: js.Object */] extends js.Object {
  var HtmlBody: java.lang.String
  var InlineCssForHtmlTestRender: js.UndefOr[scala.Boolean] = js.undefined
  var Subject: java.lang.String
  var TestRenderModel: js.UndefOr[T] = js.undefined
  var TextBody: java.lang.String
}

object TemplateValidator {
  @scala.inline
  def apply[T /* <: js.Object */](
    HtmlBody: java.lang.String,
    Subject: java.lang.String,
    TextBody: java.lang.String,
    InlineCssForHtmlTestRender: js.UndefOr[scala.Boolean] = js.undefined,
    TestRenderModel: T = null
  ): TemplateValidator[T] = {
    val __obj = js.Dynamic.literal(HtmlBody = HtmlBody, Subject = Subject, TextBody = TextBody)
    if (!js.isUndefined(InlineCssForHtmlTestRender)) __obj.updateDynamic("InlineCssForHtmlTestRender")(InlineCssForHtmlTestRender)
    if (TestRenderModel != null) __obj.updateDynamic("TestRenderModel")(TestRenderModel.asInstanceOf[js.Any])
    __obj.asInstanceOf[TemplateValidator[T]]
  }
}

