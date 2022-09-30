package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AsnCompareSchemaResult extends StObject {
  
  var result: js.UndefOr[Any] = js.undefined
  
  var verified: Boolean
}
object AsnCompareSchemaResult {
  
  inline def apply(verified: Boolean): AsnCompareSchemaResult = {
    val __obj = js.Dynamic.literal(verified = verified.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsnCompareSchemaResult]
  }
  
  extension [Self <: AsnCompareSchemaResult](x: Self) {
    
    inline def setResult(value: Any): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
    
    inline def setVerified(value: Boolean): Self = StObject.set(x, "verified", value.asInstanceOf[js.Any])
  }
}
