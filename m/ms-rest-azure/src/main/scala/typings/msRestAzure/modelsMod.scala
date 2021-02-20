package typings.msRestAzure

import typings.std.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modelsMod {
  
  @js.native
  trait Location extends StObject {
    
    val displayName: js.UndefOr[String] = js.native
    
    val id: js.UndefOr[String] = js.native
    
    val latitude: js.UndefOr[String] = js.native
    
    val longitude: js.UndefOr[String] = js.native
    
    val name: js.UndefOr[String] = js.native
    
    val subscriptionId: js.UndefOr[String] = js.native
  }
  object Location {
    
    @scala.inline
    def apply(): Location = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Location]
    }
    
    @scala.inline
    implicit class LocationMutableBuilder[Self <: Location] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setLatitude(value: String): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLatitudeUndefined: Self = StObject.set(x, "latitude", js.undefined)
      
      @scala.inline
      def setLongitude(value: String): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLongitudeUndefined: Self = StObject.set(x, "longitude", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setSubscriptionId(value: String): Self = StObject.set(x, "subscriptionId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubscriptionIdUndefined: Self = StObject.set(x, "subscriptionId", js.undefined)
    }
  }
  
  @js.native
  trait LocationListResult extends Array[Location] {
    
    var value: js.UndefOr[js.Array[Location]] = js.native
  }
  
  @js.native
  trait Subscription extends StObject {
    
    var authorizationSource: js.UndefOr[String] = js.native
    
    val displayName: js.UndefOr[String] = js.native
    
    val id: js.UndefOr[String] = js.native
    
    val state: js.UndefOr[String] = js.native
    
    val subscriptionId: js.UndefOr[String] = js.native
    
    var subscriptionPolicies: js.UndefOr[SubscriptionPolicies] = js.native
    
    val tenantId: js.UndefOr[String] = js.native
  }
  object Subscription {
    
    @scala.inline
    def apply(): Subscription = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Subscription]
    }
    
    @scala.inline
    implicit class SubscriptionMutableBuilder[Self <: Subscription] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthorizationSource(value: String): Self = StObject.set(x, "authorizationSource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthorizationSourceUndefined: Self = StObject.set(x, "authorizationSource", js.undefined)
      
      @scala.inline
      def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      @scala.inline
      def setSubscriptionId(value: String): Self = StObject.set(x, "subscriptionId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubscriptionIdUndefined: Self = StObject.set(x, "subscriptionId", js.undefined)
      
      @scala.inline
      def setSubscriptionPolicies(value: SubscriptionPolicies): Self = StObject.set(x, "subscriptionPolicies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubscriptionPoliciesUndefined: Self = StObject.set(x, "subscriptionPolicies", js.undefined)
      
      @scala.inline
      def setTenantId(value: String): Self = StObject.set(x, "tenantId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTenantIdUndefined: Self = StObject.set(x, "tenantId", js.undefined)
    }
  }
  
  @js.native
  trait SubscriptionListResult extends Array[Subscription] {
    
    var nextLink: String = js.native
    
    var value: js.UndefOr[js.Array[Subscription]] = js.native
  }
  
  @js.native
  trait SubscriptionPolicies extends StObject {
    
    val locationPlacementId: js.UndefOr[String] = js.native
    
    val quotaId: js.UndefOr[String] = js.native
    
    val spendingLimit: js.UndefOr[String] = js.native
  }
  object SubscriptionPolicies {
    
    @scala.inline
    def apply(): SubscriptionPolicies = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SubscriptionPolicies]
    }
    
    @scala.inline
    implicit class SubscriptionPoliciesMutableBuilder[Self <: SubscriptionPolicies] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLocationPlacementId(value: String): Self = StObject.set(x, "locationPlacementId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocationPlacementIdUndefined: Self = StObject.set(x, "locationPlacementId", js.undefined)
      
      @scala.inline
      def setQuotaId(value: String): Self = StObject.set(x, "quotaId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuotaIdUndefined: Self = StObject.set(x, "quotaId", js.undefined)
      
      @scala.inline
      def setSpendingLimit(value: String): Self = StObject.set(x, "spendingLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpendingLimitUndefined: Self = StObject.set(x, "spendingLimit", js.undefined)
    }
  }
  
  @js.native
  trait TenantIdDescription extends StObject {
    
    val id: js.UndefOr[String] = js.native
    
    val tenantId: js.UndefOr[String] = js.native
  }
  object TenantIdDescription {
    
    @scala.inline
    def apply(): TenantIdDescription = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TenantIdDescription]
    }
    
    @scala.inline
    implicit class TenantIdDescriptionMutableBuilder[Self <: TenantIdDescription] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setTenantId(value: String): Self = StObject.set(x, "tenantId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTenantIdUndefined: Self = StObject.set(x, "tenantId", js.undefined)
    }
  }
  
  @js.native
  trait TenantListResult extends Array[TenantIdDescription] {
    
    var nextLink: String = js.native
    
    var value: js.UndefOr[js.Array[TenantIdDescription]] = js.native
  }
}
