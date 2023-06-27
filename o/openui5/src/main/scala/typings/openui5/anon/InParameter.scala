package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InParameter extends StObject {
  
  /**
    * In parameters of the current condition (InParameter are not used any longer, but it might be filled in
    * older conditiotions stored in variants.)
    */
  var inParameter: js.UndefOr[js.Object] = js.undefined
  
  /**
    * Out parameters of the current condition (OutParameter are not used any longer, but it might be filled
    * in older conditiotions stored in variants.)
    */
  var ouParameter: js.UndefOr[js.Object] = js.undefined
  
  /**
    * Payload of the current condition
    */
  var payload: js.UndefOr[js.Object] = js.undefined
}
object InParameter {
  
  inline def apply(): InParameter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InParameter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InParameter] (val x: Self) extends AnyVal {
    
    inline def setInParameter(value: js.Object): Self = StObject.set(x, "inParameter", value.asInstanceOf[js.Any])
    
    inline def setInParameterUndefined: Self = StObject.set(x, "inParameter", js.undefined)
    
    inline def setOuParameter(value: js.Object): Self = StObject.set(x, "ouParameter", value.asInstanceOf[js.Any])
    
    inline def setOuParameterUndefined: Self = StObject.set(x, "ouParameter", js.undefined)
    
    inline def setPayload(value: js.Object): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
  }
}
