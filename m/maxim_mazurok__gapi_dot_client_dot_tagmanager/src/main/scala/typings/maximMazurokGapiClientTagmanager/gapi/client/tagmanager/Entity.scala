package typings.maximMazurokGapiClientTagmanager.gapi.client.tagmanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Entity extends StObject {
  
  /** Represents how the entity has been changed in the workspace. */
  var changeStatus: js.UndefOr[String] = js.native
  
  /** The client being represented by the entity. */
  var client: js.UndefOr[Client] = js.native
  
  /** The folder being represented by the entity. */
  var folder: js.UndefOr[Folder] = js.native
  
  /** The tag being represented by the entity. */
  var tag: js.UndefOr[Tag] = js.native
  
  /** The trigger being represented by the entity. */
  var trigger: js.UndefOr[Trigger] = js.native
  
  /** The variable being represented by the entity. */
  var variable: js.UndefOr[Variable] = js.native
}
object Entity {
  
  @scala.inline
  def apply(): Entity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Entity]
  }
  
  @scala.inline
  implicit class EntityMutableBuilder[Self <: Entity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChangeStatus(value: String): Self = StObject.set(x, "changeStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangeStatusUndefined: Self = StObject.set(x, "changeStatus", js.undefined)
    
    @scala.inline
    def setClient(value: Client): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientUndefined: Self = StObject.set(x, "client", js.undefined)
    
    @scala.inline
    def setFolder(value: Folder): Self = StObject.set(x, "folder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFolderUndefined: Self = StObject.set(x, "folder", js.undefined)
    
    @scala.inline
    def setTag(value: Tag): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
    
    @scala.inline
    def setTrigger(value: Trigger): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriggerUndefined: Self = StObject.set(x, "trigger", js.undefined)
    
    @scala.inline
    def setVariable(value: Variable): Self = StObject.set(x, "variable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariableUndefined: Self = StObject.set(x, "variable", js.undefined)
  }
}
