package typings.pkgcloud.mod

import typings.pkgcloud.pkgcloudStrings.google
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleProviderOptions extends StObject {
  
  var keyFilename: String
  
  var projectId: String
  
  var provider: google
}
object GoogleProviderOptions {
  
  @scala.inline
  def apply(keyFilename: String, projectId: String): GoogleProviderOptions = {
    val __obj = js.Dynamic.literal(keyFilename = keyFilename.asInstanceOf[js.Any], projectId = projectId.asInstanceOf[js.Any], provider = "google")
    __obj.asInstanceOf[GoogleProviderOptions]
  }
  
  @scala.inline
  implicit class GoogleProviderOptionsMutableBuilder[Self <: GoogleProviderOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKeyFilename(value: String): Self = StObject.set(x, "keyFilename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvider(value: google): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
  }
}
