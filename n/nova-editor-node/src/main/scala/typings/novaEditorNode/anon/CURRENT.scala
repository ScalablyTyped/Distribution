package typings.novaEditorNode.anon

import typings.novaEditorNode.FileSystemBitField
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CURRENT extends StObject {
  
  var CURRENT: FileSystemBitField
  
  var END: FileSystemBitField
  
  var F_OK: FileSystemBitField
  
  var R_OK: FileSystemBitField
  
  var START: FileSystemBitField
  
  var W_OK: FileSystemBitField
  
  var X_OK: FileSystemBitField
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
  implicit class CURRENTMutableBuilder[Self <: CURRENT] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCURRENT(value: FileSystemBitField): Self = StObject.set(x, "CURRENT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEND(value: FileSystemBitField): Self = StObject.set(x, "END", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setF_OK(value: FileSystemBitField): Self = StObject.set(x, "F_OK", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setR_OK(value: FileSystemBitField): Self = StObject.set(x, "R_OK", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSTART(value: FileSystemBitField): Self = StObject.set(x, "START", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setW_OK(value: FileSystemBitField): Self = StObject.set(x, "W_OK", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX_OK(value: FileSystemBitField): Self = StObject.set(x, "X_OK", value.asInstanceOf[js.Any])
  }
}
