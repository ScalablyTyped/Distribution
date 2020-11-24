package typings.micromark.libSharedTypesMod

import typings.micromark.micromarkStrings.Carriagereturn
import typings.micromark.micromarkStrings.CarriagereturnLinefeed
import typings.micromark.micromarkStrings.Linefeed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CompileOptions extends js.Object {
  
  // Whether to allow embedded HTML (`boolean`, default: `false`).
  //
  var allowDangerousHtml: js.UndefOr[Boolean] = js.native
  
  // Whether to allow potentially dangerous protocols in links and images (`boolean`,
  // default: `false`).
  // URLs relative to the current protocol are always allowed (such as, `image.jpg`).
  // For links, the allowed protocols are `http`, `https`, `irc`, `ircs`, `mailto`,
  // and `xmpp`.
  // For images, the allowed protocols are `http` and `https`.
  //
  var allowDangerousProtocol: js.UndefOr[Boolean] = js.native
  
  // Value to use for line endings not in `doc` (`string`, default: first line
  // ending or `'\n'`).
  //
  // Generally, micromark copies line endings (`'\r'`, `'\n'`, `'\r\n'`) in the
  // markdown document over to the compiled HTML.
  // In some cases, such as `> a`, CommonMark requires that extra line endings are
  // added: `<blockquote>\n<p>a</p>\n</blockquote>`.
  //
  var defaultLineEnding: js.UndefOr[Carriagereturn | Linefeed | CarriagereturnLinefeed] = js.native
  
  // Array of HTML extensions
  //
  var htmlExtensions: js.UndefOr[js.Array[HtmlExtension]] = js.native
}
object CompileOptions {
  
  @scala.inline
  def apply(): CompileOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompileOptions]
  }
  
  @scala.inline
  implicit class CompileOptionsOps[Self <: CompileOptions] (val x: Self) extends AnyVal {
    
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
    def setAllowDangerousHtml(value: Boolean): Self = this.set("allowDangerousHtml", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowDangerousHtml: Self = this.set("allowDangerousHtml", js.undefined)
    
    @scala.inline
    def setAllowDangerousProtocol(value: Boolean): Self = this.set("allowDangerousProtocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowDangerousProtocol: Self = this.set("allowDangerousProtocol", js.undefined)
    
    @scala.inline
    def setDefaultLineEnding(value: Carriagereturn | Linefeed | CarriagereturnLinefeed): Self = this.set("defaultLineEnding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultLineEnding: Self = this.set("defaultLineEnding", js.undefined)
    
    @scala.inline
    def setHtmlExtensionsVarargs(value: HtmlExtension*): Self = this.set("htmlExtensions", js.Array(value :_*))
    
    @scala.inline
    def setHtmlExtensions(value: js.Array[HtmlExtension]): Self = this.set("htmlExtensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHtmlExtensions: Self = this.set("htmlExtensions", js.undefined)
  }
}
