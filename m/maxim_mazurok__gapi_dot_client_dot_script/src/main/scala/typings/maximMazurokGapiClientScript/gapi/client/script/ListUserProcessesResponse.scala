package typings.maximMazurokGapiClientScript.gapi.client.script

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListUserProcessesResponse extends js.Object {
  
  /** Token for the next page of results. If empty, there are no more pages remaining. */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /** List of processes matching request parameters. */
  var processes: js.UndefOr[js.Array[GoogleAppsScriptTypeProcess]] = js.native
}
object ListUserProcessesResponse {
  
  @scala.inline
  def apply(): ListUserProcessesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListUserProcessesResponse]
  }
  
  @scala.inline
  implicit class ListUserProcessesResponseOps[Self <: ListUserProcessesResponse] (val x: Self) extends AnyVal {
    
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
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
    
    @scala.inline
    def setProcessesVarargs(value: GoogleAppsScriptTypeProcess*): Self = this.set("processes", js.Array(value :_*))
    
    @scala.inline
    def setProcesses(value: js.Array[GoogleAppsScriptTypeProcess]): Self = this.set("processes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProcesses: Self = this.set("processes", js.undefined)
  }
}
