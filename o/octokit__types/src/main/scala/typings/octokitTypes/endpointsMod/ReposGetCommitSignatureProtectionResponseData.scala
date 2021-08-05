package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReposGetCommitSignatureProtectionResponseData extends StObject {
  
  var enabled: Boolean
  
  var url: String
}
object ReposGetCommitSignatureProtectionResponseData {
  
  inline def apply(enabled: Boolean, url: String): ReposGetCommitSignatureProtectionResponseData = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposGetCommitSignatureProtectionResponseData]
  }
  
  extension [Self <: ReposGetCommitSignatureProtectionResponseData](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
