package typings.maximMazurokGapiClientTranslate.gapi.client.translate

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GcsDestination extends StObject {
  
  /**
    * Required. The bucket used in 'output_uri_prefix' must exist and there must be no files under 'output_uri_prefix'. 'output_uri_prefix' must end with "/" and start with "gs://". One
    * 'output_uri_prefix' can only be used by one batch translation job at a time. Otherwise an INVALID_ARGUMENT (400) error is returned.
    */
  var outputUriPrefix: js.UndefOr[String] = js.native
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
    def setOutputUriPrefix(value: String): Self = StObject.set(x, "outputUriPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputUriPrefixUndefined: Self = StObject.set(x, "outputUriPrefix", js.undefined)
  }
}
