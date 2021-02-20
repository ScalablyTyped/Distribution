package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReposCreateCommitSignatureProtectionResponseData extends StObject {
  
  var enabled: Boolean = js.native
  
  var url: String = js.native
}
object ReposCreateCommitSignatureProtectionResponseData {
  
  @scala.inline
  def apply(enabled: Boolean, url: String): ReposCreateCommitSignatureProtectionResponseData = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposCreateCommitSignatureProtectionResponseData]
  }
  
  @scala.inline
  implicit class ReposCreateCommitSignatureProtectionResponseDataMutableBuilder[Self <: ReposCreateCommitSignatureProtectionResponseData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
