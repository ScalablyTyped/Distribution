package typings.maximMazurokGapiClientRedis.gapi.client.redis

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GcsDestination extends StObject {
  
  /** Required. Data destination URI (e.g. 'gs://my_bucket/my_object'). Existing files will be overwritten. */
  var uri: js.UndefOr[String] = js.native
}
object GcsDestination {
  
  @scala.inline
  def apply(): GcsDestination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GcsDestination]
  }
  
  @scala.inline
  implicit class GcsDestinationMutableBuilder[Self <: GcsDestination] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
  }
}
