package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchRequest extends StObject {
  
  var contentSources: js.UndefOr[NullableOption[js.Array[String]]] = js.native
  
  var enableTopResults: js.UndefOr[NullableOption[Boolean]] = js.native
  
  var entityTypes: js.UndefOr[NullableOption[js.Array[EntityType]]] = js.native
  
  var fields: js.UndefOr[NullableOption[js.Array[String]]] = js.native
  
  var from: js.UndefOr[Double] = js.native
  
  var query: js.UndefOr[SearchQuery] = js.native
  
  var size: js.UndefOr[Double] = js.native
}
object SearchRequest {
  
  @scala.inline
  def apply(): SearchRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchRequest]
  }
  
  @scala.inline
  implicit class SearchRequestMutableBuilder[Self <: SearchRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContentSources(value: NullableOption[js.Array[String]]): Self = StObject.set(x, "contentSources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentSourcesNull: Self = StObject.set(x, "contentSources", null)
    
    @scala.inline
    def setContentSourcesUndefined: Self = StObject.set(x, "contentSources", js.undefined)
    
    @scala.inline
    def setContentSourcesVarargs(value: String*): Self = StObject.set(x, "contentSources", js.Array(value :_*))
    
    @scala.inline
    def setEnableTopResults(value: NullableOption[Boolean]): Self = StObject.set(x, "enableTopResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableTopResultsNull: Self = StObject.set(x, "enableTopResults", null)
    
    @scala.inline
    def setEnableTopResultsUndefined: Self = StObject.set(x, "enableTopResults", js.undefined)
    
    @scala.inline
    def setEntityTypes(value: NullableOption[js.Array[EntityType]]): Self = StObject.set(x, "entityTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntityTypesNull: Self = StObject.set(x, "entityTypes", null)
    
    @scala.inline
    def setEntityTypesUndefined: Self = StObject.set(x, "entityTypes", js.undefined)
    
    @scala.inline
    def setEntityTypesVarargs(value: EntityType*): Self = StObject.set(x, "entityTypes", js.Array(value :_*))
    
    @scala.inline
    def setFields(value: NullableOption[js.Array[String]]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsNull: Self = StObject.set(x, "fields", null)
    
    @scala.inline
    def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    @scala.inline
    def setFieldsVarargs(value: String*): Self = StObject.set(x, "fields", js.Array(value :_*))
    
    @scala.inline
    def setFrom(value: Double): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    @scala.inline
    def setQuery(value: SearchQuery): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
