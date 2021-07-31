package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GitignoreGetTemplateEndpoint extends StObject {
  
  var name: String
}
object GitignoreGetTemplateEndpoint {
  
  @scala.inline
  def apply(name: String): GitignoreGetTemplateEndpoint = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitignoreGetTemplateEndpoint]
  }
  
  @scala.inline
  implicit class GitignoreGetTemplateEndpointMutableBuilder[Self <: GitignoreGetTemplateEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
