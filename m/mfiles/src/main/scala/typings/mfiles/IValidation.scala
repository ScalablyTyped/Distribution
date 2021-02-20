package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IValidation extends StObject {
  
  def Clone(): IValidation = js.native
  
  var RegularExpression: String = js.native
  
  var VBScript: String = js.native
}
object IValidation {
  
  @scala.inline
  def apply(Clone: () => IValidation, RegularExpression: String, VBScript: String): IValidation = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), RegularExpression = RegularExpression.asInstanceOf[js.Any], VBScript = VBScript.asInstanceOf[js.Any])
    __obj.asInstanceOf[IValidation]
  }
  
  @scala.inline
  implicit class IValidationMutableBuilder[Self <: IValidation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClone(value: () => IValidation): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRegularExpression(value: String): Self = StObject.set(x, "RegularExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVBScript(value: String): Self = StObject.set(x, "VBScript", value.asInstanceOf[js.Any])
  }
}
