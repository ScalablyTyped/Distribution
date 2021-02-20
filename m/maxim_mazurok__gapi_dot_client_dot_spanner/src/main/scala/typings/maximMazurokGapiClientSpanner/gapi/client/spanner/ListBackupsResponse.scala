package typings.maximMazurokGapiClientSpanner.gapi.client.spanner

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListBackupsResponse extends StObject {
  
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
  implicit class ListBackupsResponseMutableBuilder[Self <: ListBackupsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackups(value: js.Array[Backup]): Self = StObject.set(x, "backups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackupsUndefined: Self = StObject.set(x, "backups", js.undefined)
    
    @scala.inline
    def setBackupsVarargs(value: Backup*): Self = StObject.set(x, "backups", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
