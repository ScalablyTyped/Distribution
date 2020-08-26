package typings.miniCssExtractPlugin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PluginOptions extends js.Object {
  var chunkFilename: js.UndefOr[String] = js.native
  /**
    * By default, mini-css-extract-plugin generates JS modules that use the CommonJS
    * modules syntax. There are some cases in which using ES modules is beneficial,
    * like in the case of module concatenation and tree shaking.
    */
  var esModule: js.UndefOr[Boolean] = js.native
  /**
    * Options similar to the same options in webpackOptions.output, both options are optional
    * May contain `[name]`, `[id]`, `hash` and `[chunkhash]`
    */
  var filename: js.UndefOr[String] = js.native
  /**
    * For projects where CSS ordering has been mitigated through consistent
    * use of scoping or naming conventions, the CSS order warnings can be
    * disabled by setting this flag to true for the plugin.
    */
  var ignoreOrder: js.UndefOr[Boolean] = js.native
  /**
    * With the `moduleFilename` option you can use chunk data to customize the filename.
    * This is particularly useful when dealing with multiple entry points
    * and wanting to get more control out of the filename for a given entry point/chunk
    */
  var moduleFilename: js.UndefOr[
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify compilation.Chunk */ /* chunk */ js.Any, 
      String
    ]
  ] = js.native
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
    def setChunkFilename(value: String): Self = this.set("chunkFilename", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChunkFilename: Self = this.set("chunkFilename", js.undefined)
    @scala.inline
    def setEsModule(value: Boolean): Self = this.set("esModule", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEsModule: Self = this.set("esModule", js.undefined)
    @scala.inline
    def setFilename(value: String): Self = this.set("filename", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilename: Self = this.set("filename", js.undefined)
    @scala.inline
    def setIgnoreOrder(value: Boolean): Self = this.set("ignoreOrder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnoreOrder: Self = this.set("ignoreOrder", js.undefined)
    @scala.inline
    def setModuleFilename(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify compilation.Chunk */ /* chunk */ js.Any => String
    ): Self = this.set("moduleFilename", js.Any.fromFunction1(value))
    @scala.inline
    def deleteModuleFilename: Self = this.set("moduleFilename", js.undefined)
  }
  
}

