package typings.msportalfxMock

import typings.msportalfxMock.html5Mod.StringMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object armResourceGroupMod {
  
  object ResourceLockState {
    
    @JSImport("msportalfx-mock/lib/src/ArmProxy/Models/armResourceGroup", "ResourceLockState")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("msportalfx-mock/lib/src/ArmProxy/Models/armResourceGroup", "ResourceLockState.Locked")
    @js.native
    def Locked: String = js.native
    @scala.inline
    def Locked_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Locked")(x.asInstanceOf[js.Any])
    
    @JSImport("msportalfx-mock/lib/src/ArmProxy/Models/armResourceGroup", "ResourceLockState.Unlocked")
    @js.native
    def Unlocked: String = js.native
    @scala.inline
    def Unlocked_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Unlocked")(x.asInstanceOf[js.Any])
  }
  
  trait ResourceGroup extends StObject {
    
    /**
      * Resource group id.
      */
    var id: String
    
    /**
      * Resource group location.
      */
    var location: String
    
    /**
      * Resource group name.
      */
    var name: String
    
    /**
      * Resource group properties.
      */
    var properties: ResourceGroupProperties
    
    /**
      * Resource group tags.
      */
    var tags: StringMap[String]
  }
  object ResourceGroup {
    
    @scala.inline
    def apply(
      id: String,
      location: String,
      name: String,
      properties: ResourceGroupProperties,
      tags: StringMap[String]
    ): ResourceGroup = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResourceGroup]
    }
    
    @scala.inline
    implicit class ResourceGroupMutableBuilder[Self <: ResourceGroup] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProperties(value: ResourceGroupProperties): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
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
}
