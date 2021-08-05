package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Contenttype
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MarkdownRenderRawEndpoint extends StObject {
  
  /**
    * data parameter
    */
  var data: String
  
  var headers: Contenttype
}
object MarkdownRenderRawEndpoint {
  
  inline def apply(data: String, headers: Contenttype): MarkdownRenderRawEndpoint = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarkdownRenderRawEndpoint]
  }
  
  extension [Self <: MarkdownRenderRawEndpoint](x: Self) {
    
    inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Contenttype): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
