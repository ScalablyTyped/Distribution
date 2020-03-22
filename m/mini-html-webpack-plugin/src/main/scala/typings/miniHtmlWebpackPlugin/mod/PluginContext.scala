package typings.miniHtmlWebpackPlugin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginContext extends js.Object {
  /** Optional, any additional HTML attached within <body> */
  var body: js.UndefOr[String] = js.undefined
  var css: js.UndefOr[js.Array[String]] = js.undefined
  var cssAttributes: js.UndefOr[AttributesType] = js.undefined
  /** Optional, any additional HTML attached within <head> */
  var head: js.UndefOr[String] = js.undefined
  /** Optional, defaults to `{ lang: 'en' }` */
  var htmlAttributes: js.UndefOr[AttributesType] = js.undefined
  var jsAttributes: js.UndefOr[AttributesType] = js.undefined
  @JSName("js")
  var js_ : js.UndefOr[js.Array[String]] = js.undefined
  var publicPath: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object PluginContext {
  @scala.inline
  def apply(
    body: String = null,
    css: js.Array[String] = null,
    cssAttributes: AttributesType = null,
    head: String = null,
    htmlAttributes: AttributesType = null,
    jsAttributes: AttributesType = null,
    js_ : js.Array[String] = null,
    publicPath: String = null,
    title: String = null
  ): PluginContext = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (css != null) __obj.updateDynamic("css")(css.asInstanceOf[js.Any])
    if (cssAttributes != null) __obj.updateDynamic("cssAttributes")(cssAttributes.asInstanceOf[js.Any])
    if (head != null) __obj.updateDynamic("head")(head.asInstanceOf[js.Any])
    if (htmlAttributes != null) __obj.updateDynamic("htmlAttributes")(htmlAttributes.asInstanceOf[js.Any])
    if (jsAttributes != null) __obj.updateDynamic("jsAttributes")(jsAttributes.asInstanceOf[js.Any])
    if (js_ != null) __obj.updateDynamic("js")(js_.asInstanceOf[js.Any])
    if (publicPath != null) __obj.updateDynamic("publicPath")(publicPath.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginContext]
  }
}

