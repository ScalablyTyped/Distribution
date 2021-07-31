package typings.maximMazurokGapiClientMl.gapi.client.ml

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudMlV1ListStudiesResponse extends StObject {
  
  /** The studies associated with the project. */
  var studies: js.UndefOr[js.Array[GoogleCloudMlV1Study]] = js.undefined
}
object GoogleCloudMlV1ListStudiesResponse {
  
  @scala.inline
  def apply(): GoogleCloudMlV1ListStudiesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudMlV1ListStudiesResponse]
  }
  
  @scala.inline
  implicit class GoogleCloudMlV1ListStudiesResponseMutableBuilder[Self <: GoogleCloudMlV1ListStudiesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStudies(value: js.Array[GoogleCloudMlV1Study]): Self = StObject.set(x, "studies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStudiesUndefined: Self = StObject.set(x, "studies", js.undefined)
    
    @scala.inline
    def setStudiesVarargs(value: GoogleCloudMlV1Study*): Self = StObject.set(x, "studies", js.Array(value :_*))
  }
}
