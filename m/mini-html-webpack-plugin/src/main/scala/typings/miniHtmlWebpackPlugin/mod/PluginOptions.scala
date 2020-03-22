package typings.miniHtmlWebpackPlugin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginOptions extends js.Object {
  /** Optional, use this for choosing chunks to include to your page. */
  var chunks: js.UndefOr[js.Array[String]] = js.undefined
  var context: js.UndefOr[PluginContext] = js.undefined
  /** Optional, defaults to `index.html` */
  var filename: js.UndefOr[String] = js.undefined
  var publicPath: js.UndefOr[String] = js.undefined
  /** define a template function to generate your own code */
  var template: js.UndefOr[js.Function1[/* context */ PluginContext, String | js.Promise[String]]] = js.undefined
}

object PluginOptions {
  @scala.inline
  def apply(
    chunks: js.Array[String] = null,
    context: PluginContext = null,
    filename: String = null,
    publicPath: String = null,
    template: /* context */ PluginContext => String | js.Promise[String] = null
  ): PluginOptions = {
    val __obj = js.Dynamic.literal()
    if (chunks != null) __obj.updateDynamic("chunks")(chunks.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (filename != null) __obj.updateDynamic("filename")(filename.asInstanceOf[js.Any])
    if (publicPath != null) __obj.updateDynamic("publicPath")(publicPath.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(js.Any.fromFunction1(template))
    __obj.asInstanceOf[PluginOptions]
  }
}

