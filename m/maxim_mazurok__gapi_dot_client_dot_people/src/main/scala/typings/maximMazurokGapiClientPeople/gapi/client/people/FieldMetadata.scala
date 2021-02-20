package typings.maximMazurokGapiClientPeople.gapi.client.people

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FieldMetadata extends StObject {
  
  /** True if the field is the primary field; false if the field is a secondary field. */
  var primary: js.UndefOr[Boolean] = js.native
  
  /** The source of the field. */
  var source: js.UndefOr[Source] = js.native
  
  /**
    * Output only. True if the field is verified; false if the field is unverified. A verified field is typically a name, email address, phone number, or website that has been confirmed
    * to be owned by the person.
    */
  var verified: js.UndefOr[Boolean] = js.native
}
object FieldMetadata {
  
  @scala.inline
  def apply(): FieldMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FieldMetadata]
  }
  
  @scala.inline
  implicit class FieldMetadataMutableBuilder[Self <: FieldMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPrimary(value: Boolean): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrimaryUndefined: Self = StObject.set(x, "primary", js.undefined)
    
    @scala.inline
    def setSource(value: Source): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    @scala.inline
    def setVerified(value: Boolean): Self = StObject.set(x, "verified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerifiedUndefined: Self = StObject.set(x, "verified", js.undefined)
  }
}
