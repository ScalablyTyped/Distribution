package typings.mdastUtilFromMarkdown.mod

import typings.micromark.sharedTypesMod.SyntaxExtension
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var extensions: js.UndefOr[js.Array[SyntaxExtension]] = js.native
  
  var mdastExtensions: js.UndefOr[js.Array[MdastExtension]] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setExtensionsVarargs(value: SyntaxExtension*): Self = this.set("extensions", js.Array(value :_*))
    
    @scala.inline
    def setExtensions(value: js.Array[SyntaxExtension]): Self = this.set("extensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtensions: Self = this.set("extensions", js.undefined)
    
    @scala.inline
    def setMdastExtensionsVarargs(value: MdastExtension*): Self = this.set("mdastExtensions", js.Array(value :_*))
    
    @scala.inline
    def setMdastExtensions(value: js.Array[MdastExtension]): Self = this.set("mdastExtensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMdastExtensions: Self = this.set("mdastExtensions", js.undefined)
  }
}
