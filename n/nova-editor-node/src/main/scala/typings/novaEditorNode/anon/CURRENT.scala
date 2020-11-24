package typings.novaEditorNode.anon

import typings.novaEditorNode.FileSystemBitField
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CURRENT extends js.Object {
  
  var CURRENT: FileSystemBitField = js.native
  
  var END: FileSystemBitField = js.native
  
  var F_OK: FileSystemBitField = js.native
  
  var R_OK: FileSystemBitField = js.native
  
  var START: FileSystemBitField = js.native
  
  var W_OK: FileSystemBitField = js.native
  
  var X_OK: FileSystemBitField = js.native
}
object CURRENT {
  
  @scala.inline
  def apply(
    CURRENT: FileSystemBitField,
    END: FileSystemBitField,
    F_OK: FileSystemBitField,
    R_OK: FileSystemBitField,
    START: FileSystemBitField,
    W_OK: FileSystemBitField,
    X_OK: FileSystemBitField
  ): CURRENT = {
    val __obj = js.Dynamic.literal(CURRENT = CURRENT.asInstanceOf[js.Any], END = END.asInstanceOf[js.Any], F_OK = F_OK.asInstanceOf[js.Any], R_OK = R_OK.asInstanceOf[js.Any], START = START.asInstanceOf[js.Any], W_OK = W_OK.asInstanceOf[js.Any], X_OK = X_OK.asInstanceOf[js.Any])
    __obj.asInstanceOf[CURRENT]
  }
  
  @scala.inline
  implicit class CURRENTOps[Self <: CURRENT] (val x: Self) extends AnyVal {
    
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
    def setCURRENT(value: FileSystemBitField): Self = this.set("CURRENT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEND(value: FileSystemBitField): Self = this.set("END", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setF_OK(value: FileSystemBitField): Self = this.set("F_OK", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setR_OK(value: FileSystemBitField): Self = this.set("R_OK", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSTART(value: FileSystemBitField): Self = this.set("START", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setW_OK(value: FileSystemBitField): Self = this.set("W_OK", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX_OK(value: FileSystemBitField): Self = this.set("X_OK", value.asInstanceOf[js.Any])
  }
}
