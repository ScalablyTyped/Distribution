package typings.maximMazurokGapiClientSourcerepo.gapi.client.sourcerepo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SyncRepoMetadata extends StObject {
  
  /** The name of the repo being synchronized. Values are of the form `projects//repos/`. */
  var name: js.UndefOr[String] = js.undefined
  
  /** The time this operation is started. */
  var startTime: js.UndefOr[String] = js.undefined
  
  /** The latest status message on syncing the repository. */
  var statusMessage: js.UndefOr[String] = js.undefined
  
  /** The time this operation's status message is updated. */
  var updateTime: js.UndefOr[String] = js.undefined
}
object SyncRepoMetadata {
  
  inline def apply(): SyncRepoMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SyncRepoMetadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SyncRepoMetadata] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    inline def setStatusMessage(value: String): Self = StObject.set(x, "statusMessage", value.asInstanceOf[js.Any])
    
    inline def setStatusMessageUndefined: Self = StObject.set(x, "statusMessage", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
