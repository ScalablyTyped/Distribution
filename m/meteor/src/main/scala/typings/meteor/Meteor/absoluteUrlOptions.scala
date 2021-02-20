package typings.meteor.Meteor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait absoluteUrlOptions extends StObject {
  
  var replaceLocalhost: js.UndefOr[Boolean] = js.native
  
  var rootUrl: js.UndefOr[String] = js.native
  
  var secure: js.UndefOr[Boolean] = js.native
}
object absoluteUrlOptions {
  
  @scala.inline
  def apply(): absoluteUrlOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[absoluteUrlOptions]
  }
  
  @scala.inline
  implicit class absoluteUrlOptionsMutableBuilder[Self <: absoluteUrlOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReplaceLocalhost(value: Boolean): Self = StObject.set(x, "replaceLocalhost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplaceLocalhostUndefined: Self = StObject.set(x, "replaceLocalhost", js.undefined)
    
    @scala.inline
    def setRootUrl(value: String): Self = StObject.set(x, "rootUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootUrlUndefined: Self = StObject.set(x, "rootUrl", js.undefined)
    
    @scala.inline
    def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecureUndefined: Self = StObject.set(x, "secure", js.undefined)
  }
}
