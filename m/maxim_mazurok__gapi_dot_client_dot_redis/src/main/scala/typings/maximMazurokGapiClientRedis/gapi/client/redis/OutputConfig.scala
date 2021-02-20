package typings.maximMazurokGapiClientRedis.gapi.client.redis

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OutputConfig extends StObject {
  
  /** Google Cloud Storage destination for output content. */
  var gcsDestination: js.UndefOr[GcsDestination] = js.native
}
object OutputConfig {
  
  @scala.inline
  def apply(): OutputConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OutputConfig]
  }
  
  @scala.inline
  implicit class OutputConfigMutableBuilder[Self <: OutputConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGcsDestination(value: GcsDestination): Self = StObject.set(x, "gcsDestination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGcsDestinationUndefined: Self = StObject.set(x, "gcsDestination", js.undefined)
  }
}
