package typings.pkijs.mod

import typings.asn1js.mod.Integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined pkijs.pkijs.PkiObjectParameters & std.Partial<pkijs.pkijs.IOtherPrimeInfo> & {  json :pkijs.pkijs.OtherPrimeInfoJson | undefined} */
trait OtherPrimeInfoParameters extends StObject {
  
  var coefficient: js.UndefOr[Integer] = js.undefined
  
  var exponent: js.UndefOr[Integer] = js.undefined
  
  var json: js.UndefOr[OtherPrimeInfoJson] = js.undefined
  
  var prime: js.UndefOr[Integer] = js.undefined
  
  var schema: js.UndefOr[SchemaType] = js.undefined
}
object OtherPrimeInfoParameters {
  
  inline def apply(): OtherPrimeInfoParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OtherPrimeInfoParameters]
  }
  
  extension [Self <: OtherPrimeInfoParameters](x: Self) {
    
    inline def setCoefficient(value: Integer): Self = StObject.set(x, "coefficient", value.asInstanceOf[js.Any])
    
    inline def setCoefficientUndefined: Self = StObject.set(x, "coefficient", js.undefined)
    
    inline def setExponent(value: Integer): Self = StObject.set(x, "exponent", value.asInstanceOf[js.Any])
    
    inline def setExponentUndefined: Self = StObject.set(x, "exponent", js.undefined)
    
    inline def setJson(value: OtherPrimeInfoJson): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
    
    inline def setJsonUndefined: Self = StObject.set(x, "json", js.undefined)
    
    inline def setPrime(value: Integer): Self = StObject.set(x, "prime", value.asInstanceOf[js.Any])
    
    inline def setPrimeUndefined: Self = StObject.set(x, "prime", js.undefined)
    
    inline def setSchema(value: SchemaType): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
  }
}
