package typings.maximMazurokGapiClientPeople.gapi.client.people

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CoverPhoto extends StObject {
  
  /** True if the cover photo is the default cover photo; false if the cover photo is a user-provided cover photo. */
  var default: js.UndefOr[Boolean] = js.native
  
  /** Metadata about the cover photo. */
  var metadata: js.UndefOr[FieldMetadata] = js.native
  
  /** The URL of the cover photo. */
  var url: js.UndefOr[String] = js.native
}
object CoverPhoto {
  
  @scala.inline
  def apply(): CoverPhoto = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CoverPhoto]
  }
  
  @scala.inline
  implicit class CoverPhotoMutableBuilder[Self <: CoverPhoto] (val x: Self) extends AnyVal {
    
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
