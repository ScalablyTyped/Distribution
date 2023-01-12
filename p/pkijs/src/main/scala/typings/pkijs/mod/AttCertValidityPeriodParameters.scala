package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined pkijs.pkijs.PkiObjectParameters & std.Partial<pkijs.pkijs.IAttCertValidityPeriod> */
trait AttCertValidityPeriodParameters extends StObject {
  
  var notAfterTime: js.UndefOr[js.Date] = js.undefined
  
  var notBeforeTime: js.UndefOr[js.Date] = js.undefined
  
  var schema: js.UndefOr[SchemaType] = js.undefined
}
object AttCertValidityPeriodParameters {
  
  inline def apply(): AttCertValidityPeriodParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttCertValidityPeriodParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AttCertValidityPeriodParameters] (val x: Self) extends AnyVal {
    
    inline def setNotAfterTime(value: js.Date): Self = StObject.set(x, "notAfterTime", value.asInstanceOf[js.Any])
    
    inline def setNotAfterTimeUndefined: Self = StObject.set(x, "notAfterTime", js.undefined)
    
    inline def setNotBeforeTime(value: js.Date): Self = StObject.set(x, "notBeforeTime", value.asInstanceOf[js.Any])
    
    inline def setNotBeforeTimeUndefined: Self = StObject.set(x, "notBeforeTime", js.undefined)
    
    inline def setSchema(value: SchemaType): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
  }
}
