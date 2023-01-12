package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapMViewSettingsItemMod.ViewSettingsItemSettings
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMViewSettingsCustomItemMod {
  
  @JSImport("sap/m/ViewSettingsCustomItem", JSImport.Default)
  @js.native
  /**
    * Constructor for a new ViewSettingsCustomItem.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends ViewSettingsCustomItem {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: ViewSettingsCustomItemSettings) = this()
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
    mSettings: ViewSettingsCustomItemSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: ViewSettingsCustomItemSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/m/ViewSettingsCustomItem", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.ViewSettingsCustomItem with name `sClassName` and enriches it with
      * the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.m.ViewSettingsItem.extend}.
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
    oClassInfo: ClassInfo[T, ViewSettingsCustomItem]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, ViewSettingsCustomItem],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.m.ViewSettingsCustomItem.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait ViewSettingsCustomItem
    extends typings.openui5.sapMViewSettingsItemMod.default {
    
    def clone(
      /**
      * a suffix to be appended to the cloned object id
      */
    sIdSuffix: String,
      /**
      * an array of local IDs within the cloned hierarchy (internally used)
      */
    aLocalIds: js.Array[String],
      /**
      * configuration object
      */
    oOptions: js.Object
    ): this.type = js.native
    def clone(
      /**
      * a suffix to be appended to the cloned object id
      */
    sIdSuffix: String,
      /**
      * an array of local IDs within the cloned hierarchy (internally used)
      */
    aLocalIds: Unit,
      /**
      * configuration object
      */
    oOptions: js.Object
    ): this.type = js.native
    def clone(
      /**
      * a suffix to be appended to the cloned object id
      */
    sIdSuffix: Unit,
      /**
      * an array of local IDs within the cloned hierarchy (internally used)
      */
    aLocalIds: js.Array[String],
      /**
      * configuration object
      */
    oOptions: js.Object
    ): this.type = js.native
    def clone(
      /**
      * a suffix to be appended to the cloned object id
      */
    sIdSuffix: Unit,
      /**
      * an array of local IDs within the cloned hierarchy (internally used)
      */
    aLocalIds: Unit,
      /**
      * configuration object
      */
    oOptions: js.Object
    ): this.type = js.native
    
    /**
      * Destroys the customControl in the aggregation {@link #getCustomControl customControl}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyCustomControl(): this.type = js.native
    
    /**
      * Internally the control is handled as a managed object instead of an aggregation because this control
      * is sometimes aggregated in other controls like a popover or a dialog.
      *
      * @returns oControl a control used for filtering purposes
      */
    def getCustomControl(): typings.openui5.sapUiCoreControlMod.default = js.native
    
    /**
      * Gets current value of property {@link #getFilterCount filterCount}.
      *
      * The number of currently active filters for this custom filter item. It will be displayed in the filter
      * list of the ViewSettingsDialog to represent the filter state of the custom control.
      *
      * Default value is `0`.
      *
      * @returns Value of property `filterCount`
      */
    def getFilterCount(): int = js.native
    
    /**
      * Internally the control is handled as a managed object instead of an aggregation as this control is sometimes
      * aggregated in other controls like a popover or a dialog.
      *
      * @returns this pointer for chaining
      */
    def setCustomControl(
      /**
      * A control used for filtering purposes
      */
    oControl: typings.openui5.sapUiCoreControlMod.default
    ): this.type = js.native
    
    /**
      * Sets the filterCount without invalidating the control as it is never rendered directly.
      *
      * @returns this pointer for chaining
      */
    def setFilterCount(/**
      * The new value for property filterCount
      */
    iValue: int): this.type = js.native
  }
  
  trait ViewSettingsCustomItemSettings
    extends StObject
       with ViewSettingsItemSettings {
    
    /**
      * A custom control for the filter field. It can be used for complex filtering mechanisms.
      */
    var customControl: js.UndefOr[typings.openui5.sapUiCoreControlMod.default] = js.undefined
    
    /**
      * The number of currently active filters for this custom filter item. It will be displayed in the filter
      * list of the ViewSettingsDialog to represent the filter state of the custom control.
      */
    var filterCount: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
  }
  object ViewSettingsCustomItemSettings {
    
    inline def apply(): ViewSettingsCustomItemSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ViewSettingsCustomItemSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ViewSettingsCustomItemSettings] (val x: Self) extends AnyVal {
      
      inline def setCustomControl(value: typings.openui5.sapUiCoreControlMod.default): Self = StObject.set(x, "customControl", value.asInstanceOf[js.Any])
      
      inline def setCustomControlUndefined: Self = StObject.set(x, "customControl", js.undefined)
      
      inline def setFilterCount(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "filterCount", value.asInstanceOf[js.Any])
      
      inline def setFilterCountUndefined: Self = StObject.set(x, "filterCount", js.undefined)
    }
  }
}
