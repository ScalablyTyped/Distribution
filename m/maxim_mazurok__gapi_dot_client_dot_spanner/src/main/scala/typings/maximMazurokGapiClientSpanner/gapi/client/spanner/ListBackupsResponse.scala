package typings.maximMazurokGapiClientSpanner.gapi.client.spanner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListBackupsResponse extends js.Object {
  
  /** The list of matching backups. Backups returned are ordered by `create_time` in descending order, starting from the most recent `create_time`. */
  var backups: js.UndefOr[js.Array[Backup]] = js.native
  
  /** `next_page_token` can be sent in a subsequent ListBackups call to fetch more of the matching backups. */
  var nextPageToken: js.UndefOr[String] = js.native
}
object ListBackupsResponse {
  
  @scala.inline
  def apply(): ListBackupsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListBackupsResponse]
  }
  
  @scala.inline
  implicit class ListBackupsResponseOps[Self <: ListBackupsResponse] (val x: Self) extends AnyVal {
    
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
    def setBackupsVarargs(value: Backup*): Self = this.set("backups", js.Array(value :_*))
    
    @scala.inline
    def setBackups(value: js.Array[Backup]): Self = this.set("backups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackups: Self = this.set("backups", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
}
