package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined pkijs.pkijs.PkiObjectParameters & std.Partial<pkijs.pkijs.IRSAESOAEPParams> */
trait RSAESOAEPParamsParameters extends StObject {
  
  var hashAlgorithm: js.UndefOr[AlgorithmIdentifier] = js.undefined
  
  var maskGenAlgorithm: js.UndefOr[AlgorithmIdentifier] = js.undefined
  
  var pSourceAlgorithm: js.UndefOr[AlgorithmIdentifier] = js.undefined
  
  var schema: js.UndefOr[SchemaType] = js.undefined
}
object RSAESOAEPParamsParameters {
  
  inline def apply(): RSAESOAEPParamsParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RSAESOAEPParamsParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RSAESOAEPParamsParameters] (val x: Self) extends AnyVal {
    
    inline def setHashAlgorithm(value: AlgorithmIdentifier): Self = StObject.set(x, "hashAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setHashAlgorithmUndefined: Self = StObject.set(x, "hashAlgorithm", js.undefined)
    
    inline def setMaskGenAlgorithm(value: AlgorithmIdentifier): Self = StObject.set(x, "maskGenAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setMaskGenAlgorithmUndefined: Self = StObject.set(x, "maskGenAlgorithm", js.undefined)
    
    inline def setPSourceAlgorithm(value: AlgorithmIdentifier): Self = StObject.set(x, "pSourceAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setPSourceAlgorithmUndefined: Self = StObject.set(x, "pSourceAlgorithm", js.undefined)
    
    inline def setSchema(value: SchemaType): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
  }
}
