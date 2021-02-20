package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GitCreateBlobResponseData extends StObject {
  
  var sha: String = js.native
  
  var url: String = js.native
}
object GitCreateBlobResponseData {
  
  @scala.inline
  def apply(sha: String, url: String): GitCreateBlobResponseData = {
    val __obj = js.Dynamic.literal(sha = sha.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitCreateBlobResponseData]
  }
  
  @scala.inline
  implicit class GitCreateBlobResponseDataMutableBuilder[Self <: GitCreateBlobResponseData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSha(value: String): Self = StObject.set(x, "sha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
