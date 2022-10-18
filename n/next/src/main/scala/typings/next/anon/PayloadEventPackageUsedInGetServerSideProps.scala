package typings.next.anon

import typings.next.distTelemetryEventsBuildMod.EventPackageUsedInGetServerSideProps_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PayloadEventPackageUsedInGetServerSideProps extends StObject {
  
  var eventName: String
  
  var payload: EventPackageUsedInGetServerSideProps_
}
object PayloadEventPackageUsedInGetServerSideProps {
  
  inline def apply(eventName: String, payload: EventPackageUsedInGetServerSideProps_): PayloadEventPackageUsedInGetServerSideProps = {
    val __obj = js.Dynamic.literal(eventName = eventName.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
    __obj.asInstanceOf[PayloadEventPackageUsedInGetServerSideProps]
  }
  
  extension [Self <: PayloadEventPackageUsedInGetServerSideProps](x: Self) {
    
    inline def setEventName(value: String): Self = StObject.set(x, "eventName", value.asInstanceOf[js.Any])
    
    inline def setPayload(value: EventPackageUsedInGetServerSideProps_): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
  }
}
