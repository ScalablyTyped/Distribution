package typings.monacoEditor.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LineEnding extends js.Object {
  
  var lineEnding: String = js.native
  
  var preserveBOM: Boolean = js.native
}
object LineEnding {
  
  @scala.inline
  def apply(lineEnding: String, preserveBOM: Boolean): LineEnding = {
    val __obj = js.Dynamic.literal(lineEnding = lineEnding.asInstanceOf[js.Any], preserveBOM = preserveBOM.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineEnding]
  }
  
  @scala.inline
  implicit class LineEndingOps[Self <: LineEnding] (val x: Self) extends AnyVal {
    
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
    def setLineEnding(value: String): Self = this.set("lineEnding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreserveBOM(value: Boolean): Self = this.set("preserveBOM", value.asInstanceOf[js.Any])
  }
}
