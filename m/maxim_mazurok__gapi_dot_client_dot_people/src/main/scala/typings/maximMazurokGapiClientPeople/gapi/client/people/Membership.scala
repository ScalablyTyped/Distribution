package typings.maximMazurokGapiClientPeople.gapi.client.people

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Membership extends StObject {
  
  /** The contact group membership. */
  var contactGroupMembership: js.UndefOr[ContactGroupMembership] = js.undefined
  
  /** Output only. The domain membership. */
  var domainMembership: js.UndefOr[DomainMembership] = js.undefined
  
  /** Metadata about the membership. */
  var metadata: js.UndefOr[FieldMetadata] = js.undefined
}
object Membership {
  
  @scala.inline
  def apply(): Membership = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Membership]
  }
  
  @scala.inline
  implicit class MembershipMutableBuilder[Self <: Membership] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContactGroupMembership(value: ContactGroupMembership): Self = StObject.set(x, "contactGroupMembership", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContactGroupMembershipUndefined: Self = StObject.set(x, "contactGroupMembership", js.undefined)
    
    @scala.inline
    def setDomainMembership(value: DomainMembership): Self = StObject.set(x, "domainMembership", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainMembershipUndefined: Self = StObject.set(x, "domainMembership", js.undefined)
    
    @scala.inline
    def setMetadata(value: FieldMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
  }
}
