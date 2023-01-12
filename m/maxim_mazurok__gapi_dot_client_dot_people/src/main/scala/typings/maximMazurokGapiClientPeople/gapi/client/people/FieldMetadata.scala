package typings.maximMazurokGapiClientPeople.gapi.client.people

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FieldMetadata extends StObject {
  
  /** Output only. True if the field is the primary field for all sources in the person. Each person will have at most one field with `primary` set to true. */
  var primary: js.UndefOr[Boolean] = js.undefined
  
  /** The source of the field. */
  var source: js.UndefOr[Source] = js.undefined
  
  /** True if the field is the primary field for the source. Each source must have at most one field with `source_primary` set to true. */
  var sourcePrimary: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Output only. True if the field is verified; false if the field is unverified. A verified field is typically a name, email address, phone number, or website that has been confirmed
    * to be owned by the person.
    */
  var verified: js.UndefOr[Boolean] = js.undefined
}
object FieldMetadata {
  
  inline def apply(): FieldMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FieldMetadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FieldMetadata] (val x: Self) extends AnyVal {
    
    inline def setPrimary(value: Boolean): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
    
    inline def setPrimaryUndefined: Self = StObject.set(x, "primary", js.undefined)
    
    inline def setSource(value: Source): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourcePrimary(value: Boolean): Self = StObject.set(x, "sourcePrimary", value.asInstanceOf[js.Any])
    
    inline def setSourcePrimaryUndefined: Self = StObject.set(x, "sourcePrimary", js.undefined)
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setVerified(value: Boolean): Self = StObject.set(x, "verified", value.asInstanceOf[js.Any])
    
    inline def setVerifiedUndefined: Self = StObject.set(x, "verified", js.undefined)
  }
}
