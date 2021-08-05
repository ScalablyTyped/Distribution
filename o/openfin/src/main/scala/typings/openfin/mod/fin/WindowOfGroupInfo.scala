package typings.openfin.mod.fin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WindowOfGroupInfo extends StObject {
  
  /**
    * The UUID of the application this window entry belongs to.
    */
  var appUuid: String
  
  /**
    * The name of this window entry.
    */
  var windowName: String
}
object WindowOfGroupInfo {
  
  inline def apply(appUuid: String, windowName: String): WindowOfGroupInfo = {
    val __obj = js.Dynamic.literal(appUuid = appUuid.asInstanceOf[js.Any], windowName = windowName.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowOfGroupInfo]
  }
  
  extension [Self <: WindowOfGroupInfo](x: Self) {
    
    inline def setAppUuid(value: String): Self = StObject.set(x, "appUuid", value.asInstanceOf[js.Any])
    
    inline def setWindowName(value: String): Self = StObject.set(x, "windowName", value.asInstanceOf[js.Any])
  }
}
