package typings.maximMazurokGapiClientTpu.gapi.client.tpu

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListAcceleratorTypesResponse extends StObject {
  
  /** The listed nodes. */
  var acceleratorTypes: js.UndefOr[js.Array[AcceleratorType]] = js.native
  
  /** The next page token or empty if none. */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /** Locations that could not be reached. */
  var unreachable: js.UndefOr[js.Array[String]] = js.native
}
object ListAcceleratorTypesResponse {
  
  @scala.inline
  def apply(): ListAcceleratorTypesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAcceleratorTypesResponse]
  }
  
  @scala.inline
  implicit class ListAcceleratorTypesResponseMutableBuilder[Self <: ListAcceleratorTypesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAcceleratorTypes(value: js.Array[AcceleratorType]): Self = StObject.set(x, "acceleratorTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcceleratorTypesUndefined: Self = StObject.set(x, "acceleratorTypes", js.undefined)
    
    @scala.inline
    def setAcceleratorTypesVarargs(value: AcceleratorType*): Self = StObject.set(x, "acceleratorTypes", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setUnreachable(value: js.Array[String]): Self = StObject.set(x, "unreachable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnreachableUndefined: Self = StObject.set(x, "unreachable", js.undefined)
    
    @scala.inline
    def setUnreachableVarargs(value: String*): Self = StObject.set(x, "unreachable", js.Array(value :_*))
  }
}
