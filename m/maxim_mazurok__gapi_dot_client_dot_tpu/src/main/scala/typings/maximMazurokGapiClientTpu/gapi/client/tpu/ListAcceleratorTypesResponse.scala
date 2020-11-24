package typings.maximMazurokGapiClientTpu.gapi.client.tpu

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListAcceleratorTypesResponse extends js.Object {
  
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
  implicit class ListAcceleratorTypesResponseOps[Self <: ListAcceleratorTypesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAcceleratorTypesVarargs(value: AcceleratorType*): Self = this.set("acceleratorTypes", js.Array(value :_*))
    
    @scala.inline
    def setAcceleratorTypes(value: js.Array[AcceleratorType]): Self = this.set("acceleratorTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAcceleratorTypes: Self = this.set("acceleratorTypes", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
    
    @scala.inline
    def setUnreachableVarargs(value: String*): Self = this.set("unreachable", js.Array(value :_*))
    
    @scala.inline
    def setUnreachable(value: js.Array[String]): Self = this.set("unreachable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnreachable: Self = this.set("unreachable", js.undefined)
  }
}
