package typings.maximMazurokGapiClientPeople.gapi.client.people

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Tagline extends StObject {
  
  /** Metadata about the tagline. */
  var metadata: js.UndefOr[FieldMetadata] = js.undefined
  
  /** The tagline. */
  var value: js.UndefOr[String] = js.undefined
}
object Tagline {
  
  inline def apply(): Tagline = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Tagline]
  }
  
  extension [Self <: Tagline](x: Self) {
    
    inline def setMetadata(value: FieldMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
