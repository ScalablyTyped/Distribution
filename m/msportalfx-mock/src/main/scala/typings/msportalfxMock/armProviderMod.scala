package typings.msportalfxMock

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object armProviderMod {
  
  trait Provider extends StObject {
    
    /**
      * Namespace for the provider
      */
    var namespace: String
    
    /**
      * Registration state that are provided by the provider.
      */
    var registrationState: js.UndefOr[String] = js.undefined
    
    /**
      * Resource Types that are provided by the provider.
      */
    var resourceTypes: js.Array[ResourceType]
  }
  object Provider {
    
    @scala.inline
    def apply(namespace: String, resourceTypes: js.Array[ResourceType]): Provider = {
      val __obj = js.Dynamic.literal(namespace = namespace.asInstanceOf[js.Any], resourceTypes = resourceTypes.asInstanceOf[js.Any])
      __obj.asInstanceOf[Provider]
    }
    
    @scala.inline
    implicit class ProviderMutableBuilder[Self <: Provider] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegistrationState(value: String): Self = StObject.set(x, "registrationState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegistrationStateUndefined: Self = StObject.set(x, "registrationState", js.undefined)
      
      @scala.inline
      def setResourceTypes(value: js.Array[ResourceType]): Self = StObject.set(x, "resourceTypes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourceTypesVarargs(value: ResourceType*): Self = StObject.set(x, "resourceTypes", js.Array(value :_*))
    }
  }
  
  trait ResourceType extends StObject {
    
    /**
      * List of supported api versions.
      */
    var apiVersions: js.Array[String]
    
    /**
      * List of locations that the Resource Type has
      */
    var locations: js.Array[String]
    
    /**
      * Resource Type name
      */
    var resourceType: String
  }
  object ResourceType {
    
    @scala.inline
    def apply(apiVersions: js.Array[String], locations: js.Array[String], resourceType: String): ResourceType = {
      val __obj = js.Dynamic.literal(apiVersions = apiVersions.asInstanceOf[js.Any], locations = locations.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResourceType]
    }
    
    @scala.inline
    implicit class ResourceTypeMutableBuilder[Self <: ResourceType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApiVersions(value: js.Array[String]): Self = StObject.set(x, "apiVersions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApiVersionsVarargs(value: String*): Self = StObject.set(x, "apiVersions", js.Array(value :_*))
      
      @scala.inline
      def setLocations(value: js.Array[String]): Self = StObject.set(x, "locations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocationsVarargs(value: String*): Self = StObject.set(x, "locations", js.Array(value :_*))
      
      @scala.inline
      def setResourceType(value: String): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    }
  }
}
