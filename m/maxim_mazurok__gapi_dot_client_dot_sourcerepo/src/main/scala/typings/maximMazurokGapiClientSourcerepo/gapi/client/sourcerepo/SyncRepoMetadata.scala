package typings.maximMazurokGapiClientSourcerepo.gapi.client.sourcerepo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SyncRepoMetadata extends StObject {
  
  /** The name of the repo being synchronized. Values are of the form `projects//repos/`. */
  var name: js.UndefOr[String] = js.native
  
  /** The time this operation is started. */
  var startTime: js.UndefOr[String] = js.native
  
  /** The latest status message on syncing the repository. */
  var statusMessage: js.UndefOr[String] = js.native
  
  /** The time this operation's status message is updated. */
  var updateTime: js.UndefOr[String] = js.native
}
object SyncRepoMetadata {
  
  @scala.inline
  def apply(): SyncRepoMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SyncRepoMetadata]
  }
  
  @scala.inline
  implicit class SyncRepoMetadataMutableBuilder[Self <: SyncRepoMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    @scala.inline
    def setStatusMessage(value: String): Self = StObject.set(x, "statusMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusMessageUndefined: Self = StObject.set(x, "statusMessage", js.undefined)
    
    @scala.inline
    def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
