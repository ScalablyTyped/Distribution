package typings.maximMazurokGapiClientSearchconsole.gapi.client.searchconsole

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceIssue extends StObject {
  
  /** Describes a blocked resource issue. */
  var blockedResource: js.UndefOr[BlockedResource] = js.undefined
}
object ResourceIssue {
  
  @scala.inline
  def apply(): ResourceIssue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceIssue]
  }
  
  @scala.inline
  implicit class ResourceIssueMutableBuilder[Self <: ResourceIssue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlockedResource(value: BlockedResource): Self = StObject.set(x, "blockedResource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlockedResourceUndefined: Self = StObject.set(x, "blockedResource", js.undefined)
  }
}
