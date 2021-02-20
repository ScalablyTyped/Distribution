package typings.maximMazurokGapiClientSlides.gapi.client.slides

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateVideoRequest extends StObject {
  
  /**
    * The element properties for the video. The PageElementProperties.size property is optional. If you don't specify a size, a default size is chosen by the server. The
    * PageElementProperties.transform property is optional. The transform must not have shear components. If you don't specify a transform, the video will be placed at the top left corner
    * of the page.
    */
  var elementProperties: js.UndefOr[PageElementProperties] = js.native
  
  /**
    * The video source's unique identifier for this video. e.g. For YouTube video https://www.youtube.com/watch?v=7U3axjORYZ0, the ID is 7U3axjORYZ0. For a Google Drive video
    * https://drive.google.com/file/d/1xCgQLFTJi5_Xl8DgW_lcUYq5e-q6Hi5Q the ID is 1xCgQLFTJi5_Xl8DgW_lcUYq5e-q6Hi5Q.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * A user-supplied object ID. If you specify an ID, it must be unique among all pages and page elements in the presentation. The ID must start with an alphanumeric character or an
    * underscore (matches regex `[a-zA-Z0-9_]`); remaining characters may include those as well as a hyphen or colon (matches regex `[a-zA-Z0-9_-:]`). The length of the ID must not be
    * less than 5 or greater than 50. If you don't specify an ID, a unique one is generated.
    */
  var objectId: js.UndefOr[String] = js.native
  
  /** The video source. */
  var source: js.UndefOr[String] = js.native
}
object CreateVideoRequest {
  
  @scala.inline
  def apply(): CreateVideoRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateVideoRequest]
  }
  
  @scala.inline
  implicit class CreateVideoRequestMutableBuilder[Self <: CreateVideoRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setElementProperties(value: PageElementProperties): Self = StObject.set(x, "elementProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementPropertiesUndefined: Self = StObject.set(x, "elementProperties", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
    
    @scala.inline
    def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}
