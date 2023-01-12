package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined pkijs.pkijs.PkiObjectParameters & std.Partial<pkijs.pkijs.IPrivateKeyUsagePeriod> */
trait PrivateKeyUsagePeriodParameters extends StObject {
  
  var notAfter: js.UndefOr[js.Date] = js.undefined
  
  var notBefore: js.UndefOr[js.Date] = js.undefined
  
  var schema: js.UndefOr[SchemaType] = js.undefined
}
object PrivateKeyUsagePeriodParameters {
  
  inline def apply(): PrivateKeyUsagePeriodParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrivateKeyUsagePeriodParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PrivateKeyUsagePeriodParameters] (val x: Self) extends AnyVal {
    
    inline def setNotAfter(value: js.Date): Self = StObject.set(x, "notAfter", value.asInstanceOf[js.Any])
    
    inline def setNotAfterUndefined: Self = StObject.set(x, "notAfter", js.undefined)
    
    inline def setNotBefore(value: js.Date): Self = StObject.set(x, "notBefore", value.asInstanceOf[js.Any])
    
    inline def setNotBeforeUndefined: Self = StObject.set(x, "notBefore", js.undefined)
    
    inline def setSchema(value: SchemaType): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
  }
}
