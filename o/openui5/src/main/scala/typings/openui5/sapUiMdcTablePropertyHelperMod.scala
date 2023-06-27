package typings.openui5

import typings.openui5.anon.Template
import typings.openui5.anon.WidthCalculation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiMdcTablePropertyHelperMod {
  
  trait PropertyInfo
    extends StObject
       with typings.openui5.sapUiMdcUtilPropertyHelperMod.PropertyInfo {
    
    /**
      * Object that contains information about the clipboard settings. Setting this value to `null` disables
      * the copy function.
      */
    var clipboardSettings: js.UndefOr[Template] = js.undefined
    
    /**
      * Object that contains information about the export settings, see {@link sap.ui.export.Spreadsheet}.
      */
    var exportSettings: js.UndefOr[js.Object] = js.undefined
    
    /**
      * Defines whether a property is filterable.
      */
    var filterable: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Defines whether a property is groupable.
      */
    var groupable: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Defines whether a property is a key or part of a key in the data.
      */
    var key: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The availability of this property makes the `PropertyInfo` a complex `PropertyInfo`. Provides a list
      * of related properties (by name). These related properties must not themselves be complex.
      */
    var propertyInfos: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Defines whether a property is sortable.
      */
    var sortable: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Name of the text property that is related to this property in a 1:1 relation.
      */
    var text: js.UndefOr[String] = js.undefined
    
    /**
      * Name of the unit property that is related to this property.
      */
    var unit: js.UndefOr[String] = js.undefined
    
    /**
      * This object contains all relevant properties for visual adjustments.
      */
    var visualSettings: js.UndefOr[WidthCalculation] = js.undefined
  }
  object PropertyInfo {
    
    inline def apply(dataType: String, label: String, name: String): PropertyInfo = {
      val __obj = js.Dynamic.literal(dataType = dataType.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[PropertyInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PropertyInfo] (val x: Self) extends AnyVal {
      
      inline def setClipboardSettings(value: Template): Self = StObject.set(x, "clipboardSettings", value.asInstanceOf[js.Any])
      
      inline def setClipboardSettingsUndefined: Self = StObject.set(x, "clipboardSettings", js.undefined)
      
      inline def setExportSettings(value: js.Object): Self = StObject.set(x, "exportSettings", value.asInstanceOf[js.Any])
      
      inline def setExportSettingsUndefined: Self = StObject.set(x, "exportSettings", js.undefined)
      
      inline def setFilterable(value: Boolean): Self = StObject.set(x, "filterable", value.asInstanceOf[js.Any])
      
      inline def setFilterableUndefined: Self = StObject.set(x, "filterable", js.undefined)
      
      inline def setGroupable(value: Boolean): Self = StObject.set(x, "groupable", value.asInstanceOf[js.Any])
      
      inline def setGroupableUndefined: Self = StObject.set(x, "groupable", js.undefined)
      
      inline def setKey(value: Boolean): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setPropertyInfos(value: js.Array[String]): Self = StObject.set(x, "propertyInfos", value.asInstanceOf[js.Any])
      
      inline def setPropertyInfosUndefined: Self = StObject.set(x, "propertyInfos", js.undefined)
      
      inline def setPropertyInfosVarargs(value: String*): Self = StObject.set(x, "propertyInfos", js.Array(value*))
      
      inline def setSortable(value: Boolean): Self = StObject.set(x, "sortable", value.asInstanceOf[js.Any])
      
      inline def setSortableUndefined: Self = StObject.set(x, "sortable", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setUnit(value: String): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
      
      inline def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
      
      inline def setVisualSettings(value: WidthCalculation): Self = StObject.set(x, "visualSettings", value.asInstanceOf[js.Any])
      
      inline def setVisualSettingsUndefined: Self = StObject.set(x, "visualSettings", js.undefined)
    }
  }
}
