package typings.pkijs.mod

import typings.asn1js.mod.OctetStringJson
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtensionJson extends StObject {
  
  var critical: js.UndefOr[Boolean] = js.undefined
  
  var extnID: String
  
  var extnValue: OctetStringJson
  
  var parsedValue: js.UndefOr[Any] = js.undefined
}
object ExtensionJson {
  
  inline def apply(extnID: String, extnValue: OctetStringJson): ExtensionJson = {
    val __obj = js.Dynamic.literal(extnID = extnID.asInstanceOf[js.Any], extnValue = extnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtensionJson]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExtensionJson] (val x: Self) extends AnyVal {
    
    inline def setCritical(value: Boolean): Self = StObject.set(x, "critical", value.asInstanceOf[js.Any])
    
    inline def setCriticalUndefined: Self = StObject.set(x, "critical", js.undefined)
    
    inline def setExtnID(value: String): Self = StObject.set(x, "extnID", value.asInstanceOf[js.Any])
    
    inline def setExtnValue(value: OctetStringJson): Self = StObject.set(x, "extnValue", value.asInstanceOf[js.Any])
    
    inline def setParsedValue(value: Any): Self = StObject.set(x, "parsedValue", value.asInstanceOf[js.Any])
    
    inline def setParsedValueUndefined: Self = StObject.set(x, "parsedValue", js.undefined)
  }
}
