package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiMdcValuehelpBaseListContentMod.ListContentSettings
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiMdcValuehelpBaseFilterableListContentMod {
  
  @JSImport("sap/ui/mdc/valuehelp/base/FilterableListContent", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `FilterableListContent`.
    *
    * This is the basis for different value help list contents with filter functionality. It cannot be used
    * directly.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends FilterableListContent {
    def this(/**
      * Initial settings for the new element
      */
    mSettings: FilterableListContentSettings) = this()
    def this(/**
      * ID for the new element, generated automatically if no ID is given
      */
    sId: String) = this()
    def this(
      /**
      * ID for the new element, generated automatically if no ID is given
      */
    sId: String,
      /**
      * Initial settings for the new element
      */
    mSettings: FilterableListContentSettings
    ) = this()
    def this(
      /**
      * ID for the new element, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new element
      */
    mSettings: FilterableListContentSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/mdc/valuehelp/base/FilterableListContent", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.mdc.valuehelp.base.FilterableListContent with name `sClassName`
      * and enriches it with the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.mdc.valuehelp.base.ListContent.extend}.
      *
      * @returns Created class / constructor function
      */
    inline def extend[T /* <: Record[String, Any] */](/**
      * Name of the class being created
      */
    sClassName: String): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any]).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: Unit,
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, FilterableListContent]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, FilterableListContent],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.mdc.valuehelp.base.FilterableListContent.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait FilterableListContent
    extends typings.openui5.sapUiMdcValuehelpBaseListContentMod.default {
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Applies the filter to the content control
      */
    def applyFilters(): Unit = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Created a payload for a value
      *
      * @returns payload
      */
    def createConditionPayload(/**
      * values (key, description)
      */
    aValues: js.Array[Any], /**
      * context
      */
    vContext: Any): js.Object = js.native
    
    /**
      * Destroys the filterBar in the aggregation {@link #getFilterBar filterBar}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyFilterBar(): this.type = js.native
    
    /**
      * Gets current value of property {@link #getDescriptionPath descriptionPath}.
      *
      * The path of the description field in the content binding. If a table is used as content, this is the
      * binding path of the description of the items.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `descriptionPath`
      */
    def getDescriptionPath(): String = js.native
    
    /**
      * Gets content of aggregation {@link #getFilterBar filterBar}.
      *
      * FilterBar
      */
    def getFilterBar(): typings.openui5.sapUiMdcFilterbarVhFilterBarMod.default = js.native
    
    /**
      * Gets current value of property {@link #getFilterFields filterFields}.
      *
      * The fields based on which the table data is filtered. For filtering the value of the `filterValue` property
      * is used.
      *
      * If set to `$search` and the used binding supports search requests, a $search request is used for filtering.
      *
      * If set to one or more properties, the filters for these properties are used for filtering. These filters
      * are set on the `ListBinding` used. The properties need to be separated by commas and enclosed by "*"
      * characters. (`"*Property1,Property2*"`)
      *
      * If it is empty, no suggestion is available.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `filterFields`
      */
    def getFilterFields(): String = js.native
    
    /**
      * Gets current value of property {@link #getGroup group}.
      *
      * If set, all contents with the same group are arranged together on one tab.
      *
      * The label of the groups can be defined on the container via {@link sap.ui.mdc.valuehelp.Dialog#setGroupConfig setGroupConfig}.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `group`
      */
    def getGroup(): String = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Gets an item for a BindingContext
      *
      * @returns Item object containing `key`, `description` and `payload`
      */
    def getItemFromContext(
      /**
      * BindingContext
      */
    oBindingContext: typings.openui5.sapUiModelContextMod.default,
      /**
      * options
      */
    oOptions: js.Object
    ): js.Object = js.native
    
    /**
      * Gets current value of property {@link #getKeyPath keyPath}.
      *
      * The path of the key field in the content binding. If a table is used as content, this is the binding
      * path of the key of the items.
      *
      * If not set, the FieldPath of the assigned field is used.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `keyPath`
      */
    def getKeyPath(): String = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Gets the `BindingInfo` of the content
      *
      * @returns ListBindingInfo
      */
    def getListBindingInfo(): AggregationBindingInfo = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Gets the conditions that are selecatble from list content
      *
      * This are validated conditions as other conditions are shown on the {@link sap.ui.mdc.valuehelp.base.DefineConditionPanel DefineConditionPanel}
      *
      * @returns ListBindingInfo
      */
    def getSelectableConditions(): AggregationBindingInfo = js.native
    
    /**
      * Sets a new value for property {@link #getDescriptionPath descriptionPath}.
      *
      * The path of the description field in the content binding. If a table is used as content, this is the
      * binding path of the description of the items.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `empty string`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setDescriptionPath(): this.type = js.native
    def setDescriptionPath(/**
      * New value for property `descriptionPath`
      */
    sDescriptionPath: String): this.type = js.native
    
    /**
      * Sets the aggregated {@link #getFilterBar filterBar}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setFilterBar(
      /**
      * The filterBar to set
      */
    oFilterBar: typings.openui5.sapUiMdcFilterbarVhFilterBarMod.default
    ): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getFilterFields filterFields}.
      *
      * The fields based on which the table data is filtered. For filtering the value of the `filterValue` property
      * is used.
      *
      * If set to `$search` and the used binding supports search requests, a $search request is used for filtering.
      *
      * If set to one or more properties, the filters for these properties are used for filtering. These filters
      * are set on the `ListBinding` used. The properties need to be separated by commas and enclosed by "*"
      * characters. (`"*Property1,Property2*"`)
      *
      * If it is empty, no suggestion is available.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `empty string`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setFilterFields(): this.type = js.native
    def setFilterFields(/**
      * New value for property `filterFields`
      */
    sFilterFields: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getGroup group}.
      *
      * If set, all contents with the same group are arranged together on one tab.
      *
      * The label of the groups can be defined on the container via {@link sap.ui.mdc.valuehelp.Dialog#setGroupConfig setGroupConfig}.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `empty string`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setGroup(): this.type = js.native
    def setGroup(/**
      * New value for property `group`
      */
    sGroup: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getKeyPath keyPath}.
      *
      * The path of the key field in the content binding. If a table is used as content, this is the binding
      * path of the key of the items.
      *
      * If not set, the FieldPath of the assigned field is used.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `empty string`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setKeyPath(): this.type = js.native
    def setKeyPath(/**
      * New value for property `keyPath`
      */
    sKeyPath: String): this.type = js.native
  }
  
  trait FilterableListContentSettings
    extends StObject
       with ListContentSettings {
    
    /**
      * The path of the description field in the content binding. If a table is used as content, this is the
      * binding path of the description of the items.
      */
    var descriptionPath: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * FilterBar
      */
    var filterBar: js.UndefOr[typings.openui5.sapUiMdcFilterbarVhFilterBarMod.default] = js.undefined
    
    /**
      * The fields based on which the table data is filtered. For filtering the value of the `filterValue` property
      * is used.
      *
      * If set to `$search` and the used binding supports search requests, a $search request is used for filtering.
      *
      * If set to one or more properties, the filters for these properties are used for filtering. These filters
      * are set on the `ListBinding` used. The properties need to be separated by commas and enclosed by "*"
      * characters. (`"*Property1,Property2*"`)
      *
      * If it is empty, no suggestion is available.
      */
    var filterFields: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * If set, all contents with the same group are arranged together on one tab.
      *
      * The label of the groups can be defined on the container via {@link sap.ui.mdc.valuehelp.Dialog#setGroupConfig setGroupConfig}.
      */
    var group: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * The path of the key field in the content binding. If a table is used as content, this is the binding
      * path of the key of the items.
      *
      * If not set, the FieldPath of the assigned field is used.
      */
    var keyPath: js.UndefOr[String | PropertyBindingInfo] = js.undefined
  }
  object FilterableListContentSettings {
    
    inline def apply(): FilterableListContentSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FilterableListContentSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FilterableListContentSettings] (val x: Self) extends AnyVal {
      
      inline def setDescriptionPath(value: String | PropertyBindingInfo): Self = StObject.set(x, "descriptionPath", value.asInstanceOf[js.Any])
      
      inline def setDescriptionPathUndefined: Self = StObject.set(x, "descriptionPath", js.undefined)
      
      inline def setFilterBar(value: typings.openui5.sapUiMdcFilterbarVhFilterBarMod.default): Self = StObject.set(x, "filterBar", value.asInstanceOf[js.Any])
      
      inline def setFilterBarUndefined: Self = StObject.set(x, "filterBar", js.undefined)
      
      inline def setFilterFields(value: String | PropertyBindingInfo): Self = StObject.set(x, "filterFields", value.asInstanceOf[js.Any])
      
      inline def setFilterFieldsUndefined: Self = StObject.set(x, "filterFields", js.undefined)
      
      inline def setGroup(value: String | PropertyBindingInfo): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
      
      inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
      
      inline def setKeyPath(value: String | PropertyBindingInfo): Self = StObject.set(x, "keyPath", value.asInstanceOf[js.Any])
      
      inline def setKeyPathUndefined: Self = StObject.set(x, "keyPath", js.undefined)
    }
  }
}
