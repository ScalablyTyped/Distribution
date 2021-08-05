package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IValidation extends StObject {
  
  def Clone(): IValidation
  
  var RegularExpression: String
  
  var VBScript: String
}
object IValidation {
  
  inline def apply(Clone: () => IValidation, RegularExpression: String, VBScript: String): IValidation = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), RegularExpression = RegularExpression.asInstanceOf[js.Any], VBScript = VBScript.asInstanceOf[js.Any])
    __obj.asInstanceOf[IValidation]
  }
  
  extension [Self <: IValidation](x: Self) {
    
    inline def setClone(value: () => IValidation): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    inline def setRegularExpression(value: String): Self = StObject.set(x, "RegularExpression", value.asInstanceOf[js.Any])
    
    inline def setVBScript(value: String): Self = StObject.set(x, "VBScript", value.asInstanceOf[js.Any])
  }
}
