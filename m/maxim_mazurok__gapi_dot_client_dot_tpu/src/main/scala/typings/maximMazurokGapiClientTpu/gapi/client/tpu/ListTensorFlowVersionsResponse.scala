package typings.maximMazurokGapiClientTpu.gapi.client.tpu

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTensorFlowVersionsResponse extends StObject {
  
  /** The next page token or empty if none. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** The listed nodes. */
  var tensorflowVersions: js.UndefOr[js.Array[TensorFlowVersion]] = js.undefined
  
  /** Locations that could not be reached. */
  var unreachable: js.UndefOr[js.Array[String]] = js.undefined
}
object ListTensorFlowVersionsResponse {
  
  inline def apply(): ListTensorFlowVersionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTensorFlowVersionsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListTensorFlowVersionsResponse] (val x: Self) extends AnyVal {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setTensorflowVersions(value: js.Array[TensorFlowVersion]): Self = StObject.set(x, "tensorflowVersions", value.asInstanceOf[js.Any])
    
    inline def setTensorflowVersionsUndefined: Self = StObject.set(x, "tensorflowVersions", js.undefined)
    
    inline def setTensorflowVersionsVarargs(value: TensorFlowVersion*): Self = StObject.set(x, "tensorflowVersions", js.Array(value*))
    
    inline def setUnreachable(value: js.Array[String]): Self = StObject.set(x, "unreachable", value.asInstanceOf[js.Any])
    
    inline def setUnreachableUndefined: Self = StObject.set(x, "unreachable", js.undefined)
    
    inline def setUnreachableVarargs(value: String*): Self = StObject.set(x, "unreachable", js.Array(value*))
  }
}
