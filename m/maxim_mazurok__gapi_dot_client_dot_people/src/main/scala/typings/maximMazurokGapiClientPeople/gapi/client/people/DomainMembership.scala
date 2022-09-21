package typings.maximMazurokGapiClientPeople.gapi.client.people

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DomainMembership extends StObject {
  
  /** True if the person is in the viewer's Google Workspace domain. */
  var inViewerDomain: js.UndefOr[Boolean] = js.undefined
}
object DomainMembership {
  
  inline def apply(): DomainMembership = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DomainMembership]
  }
  
  extension [Self <: DomainMembership](x: Self) {
    
    inline def setInViewerDomain(value: Boolean): Self = StObject.set(x, "inViewerDomain", value.asInstanceOf[js.Any])
    
    inline def setInViewerDomainUndefined: Self = StObject.set(x, "inViewerDomain", js.undefined)
  }
}
