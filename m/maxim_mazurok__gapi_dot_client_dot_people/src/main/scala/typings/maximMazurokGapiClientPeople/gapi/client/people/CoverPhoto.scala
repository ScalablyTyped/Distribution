package typings.maximMazurokGapiClientPeople.gapi.client.people

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CoverPhoto extends StObject {
  
  /** True if the cover photo is the default cover photo; false if the cover photo is a user-provided cover photo. */
  var default: js.UndefOr[Boolean] = js.undefined
  
  /** Metadata about the cover photo. */
  var metadata: js.UndefOr[FieldMetadata] = js.undefined
  
  /** The URL of the cover photo. */
  var url: js.UndefOr[String] = js.undefined
}
object CoverPhoto {
  
  inline def apply(): CoverPhoto = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CoverPhoto]
  }
  
  extension [Self <: CoverPhoto](x: Self) {
    
    inline def setDefault(value: Boolean): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    
    inline def setMetadata(value: FieldMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
