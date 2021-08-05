package typings.powerappsComponentFramework.ComponentFramework

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Helper of Utils API interface
  */
object UtilityApi {
  
  /**
    * Options used when opening a lookup dialog.
    */
  trait LookupOptions extends StObject {
    
    /**
      * Whether the lookup allows more than one item to be selected.
      */
    var allowMultiSelect: Boolean
    
    /**
      * The default entity type.
      */
    var defaultEntityType: String
    
    /**
      * The default view to use.
      */
    var defaultViewId: String
    
    /**
      * The entity types to display.
      */
    var entityTypes: js.Array[String]
    
    /**
      * The views to be available in the view picker. Only System views are supported (not user views).
      */
    var viewIds: js.Array[String]
  }
  object LookupOptions {
    
    inline def apply(
      allowMultiSelect: Boolean,
      defaultEntityType: String,
      defaultViewId: String,
      entityTypes: js.Array[String],
      viewIds: js.Array[String]
    ): LookupOptions = {
      val __obj = js.Dynamic.literal(allowMultiSelect = allowMultiSelect.asInstanceOf[js.Any], defaultEntityType = defaultEntityType.asInstanceOf[js.Any], defaultViewId = defaultViewId.asInstanceOf[js.Any], entityTypes = entityTypes.asInstanceOf[js.Any], viewIds = viewIds.asInstanceOf[js.Any])
      __obj.asInstanceOf[LookupOptions]
    }
    
    extension [Self <: LookupOptions](x: Self) {
      
      inline def setAllowMultiSelect(value: Boolean): Self = StObject.set(x, "allowMultiSelect", value.asInstanceOf[js.Any])
      
      inline def setDefaultEntityType(value: String): Self = StObject.set(x, "defaultEntityType", value.asInstanceOf[js.Any])
      
      inline def setDefaultViewId(value: String): Self = StObject.set(x, "defaultViewId", value.asInstanceOf[js.Any])
      
      inline def setEntityTypes(value: js.Array[String]): Self = StObject.set(x, "entityTypes", value.asInstanceOf[js.Any])
      
      inline def setEntityTypesVarargs(value: String*): Self = StObject.set(x, "entityTypes", js.Array(value :_*))
      
      inline def setViewIds(value: js.Array[String]): Self = StObject.set(x, "viewIds", value.asInstanceOf[js.Any])
      
      inline def setViewIdsVarargs(value: String*): Self = StObject.set(x, "viewIds", js.Array(value :_*))
    }
  }
}
