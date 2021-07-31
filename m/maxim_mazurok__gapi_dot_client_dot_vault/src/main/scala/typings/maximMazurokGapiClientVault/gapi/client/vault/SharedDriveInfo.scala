package typings.maximMazurokGapiClientVault.gapi.client.vault

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SharedDriveInfo extends StObject {
  
  /** List of Shared drive IDs, as provided by Drive API. */
  var sharedDriveIds: js.UndefOr[js.Array[String]] = js.undefined
}
object SharedDriveInfo {
  
  @scala.inline
  def apply(): SharedDriveInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SharedDriveInfo]
  }
  
  @scala.inline
  implicit class SharedDriveInfoMutableBuilder[Self <: SharedDriveInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSharedDriveIds(value: js.Array[String]): Self = StObject.set(x, "sharedDriveIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSharedDriveIdsUndefined: Self = StObject.set(x, "sharedDriveIds", js.undefined)
    
    @scala.inline
    def setSharedDriveIdsVarargs(value: String*): Self = StObject.set(x, "sharedDriveIds", js.Array(value :_*))
  }
}
