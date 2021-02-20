package typings.maximMazurokGapiClientTpu.gapi.client.tpu

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReimageNodeRequest extends StObject {
  
  /** The version for reimage to create. */
  var tensorflowVersion: js.UndefOr[String] = js.native
}
object ReimageNodeRequest {
  
  @scala.inline
  def apply(): ReimageNodeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReimageNodeRequest]
  }
  
  @scala.inline
  implicit class ReimageNodeRequestMutableBuilder[Self <: ReimageNodeRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTensorflowVersion(value: String): Self = StObject.set(x, "tensorflowVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTensorflowVersionUndefined: Self = StObject.set(x, "tensorflowVersion", js.undefined)
  }
}
