package typings.pkgcloud.mod

import typings.pkgcloud.pkgcloudStrings.amazon
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AmazonProviderOptions extends StObject {
  
  var key: String
  
  var keyId: String
  
  var provider: amazon
  
  var region: js.UndefOr[String] = js.undefined
}
object AmazonProviderOptions {
  
  @scala.inline
  def apply(key: String, keyId: String): AmazonProviderOptions = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], keyId = keyId.asInstanceOf[js.Any], provider = "amazon")
    __obj.asInstanceOf[AmazonProviderOptions]
  }
  
  @scala.inline
  implicit class AmazonProviderOptionsMutableBuilder[Self <: AmazonProviderOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyId(value: String): Self = StObject.set(x, "keyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvider(value: amazon): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
  }
}
