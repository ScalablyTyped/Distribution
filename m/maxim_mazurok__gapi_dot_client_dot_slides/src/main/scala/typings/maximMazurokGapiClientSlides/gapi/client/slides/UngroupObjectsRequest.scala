package typings.maximMazurokGapiClientSlides.gapi.client.slides

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UngroupObjectsRequest extends StObject {
  
  /**
    * The object IDs of the objects to ungroup. Only groups that are not inside other groups can be ungrouped. All the groups should be on the same page. The group itself is deleted. The
    * visual sizes and positions of all the children are preserved.
    */
  var objectIds: js.UndefOr[js.Array[String]] = js.undefined
}
object UngroupObjectsRequest {
  
  @scala.inline
  def apply(): UngroupObjectsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UngroupObjectsRequest]
  }
  
  @scala.inline
  implicit class UngroupObjectsRequestMutableBuilder[Self <: UngroupObjectsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setObjectIds(value: js.Array[String]): Self = StObject.set(x, "objectIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectIdsUndefined: Self = StObject.set(x, "objectIds", js.undefined)
    
    @scala.inline
    def setObjectIdsVarargs(value: String*): Self = StObject.set(x, "objectIds", js.Array(value :_*))
  }
}
