package typings.maximMazurokGapiClientRun.gapi.client.run

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudRunV2ExecutionReference extends StObject {
  
  /** Creation timestamp of the execution. */
  var completionTime: js.UndefOr[String] = js.undefined
  
  /** Creation timestamp of the execution. */
  var createTime: js.UndefOr[String] = js.undefined
  
  /** Name of the execution. */
  var name: js.UndefOr[String] = js.undefined
}
object GoogleCloudRunV2ExecutionReference {
  
  inline def apply(): GoogleCloudRunV2ExecutionReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudRunV2ExecutionReference]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleCloudRunV2ExecutionReference] (val x: Self) extends AnyVal {
    
    inline def setCompletionTime(value: String): Self = StObject.set(x, "completionTime", value.asInstanceOf[js.Any])
    
    inline def setCompletionTimeUndefined: Self = StObject.set(x, "completionTime", js.undefined)
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
