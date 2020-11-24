package typings.maximMazurokGapiClientNotebooks.gapi.client.notebooks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListEnvironmentsResponse extends js.Object {
  
  /** A list of returned environments. */
  var environments: js.UndefOr[js.Array[Environment]] = js.native
  
  /** A page token that can be used to continue listing from the last result in the next list call. */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /** Locations that could not be reached. */
  var unreachable: js.UndefOr[js.Array[String]] = js.native
}
object ListEnvironmentsResponse {
  
  @scala.inline
  def apply(): ListEnvironmentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListEnvironmentsResponse]
  }
  
  @scala.inline
  implicit class ListEnvironmentsResponseOps[Self <: ListEnvironmentsResponse] (val x: Self) extends AnyVal {
    
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
    def setEnvironmentsVarargs(value: Environment*): Self = this.set("environments", js.Array(value :_*))
    
    @scala.inline
    def setEnvironments(value: js.Array[Environment]): Self = this.set("environments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnvironments: Self = this.set("environments", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
    
    @scala.inline
    def setUnreachableVarargs(value: String*): Self = this.set("unreachable", js.Array(value :_*))
    
    @scala.inline
    def setUnreachable(value: js.Array[String]): Self = this.set("unreachable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnreachable: Self = this.set("unreachable", js.undefined)
  }
}
