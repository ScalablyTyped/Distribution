package typings.msportalfxMock

import typings.msportalfxMock.armLockMod.ArmLockData
import typings.msportalfxMock.armLockMod.LockProperties
import typings.msportalfxMock.html5Mod.StringMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mockModelMod {
  
  trait Lock
    extends StObject
       with ArmLockData {
    
    /**
      * The name given to the lock
      */
    var name: String
  }
  object Lock {
    
    @scala.inline
    def apply(name: String, properties: LockProperties): Lock = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
      __obj.asInstanceOf[Lock]
    }
    
    @scala.inline
    implicit class LockMutableBuilder[Self <: Lock] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait MappedArmData[T] extends StObject {
    
    var mappedData: js.UndefOr[T] = js.undefined
  }
  object MappedArmData {
    
    @scala.inline
    def apply[T](): MappedArmData[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MappedArmData[T]]
    }
    
    @scala.inline
    implicit class MappedArmDataMutableBuilder[Self <: MappedArmData[?], T] (val x: Self & MappedArmData[T]) extends AnyVal {
      
      @scala.inline
      def setMappedData(value: T): Self = StObject.set(x, "mappedData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMappedDataUndefined: Self = StObject.set(x, "mappedData", js.undefined)
    }
  }
  
  trait NestedResource
    extends StObject
       with MappedArmData[typings.msportalfxMock.armResourceMod.Resource] {
    
    /**
      * Resource name.
      */
    var name: String
    
    /**
      * Resource tags.
      */
    var tags: StringMap[String]
    
    /**
      * Mested resource type.
      */
    var `type`: String
  }
  object NestedResource {
    
    @scala.inline
    def apply(name: String, tags: StringMap[String], `type`: String): NestedResource = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[NestedResource]
    }
    
    @scala.inline
    implicit class NestedResourceMutableBuilder[Self <: NestedResource] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTags(value: StringMap[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Resource
    extends StObject
       with MappedArmData[typings.msportalfxMock.armResourceMod.Resource] {
    
    /**
      * Resource kind.
      */
    var kind: String
    
    /**
      * Resource location.
      */
    var location: String
    
    /**
      * The list of lcoks.
      */
    var locks: js.UndefOr[js.Array[Lock]] = js.undefined
    
    /**
      * Resource name.
      */
    var name: String
    
    /**
      * List of nested resources
      */
    var nestedResources: js.UndefOr[js.Array[NestedResource]] = js.undefined
    
    /**
      * Resource tags.
      */
    var tags: StringMap[String]
    
    /**
      * Resource type.
      */
    var `type`: String
  }
  object Resource {
    
    @scala.inline
    def apply(kind: String, location: String, name: String, tags: StringMap[String], `type`: String): Resource = {
      val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Resource]
    }
    
    @scala.inline
    implicit class ResourceMutableBuilder[Self <: Resource] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocks(value: js.Array[Lock]): Self = StObject.set(x, "locks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocksUndefined: Self = StObject.set(x, "locks", js.undefined)
      
      @scala.inline
      def setLocksVarargs(value: Lock*): Self = StObject.set(x, "locks", js.Array(value :_*))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNestedResources(value: js.Array[NestedResource]): Self = StObject.set(x, "nestedResources", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNestedResourcesUndefined: Self = StObject.set(x, "nestedResources", js.undefined)
      
      @scala.inline
      def setNestedResourcesVarargs(value: NestedResource*): Self = StObject.set(x, "nestedResources", js.Array(value :_*))
      
      @scala.inline
      def setTags(value: StringMap[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait ResourceGroup
    extends StObject
       with MappedArmData[typings.msportalfxMock.armResourceGroupMod.ResourceGroup] {
    
    /**
      * Resource group location.
      */
    var location: String
    
    /**
      * The list of lcoks.
      */
    var locks: js.UndefOr[js.Array[Lock]] = js.undefined
    
    /**
      * Resource group name.
      */
    var name: String
    
    /**
      * Resource group properties.
      */
    var properties: ResourceGroupProperties
    
    /**
      * The list of resources in the resource group.
      */
    var resources: js.UndefOr[js.Array[Resource]] = js.undefined
    
    /**
      * Resource group tags.
      */
    var tags: StringMap[String]
  }
  object ResourceGroup {
    
    @scala.inline
    def apply(location: String, name: String, properties: ResourceGroupProperties, tags: StringMap[String]): ResourceGroup = {
      val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResourceGroup]
    }
    
    @scala.inline
    implicit class ResourceGroupMutableBuilder[Self <: ResourceGroup] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocks(value: js.Array[Lock]): Self = StObject.set(x, "locks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocksUndefined: Self = StObject.set(x, "locks", js.undefined)
      
      @scala.inline
      def setLocksVarargs(value: Lock*): Self = StObject.set(x, "locks", js.Array(value :_*))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProperties(value: ResourceGroupProperties): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResources(value: js.Array[Resource]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourcesUndefined: Self = StObject.set(x, "resources", js.undefined)
      
      @scala.inline
      def setResourcesVarargs(value: Resource*): Self = StObject.set(x, "resources", js.Array(value :_*))
      
      @scala.inline
      def setTags(value: StringMap[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    }
  }
  
  trait ResourceGroupProperties extends StObject {
    
    /**
      * Resource group lock state.
      */
    var lockState: String
    
    /**
      * Resource group provisioning state.
      */
    var provisioningState: String
  }
  object ResourceGroupProperties {
    
    @scala.inline
    def apply(lockState: String, provisioningState: String): ResourceGroupProperties = {
      val __obj = js.Dynamic.literal(lockState = lockState.asInstanceOf[js.Any], provisioningState = provisioningState.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResourceGroupProperties]
    }
    
    @scala.inline
    implicit class ResourceGroupPropertiesMutableBuilder[Self <: ResourceGroupProperties] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLockState(value: String): Self = StObject.set(x, "lockState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProvisioningState(value: String): Self = StObject.set(x, "provisioningState", value.asInstanceOf[js.Any])
    }
  }
  
  trait Subscription
    extends StObject
       with MappedArmData[typings.msportalfxMock.armSubscriptionMod.Subscription] {
    
    /**
      * Friendly name of the azure subscription.
      */
    var displayName: String
    
    /**
      * The list of lcoks.
      */
    var locks: js.UndefOr[js.Array[Lock]] = js.undefined
    
    /**
      * The list of resource groups.
      */
    var resourceGroups: js.UndefOr[js.Array[ResourceGroup]] = js.undefined
    
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
    
    @scala.inline
    def apply(displayName: String, state: String, subscriptionId: String): Subscription = {
      val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], subscriptionId = subscriptionId.asInstanceOf[js.Any])
      __obj.asInstanceOf[Subscription]
    }
    
    @scala.inline
    implicit class SubscriptionMutableBuilder[Self <: Subscription] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocks(value: js.Array[Lock]): Self = StObject.set(x, "locks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocksUndefined: Self = StObject.set(x, "locks", js.undefined)
      
      @scala.inline
      def setLocksVarargs(value: Lock*): Self = StObject.set(x, "locks", js.Array(value :_*))
      
      @scala.inline
      def setResourceGroups(value: js.Array[ResourceGroup]): Self = StObject.set(x, "resourceGroups", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourceGroupsUndefined: Self = StObject.set(x, "resourceGroups", js.undefined)
      
      @scala.inline
      def setResourceGroupsVarargs(value: ResourceGroup*): Self = StObject.set(x, "resourceGroups", js.Array(value :_*))
      
      @scala.inline
      def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubscriptionId(value: String): Self = StObject.set(x, "subscriptionId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubscriptionPolicies(value: SubscriptionPolicies): Self = StObject.set(x, "subscriptionPolicies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubscriptionPoliciesUndefined: Self = StObject.set(x, "subscriptionPolicies", js.undefined)
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
    
    @scala.inline
    def apply(locationPlacementId: String, quotaId: String): SubscriptionPolicies = {
      val __obj = js.Dynamic.literal(locationPlacementId = locationPlacementId.asInstanceOf[js.Any], quotaId = quotaId.asInstanceOf[js.Any])
      __obj.asInstanceOf[SubscriptionPolicies]
    }
    
    @scala.inline
    implicit class SubscriptionPoliciesMutableBuilder[Self <: SubscriptionPolicies] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLocationPlacementId(value: String): Self = StObject.set(x, "locationPlacementId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuotaId(value: String): Self = StObject.set(x, "quotaId", value.asInstanceOf[js.Any])
    }
  }
}
