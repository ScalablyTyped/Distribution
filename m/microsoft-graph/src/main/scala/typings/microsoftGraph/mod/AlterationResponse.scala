package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AlterationResponse extends StObject {
  
  // Defines the original user query string.
  var originalQueryString: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Defines the details of the alteration information for the spelling correction.
  var queryAlteration: js.UndefOr[NullableOption[SearchAlteration]] = js.undefined
  
  // Defines the type of the spelling correction. Possible values are: suggestion, modification.
  var queryAlterationType: js.UndefOr[NullableOption[SearchAlterationType]] = js.undefined
}
object AlterationResponse {
  
  inline def apply(): AlterationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AlterationResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AlterationResponse] (val x: Self) extends AnyVal {
    
    inline def setOriginalQueryString(value: NullableOption[String]): Self = StObject.set(x, "originalQueryString", value.asInstanceOf[js.Any])
    
    inline def setOriginalQueryStringNull: Self = StObject.set(x, "originalQueryString", null)
    
    inline def setOriginalQueryStringUndefined: Self = StObject.set(x, "originalQueryString", js.undefined)
    
    inline def setQueryAlteration(value: NullableOption[SearchAlteration]): Self = StObject.set(x, "queryAlteration", value.asInstanceOf[js.Any])
    
    inline def setQueryAlterationNull: Self = StObject.set(x, "queryAlteration", null)
    
    inline def setQueryAlterationType(value: NullableOption[SearchAlterationType]): Self = StObject.set(x, "queryAlterationType", value.asInstanceOf[js.Any])
    
    inline def setQueryAlterationTypeNull: Self = StObject.set(x, "queryAlterationType", null)
    
    inline def setQueryAlterationTypeUndefined: Self = StObject.set(x, "queryAlterationType", js.undefined)
    
    inline def setQueryAlterationUndefined: Self = StObject.set(x, "queryAlteration", js.undefined)
  }
}
