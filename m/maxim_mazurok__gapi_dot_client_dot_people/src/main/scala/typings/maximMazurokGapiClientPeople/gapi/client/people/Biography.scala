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
  
  @scala.inline
  def apply(): Biography = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Biography]
  }
  
  @scala.inline
  implicit class BiographyMutableBuilder[Self <: Biography] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
    @scala.inline
    def setMetadata(value: FieldMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
