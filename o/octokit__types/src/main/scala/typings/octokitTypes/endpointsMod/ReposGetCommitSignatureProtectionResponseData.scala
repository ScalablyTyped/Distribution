package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReposGetCommitSignatureProtectionResponseData extends StObject {
  
  var enabled: Boolean = js.native
  
  var url: String = js.native
}
object ReposGetCommitSignatureProtectionResponseData {
  
  @scala.inline
  def apply(enabled: Boolean, url: String): ReposGetCommitSignatureProtectionResponseData = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposGetCommitSignatureProtectionResponseData]
  }
  
  @scala.inline
  implicit class ReposGetCommitSignatureProtectionResponseDataMutableBuilder[Self <: ReposGetCommitSignatureProtectionResponseData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
