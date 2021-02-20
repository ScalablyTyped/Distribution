package typings.maximMazurokGapiClientMonitoring.gapi.client.monitoring

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResourceGroup extends StObject {
  
  /** The group of resources being monitored. Should be only the [GROUP_ID], and not the full-path projects/[PROJECT_ID_OR_NUMBER]/groups/[GROUP_ID]. */
  var groupId: js.UndefOr[String] = js.native
  
  /** The resource type of the group members. */
  var resourceType: js.UndefOr[String] = js.native
}
object ResourceGroup {
  
  @scala.inline
  def apply(): ResourceGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceGroup]
  }
  
  @scala.inline
  implicit class ResourceGroupMutableBuilder[Self <: ResourceGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGroupId(value: String): Self = StObject.set(x, "groupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupIdUndefined: Self = StObject.set(x, "groupId", js.undefined)
    
    @scala.inline
    def setResourceType(value: String): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceTypeUndefined: Self = StObject.set(x, "resourceType", js.undefined)
  }
}
