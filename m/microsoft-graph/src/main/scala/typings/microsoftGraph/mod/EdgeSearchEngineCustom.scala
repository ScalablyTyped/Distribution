package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EdgeSearchEngineCustom extends EdgeSearchEngineBase {
  
  /**
    * Points to a https link containing the OpenSearch xml file that contains, at minimum, the short name and the URL to the
    * search Engine.
    */
  var edgeSearchEngineOpenSearchXmlUrl: js.UndefOr[String] = js.native
}
object EdgeSearchEngineCustom {
  
  @scala.inline
  def apply(): EdgeSearchEngineCustom = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EdgeSearchEngineCustom]
  }
  
  @scala.inline
  implicit class EdgeSearchEngineCustomMutableBuilder[Self <: EdgeSearchEngineCustom] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEdgeSearchEngineOpenSearchXmlUrl(value: String): Self = StObject.set(x, "edgeSearchEngineOpenSearchXmlUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEdgeSearchEngineOpenSearchXmlUrlUndefined: Self = StObject.set(x, "edgeSearchEngineOpenSearchXmlUrl", js.undefined)
  }
}
