package typings.pkgcloud.mod

import typings.pkgcloud.pkgcloudStrings.rackspace
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RackspaceProviderOptions extends StObject {
  
  var apiKey: String = js.native
  
  var provider: rackspace = js.native
  
  var region: RackspaceRegions = js.native
  
  var useInternal: js.UndefOr[Boolean] = js.native
  
  var username: String = js.native
}
object RackspaceProviderOptions {
  
  @scala.inline
  def apply(apiKey: String, provider: rackspace, region: RackspaceRegions, username: String): RackspaceProviderOptions = {
    val __obj = js.Dynamic.literal(apiKey = apiKey.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[RackspaceProviderOptions]
  }
  
  @scala.inline
  implicit class RackspaceProviderOptionsMutableBuilder[Self <: RackspaceProviderOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApiKey(value: String): Self = StObject.set(x, "apiKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvider(value: rackspace): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegion(value: RackspaceRegions): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseInternal(value: Boolean): Self = StObject.set(x, "useInternal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseInternalUndefined: Self = StObject.set(x, "useInternal", js.undefined)
    
    @scala.inline
    def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
  }
}
