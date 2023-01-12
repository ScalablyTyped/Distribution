package typings.maximMazurokGapiClientToolresults.gapi.client.toolresults

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UsedRoboDirective extends StObject {
  
  /** The name of the resource that was used. */
  var resourceName: js.UndefOr[String] = js.undefined
}
object UsedRoboDirective {
  
  inline def apply(): UsedRoboDirective = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UsedRoboDirective]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UsedRoboDirective] (val x: Self) extends AnyVal {
    
    inline def setResourceName(value: String): Self = StObject.set(x, "resourceName", value.asInstanceOf[js.Any])
    
    inline def setResourceNameUndefined: Self = StObject.set(x, "resourceName", js.undefined)
  }
}
