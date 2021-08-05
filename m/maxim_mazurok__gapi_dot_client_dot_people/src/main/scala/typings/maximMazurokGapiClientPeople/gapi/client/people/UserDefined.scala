package typings.maximMazurokGapiClientPeople.gapi.client.people

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserDefined extends StObject {
  
  /** The end user specified key of the user defined data. */
  var key: js.UndefOr[String] = js.undefined
  
  /** Metadata about the user defined data. */
  var metadata: js.UndefOr[FieldMetadata] = js.undefined
  
  /** The end user specified value of the user defined data. */
  var value: js.UndefOr[String] = js.undefined
}
object UserDefined {
  
  inline def apply(): UserDefined = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserDefined]
  }
  
  extension [Self <: UserDefined](x: Self) {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setMetadata(value: FieldMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
