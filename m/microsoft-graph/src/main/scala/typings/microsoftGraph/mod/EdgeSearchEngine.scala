package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EdgeSearchEngine extends EdgeSearchEngineBase {
  
  /**
    * Allows IT admins to set a predefined default search engine for MDM-Controlled devices. Possible values are: default,
    * bing.
    */
  var edgeSearchEngineType: js.UndefOr[EdgeSearchEngineType] = js.native
}
object EdgeSearchEngine {
  
  @scala.inline
  def apply(): EdgeSearchEngine = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EdgeSearchEngine]
  }
  
  @scala.inline
  implicit class EdgeSearchEngineMutableBuilder[Self <: EdgeSearchEngine] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEdgeSearchEngineType(value: EdgeSearchEngineType): Self = StObject.set(x, "edgeSearchEngineType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEdgeSearchEngineTypeUndefined: Self = StObject.set(x, "edgeSearchEngineType", js.undefined)
  }
}
