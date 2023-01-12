package typings.pkijs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetName extends StObject {
  
  var setName: js.UndefOr[String] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
  
  var values: js.UndefOr[String] = js.undefined
}
object SetName {
  
  inline def apply(): SetName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetName]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SetName] (val x: Self) extends AnyVal {
    
    inline def setSetName(value: String): Self = StObject.set(x, "setName", value.asInstanceOf[js.Any])
    
    inline def setSetNameUndefined: Self = StObject.set(x, "setName", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setValues(value: String): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
  }
}
