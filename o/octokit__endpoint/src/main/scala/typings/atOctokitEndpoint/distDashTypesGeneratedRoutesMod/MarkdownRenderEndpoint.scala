package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MarkdownRenderEndpoint extends js.Object {
  var context: js.UndefOr[String] = js.undefined
  var mode: js.UndefOr[String] = js.undefined
  var text: String
}

object MarkdownRenderEndpoint {
  @scala.inline
  def apply(text: String, context: String = null, mode: String = null): MarkdownRenderEndpoint = {
    val __obj = js.Dynamic.literal(text = text)
    if (context != null) __obj.updateDynamic("context")(context)
    if (mode != null) __obj.updateDynamic("mode")(mode)
    __obj.asInstanceOf[MarkdownRenderEndpoint]
  }
}

