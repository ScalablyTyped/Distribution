package typings.pkijs.mod

import typings.asn1js.mod.OctetString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined pkijs.pkijs.PkiObjectParameters & std.Partial<pkijs.pkijs.IMacData> */
trait MacDataParameters extends StObject {
  
  var iterations: js.UndefOr[Double] = js.undefined
  
  var mac: js.UndefOr[DigestInfo] = js.undefined
  
  var macSalt: js.UndefOr[OctetString] = js.undefined
  
  var schema: js.UndefOr[SchemaType] = js.undefined
}
object MacDataParameters {
  
  inline def apply(): MacDataParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MacDataParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MacDataParameters] (val x: Self) extends AnyVal {
    
    inline def setIterations(value: Double): Self = StObject.set(x, "iterations", value.asInstanceOf[js.Any])
    
    inline def setIterationsUndefined: Self = StObject.set(x, "iterations", js.undefined)
    
    inline def setMac(value: DigestInfo): Self = StObject.set(x, "mac", value.asInstanceOf[js.Any])
    
    inline def setMacSalt(value: OctetString): Self = StObject.set(x, "macSalt", value.asInstanceOf[js.Any])
    
    inline def setMacSaltUndefined: Self = StObject.set(x, "macSalt", js.undefined)
    
    inline def setMacUndefined: Self = StObject.set(x, "mac", js.undefined)
    
    inline def setSchema(value: SchemaType): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
  }
}
