package typings.maximMazurokGapiClientTagmanager.gapi.client.tagmanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateContainerVersionResponse extends StObject {
  
  /** Compiler errors or not. */
  var compilerError: js.UndefOr[Boolean] = js.native
  
  /** The container version created. */
  var containerVersion: js.UndefOr[ContainerVersion] = js.native
  
  /** Auto generated workspace path created as a result of version creation. This field should only be populated if the created version was not a quick preview. */
  var newWorkspacePath: js.UndefOr[String] = js.native
  
  /** Whether version creation failed when syncing the workspace to the latest container version. */
  var syncStatus: js.UndefOr[SyncStatus] = js.native
}
object CreateContainerVersionResponse {
  
  @scala.inline
  def apply(): CreateContainerVersionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateContainerVersionResponse]
  }
  
  @scala.inline
  implicit class CreateContainerVersionResponseMutableBuilder[Self <: CreateContainerVersionResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompilerError(value: Boolean): Self = StObject.set(x, "compilerError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompilerErrorUndefined: Self = StObject.set(x, "compilerError", js.undefined)
    
    @scala.inline
    def setContainerVersion(value: ContainerVersion): Self = StObject.set(x, "containerVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerVersionUndefined: Self = StObject.set(x, "containerVersion", js.undefined)
    
    @scala.inline
    def setNewWorkspacePath(value: String): Self = StObject.set(x, "newWorkspacePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewWorkspacePathUndefined: Self = StObject.set(x, "newWorkspacePath", js.undefined)
    
    @scala.inline
    def setSyncStatus(value: SyncStatus): Self = StObject.set(x, "syncStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSyncStatusUndefined: Self = StObject.set(x, "syncStatus", js.undefined)
  }
}
