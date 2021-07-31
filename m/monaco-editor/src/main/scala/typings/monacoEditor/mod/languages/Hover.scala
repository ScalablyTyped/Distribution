package typings.monacoEditor.mod.languages

import typings.monacoEditor.mod.IMarkdownString
import typings.monacoEditor.mod.IRange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Hover extends StObject {
  
  /**
    * The contents of this hover.
    */
  var contents: js.Array[IMarkdownString]
  
  /**
    * The range to which this hover applies. When missing, the
    * editor will use the range at the current position or the
    * current position itself.
    */
  var range: js.UndefOr[IRange] = js.undefined
}
object Hover {
  
  @scala.inline
  def apply(contents: js.Array[IMarkdownString]): Hover = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hover]
  }
  
  @scala.inline
  implicit class HoverMutableBuilder[Self <: Hover] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContents(value: js.Array[IMarkdownString]): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentsVarargs(value: IMarkdownString*): Self = StObject.set(x, "contents", js.Array(value :_*))
    
    @scala.inline
    def setRange(value: IRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
  }
}
