package typings.monacoEditor.mod.languages

import typings.monacoEditor.mod.IMarkdownString
import typings.monacoEditor.mod.IRange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Hover extends js.Object {
  
  /**
    * The contents of this hover.
    */
  var contents: js.Array[IMarkdownString] = js.native
  
  /**
    * The range to which this hover applies. When missing, the
    * editor will use the range at the current position or the
    * current position itself.
    */
  var range: js.UndefOr[IRange] = js.native
}
object Hover {
  
  @scala.inline
  def apply(contents: js.Array[IMarkdownString]): Hover = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hover]
  }
  
  @scala.inline
  implicit class HoverOps[Self <: Hover] (val x: Self) extends AnyVal {
    
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
    def setContentsVarargs(value: IMarkdownString*): Self = this.set("contents", js.Array(value :_*))
    
    @scala.inline
    def setContents(value: js.Array[IMarkdownString]): Self = this.set("contents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRange(value: IRange): Self = this.set("range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRange: Self = this.set("range", js.undefined)
  }
}
