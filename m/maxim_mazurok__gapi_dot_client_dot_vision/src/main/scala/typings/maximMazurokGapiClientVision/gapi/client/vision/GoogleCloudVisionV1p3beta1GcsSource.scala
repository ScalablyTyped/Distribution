package typings.maximMazurokGapiClientVision.gapi.client.vision

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudVisionV1p3beta1GcsSource extends StObject {
  
  /** Google Cloud Storage URI for the input file. This must only be a Google Cloud Storage object. Wildcards are not currently supported. */
  var uri: js.UndefOr[String] = js.undefined
}
object GoogleCloudVisionV1p3beta1GcsSource {
  
  @scala.inline
  def apply(): GoogleCloudVisionV1p3beta1GcsSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVisionV1p3beta1GcsSource]
  }
  
  @scala.inline
  implicit class GoogleCloudVisionV1p3beta1GcsSourceMutableBuilder[Self <: GoogleCloudVisionV1p3beta1GcsSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
  }
}
