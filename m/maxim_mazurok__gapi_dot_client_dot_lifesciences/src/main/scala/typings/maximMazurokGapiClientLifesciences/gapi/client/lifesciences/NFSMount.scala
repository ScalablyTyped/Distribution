package typings.maximMazurokGapiClientLifesciences.gapi.client.lifesciences

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NFSMount extends StObject {
  
  /** A target NFS mount. The target must be specified as `address:/mount". */
  var target: js.UndefOr[String] = js.undefined
}
object NFSMount {
  
  inline def apply(): NFSMount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NFSMount]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NFSMount] (val x: Self) extends AnyVal {
    
    inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
