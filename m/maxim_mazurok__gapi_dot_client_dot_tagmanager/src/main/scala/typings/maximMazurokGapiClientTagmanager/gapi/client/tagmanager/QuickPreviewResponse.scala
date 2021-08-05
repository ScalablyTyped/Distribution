package typings.maximMazurokGapiClientTagmanager.gapi.client.tagmanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QuickPreviewResponse extends StObject {
  
  /** Were there compiler errors or not. */
  var compilerError: js.UndefOr[Boolean] = js.undefined
  
  /** The quick previewed container version. */
  var containerVersion: js.UndefOr[ContainerVersion] = js.undefined
  
  /** Whether quick previewing failed when syncing the workspace to the latest container version. */
  var syncStatus: js.UndefOr[SyncStatus] = js.undefined
}
object QuickPreviewResponse {
  
  inline def apply(): QuickPreviewResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QuickPreviewResponse]
  }
  
  extension [Self <: QuickPreviewResponse](x: Self) {
    
    inline def setCompilerError(value: Boolean): Self = StObject.set(x, "compilerError", value.asInstanceOf[js.Any])
    
    inline def setCompilerErrorUndefined: Self = StObject.set(x, "compilerError", js.undefined)
    
    inline def setContainerVersion(value: ContainerVersion): Self = StObject.set(x, "containerVersion", value.asInstanceOf[js.Any])
    
    inline def setContainerVersionUndefined: Self = StObject.set(x, "containerVersion", js.undefined)
    
    inline def setSyncStatus(value: SyncStatus): Self = StObject.set(x, "syncStatus", value.asInstanceOf[js.Any])
    
    inline def setSyncStatusUndefined: Self = StObject.set(x, "syncStatus", js.undefined)
  }
}
