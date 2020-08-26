package typings.miniHtmlWebpackPlugin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PluginOptions extends js.Object {
  /** Optional, use this for choosing chunks to include to your page. */
  var chunks: js.UndefOr[js.Array[String]] = js.native
  var context: js.UndefOr[PluginContext] = js.native
  /** Optional, defaults to `index.html` */
  var filename: js.UndefOr[String] = js.native
  var publicPath: js.UndefOr[String] = js.native
  /** define a template function to generate your own code */
  var template: js.UndefOr[js.Function1[/* context */ PluginContext, String | js.Promise[String]]] = js.native
}

object PluginOptions {
  @scala.inline
  def apply(): PluginOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PluginOptions]
  }
  @scala.inline
  implicit class PluginOptionsOps[Self <: PluginOptions] (val x: Self) extends AnyVal {
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
    def setChunksVarargs(value: String*): Self = this.set("chunks", js.Array(value :_*))
    @scala.inline
    def setChunks(value: js.Array[String]): Self = this.set("chunks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChunks: Self = this.set("chunks", js.undefined)
    @scala.inline
    def setContext(value: PluginContext): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    @scala.inline
    def setFilename(value: String): Self = this.set("filename", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilename: Self = this.set("filename", js.undefined)
    @scala.inline
    def setPublicPath(value: String): Self = this.set("publicPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePublicPath: Self = this.set("publicPath", js.undefined)
    @scala.inline
    def setTemplate(value: /* context */ PluginContext => String | js.Promise[String]): Self = this.set("template", js.Any.fromFunction1(value))
    @scala.inline
    def deleteTemplate: Self = this.set("template", js.undefined)
  }
  
}

