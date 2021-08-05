package typings.maximMazurokGapiClientPeople.gapi.client.people

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Residence extends StObject {
  
  /** True if the residence is the person's current residence; false if the residence is a past residence. */
  var current: js.UndefOr[Boolean] = js.undefined
  
  /** Metadata about the residence. */
  var metadata: js.UndefOr[FieldMetadata] = js.undefined
  
  /** The address of the residence. */
  var value: js.UndefOr[String] = js.undefined
}
object Residence {
  
  inline def apply(): Residence = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Residence]
  }
  
  extension [Self <: Residence](x: Self) {
    
    inline def setCurrent(value: Boolean): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
    
    inline def setCurrentUndefined: Self = StObject.set(x, "current", js.undefined)
    
    inline def setMetadata(value: FieldMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
