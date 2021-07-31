package typings.maximMazurokGapiClientPeople.gapi.client.people

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Photo extends StObject {
  
  /** True if the photo is a default photo; false if the photo is a user-provided photo. */
  var default: js.UndefOr[Boolean] = js.undefined
  
  /** Metadata about the photo. */
  var metadata: js.UndefOr[FieldMetadata] = js.undefined
  
  /**
    * The URL of the photo. You can change the desired size by appending a query parameter `sz={size}` at the end of the url, where {size} is the size in pixels. Example:
    * https://lh3.googleusercontent.com/-T_wVWLlmg7w/AAAAAAAAAAI/AAAAAAAABa8/00gzXvDBYqw/s100/photo.jpg?sz=50
    */
  var url: js.UndefOr[String] = js.undefined
}
object Photo {
  
  @scala.inline
  def apply(): Photo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Photo]
  }
  
  @scala.inline
  implicit class PhotoMutableBuilder[Self <: Photo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefault(value: Boolean): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    
    @scala.inline
    def setMetadata(value: FieldMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
