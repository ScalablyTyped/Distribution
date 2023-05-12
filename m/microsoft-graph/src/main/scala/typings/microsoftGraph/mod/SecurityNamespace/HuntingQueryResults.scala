package typings.microsoftGraph.mod.SecurityNamespace

import typings.microsoftGraph.mod.NullableOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HuntingQueryResults extends StObject {
  
  // The results of the hunting query.
  var results: js.UndefOr[NullableOption[js.Array[HuntingRowResult]]] = js.undefined
  
  // The schema for the response.
  var schema: js.UndefOr[NullableOption[js.Array[SinglePropertySchema]]] = js.undefined
}
object HuntingQueryResults {
  
  inline def apply(): HuntingQueryResults = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HuntingQueryResults]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HuntingQueryResults] (val x: Self) extends AnyVal {
    
    inline def setResults(value: NullableOption[js.Array[HuntingRowResult]]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    inline def setResultsNull: Self = StObject.set(x, "results", null)
    
    inline def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
    
    inline def setResultsVarargs(value: HuntingRowResult*): Self = StObject.set(x, "results", js.Array(value*))
    
    inline def setSchema(value: NullableOption[js.Array[SinglePropertySchema]]): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaNull: Self = StObject.set(x, "schema", null)
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
    
    inline def setSchemaVarargs(value: SinglePropertySchema*): Self = StObject.set(x, "schema", js.Array(value*))
  }
}
