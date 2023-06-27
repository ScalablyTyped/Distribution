package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreItemMod.ItemSettings
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMViewSettingsItemMod {
  
  @JSImport("sap/m/ViewSettingsItem", JSImport.Default)
  @js.native
  /**
    * Constructor for a new ViewSettingsItem.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends ViewSettingsItem {
    def this(/**
      * initial settings for the new control
      */
    mSettings: ViewSettingsItemSettings) = this()
    def this(/**
      * id for the new control, generated automatically if no id is given
      */
    sId: String) = this()
    def this(
      /**
      * id for the new control, generated automatically if no id is given
      */
    sId: String,
      /**
      * initial settings for the new control
      */
    mSettings: ViewSettingsItemSettings
    ) = this()
    def this(
      /**
      * id for the new control, generated automatically if no id is given
      */
    sId: Unit,
      /**
      * initial settings for the new control
      */
    mSettings: ViewSettingsItemSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/m/ViewSettingsItem", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.ViewSettingsItem with name `sClassName` and enriches it with the
      * information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.core.Item.extend}.
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
    oClassInfo: ClassInfo[T, ViewSettingsItem]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, ViewSettingsItem],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.m.ViewSettingsItem.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait ViewSettingsItem
    extends typings.openui5.sapUiCoreItemMod.default {
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:itemPropertyChanged itemPropertyChanged} event
      * of this `sap.m.ViewSettingsItem`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.ViewSettingsItem` itself.
      *
      * Let the outside world know that some of its properties has changed.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachItemPropertyChanged(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ViewSettingsItemItemPropertyChangedEvent, Unit]
    ): this.type = js.native
    def attachItemPropertyChanged(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ViewSettingsItemItemPropertyChangedEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.ViewSettingsItem` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:itemPropertyChanged itemPropertyChanged} event
      * of this `sap.m.ViewSettingsItem`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.ViewSettingsItem` itself.
      *
      * Let the outside world know that some of its properties has changed.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachItemPropertyChanged(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ViewSettingsItemItemPropertyChangedEvent, Unit]
    ): this.type = js.native
    def attachItemPropertyChanged(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ViewSettingsItemItemPropertyChangedEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.ViewSettingsItem` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:itemPropertyChanged itemPropertyChanged} event
      * of this `sap.m.ViewSettingsItem`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachItemPropertyChanged(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ViewSettingsItemItemPropertyChangedEvent, Unit]
    ): this.type = js.native
    def detachItemPropertyChanged(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ ViewSettingsItemItemPropertyChangedEvent, Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Fires event {@link #event:itemPropertyChanged itemPropertyChanged} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireItemPropertyChanged(): this.type = js.native
    def fireItemPropertyChanged(
      /**
      * Parameters to pass along with the event
      */
    mParameters: ViewSettingsItem$ItemPropertyChangedEventParameters
    ): this.type = js.native
    
    /**
      * Gets current value of property {@link #getSelected selected}.
      *
      * Selected state of the item. If set to "true", the item will be displayed as selected in the view settings
      * dialog.
      *
      * Default value is `false`.
      *
      * @returns Value of property `selected`
      */
    def getSelected(): Boolean = js.native
    
    /**
      * Sets a new value for property {@link #getSelected selected}.
      *
      * Selected state of the item. If set to "true", the item will be displayed as selected in the view settings
      * dialog.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setSelected(): this.type = js.native
    def setSelected(/**
      * New value for property `selected`
      */
    bSelected: Boolean): this.type = js.native
  }
  
  trait ViewSettingsItem$ItemPropertyChangedEventParameters extends StObject {
    
    /**
      * Instance of the item that changed.
      */
    var changedItem: js.UndefOr[ViewSettingsItem] = js.undefined
    
    /**
      * Key of the changed property.
      */
    var propertyKey: js.UndefOr[String] = js.undefined
    
    /**
      * Value of the changed property.
      */
    var propertyValue: js.UndefOr[Any] = js.undefined
  }
  object ViewSettingsItem$ItemPropertyChangedEventParameters {
    
    inline def apply(): ViewSettingsItem$ItemPropertyChangedEventParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ViewSettingsItem$ItemPropertyChangedEventParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ViewSettingsItem$ItemPropertyChangedEventParameters] (val x: Self) extends AnyVal {
      
      inline def setChangedItem(value: ViewSettingsItem): Self = StObject.set(x, "changedItem", value.asInstanceOf[js.Any])
      
      inline def setChangedItemUndefined: Self = StObject.set(x, "changedItem", js.undefined)
      
      inline def setPropertyKey(value: String): Self = StObject.set(x, "propertyKey", value.asInstanceOf[js.Any])
      
      inline def setPropertyKeyUndefined: Self = StObject.set(x, "propertyKey", js.undefined)
      
      inline def setPropertyValue(value: Any): Self = StObject.set(x, "propertyValue", value.asInstanceOf[js.Any])
      
      inline def setPropertyValueUndefined: Self = StObject.set(x, "propertyValue", js.undefined)
    }
  }
  
  type ViewSettingsItemItemPropertyChangedEvent = typings.openui5.sapUiBaseEventMod.default[ViewSettingsItem$ItemPropertyChangedEventParameters]
  
  type ViewSettingsItemItemPropertyChangedEventParameters = ViewSettingsItem$ItemPropertyChangedEventParameters
  
  trait ViewSettingsItemSettings
    extends StObject
       with ItemSettings {
    
    /**
      * Let the outside world know that some of its properties has changed.
      */
    var itemPropertyChanged: js.UndefOr[
        js.Function1[
          /* oEvent */ typings.openui5.sapUiBaseEventMod.default[ViewSettingsItem$ItemPropertyChangedEventParameters], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * Selected state of the item. If set to "true", the item will be displayed as selected in the view settings
      * dialog.
      */
    var selected: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object ViewSettingsItemSettings {
    
    inline def apply(): ViewSettingsItemSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ViewSettingsItemSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ViewSettingsItemSettings] (val x: Self) extends AnyVal {
      
      inline def setItemPropertyChanged(
        value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[ViewSettingsItem$ItemPropertyChangedEventParameters] => Unit
      ): Self = StObject.set(x, "itemPropertyChanged", js.Any.fromFunction1(value))
      
      inline def setItemPropertyChangedUndefined: Self = StObject.set(x, "itemPropertyChanged", js.undefined)
      
      inline def setSelected(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
    }
  }
}
