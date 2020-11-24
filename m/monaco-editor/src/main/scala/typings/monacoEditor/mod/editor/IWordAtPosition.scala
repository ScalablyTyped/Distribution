package typings.monacoEditor.mod.editor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IWordAtPosition extends js.Object {
  
  /**
    * The column where the word ends.
    */
  val endColumn: Double = js.native
  
  /**
    * The column where the word starts.
    */
  val startColumn: Double = js.native
  
  /**
    * The word.
    */
  val word: String = js.native
}
object IWordAtPosition {
  
  @scala.inline
  def apply(endColumn: Double, startColumn: Double, word: String): IWordAtPosition = {
    val __obj = js.Dynamic.literal(endColumn = endColumn.asInstanceOf[js.Any], startColumn = startColumn.asInstanceOf[js.Any], word = word.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWordAtPosition]
  }
  
  @scala.inline
  implicit class IWordAtPositionOps[Self <: IWordAtPosition] (val x: Self) extends AnyVal {
    
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
    def setEndColumn(value: Double): Self = this.set("endColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartColumn(value: Double): Self = this.set("startColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWord(value: String): Self = this.set("word", value.asInstanceOf[js.Any])
  }
}
