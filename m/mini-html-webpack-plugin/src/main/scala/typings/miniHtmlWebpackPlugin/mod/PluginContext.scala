package typings.miniHtmlWebpackPlugin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PluginContext extends js.Object {
  /** Optional, any additional HTML attached within <body> */
  var body: js.UndefOr[String] = js.native
  var css: js.UndefOr[js.Array[String]] = js.native
  var cssAttributes: js.UndefOr[AttributesType] = js.native
  /** Optional, any additional HTML attached within <head> */
  var head: js.UndefOr[String] = js.native
  /** Optional, defaults to `{ lang: 'en' }` */
  var htmlAttributes: js.UndefOr[AttributesType] = js.native
  var jsAttributes: js.UndefOr[AttributesType] = js.native
  @JSName("js")
  var js_ : js.UndefOr[js.Array[String]] = js.native
  var publicPath: js.UndefOr[String] = js.native
  var title: js.UndefOr[String] = js.native
}

object PluginContext {
  @scala.inline
  def apply(): PluginContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PluginContext]
  }
  @scala.inline
  implicit class PluginContextOps[Self <: PluginContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBody(value: String): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    @scala.inline
    def setCssVarargs(value: String*): Self = this.set("css", js.Array(value :_*))
    @scala.inline
    def setCss(value: js.Array[String]): Self = this.set("css", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCss: Self = this.set("css", js.undefined)
    @scala.inline
    def setCssAttributes(value: AttributesType): Self = this.set("cssAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCssAttributes: Self = this.set("cssAttributes", js.undefined)
    @scala.inline
    def setHead(value: String): Self = this.set("head", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHead: Self = this.set("head", js.undefined)
    @scala.inline
    def setHtmlAttributes(value: AttributesType): Self = this.set("htmlAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHtmlAttributes: Self = this.set("htmlAttributes", js.undefined)
    @scala.inline
    def setJsAttributes(value: AttributesType): Self = this.set("jsAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJsAttributes: Self = this.set("jsAttributes", js.undefined)
    @scala.inline
    def setJs_Varargs(value: String*): Self = this.set("js", js.Array(value :_*))
    @scala.inline
    def setJs_(value: js.Array[String]): Self = this.set("js", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJs_ : Self = this.set("js", js.undefined)
    @scala.inline
    def setPublicPath(value: String): Self = this.set("publicPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePublicPath: Self = this.set("publicPath", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

