package typings.octokitTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Protected extends StObject {
  
  var commit: ShaUrl = js.native
  
  var name: String = js.native
  
  var `protected`: Boolean = js.native
  
  var protection: Enabled = js.native
  
  var protection_url: String = js.native
}
object Protected {
  
  @scala.inline
  def apply(commit: ShaUrl, name: String, `protected`: Boolean, protection: Enabled, protection_url: String): Protected = {
    val __obj = js.Dynamic.literal(commit = commit.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], protection = protection.asInstanceOf[js.Any], protection_url = protection_url.asInstanceOf[js.Any])
    __obj.updateDynamic("protected")(`protected`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Protected]
  }
  
  @scala.inline
  implicit class ProtectedMutableBuilder[Self <: Protected] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommit(value: ShaUrl): Self = StObject.set(x, "commit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtected(value: Boolean): Self = StObject.set(x, "protected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtection(value: Enabled): Self = StObject.set(x, "protection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtection_url(value: String): Self = StObject.set(x, "protection_url", value.asInstanceOf[js.Any])
  }
}
