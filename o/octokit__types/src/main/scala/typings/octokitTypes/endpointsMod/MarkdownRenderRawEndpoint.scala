package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Contenttype
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MarkdownRenderRawEndpoint extends StObject {
  
  /**
    * data parameter
    */
  var data: String = js.native
  
  var headers: Contenttype = js.native
}
object MarkdownRenderRawEndpoint {
  
  @scala.inline
  def apply(data: String, headers: Contenttype): MarkdownRenderRawEndpoint = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarkdownRenderRawEndpoint]
  }
  
  @scala.inline
  implicit class MarkdownRenderRawEndpointMutableBuilder[Self <: MarkdownRenderRawEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaders(value: Contenttype): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
