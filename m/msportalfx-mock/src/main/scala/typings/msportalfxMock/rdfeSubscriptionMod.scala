package typings.msportalfxMock

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rdfeSubscriptionMod {
  
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
    
    @scala.inline
    def apply(displayName: String, subscriptionId: String): Subscription = {
      val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], subscriptionId = subscriptionId.asInstanceOf[js.Any])
      __obj.asInstanceOf[Subscription]
    }
    
    @scala.inline
    implicit class SubscriptionMutableBuilder[Self <: Subscription] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubscriptionId(value: String): Self = StObject.set(x, "subscriptionId", value.asInstanceOf[js.Any])
    }
  }
}
