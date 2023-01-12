package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined pkijs.pkijs.PkiObjectParameters & std.Partial<pkijs.pkijs.IPBES2Params> */
trait PBES2ParamsParameters extends StObject {
  
  var encryptionScheme: js.UndefOr[AlgorithmIdentifier] = js.undefined
  
  var keyDerivationFunc: js.UndefOr[AlgorithmIdentifier] = js.undefined
  
  var schema: js.UndefOr[SchemaType] = js.undefined
}
object PBES2ParamsParameters {
  
  inline def apply(): PBES2ParamsParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PBES2ParamsParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PBES2ParamsParameters] (val x: Self) extends AnyVal {
    
    inline def setEncryptionScheme(value: AlgorithmIdentifier): Self = StObject.set(x, "encryptionScheme", value.asInstanceOf[js.Any])
    
    inline def setEncryptionSchemeUndefined: Self = StObject.set(x, "encryptionScheme", js.undefined)
    
    inline def setKeyDerivationFunc(value: AlgorithmIdentifier): Self = StObject.set(x, "keyDerivationFunc", value.asInstanceOf[js.Any])
    
    inline def setKeyDerivationFuncUndefined: Self = StObject.set(x, "keyDerivationFunc", js.undefined)
    
    inline def setSchema(value: SchemaType): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
  }
}
