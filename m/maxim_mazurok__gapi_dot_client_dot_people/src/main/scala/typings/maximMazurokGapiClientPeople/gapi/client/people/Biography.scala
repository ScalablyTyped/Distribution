package typings.maximMazurokGapiClientPeople.gapi.client.people

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Biography extends StObject {
  
  /** The content type of the biography. */
  var contentType: js.UndefOr[String] = js.undefined
  
  /** Metadata about the biography. */
  var metadata: js.UndefOr[FieldMetadata] = js.undefined
  
  /** The short biography. */
  var value: js.UndefOr[String] = js.undefined
}
object Biography {
  
  inline def apply(): Biography = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Biography]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Biography] (val x: Self) extends AnyVal {
    
    inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    inline def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
    inline def setMetadata(value: FieldMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
