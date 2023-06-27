package typings.openui5

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiMdcUtilPropertyHelperMod {
  
  trait PropertyInfo extends StObject {
    
    /**
      * Whether filtering by this property is case-sensitive.
      */
    var caseSensitive: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Defines the constraints for the data type
      */
    var constraints: js.UndefOr[js.Object] = js.undefined
    
    /**
      * The name of the data type
      */
    var dataType: String
    
    /**
      * Defines the format options for the data type
      */
    var formatOptions: js.UndefOr[js.Object] = js.undefined
    
    /**
      * Key of the group the property is inside. Used to visually group properties in personalization dialogs.
      */
    var group: js.UndefOr[String] = js.undefined
    
    /**
      * Translatable text of the group.
      */
    var groupLabel: js.UndefOr[String] = js.undefined
    
    /**
      * Translatable text that labels the property.
      */
    var label: String
    
    /**
      * Defines the maximum number of filter conditions for the property. Possible values that can be used:
      *
      * 	 - 1 is a single-filter expression field
      * 	 - -1 is a multi-filter expression field  This information is, for example, used in the `addItem`
      *     method of the `FilterBar` control to forward this information to the created `FilterField` instance.
      */
    var maxConditions: js.UndefOr[int] = js.undefined
    
    /**
      * Unique, stable key for the property. It must only contain characters allowed for IDs, see {@link sap.ui.core.ID}.
      * Does not have to be an existing attribute in the data model or the technical name of an attribute in
      * the data model.
      */
    var name: String
    
    /**
      * The technical path for a data source property.
      */
    var path: js.UndefOr[String] = js.undefined
    
    /**
      * Translatable text that can optionally be offered as tooltip (For example in a personalization dialog).
      */
    var tooltip: js.UndefOr[String] = js.undefined
    
    /**
      * Whether the property is or can be visible to a user.
      */
    var visible: js.UndefOr[Boolean] = js.undefined
  }
  object PropertyInfo {
    
    inline def apply(dataType: String, label: String, name: String): PropertyInfo = {
      val __obj = js.Dynamic.literal(dataType = dataType.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[PropertyInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PropertyInfo] (val x: Self) extends AnyVal {
      
      inline def setCaseSensitive(value: Boolean): Self = StObject.set(x, "caseSensitive", value.asInstanceOf[js.Any])
      
      inline def setCaseSensitiveUndefined: Self = StObject.set(x, "caseSensitive", js.undefined)
      
      inline def setConstraints(value: js.Object): Self = StObject.set(x, "constraints", value.asInstanceOf[js.Any])
      
      inline def setConstraintsUndefined: Self = StObject.set(x, "constraints", js.undefined)
      
      inline def setDataType(value: String): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
      
      inline def setFormatOptions(value: js.Object): Self = StObject.set(x, "formatOptions", value.asInstanceOf[js.Any])
      
      inline def setFormatOptionsUndefined: Self = StObject.set(x, "formatOptions", js.undefined)
      
      inline def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
      
      inline def setGroupLabel(value: String): Self = StObject.set(x, "groupLabel", value.asInstanceOf[js.Any])
      
      inline def setGroupLabelUndefined: Self = StObject.set(x, "groupLabel", js.undefined)
      
      inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setMaxConditions(value: int): Self = StObject.set(x, "maxConditions", value.asInstanceOf[js.Any])
      
      inline def setMaxConditionsUndefined: Self = StObject.set(x, "maxConditions", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setTooltip(value: String): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
}
