package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.std.Object
import typings.std.PropertyKey
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiMdcP13nPanelsFilterPanelMod {
  
  @JSImport("sap/ui/mdc/p13n/panels/FilterPanel", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `FilterPanel`.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default ()
    extends StObject
       with FilterPanel {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: FilterPanelSettings) = this()
    def this(/**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: String) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: String,
      /**
      * Initial settings for the new control
      */
    mSettings: FilterPanelSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: FilterPanelSettings
    ) = this()
    
    /** The initial value of Object.prototype.constructor is the standard built-in Object constructor. */
    /* standard es5 */
    /* CompleteClass */
    var constructor: js.Function = js.native
    
    /**
      * Gets current value of property {@link #getItemFactory itemFactory}.
      *
      * A factory function that will be called whenever the user selects a new entry from the `ComboBox`. The
      * factory must return a single control instance of an input based control to provide custom filter capabilities.
      * This control is then going to be added in the grid layout provided by the `QueryPanel`. Whenever the
      * `FilterPanel#setP13nData` method will be called, the `active` can be used to update the current set of
      * active factory controls.
      *
      * **Note:**: The Panel will not handle the lifecylce of the provided factory control instance, in case
      * the row is going to be removed, the according consumer needs to decide about destroying or keeping the
      * control instance.
      *
      * @returns Value of property `itemFactory`
      */
    /* CompleteClass */
    override def getItemFactory(): js.Function = js.native
    
    /**
      * Determines whether an object has a property with the specified name.
      * @param v A property name.
      */
    /* standard es5 */
    /* CompleteClass */
    override def hasOwnProperty(v: PropertyKey): Boolean = js.native
    
    /**
      * Determines whether a specified property is enumerable.
      * @param v A property name.
      */
    /* standard es5 */
    /* CompleteClass */
    override def propertyIsEnumerable(v: PropertyKey): Boolean = js.native
    
    /**
      * Sets a new value for property {@link #getItemFactory itemFactory}.
      *
      * A factory function that will be called whenever the user selects a new entry from the `ComboBox`. The
      * factory must return a single control instance of an input based control to provide custom filter capabilities.
      * This control is then going to be added in the grid layout provided by the `QueryPanel`. Whenever the
      * `FilterPanel#setP13nData` method will be called, the `active` can be used to update the current set of
      * active factory controls.
      *
      * **Note:**: The Panel will not handle the lifecylce of the provided factory control instance, in case
      * the row is going to be removed, the according consumer needs to decide about destroying or keeping the
      * control instance.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    /* CompleteClass */
    override def setItemFactory(/**
      * New value for property `itemFactory`
      */
    fnItemFactory: js.Function): this.type = js.native
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/mdc/p13n/panels/FilterPanel", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.mdc.p13n.panels.FilterPanel with name `sClassName` and enriches
      * it with the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.m.p13n.QueryPanel.extend}.
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
    oClassInfo: ClassInfo[T, FilterPanel]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, FilterPanel],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.mdc.p13n.panels.FilterPanel.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
    
    /**
      * Sets the personalization state of the panel instance.
      *
      * @returns The SortPanel instance
      */
    inline def setP13nData(/**
      * An array containing the personalization state
      */
    aP13nData: FilterItem): FilterPanel = ^.asInstanceOf[js.Dynamic].applyDynamic("setP13nData")(aP13nData.asInstanceOf[js.Any]).asInstanceOf[FilterPanel]
  }
  
  trait FilterItem extends StObject {
    
    /**
      * Defines whether there is a visible grid shown in the panel for this key, also triggers the call of the
      * `#itemFactory` function
      */
    var active: Boolean
    
    /**
      * The label describing the personalization item
      */
    var label: String
    
    /**
      * The unique key of the item
      */
    var name: String
  }
  object FilterItem {
    
    inline def apply(active: Boolean, label: String, name: String): FilterItem = {
      val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[FilterItem]
    }
    
    extension [Self <: FilterItem](x: Self) {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait FilterPanel
    extends StObject
       with Object {
    
    /**
      * Gets current value of property {@link #getItemFactory itemFactory}.
      *
      * A factory function that will be called whenever the user selects a new entry from the `ComboBox`. The
      * factory must return a single control instance of an input based control to provide custom filter capabilities.
      * This control is then going to be added in the grid layout provided by the `QueryPanel`. Whenever the
      * `FilterPanel#setP13nData` method will be called, the `active` can be used to update the current set of
      * active factory controls.
      *
      * **Note:**: The Panel will not handle the lifecylce of the provided factory control instance, in case
      * the row is going to be removed, the according consumer needs to decide about destroying or keeping the
      * control instance.
      *
      * @returns Value of property `itemFactory`
      */
    def getItemFactory(): js.Function
    
    /**
      * Sets a new value for property {@link #getItemFactory itemFactory}.
      *
      * A factory function that will be called whenever the user selects a new entry from the `ComboBox`. The
      * factory must return a single control instance of an input based control to provide custom filter capabilities.
      * This control is then going to be added in the grid layout provided by the `QueryPanel`. Whenever the
      * `FilterPanel#setP13nData` method will be called, the `active` can be used to update the current set of
      * active factory controls.
      *
      * **Note:**: The Panel will not handle the lifecylce of the provided factory control instance, in case
      * the row is going to be removed, the according consumer needs to decide about destroying or keeping the
      * control instance.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setItemFactory(/**
      * New value for property `itemFactory`
      */
    fnItemFactory: js.Function): this.type
  }
  object FilterPanel {
    
    inline def apply(
      constructor: js.Function,
      getItemFactory: () => js.Function,
      hasOwnProperty: PropertyKey => Boolean,
      propertyIsEnumerable: PropertyKey => Boolean,
      setItemFactory: js.Function => FilterPanel
    ): FilterPanel = {
      val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], getItemFactory = js.Any.fromFunction0(getItemFactory), hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), setItemFactory = js.Any.fromFunction1(setItemFactory))
      __obj.asInstanceOf[FilterPanel]
    }
    
    extension [Self <: FilterPanel](x: Self) {
      
      inline def setGetItemFactory(value: () => js.Function): Self = StObject.set(x, "getItemFactory", js.Any.fromFunction0(value))
      
      inline def setSetItemFactory(value: js.Function => FilterPanel): Self = StObject.set(x, "setItemFactory", js.Any.fromFunction1(value))
    }
  }
  
  trait FilterPanelSettings
    extends StObject
       with Object {
    
    /**
      * A factory function that will be called whenever the user selects a new entry from the `ComboBox`. The
      * factory must return a single control instance of an input based control to provide custom filter capabilities.
      * This control is then going to be added in the grid layout provided by the `QueryPanel`. Whenever the
      * `FilterPanel#setP13nData` method will be called, the `active` can be used to update the current set of
      * active factory controls.
      *
      * **Note:**: The Panel will not handle the lifecylce of the provided factory control instance, in case
      * the row is going to be removed, the according consumer needs to decide about destroying or keeping the
      * control instance.
      */
    var itemFactory: js.UndefOr[
        js.Function | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object FilterPanelSettings {
    
    inline def apply(
      constructor: js.Function,
      hasOwnProperty: PropertyKey => Boolean,
      propertyIsEnumerable: PropertyKey => Boolean
    ): FilterPanelSettings = {
      val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
      __obj.asInstanceOf[FilterPanelSettings]
    }
    
    extension [Self <: FilterPanelSettings](x: Self) {
      
      inline def setItemFactory(value: js.Function | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "itemFactory", value.asInstanceOf[js.Any])
      
      inline def setItemFactoryUndefined: Self = StObject.set(x, "itemFactory", js.undefined)
    }
  }
}
