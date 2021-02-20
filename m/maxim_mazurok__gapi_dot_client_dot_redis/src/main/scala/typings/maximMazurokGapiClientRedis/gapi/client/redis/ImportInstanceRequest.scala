package typings.maximMazurokGapiClientRedis.gapi.client.redis

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImportInstanceRequest extends StObject {
  
  /** Required. Specify data to be imported. */
  var inputConfig: js.UndefOr[InputConfig] = js.native
}
object ImportInstanceRequest {
  
  @scala.inline
  def apply(): ImportInstanceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImportInstanceRequest]
  }
  
  @scala.inline
  implicit class ImportInstanceRequestMutableBuilder[Self <: ImportInstanceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInputConfig(value: InputConfig): Self = StObject.set(x, "inputConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputConfigUndefined: Self = StObject.set(x, "inputConfig", js.undefined)
  }
}
