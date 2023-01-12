package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined pkijs.pkijs.PkiObjectParameters & std.Partial<pkijs.pkijs.IAlgorithmIdentifier> */
trait AlgorithmIdentifierParameters extends StObject {
  
  var algorithmId: js.UndefOr[String] = js.undefined
  
  var algorithmParams: js.UndefOr[Any] = js.undefined
  
  var schema: js.UndefOr[SchemaType] = js.undefined
}
object AlgorithmIdentifierParameters {
  
  inline def apply(): AlgorithmIdentifierParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AlgorithmIdentifierParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AlgorithmIdentifierParameters] (val x: Self) extends AnyVal {
    
    inline def setAlgorithmId(value: String): Self = StObject.set(x, "algorithmId", value.asInstanceOf[js.Any])
    
    inline def setAlgorithmIdUndefined: Self = StObject.set(x, "algorithmId", js.undefined)
    
    inline def setAlgorithmParams(value: Any): Self = StObject.set(x, "algorithmParams", value.asInstanceOf[js.Any])
    
    inline def setAlgorithmParamsUndefined: Self = StObject.set(x, "algorithmParams", js.undefined)
    
    inline def setSchema(value: SchemaType): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
  }
}
