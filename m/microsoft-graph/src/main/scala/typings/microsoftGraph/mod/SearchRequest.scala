package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchRequest extends js.Object {
  
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
  implicit class SearchRequestOps[Self <: SearchRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setContentSourcesVarargs(value: String*): Self = this.set("contentSources", js.Array(value :_*))
    
    @scala.inline
    def setContentSources(value: NullableOption[js.Array[String]]): Self = this.set("contentSources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentSources: Self = this.set("contentSources", js.undefined)
    
    @scala.inline
    def setContentSourcesNull: Self = this.set("contentSources", null)
    
    @scala.inline
    def setEnableTopResults(value: NullableOption[Boolean]): Self = this.set("enableTopResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableTopResults: Self = this.set("enableTopResults", js.undefined)
    
    @scala.inline
    def setEnableTopResultsNull: Self = this.set("enableTopResults", null)
    
    @scala.inline
    def setEntityTypesVarargs(value: EntityType*): Self = this.set("entityTypes", js.Array(value :_*))
    
    @scala.inline
    def setEntityTypes(value: NullableOption[js.Array[EntityType]]): Self = this.set("entityTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEntityTypes: Self = this.set("entityTypes", js.undefined)
    
    @scala.inline
    def setEntityTypesNull: Self = this.set("entityTypes", null)
    
    @scala.inline
    def setFieldsVarargs(value: String*): Self = this.set("fields", js.Array(value :_*))
    
    @scala.inline
    def setFields(value: NullableOption[js.Array[String]]): Self = this.set("fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    
    @scala.inline
    def setFieldsNull: Self = this.set("fields", null)
    
    @scala.inline
    def setFrom(value: Double): Self = this.set("from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrom: Self = this.set("from", js.undefined)
    
    @scala.inline
    def setQuery(value: SearchQuery): Self = this.set("query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuery: Self = this.set("query", js.undefined)
    
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
  }
}
