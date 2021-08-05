package typings.msportalfxMock

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object armSubscriptionMod {
  
  trait Subscription extends StObject {
    
    /**
      * Friendly name of the azure subscription.
      */
    var displayName: String
    
    /**
      * Subscription resource id.
      */
    var id: String
    
    /**
      * The subscription state.
      */
    var state: String
    
    /**
      * Id of the azure subscription.
      */
    var subscriptionId: String
    
    /**
      * The subscription policies. May be null.
      */
    var subscriptionPolicies: js.UndefOr[SubscriptionPolicies] = js.undefined
  }
  object Subscription {
    
    inline def apply(displayName: String, id: String, state: String, subscriptionId: String): Subscription = {
      val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], subscriptionId = subscriptionId.asInstanceOf[js.Any])
      __obj.asInstanceOf[Subscription]
    }
    
    extension [Self <: Subscription](x: Self) {
      
      inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setSubscriptionId(value: String): Self = StObject.set(x, "subscriptionId", value.asInstanceOf[js.Any])
      
      inline def setSubscriptionPolicies(value: SubscriptionPolicies): Self = StObject.set(x, "subscriptionPolicies", value.asInstanceOf[js.Any])
      
      inline def setSubscriptionPoliciesUndefined: Self = StObject.set(x, "subscriptionPolicies", js.undefined)
    }
  }
  
  trait SubscriptionPolicies extends StObject {
    
    /**
      * The subscription location placement id.
      */
    var locationPlacementId: String
    
    /**
      * The subscription quota id.
      */
    var quotaId: String
  }
  object SubscriptionPolicies {
    
    inline def apply(locationPlacementId: String, quotaId: String): SubscriptionPolicies = {
      val __obj = js.Dynamic.literal(locationPlacementId = locationPlacementId.asInstanceOf[js.Any], quotaId = quotaId.asInstanceOf[js.Any])
      __obj.asInstanceOf[SubscriptionPolicies]
    }
    
    extension [Self <: SubscriptionPolicies](x: Self) {
      
      inline def setLocationPlacementId(value: String): Self = StObject.set(x, "locationPlacementId", value.asInstanceOf[js.Any])
      
      inline def setQuotaId(value: String): Self = StObject.set(x, "quotaId", value.asInstanceOf[js.Any])
    }
  }
}
