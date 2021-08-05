package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchRequest extends StObject {
  
  var contentSources: js.UndefOr[NullableOption[js.Array[String]]] = js.undefined
  
  var enableTopResults: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  var entityTypes: js.UndefOr[NullableOption[js.Array[EntityType]]] = js.undefined
  
  var fields: js.UndefOr[NullableOption[js.Array[String]]] = js.undefined
  
  var from: js.UndefOr[Double] = js.undefined
  
  var query: js.UndefOr[SearchQuery] = js.undefined
  
  var size: js.UndefOr[Double] = js.undefined
}
object SearchRequest {
  
  inline def apply(): SearchRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchRequest]
  }
  
  extension [Self <: SearchRequest](x: Self) {
    
    inline def setContentSources(value: NullableOption[js.Array[String]]): Self = StObject.set(x, "contentSources", value.asInstanceOf[js.Any])
    
    inline def setContentSourcesNull: Self = StObject.set(x, "contentSources", null)
    
    inline def setContentSourcesUndefined: Self = StObject.set(x, "contentSources", js.undefined)
    
    inline def setContentSourcesVarargs(value: String*): Self = StObject.set(x, "contentSources", js.Array(value :_*))
    
    inline def setEnableTopResults(value: NullableOption[Boolean]): Self = StObject.set(x, "enableTopResults", value.asInstanceOf[js.Any])
    
    inline def setEnableTopResultsNull: Self = StObject.set(x, "enableTopResults", null)
    
    inline def setEnableTopResultsUndefined: Self = StObject.set(x, "enableTopResults", js.undefined)
    
    inline def setEntityTypes(value: NullableOption[js.Array[EntityType]]): Self = StObject.set(x, "entityTypes", value.asInstanceOf[js.Any])
    
    inline def setEntityTypesNull: Self = StObject.set(x, "entityTypes", null)
    
    inline def setEntityTypesUndefined: Self = StObject.set(x, "entityTypes", js.undefined)
    
    inline def setEntityTypesVarargs(value: EntityType*): Self = StObject.set(x, "entityTypes", js.Array(value :_*))
    
    inline def setFields(value: NullableOption[js.Array[String]]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsNull: Self = StObject.set(x, "fields", null)
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setFieldsVarargs(value: String*): Self = StObject.set(x, "fields", js.Array(value :_*))
    
    inline def setFrom(value: Double): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    inline def setQuery(value: SearchQuery): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
