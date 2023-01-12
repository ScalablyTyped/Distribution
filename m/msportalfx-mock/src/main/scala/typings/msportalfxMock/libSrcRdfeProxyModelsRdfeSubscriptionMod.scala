package typings.msportalfxMock

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSrcRdfeProxyModelsRdfeSubscriptionMod {
  
  trait Subscription extends StObject {
    
    /**
      * Friendly name of the azure subscription.
      */
    var displayName: String
    
    /**
      * Id of the azure subscription.
      */
    var subscriptionId: String
  }
  object Subscription {
    
    inline def apply(displayName: String, subscriptionId: String): Subscription = {
      val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], subscriptionId = subscriptionId.asInstanceOf[js.Any])
      __obj.asInstanceOf[Subscription]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Subscription] (val x: Self) extends AnyVal {
      
      inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      inline def setSubscriptionId(value: String): Self = StObject.set(x, "subscriptionId", value.asInstanceOf[js.Any])
    }
  }
}
