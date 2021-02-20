package typings.postal

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IConfiguration extends StObject {
  
  var DEFAULT_CHANNEL: String = js.native
  
  var SYSTEM_CHANNEL: String = js.native
  
  var resolver: IResolver = js.native
}
object IConfiguration {
  
  @scala.inline
  def apply(DEFAULT_CHANNEL: String, SYSTEM_CHANNEL: String, resolver: IResolver): IConfiguration = {
    val __obj = js.Dynamic.literal(DEFAULT_CHANNEL = DEFAULT_CHANNEL.asInstanceOf[js.Any], SYSTEM_CHANNEL = SYSTEM_CHANNEL.asInstanceOf[js.Any], resolver = resolver.asInstanceOf[js.Any])
    __obj.asInstanceOf[IConfiguration]
  }
  
  @scala.inline
  implicit class IConfigurationMutableBuilder[Self <: IConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDEFAULT_CHANNEL(value: String): Self = StObject.set(x, "DEFAULT_CHANNEL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolver(value: IResolver): Self = StObject.set(x, "resolver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSYSTEM_CHANNEL(value: String): Self = StObject.set(x, "SYSTEM_CHANNEL", value.asInstanceOf[js.Any])
  }
}
