package typings.meteor

import typings.meteor.Mongo.Collection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serviceConfigurationMod {
  
  object ServiceConfiguration {
    
    @JSImport("meteor/service-configuration", "ServiceConfiguration")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("meteor/service-configuration", "ServiceConfiguration.configurations")
    @js.native
    def configurations: Collection[
        typings.meteor.serviceConfigurationMod.Configuration, 
        typings.meteor.serviceConfigurationMod.Configuration
      ] = js.native
    inline def configurations_=(
      x: Collection[
          typings.meteor.serviceConfigurationMod.Configuration, 
          typings.meteor.serviceConfigurationMod.Configuration
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("configurations")(x.asInstanceOf[js.Any])
  }
  
  trait Configuration extends StObject {
    
    var appId: String
    
    var secret: String
  }
  object Configuration {
    
    inline def apply(appId: String, secret: String): typings.meteor.serviceConfigurationMod.Configuration = {
      val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], secret = secret.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.meteor.serviceConfigurationMod.Configuration]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: typings.meteor.serviceConfigurationMod.Configuration] (val x: Self) extends AnyVal {
      
      inline def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
      
      inline def setSecret(value: String): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
    }
  }
}
