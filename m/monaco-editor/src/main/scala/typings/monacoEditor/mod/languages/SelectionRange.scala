package typings.monacoEditor.mod.languages

import typings.monacoEditor.mod.IRange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SelectionRange extends StObject {
  
  var range: IRange = js.native
}
object SelectionRange {
  
  @scala.inline
  def apply(range: IRange): SelectionRange = {
    val __obj = js.Dynamic.literal(range = range.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectionRange]
  }
  
  @scala.inline
  implicit class SelectionRangeMutableBuilder[Self <: SelectionRange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRange(value: IRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
  }
}
