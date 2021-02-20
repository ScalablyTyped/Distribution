package typings.meteor

import typings.meteor.Mongo.Collection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serviceConfigurationMod {
  
  object ServiceConfiguration {
    
    @JSImport("meteor/service-configuration", "ServiceConfiguration")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("meteor/service-configuration", "ServiceConfiguration.configurations")
    @js.native
    def configurations: Collection[Configuration, Configuration] = js.native
    @scala.inline
    def configurations_=(x: Collection[Configuration, Configuration]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("configurations")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Configuration extends StObject {
    
    var appId: String = js.native
    
    var secret: String = js.native
  }
  object Configuration {
    
    @scala.inline
    def apply(appId: String, secret: String): Configuration = {
      val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], secret = secret.asInstanceOf[js.Any])
      __obj.asInstanceOf[Configuration]
    }
    
    @scala.inline
    implicit class ConfigurationMutableBuilder[Self <: Configuration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecret(value: String): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
    }
  }
}
