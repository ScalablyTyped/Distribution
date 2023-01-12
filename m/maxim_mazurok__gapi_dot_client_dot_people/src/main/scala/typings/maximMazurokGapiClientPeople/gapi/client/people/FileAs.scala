package typings.maximMazurokGapiClientPeople.gapi.client.people

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileAs extends StObject {
  
  /** Metadata about the file-as. */
  var metadata: js.UndefOr[FieldMetadata] = js.undefined
  
  /** The file-as value */
  var value: js.UndefOr[String] = js.undefined
}
object FileAs {
  
  inline def apply(): FileAs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileAs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FileAs] (val x: Self) extends AnyVal {
    
    inline def setMetadata(value: FieldMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
