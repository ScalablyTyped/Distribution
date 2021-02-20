package typings.pkgcloud.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseProviderOptions extends StObject {
  
  var provider: Providers = js.native
}
object BaseProviderOptions {
  
  @scala.inline
  def apply(provider: Providers): BaseProviderOptions = {
    val __obj = js.Dynamic.literal(provider = provider.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseProviderOptions]
  }
  
  @scala.inline
  implicit class BaseProviderOptionsMutableBuilder[Self <: BaseProviderOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProvider(value: Providers): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
  }
}
