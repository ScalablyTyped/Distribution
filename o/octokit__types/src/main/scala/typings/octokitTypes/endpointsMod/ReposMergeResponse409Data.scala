package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReposMergeResponse409Data extends StObject {
  
  var message: String = js.native
}
object ReposMergeResponse409Data {
  
  @scala.inline
  def apply(message: String): ReposMergeResponse409Data = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposMergeResponse409Data]
  }
  
  @scala.inline
  implicit class ReposMergeResponse409DataMutableBuilder[Self <: ReposMergeResponse409Data] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
