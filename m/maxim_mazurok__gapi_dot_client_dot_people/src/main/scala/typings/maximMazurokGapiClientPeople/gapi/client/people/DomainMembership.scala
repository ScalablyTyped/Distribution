package typings.maximMazurokGapiClientPeople.gapi.client.people

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DomainMembership extends StObject {
  
  /** True if the person is in the viewer's G Suite domain. */
  var inViewerDomain: js.UndefOr[Boolean] = js.undefined
}
object DomainMembership {
  
  @scala.inline
  def apply(): DomainMembership = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DomainMembership]
  }
  
  @scala.inline
  implicit class DomainMembershipMutableBuilder[Self <: DomainMembership] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInViewerDomain(value: Boolean): Self = StObject.set(x, "inViewerDomain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInViewerDomainUndefined: Self = StObject.set(x, "inViewerDomain", js.undefined)
  }
}
