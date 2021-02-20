package typings.maximMazurokGapiClientFirestore.gapi.client.firestore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WriteResult extends StObject {
  
  /** The results of applying each DocumentTransform.FieldTransform, in the same order. */
  var transformResults: js.UndefOr[js.Array[Value]] = js.native
  
  /** The last update time of the document after applying the write. Not set after a `delete`. If the write did not actually change the document, this will be the previous update_time. */
  var updateTime: js.UndefOr[String] = js.native
}
object WriteResult {
  
  @scala.inline
  def apply(): WriteResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WriteResult]
  }
  
  @scala.inline
  implicit class WriteResultMutableBuilder[Self <: WriteResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTransformResults(value: js.Array[Value]): Self = StObject.set(x, "transformResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransformResultsUndefined: Self = StObject.set(x, "transformResults", js.undefined)
    
    @scala.inline
    def setTransformResultsVarargs(value: Value*): Self = StObject.set(x, "transformResults", js.Array(value :_*))
    
    @scala.inline
    def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
