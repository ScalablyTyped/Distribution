package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined pkijs.pkijs.PkiObjectParameters & std.Partial<pkijs.pkijs.ISingleResponse> */
trait SingleResponseParameters extends StObject {
  
  var certID: js.UndefOr[CertID] = js.undefined
  
  var certStatus: js.UndefOr[Any] = js.undefined
  
  var nextUpdate: js.UndefOr[js.Date] = js.undefined
  
  var schema: js.UndefOr[SchemaType] = js.undefined
  
  var singleExtensions: js.UndefOr[js.Array[Extension]] = js.undefined
  
  var thisUpdate: js.UndefOr[js.Date] = js.undefined
}
object SingleResponseParameters {
  
  inline def apply(): SingleResponseParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SingleResponseParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SingleResponseParameters] (val x: Self) extends AnyVal {
    
    inline def setCertID(value: CertID): Self = StObject.set(x, "certID", value.asInstanceOf[js.Any])
    
    inline def setCertIDUndefined: Self = StObject.set(x, "certID", js.undefined)
    
    inline def setCertStatus(value: Any): Self = StObject.set(x, "certStatus", value.asInstanceOf[js.Any])
    
    inline def setCertStatusUndefined: Self = StObject.set(x, "certStatus", js.undefined)
    
    inline def setNextUpdate(value: js.Date): Self = StObject.set(x, "nextUpdate", value.asInstanceOf[js.Any])
    
    inline def setNextUpdateUndefined: Self = StObject.set(x, "nextUpdate", js.undefined)
    
    inline def setSchema(value: SchemaType): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
    
    inline def setSingleExtensions(value: js.Array[Extension]): Self = StObject.set(x, "singleExtensions", value.asInstanceOf[js.Any])
    
    inline def setSingleExtensionsUndefined: Self = StObject.set(x, "singleExtensions", js.undefined)
    
    inline def setSingleExtensionsVarargs(value: Extension*): Self = StObject.set(x, "singleExtensions", js.Array(value*))
    
    inline def setThisUpdate(value: js.Date): Self = StObject.set(x, "thisUpdate", value.asInstanceOf[js.Any])
    
    inline def setThisUpdateUndefined: Self = StObject.set(x, "thisUpdate", js.undefined)
  }
}
