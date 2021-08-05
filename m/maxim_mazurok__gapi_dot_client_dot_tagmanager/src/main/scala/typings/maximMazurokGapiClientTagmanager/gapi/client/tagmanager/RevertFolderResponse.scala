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
  
  inline def apply(): RevertFolderResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RevertFolderResponse]
  }
  
  extension [Self <: RevertFolderResponse](x: Self) {
    
    inline def setFolder(value: Folder): Self = StObject.set(x, "folder", value.asInstanceOf[js.Any])
    
    inline def setFolderUndefined: Self = StObject.set(x, "folder", js.undefined)
  }
}
