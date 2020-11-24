package typings.mdv.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NonParsedEntry extends js.Object {
  
  var extension: String = js.native
  
  var lineEnd: Double = js.native
  
  var lineStart: Double = js.native
  
  var message: String = js.native
}
object NonParsedEntry {
  
  @scala.inline
  def apply(extension: String, lineEnd: Double, lineStart: Double, message: String): NonParsedEntry = {
    val __obj = js.Dynamic.literal(extension = extension.asInstanceOf[js.Any], lineEnd = lineEnd.asInstanceOf[js.Any], lineStart = lineStart.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[NonParsedEntry]
  }
  
  @scala.inline
  implicit class NonParsedEntryOps[Self <: NonParsedEntry] (val x: Self) extends AnyVal {
    
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
    def setExtension(value: String): Self = this.set("extension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineEnd(value: Double): Self = this.set("lineEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineStart(value: Double): Self = this.set("lineStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
  }
}
