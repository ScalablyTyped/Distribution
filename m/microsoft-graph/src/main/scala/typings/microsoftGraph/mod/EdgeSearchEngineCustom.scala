package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EdgeSearchEngineCustom
  extends StObject
     with EdgeSearchEngineBase {
  
  /**
    * Points to a https link containing the OpenSearch xml file that contains, at minimum, the short name and the URL to the
    * search Engine.
    */
  var edgeSearchEngineOpenSearchXmlUrl: js.UndefOr[String] = js.undefined
}
object EdgeSearchEngineCustom {
  
  inline def apply(): EdgeSearchEngineCustom = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EdgeSearchEngineCustom]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EdgeSearchEngineCustom] (val x: Self) extends AnyVal {
    
    inline def setEdgeSearchEngineOpenSearchXmlUrl(value: String): Self = StObject.set(x, "edgeSearchEngineOpenSearchXmlUrl", value.asInstanceOf[js.Any])
    
    inline def setEdgeSearchEngineOpenSearchXmlUrlUndefined: Self = StObject.set(x, "edgeSearchEngineOpenSearchXmlUrl", js.undefined)
  }
}
