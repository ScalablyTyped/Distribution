package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchResponse extends js.Object {
  
  var hitsContainers: js.UndefOr[NullableOption[js.Array[SearchHitsContainer]]] = js.native
  
  var searchTerms: js.UndefOr[NullableOption[js.Array[String]]] = js.native
}
object SearchResponse {
  
  @scala.inline
  def apply(): SearchResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchResponse]
  }
  
  @scala.inline
  implicit class SearchResponseOps[Self <: SearchResponse] (val x: Self) extends AnyVal {
    
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
    def setHitsContainersVarargs(value: SearchHitsContainer*): Self = this.set("hitsContainers", js.Array(value :_*))
    
    @scala.inline
    def setHitsContainers(value: NullableOption[js.Array[SearchHitsContainer]]): Self = this.set("hitsContainers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHitsContainers: Self = this.set("hitsContainers", js.undefined)
    
    @scala.inline
    def setHitsContainersNull: Self = this.set("hitsContainers", null)
    
    @scala.inline
    def setSearchTermsVarargs(value: String*): Self = this.set("searchTerms", js.Array(value :_*))
    
    @scala.inline
    def setSearchTerms(value: NullableOption[js.Array[String]]): Self = this.set("searchTerms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSearchTerms: Self = this.set("searchTerms", js.undefined)
    
    @scala.inline
    def setSearchTermsNull: Self = this.set("searchTerms", null)
  }
}
