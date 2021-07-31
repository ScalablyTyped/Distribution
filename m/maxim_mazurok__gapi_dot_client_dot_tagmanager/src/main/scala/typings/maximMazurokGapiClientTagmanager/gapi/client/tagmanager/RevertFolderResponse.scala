package typings.maximMazurokGapiClientTagmanager.gapi.client.tagmanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RevertFolderResponse extends StObject {
  
  /**
    * Folder as it appears in the latest container version since the last workspace synchronization operation. If no folder is present, that means the folder was deleted in the latest
    * container version.
    */
  var folder: js.UndefOr[Folder] = js.undefined
}
object RevertFolderResponse {
  
  @scala.inline
  def apply(): RevertFolderResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RevertFolderResponse]
  }
  
  @scala.inline
  implicit class RevertFolderResponseMutableBuilder[Self <: RevertFolderResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFolder(value: Folder): Self = StObject.set(x, "folder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFolderUndefined: Self = StObject.set(x, "folder", js.undefined)
  }
}
