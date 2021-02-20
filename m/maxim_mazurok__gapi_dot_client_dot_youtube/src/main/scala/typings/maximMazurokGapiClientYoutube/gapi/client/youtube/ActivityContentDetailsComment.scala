package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActivityContentDetailsComment extends StObject {
  
  /** The resourceId object contains information that identifies the resource associated with the comment. */
  var resourceId: js.UndefOr[ResourceId] = js.native
}
object ActivityContentDetailsComment {
  
  @scala.inline
  def apply(): ActivityContentDetailsComment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActivityContentDetailsComment]
  }
  
  @scala.inline
  implicit class ActivityContentDetailsCommentMutableBuilder[Self <: ActivityContentDetailsComment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceId(value: ResourceId): Self = StObject.set(x, "resourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceIdUndefined: Self = StObject.set(x, "resourceId", js.undefined)
  }
}
