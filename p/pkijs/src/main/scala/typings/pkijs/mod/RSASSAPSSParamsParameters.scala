package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined pkijs.pkijs.PkiObjectParameters & std.Partial<pkijs.pkijs.IRSASSAPSSParams> */
trait RSASSAPSSParamsParameters extends StObject {
  
  var hashAlgorithm: js.UndefOr[AlgorithmIdentifier] = js.undefined
  
  var maskGenAlgorithm: js.UndefOr[AlgorithmIdentifier] = js.undefined
  
  var saltLength: js.UndefOr[Double] = js.undefined
  
  var schema: js.UndefOr[SchemaType] = js.undefined
  
  var trailerField: js.UndefOr[Double] = js.undefined
}
object RSASSAPSSParamsParameters {
  
  inline def apply(): RSASSAPSSParamsParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RSASSAPSSParamsParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RSASSAPSSParamsParameters] (val x: Self) extends AnyVal {
    
    inline def setHashAlgorithm(value: AlgorithmIdentifier): Self = StObject.set(x, "hashAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setHashAlgorithmUndefined: Self = StObject.set(x, "hashAlgorithm", js.undefined)
    
    inline def setMaskGenAlgorithm(value: AlgorithmIdentifier): Self = StObject.set(x, "maskGenAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setMaskGenAlgorithmUndefined: Self = StObject.set(x, "maskGenAlgorithm", js.undefined)
    
    inline def setSaltLength(value: Double): Self = StObject.set(x, "saltLength", value.asInstanceOf[js.Any])
    
    inline def setSaltLengthUndefined: Self = StObject.set(x, "saltLength", js.undefined)
    
    inline def setSchema(value: SchemaType): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
    
    inline def setTrailerField(value: Double): Self = StObject.set(x, "trailerField", value.asInstanceOf[js.Any])
    
    inline def setTrailerFieldUndefined: Self = StObject.set(x, "trailerField", js.undefined)
  }
}
