package typings.maximMazurokGapiClientTranslate.gapi.client.translate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListGlossariesResponse extends js.Object {
  
  /** The list of glossaries for a project. */
  var glossaries: js.UndefOr[js.Array[Glossary]] = js.native
  
  /**
    * A token to retrieve a page of results. Pass this value in the [ListGlossariesRequest.page_token] field in the subsequent call to `ListGlossaries` method to retrieve the next page of
    * results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}
object ListGlossariesResponse {
  
  @scala.inline
  def apply(): ListGlossariesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListGlossariesResponse]
  }
  
  @scala.inline
  implicit class ListGlossariesResponseOps[Self <: ListGlossariesResponse] (val x: Self) extends AnyVal {
    
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
    def setGlossariesVarargs(value: Glossary*): Self = this.set("glossaries", js.Array(value :_*))
    
    @scala.inline
    def setGlossaries(value: js.Array[Glossary]): Self = this.set("glossaries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGlossaries: Self = this.set("glossaries", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
}
