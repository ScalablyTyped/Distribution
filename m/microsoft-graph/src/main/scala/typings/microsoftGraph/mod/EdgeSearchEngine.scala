package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EdgeSearchEngine
  extends StObject
     with EdgeSearchEngineBase {
  
  /**
    * Allows IT admins to set a predefined default search engine for MDM-Controlled devices. Possible values are: default,
    * bing.
    */
  var edgeSearchEngineType: js.UndefOr[EdgeSearchEngineType] = js.undefined
}
object EdgeSearchEngine {
  
  inline def apply(): EdgeSearchEngine = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EdgeSearchEngine]
  }
  
  extension [Self <: EdgeSearchEngine](x: Self) {
    
    inline def setEdgeSearchEngineType(value: EdgeSearchEngineType): Self = StObject.set(x, "edgeSearchEngineType", value.asInstanceOf[js.Any])
    
    inline def setEdgeSearchEngineTypeUndefined: Self = StObject.set(x, "edgeSearchEngineType", js.undefined)
  }
}
