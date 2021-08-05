package typings.openfin.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppUuid extends StObject {
  
  var appUuid: String
  
  var windowName: String
}
object AppUuid {
  
  inline def apply(appUuid: String, windowName: String): AppUuid = {
    val __obj = js.Dynamic.literal(appUuid = appUuid.asInstanceOf[js.Any], windowName = windowName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppUuid]
  }
  
  extension [Self <: AppUuid](x: Self) {
    
    inline def setAppUuid(value: String): Self = StObject.set(x, "appUuid", value.asInstanceOf[js.Any])
    
    inline def setWindowName(value: String): Self = StObject.set(x, "windowName", value.asInstanceOf[js.Any])
  }
}
