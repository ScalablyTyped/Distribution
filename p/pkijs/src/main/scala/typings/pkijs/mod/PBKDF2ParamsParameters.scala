package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined pkijs.pkijs.PkiObjectParameters & std.Partial<pkijs.pkijs.IPBKDF2Params> */
trait PBKDF2ParamsParameters extends StObject {
  
  var iterationCount: js.UndefOr[Double] = js.undefined
  
  var keyLength: js.UndefOr[Double] = js.undefined
  
  var prf: js.UndefOr[AlgorithmIdentifier] = js.undefined
  
  var salt: js.UndefOr[Any] = js.undefined
  
  var schema: js.UndefOr[SchemaType] = js.undefined
}
object PBKDF2ParamsParameters {
  
  inline def apply(): PBKDF2ParamsParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PBKDF2ParamsParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PBKDF2ParamsParameters] (val x: Self) extends AnyVal {
    
    inline def setIterationCount(value: Double): Self = StObject.set(x, "iterationCount", value.asInstanceOf[js.Any])
    
    inline def setIterationCountUndefined: Self = StObject.set(x, "iterationCount", js.undefined)
    
    inline def setKeyLength(value: Double): Self = StObject.set(x, "keyLength", value.asInstanceOf[js.Any])
    
    inline def setKeyLengthUndefined: Self = StObject.set(x, "keyLength", js.undefined)
    
    inline def setPrf(value: AlgorithmIdentifier): Self = StObject.set(x, "prf", value.asInstanceOf[js.Any])
    
    inline def setPrfUndefined: Self = StObject.set(x, "prf", js.undefined)
    
    inline def setSalt(value: Any): Self = StObject.set(x, "salt", value.asInstanceOf[js.Any])
    
    inline def setSaltUndefined: Self = StObject.set(x, "salt", js.undefined)
    
    inline def setSchema(value: SchemaType): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
  }
}
