package typings.maximMazurokGapiClientTagmanager.gapi.client.tagmanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RevertTagResponse extends StObject {
  
  /**
    * Tag as it appears in the latest container version since the last workspace synchronization operation. If no tag is present, that means the tag was deleted in the latest container
    * version.
    */
  var tag: js.UndefOr[Tag] = js.undefined
}
object RevertTagResponse {
  
  inline def apply(): RevertTagResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RevertTagResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RevertTagResponse] (val x: Self) extends AnyVal {
    
    inline def setTag(value: Tag): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
  }
}
