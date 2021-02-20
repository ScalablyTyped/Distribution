package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActivityContentDetailsBulletin extends StObject {
  
  /** The resourceId object contains information that identifies the resource associated with a bulletin post. @mutable youtube.activities.insert */
  var resourceId: js.UndefOr[ResourceId] = js.native
}
object ActivityContentDetailsBulletin {
  
  @scala.inline
  def apply(): ActivityContentDetailsBulletin = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActivityContentDetailsBulletin]
  }
  
  @scala.inline
  implicit class ActivityContentDetailsBulletinMutableBuilder[Self <: ActivityContentDetailsBulletin] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceId(value: ResourceId): Self = StObject.set(x, "resourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceIdUndefined: Self = StObject.set(x, "resourceId", js.undefined)
  }
}
