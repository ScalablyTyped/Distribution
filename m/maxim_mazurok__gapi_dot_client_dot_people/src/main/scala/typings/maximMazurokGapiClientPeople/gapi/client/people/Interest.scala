package typings.maximMazurokGapiClientPeople.gapi.client.people

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Interest extends StObject {
  
  /** Metadata about the interest. */
  var metadata: js.UndefOr[FieldMetadata] = js.undefined
  
  /** The interest; for example, `stargazing`. */
  var value: js.UndefOr[String] = js.undefined
}
object Interest {
  
  inline def apply(): Interest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Interest]
  }
  
  extension [Self <: Interest](x: Self) {
    
    inline def setMetadata(value: FieldMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
