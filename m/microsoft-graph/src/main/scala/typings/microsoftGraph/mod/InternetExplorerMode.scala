package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InternetExplorerMode
  extends StObject
     with Entity {
  
  // A collection of site lists to support Internet Explorer mode.
  var siteLists: js.UndefOr[NullableOption[js.Array[BrowserSiteList]]] = js.undefined
}
object InternetExplorerMode {
  
  inline def apply(): InternetExplorerMode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InternetExplorerMode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InternetExplorerMode] (val x: Self) extends AnyVal {
    
    inline def setSiteLists(value: NullableOption[js.Array[BrowserSiteList]]): Self = StObject.set(x, "siteLists", value.asInstanceOf[js.Any])
    
    inline def setSiteListsNull: Self = StObject.set(x, "siteLists", null)
    
    inline def setSiteListsUndefined: Self = StObject.set(x, "siteLists", js.undefined)
    
    inline def setSiteListsVarargs(value: BrowserSiteList*): Self = StObject.set(x, "siteLists", js.Array(value*))
  }
}
