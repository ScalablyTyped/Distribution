package typings.maximMazurokGapiClientVault.gapi.client.vault

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListExportsResponse extends js.Object {
  
  /** The list of exports. */
  var exports: js.UndefOr[js.Array[Export]] = js.native
  
  /** Page token to retrieve the next page of results in the list. */
  var nextPageToken: js.UndefOr[String] = js.native
}
object ListExportsResponse {
  
  @scala.inline
  def apply(): ListExportsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListExportsResponse]
  }
  
  @scala.inline
  implicit class ListExportsResponseOps[Self <: ListExportsResponse] (val x: Self) extends AnyVal {
    
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
    def setExportsVarargs(value: Export*): Self = this.set("exports", js.Array(value :_*))
    
    @scala.inline
    def setExports(value: js.Array[Export]): Self = this.set("exports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExports: Self = this.set("exports", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
}
