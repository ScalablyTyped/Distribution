package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PullsMergeResponse405Data extends StObject {
  
  var documentation_url: String
  
  var message: String
}
object PullsMergeResponse405Data {
  
  @scala.inline
  def apply(documentation_url: String, message: String): PullsMergeResponse405Data = {
    val __obj = js.Dynamic.literal(documentation_url = documentation_url.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[PullsMergeResponse405Data]
  }
  
  @scala.inline
  implicit class PullsMergeResponse405DataMutableBuilder[Self <: PullsMergeResponse405Data] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDocumentation_url(value: String): Self = StObject.set(x, "documentation_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
