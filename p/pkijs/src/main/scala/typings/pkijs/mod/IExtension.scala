package typings.pkijs.mod

import typings.asn1js.mod.OctetString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IExtension extends StObject {
  
  var critical: Boolean
  
  var extnID: String
  
  var extnValue: OctetString
  
  var parsedValue: js.UndefOr[ExtensionParsedValue] = js.undefined
}
object IExtension {
  
  inline def apply(critical: Boolean, extnID: String, extnValue: OctetString): IExtension = {
    val __obj = js.Dynamic.literal(critical = critical.asInstanceOf[js.Any], extnID = extnID.asInstanceOf[js.Any], extnValue = extnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[IExtension]
  }
  
  extension [Self <: IExtension](x: Self) {
    
    inline def setCritical(value: Boolean): Self = StObject.set(x, "critical", value.asInstanceOf[js.Any])
    
    inline def setExtnID(value: String): Self = StObject.set(x, "extnID", value.asInstanceOf[js.Any])
    
    inline def setExtnValue(value: OctetString): Self = StObject.set(x, "extnValue", value.asInstanceOf[js.Any])
    
    inline def setParsedValue(value: ExtensionParsedValue): Self = StObject.set(x, "parsedValue", value.asInstanceOf[js.Any])
    
    inline def setParsedValueUndefined: Self = StObject.set(x, "parsedValue", js.undefined)
  }
}
