package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MarkdownRender_Options extends js.Object {
  var context: js.UndefOr[java.lang.String] = js.undefined
  var mode: js.UndefOr[java.lang.String] = js.undefined
  var text: java.lang.String
}

object MarkdownRender_Options {
  @scala.inline
  def apply(text: java.lang.String, context: java.lang.String = null, mode: java.lang.String = null): MarkdownRender_Options = {
    val __obj = js.Dynamic.literal(text = text)
    if (context != null) __obj.updateDynamic("context")(context)
    if (mode != null) __obj.updateDynamic("mode")(mode)
    __obj.asInstanceOf[MarkdownRender_Options]
  }
}

