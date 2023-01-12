package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtensionConstructorParameters extends StObject {
  
  var critical: js.UndefOr[Boolean] = js.undefined
  
  var extnID: js.UndefOr[String] = js.undefined
  
  var extnValue: js.UndefOr[js.typedarray.ArrayBuffer] = js.undefined
  
  var parsedValue: js.UndefOr[ExtensionParsedValue] = js.undefined
}
object ExtensionConstructorParameters {
  
  inline def apply(): ExtensionConstructorParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExtensionConstructorParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExtensionConstructorParameters] (val x: Self) extends AnyVal {
    
    inline def setCritical(value: Boolean): Self = StObject.set(x, "critical", value.asInstanceOf[js.Any])
    
    inline def setCriticalUndefined: Self = StObject.set(x, "critical", js.undefined)
    
    inline def setExtnID(value: String): Self = StObject.set(x, "extnID", value.asInstanceOf[js.Any])
    
    inline def setExtnIDUndefined: Self = StObject.set(x, "extnID", js.undefined)
    
    inline def setExtnValue(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "extnValue", value.asInstanceOf[js.Any])
    
    inline def setExtnValueUndefined: Self = StObject.set(x, "extnValue", js.undefined)
    
    inline def setParsedValue(value: ExtensionParsedValue): Self = StObject.set(x, "parsedValue", value.asInstanceOf[js.Any])
    
    inline def setParsedValueUndefined: Self = StObject.set(x, "parsedValue", js.undefined)
  }
}
