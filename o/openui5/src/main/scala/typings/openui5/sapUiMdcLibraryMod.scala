package typings.openui5

import typings.openui5.sapUiMdcEnumsFieldDisplayMod.FieldDisplay
import typings.openui5.sapUiMdcLibraryMod.State.Aggregations
import typings.openui5.sapUiMdcLibraryMod.State.GroupLevels
import typings.openui5.sapUiMdcLibraryMod.State.Items
import typings.openui5.sapUiMdcLibraryMod.State.Sorters
import typings.openui5.sapUiMdcLibraryMod.State.XCondition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiMdcLibraryMod {
  
  trait State extends StObject {
    
    /**
      * Describes the aggregated fields
      */
    var aggregations: js.UndefOr[Aggregations] = js.undefined
    
    /**
      * Describes the filter conditions
      */
    var filter: js.UndefOr[XCondition] = js.undefined
    
    /**
      * Describes the grouped fields
      */
    var groupLevels: js.UndefOr[js.Array[GroupLevels]] = js.undefined
    
    /**
      * Describes the filter fields
      */
    var items: js.UndefOr[js.Array[Items]] = js.undefined
    
    /**
      * Describes the sorter fields
      */
    var sorters: js.UndefOr[js.Array[Sorters]] = js.undefined
  }
  object State {
    
    inline def apply(): State = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[State]
    }
    
    /**
      * Defines the `aggregations` to be added to the controls agreggation state.
      *
      * Defines whether there is an aggregation for each item.
      */
    trait Aggregations extends StObject {
      
      /**
        * Defines if the item has to be aggregated
        */
      var aggregated: js.UndefOr[Boolean] = js.undefined
    }
    object Aggregations {
      
      inline def apply(): Aggregations = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Aggregations]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Aggregations] (val x: Self) extends AnyVal {
        
        inline def setAggregated(value: Boolean): Self = StObject.set(x, "aggregated", value.asInstanceOf[js.Any])
        
        inline def setAggregatedUndefined: Self = StObject.set(x, "aggregated", js.undefined)
      }
    }
    
    /**
      * Defines the `groupes` to be added to the controls grouping state.
      */
    trait GroupLevels extends StObject {
      
      /**
        * Defines if the item has to be grouped
        */
      var grouped: js.UndefOr[Boolean] = js.undefined
      
      /**
        * of the grouped item
        */
      var name: String
    }
    object GroupLevels {
      
      inline def apply(name: String): GroupLevels = {
        val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
        __obj.asInstanceOf[GroupLevels]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: GroupLevels] (val x: Self) extends AnyVal {
        
        inline def setGrouped(value: Boolean): Self = StObject.set(x, "grouped", value.asInstanceOf[js.Any])
        
        inline def setGroupedUndefined: Self = StObject.set(x, "grouped", js.undefined)
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * Defines the `items` to be added to the controls default aggregation.
      */
    trait Items extends StObject {
      
      /**
        * of the item
        */
      var name: String
      
      /**
        * of the item in the aggregation
        */
      var position: js.UndefOr[int] = js.undefined
      
      /**
        * State of the item
        */
      var visible: js.UndefOr[Boolean] = js.undefined
    }
    object Items {
      
      inline def apply(name: String): Items = {
        val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
        __obj.asInstanceOf[Items]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Items] (val x: Self) extends AnyVal {
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setPosition(value: int): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
        
        inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
        
        inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
        
        inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      }
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: State] (val x: Self) extends AnyVal {
      
      inline def setAggregations(value: Aggregations): Self = StObject.set(x, "aggregations", value.asInstanceOf[js.Any])
      
      inline def setAggregationsUndefined: Self = StObject.set(x, "aggregations", js.undefined)
      
      inline def setFilter(value: XCondition): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setGroupLevels(value: js.Array[GroupLevels]): Self = StObject.set(x, "groupLevels", value.asInstanceOf[js.Any])
      
      inline def setGroupLevelsUndefined: Self = StObject.set(x, "groupLevels", js.undefined)
      
      inline def setGroupLevelsVarargs(value: GroupLevels*): Self = StObject.set(x, "groupLevels", js.Array(value*))
      
      inline def setItems(value: js.Array[Items]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      inline def setItemsVarargs(value: Items*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setSorters(value: js.Array[Sorters]): Self = StObject.set(x, "sorters", value.asInstanceOf[js.Any])
      
      inline def setSortersUndefined: Self = StObject.set(x, "sorters", js.undefined)
      
      inline def setSortersVarargs(value: Sorters*): Self = StObject.set(x, "sorters", js.Array(value*))
    }
    
    /**
      * Defines the `sorters` to be added to the controls sorting state.
      */
    trait Sorters extends StObject {
      
      /**
        * Sort order for this item
        */
      var descending: Boolean
      
      /**
        * of the sorted item
        */
      var name: String
      
      /**
        * Defines if the item has to be sorted
        */
      var sorted: js.UndefOr[Boolean] = js.undefined
    }
    object Sorters {
      
      inline def apply(descending: Boolean, name: String): Sorters = {
        val __obj = js.Dynamic.literal(descending = descending.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
        __obj.asInstanceOf[Sorters]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Sorters] (val x: Self) extends AnyVal {
        
        inline def setDescending(value: Boolean): Self = StObject.set(x, "descending", value.asInstanceOf[js.Any])
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setSorted(value: Boolean): Self = StObject.set(x, "sorted", value.asInstanceOf[js.Any])
        
        inline def setSortedUndefined: Self = StObject.set(x, "sorted", js.undefined)
      }
    }
    
    /**
      * Defines the values for each filter field path of a condition.
      */
    trait XCondition extends StObject {
      
      /**
        * of the condition
        */
      var operator: String
      
      /**
        * of the condition
        */
      var values: js.Array[Any]
    }
    object XCondition {
      
      inline def apply(operator: String, values: js.Array[Any]): XCondition = {
        val __obj = js.Dynamic.literal(operator = operator.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
        __obj.asInstanceOf[XCondition]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: XCondition] (val x: Self) extends AnyVal {
        
        inline def setOperator(value: String): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
        
        inline def setValues(value: js.Array[Any]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
        
        inline def setValuesVarargs(value: Any*): Self = StObject.set(x, "values", js.Array(value*))
      }
    }
  }
  
  object filterbar {
    
    /**
      * @since 1.112.0
      */
    trait PropertyInfo extends StObject {
      
      /**
        * Defines that the filter value is treated as case-sensitive if set to `true`
        */
      var caseSensitive: js.UndefOr[Boolean] = js.undefined
      
      /**
        * Defines constraints for the data type of the property
        */
      var constraints: js.UndefOr[js.Object] = js.undefined
      
      /**
        * The name of the type of the property
        */
      var datatype: String
      
      /**
        * Describes how the value will be presented to the user
        */
      var display: js.UndefOr[
            FieldDisplay | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FieldDisplay * / any */ String)
          ] = js.undefined
      
      /**
        * Defines format options for the data type of the property
        */
      var formatOptions: js.UndefOr[js.Object] = js.undefined
      
      /**
        * The group identifier to which the property belongs
        */
      var group: js.UndefOr[String] = js.undefined
      
      /**
        * The group name of the group identifier
        */
      var groupLabel: js.UndefOr[String] = js.undefined
      
      /**
        * Defines if the filter is visible in the filter bar
        */
      var hiddenFilter: js.UndefOr[Boolean] = js.undefined
      
      /**
        * The label of the identifier
        */
      var label: String
      
      /**
        * Defines if the filter supports multiple values `-1` or single values `1`
        */
      var maxConditions: int
      
      /**
        * The alternative identifier of the property. Either path or name can be used, preferably is on path
        */
      var name: js.UndefOr[String] = js.undefined
      
      /**
        * The identifier of the property
        */
      var path: String
      
      /**
        * Defines if the filter is mandatory
        */
      var required: js.UndefOr[Boolean] = js.undefined
      
      /**
        * The tooltip of the identifier
        */
      var tooltip: js.UndefOr[String] = js.undefined
    }
    object PropertyInfo {
      
      inline def apply(datatype: String, label: String, maxConditions: int, path: String): PropertyInfo = {
        val __obj = js.Dynamic.literal(datatype = datatype.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], maxConditions = maxConditions.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
        __obj.asInstanceOf[PropertyInfo]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: PropertyInfo] (val x: Self) extends AnyVal {
        
        inline def setCaseSensitive(value: Boolean): Self = StObject.set(x, "caseSensitive", value.asInstanceOf[js.Any])
        
        inline def setCaseSensitiveUndefined: Self = StObject.set(x, "caseSensitive", js.undefined)
        
        inline def setConstraints(value: js.Object): Self = StObject.set(x, "constraints", value.asInstanceOf[js.Any])
        
        inline def setConstraintsUndefined: Self = StObject.set(x, "constraints", js.undefined)
        
        inline def setDatatype(value: String): Self = StObject.set(x, "datatype", value.asInstanceOf[js.Any])
        
        inline def setDisplay(
          value: FieldDisplay | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FieldDisplay * / any */ String)
        ): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
        
        inline def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
        
        inline def setFormatOptions(value: js.Object): Self = StObject.set(x, "formatOptions", value.asInstanceOf[js.Any])
        
        inline def setFormatOptionsUndefined: Self = StObject.set(x, "formatOptions", js.undefined)
        
        inline def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
        
        inline def setGroupLabel(value: String): Self = StObject.set(x, "groupLabel", value.asInstanceOf[js.Any])
        
        inline def setGroupLabelUndefined: Self = StObject.set(x, "groupLabel", js.undefined)
        
        inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
        
        inline def setHiddenFilter(value: Boolean): Self = StObject.set(x, "hiddenFilter", value.asInstanceOf[js.Any])
        
        inline def setHiddenFilterUndefined: Self = StObject.set(x, "hiddenFilter", js.undefined)
        
        inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
        
        inline def setMaxConditions(value: int): Self = StObject.set(x, "maxConditions", value.asInstanceOf[js.Any])
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
        
        inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
        
        inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
        
        inline def setTooltip(value: String): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
        
        inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
      }
    }
  }
}
