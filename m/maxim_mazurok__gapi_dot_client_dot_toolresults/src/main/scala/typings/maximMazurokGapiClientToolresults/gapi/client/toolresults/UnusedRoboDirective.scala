package typings.maximMazurokGapiClientToolresults.gapi.client.toolresults

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnusedRoboDirective extends StObject {
  
  /** The name of the resource that was unused. */
  var resourceName: js.UndefOr[String] = js.undefined
}
object UnusedRoboDirective {
  
  inline def apply(): UnusedRoboDirective = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnusedRoboDirective]
  }
  
  extension [Self <: UnusedRoboDirective](x: Self) {
    
    inline def setResourceName(value: String): Self = StObject.set(x, "resourceName", value.asInstanceOf[js.Any])
    
    inline def setResourceNameUndefined: Self = StObject.set(x, "resourceName", js.undefined)
  }
}
