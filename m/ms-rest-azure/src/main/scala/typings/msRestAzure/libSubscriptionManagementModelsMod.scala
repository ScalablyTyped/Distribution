package typings.msRestAzure

import typings.std.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSubscriptionManagementModelsMod {
  
  trait Location extends StObject {
    
    val displayName: js.UndefOr[String] = js.undefined
    
    val id: js.UndefOr[String] = js.undefined
    
    val latitude: js.UndefOr[String] = js.undefined
    
    val longitude: js.UndefOr[String] = js.undefined
    
    val name: js.UndefOr[String] = js.undefined
    
    val subscriptionId: js.UndefOr[String] = js.undefined
  }
  object Location {
    
    inline def apply(): Location = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Location]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Location] (val x: Self) extends AnyVal {
      
      inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setLatitude(value: String): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
      
      inline def setLatitudeUndefined: Self = StObject.set(x, "latitude", js.undefined)
      
      inline def setLongitude(value: String): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
      
      inline def setLongitudeUndefined: Self = StObject.set(x, "longitude", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setSubscriptionId(value: String): Self = StObject.set(x, "subscriptionId", value.asInstanceOf[js.Any])
      
      inline def setSubscriptionIdUndefined: Self = StObject.set(x, "subscriptionId", js.undefined)
    }
  }
  
  @js.native
  trait LocationListResult
    extends StObject
       with Array[Location] {
    
    var value: js.UndefOr[js.Array[Location]] = js.native
  }
  
  trait Subscription extends StObject {
    
    var authorizationSource: js.UndefOr[String] = js.undefined
    
    val displayName: js.UndefOr[String] = js.undefined
    
    val id: js.UndefOr[String] = js.undefined
    
    val state: js.UndefOr[String] = js.undefined
    
    val subscriptionId: js.UndefOr[String] = js.undefined
    
    var subscriptionPolicies: js.UndefOr[SubscriptionPolicies] = js.undefined
    
    val tenantId: js.UndefOr[String] = js.undefined
  }
  object Subscription {
    
    inline def apply(): Subscription = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Subscription]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Subscription] (val x: Self) extends AnyVal {
      
      inline def setAuthorizationSource(value: String): Self = StObject.set(x, "authorizationSource", value.asInstanceOf[js.Any])
      
      inline def setAuthorizationSourceUndefined: Self = StObject.set(x, "authorizationSource", js.undefined)
      
      inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      inline def setSubscriptionId(value: String): Self = StObject.set(x, "subscriptionId", value.asInstanceOf[js.Any])
      
      inline def setSubscriptionIdUndefined: Self = StObject.set(x, "subscriptionId", js.undefined)
      
      inline def setSubscriptionPolicies(value: SubscriptionPolicies): Self = StObject.set(x, "subscriptionPolicies", value.asInstanceOf[js.Any])
      
      inline def setSubscriptionPoliciesUndefined: Self = StObject.set(x, "subscriptionPolicies", js.undefined)
      
      inline def setTenantId(value: String): Self = StObject.set(x, "tenantId", value.asInstanceOf[js.Any])
      
      inline def setTenantIdUndefined: Self = StObject.set(x, "tenantId", js.undefined)
    }
  }
  
  @js.native
  trait SubscriptionListResult
    extends StObject
       with Array[Subscription] {
    
    var nextLink: String = js.native
    
    var value: js.UndefOr[js.Array[Subscription]] = js.native
  }
  
  trait SubscriptionPolicies extends StObject {
    
    val locationPlacementId: js.UndefOr[String] = js.undefined
    
    val quotaId: js.UndefOr[String] = js.undefined
    
    val spendingLimit: js.UndefOr[String] = js.undefined
  }
  object SubscriptionPolicies {
    
    inline def apply(): SubscriptionPolicies = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SubscriptionPolicies]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SubscriptionPolicies] (val x: Self) extends AnyVal {
      
      inline def setLocationPlacementId(value: String): Self = StObject.set(x, "locationPlacementId", value.asInstanceOf[js.Any])
      
      inline def setLocationPlacementIdUndefined: Self = StObject.set(x, "locationPlacementId", js.undefined)
      
      inline def setQuotaId(value: String): Self = StObject.set(x, "quotaId", value.asInstanceOf[js.Any])
      
      inline def setQuotaIdUndefined: Self = StObject.set(x, "quotaId", js.undefined)
      
      inline def setSpendingLimit(value: String): Self = StObject.set(x, "spendingLimit", value.asInstanceOf[js.Any])
      
      inline def setSpendingLimitUndefined: Self = StObject.set(x, "spendingLimit", js.undefined)
    }
  }
  
  trait TenantIdDescription extends StObject {
    
    val id: js.UndefOr[String] = js.undefined
    
    val tenantId: js.UndefOr[String] = js.undefined
  }
  object TenantIdDescription {
    
    inline def apply(): TenantIdDescription = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TenantIdDescription]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TenantIdDescription] (val x: Self) extends AnyVal {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setTenantId(value: String): Self = StObject.set(x, "tenantId", value.asInstanceOf[js.Any])
      
      inline def setTenantIdUndefined: Self = StObject.set(x, "tenantId", js.undefined)
    }
  }
  
  @js.native
  trait TenantListResult
    extends StObject
       with Array[TenantIdDescription] {
    
    var nextLink: String = js.native
    
    var value: js.UndefOr[js.Array[TenantIdDescription]] = js.native
  }
}
