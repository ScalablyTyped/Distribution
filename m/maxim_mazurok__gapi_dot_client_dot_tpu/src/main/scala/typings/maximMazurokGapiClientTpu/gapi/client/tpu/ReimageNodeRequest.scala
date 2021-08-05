package typings.maximMazurokGapiClientTpu.gapi.client.tpu

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReimageNodeRequest extends StObject {
  
  /** The version for reimage to create. */
  var tensorflowVersion: js.UndefOr[String] = js.undefined
}
object ReimageNodeRequest {
  
  inline def apply(): ReimageNodeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReimageNodeRequest]
  }
  
  extension [Self <: ReimageNodeRequest](x: Self) {
    
    inline def setTensorflowVersion(value: String): Self = StObject.set(x, "tensorflowVersion", value.asInstanceOf[js.Any])
    
    inline def setTensorflowVersionUndefined: Self = StObject.set(x, "tensorflowVersion", js.undefined)
  }
}
