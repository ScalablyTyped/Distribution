package typings.maximMazurokGapiClientToolresults.gapi.client.toolresults

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SuggestionClusterProto extends js.Object {
  
  /** Category in which these types of suggestions should appear. Always set. */
  var category: js.UndefOr[String] = js.native
  
  /**
    * A sequence of suggestions. All of the suggestions within a cluster must have the same SuggestionPriority and belong to the same SuggestionCategory. Suggestions with the same
    * screenshot URL should be adjacent.
    */
  var suggestions: js.UndefOr[js.Array[SuggestionProto]] = js.native
}
object SuggestionClusterProto {
  
  @scala.inline
  def apply(): SuggestionClusterProto = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SuggestionClusterProto]
  }
  
  @scala.inline
  implicit class SuggestionClusterProtoOps[Self <: SuggestionClusterProto] (val x: Self) extends AnyVal {
    
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
    def setCategory(value: String): Self = this.set("category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCategory: Self = this.set("category", js.undefined)
    
    @scala.inline
    def setSuggestionsVarargs(value: SuggestionProto*): Self = this.set("suggestions", js.Array(value :_*))
    
    @scala.inline
    def setSuggestions(value: js.Array[SuggestionProto]): Self = this.set("suggestions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuggestions: Self = this.set("suggestions", js.undefined)
  }
}
