package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Edge
  extends StObject
     with Entity {
  
  // A container for Internet Explorer mode resources.
  var internetExplorerMode: js.UndefOr[NullableOption[InternetExplorerMode]] = js.undefined
}
object Edge {
  
  inline def apply(): Edge = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Edge]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Edge] (val x: Self) extends AnyVal {
    
    inline def setInternetExplorerMode(value: NullableOption[InternetExplorerMode]): Self = StObject.set(x, "internetExplorerMode", value.asInstanceOf[js.Any])
    
    inline def setInternetExplorerModeNull: Self = StObject.set(x, "internetExplorerMode", null)
    
    inline def setInternetExplorerModeUndefined: Self = StObject.set(x, "internetExplorerMode", js.undefined)
  }
}
