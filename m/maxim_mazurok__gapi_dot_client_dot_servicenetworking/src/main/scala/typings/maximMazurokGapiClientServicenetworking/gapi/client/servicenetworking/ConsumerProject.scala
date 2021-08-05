package typings.maximMazurokGapiClientServicenetworking.gapi.client.servicenetworking

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConsumerProject extends StObject {
  
  /**
    * Required. Project number of the consumer that is launching the service instance. It can own the network that is peered with Google or, be a service project in an XPN where the host
    * project has the network.
    */
  var projectNum: js.UndefOr[String] = js.undefined
}
object ConsumerProject {
  
  inline def apply(): ConsumerProject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConsumerProject]
  }
  
  extension [Self <: ConsumerProject](x: Self) {
    
    inline def setProjectNum(value: String): Self = StObject.set(x, "projectNum", value.asInstanceOf[js.Any])
    
    inline def setProjectNumUndefined: Self = StObject.set(x, "projectNum", js.undefined)
  }
}
