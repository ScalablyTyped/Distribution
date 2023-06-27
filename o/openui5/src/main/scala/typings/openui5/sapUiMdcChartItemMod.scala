package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreElementMod.ElementSettings
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiMdcChartItemMod {
  
  @JSImport("sap/ui/mdc/chart/Item", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `Item`.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends Item {
    def this(/**
      * initial settings for the new control
      */
    mSettings: ItemSettings) = this()
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
      * initial settings for the new control
      */
    mSettings: ItemSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * initial settings for the new control
      */
    mSettings: ItemSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/mdc/chart/Item", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.mdc.chart.Item with name `sClassName` and enriches it with the
      * information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.core.Element.extend}.
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
    oClassInfo: ClassInfo[T, Item]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, Item],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.mdc.chart.Item.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait Item
    extends typings.openui5.sapUiCoreElementMod.default {
    
    /**
      * Gets current value of property {@link #getLabel label}.
      *
      * Label for the item, either as a string literal or by a pointer, using the binding to some property containing
      * the label.
      *
      * @returns Value of property `label`
      */
    def getLabel(): String = js.native
    
    /**
      * @deprecated (since 1.115) - Please use `propertyKey` instead.
      *
      * Gets current value of property {@link #getName name}.
      *
      * The unique identifier of the chart item that reflects the name of the data property in the resulting
      * data set.
      *
      * @returns Value of property `name`
      */
    def getName(): String = js.native
    
    /**
      * @since 1.115
      *
      * Gets current value of property {@link #getPropertyKey propertyKey}.
      *
      * The unique identifier of the chart item that reflects the name of the data property in the resulting
      * data set.
      *
      * @returns Value of property `propertyKey`
      */
    def getPropertyKey(): String = js.native
    
    /**
      * Gets current value of property {@link #getRole role}.
      *
      * Specifies the role of the item for the chart (category, axis1...). This is specific for the used chart
      * library.
      *  **Note:** This property must not be changed after initialization.
      *
      * @returns Value of property `role`
      */
    def getRole(): String = js.native
    
    /**
      * Gets current value of property {@link #getType type}.
      *
      * Specifies the type of the item for the chart (groupable and aggregatable). This is specific for the used
      * chart library.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `type`
      */
    def getType(): String = js.native
    
    /**
      * Sets a new value for property {@link #getLabel label}.
      *
      * Label for the item, either as a string literal or by a pointer, using the binding to some property containing
      * the label.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setLabel(/**
      * New value for property `label`
      */
    sLabel: String): this.type = js.native
    
    /**
      * @deprecated (since 1.115) - Please use `propertyKey` instead.
      *
      * Sets a new value for property {@link #getName name}.
      *
      * The unique identifier of the chart item that reflects the name of the data property in the resulting
      * data set.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setName(/**
      * New value for property `name`
      */
    sName: String): this.type = js.native
    
    /**
      * @since 1.115
      *
      * Sets a new value for property {@link #getPropertyKey propertyKey}.
      *
      * The unique identifier of the chart item that reflects the name of the data property in the resulting
      * data set.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setPropertyKey(/**
      * New value for property `propertyKey`
      */
    sPropertyKey: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getRole role}.
      *
      * Specifies the role of the item for the chart (category, axis1...). This is specific for the used chart
      * library.
      *  **Note:** This property must not be changed after initialization.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setRole(/**
      * New value for property `role`
      */
    sRole: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getType type}.
      *
      * Specifies the type of the item for the chart (groupable and aggregatable). This is specific for the used
      * chart library.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `empty string`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setType(): this.type = js.native
    def setType(/**
      * New value for property `type`
      */
    sType: String): this.type = js.native
  }
  
  trait ItemSettings
    extends StObject
       with ElementSettings {
    
    /**
      * Label for the item, either as a string literal or by a pointer, using the binding to some property containing
      * the label.
      */
    var label: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * @deprecated (since 1.115) - Please use `propertyKey` instead.
      *
      * The unique identifier of the chart item that reflects the name of the data property in the resulting
      * data set.
      */
    var name: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * @since 1.115
      *
      * The unique identifier of the chart item that reflects the name of the data property in the resulting
      * data set.
      */
    var propertyKey: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Specifies the role of the item for the chart (category, axis1...). This is specific for the used chart
      * library.
      *  **Note:** This property must not be changed after initialization.
      */
    var role: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Specifies the type of the item for the chart (groupable and aggregatable). This is specific for the used
      * chart library.
      */
    var `type`: js.UndefOr[String | PropertyBindingInfo] = js.undefined
  }
  object ItemSettings {
    
    inline def apply(): ItemSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ItemSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ItemSettings] (val x: Self) extends AnyVal {
      
      inline def setLabel(value: String | PropertyBindingInfo): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setName(value: String | PropertyBindingInfo): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setPropertyKey(value: String | PropertyBindingInfo): Self = StObject.set(x, "propertyKey", value.asInstanceOf[js.Any])
      
      inline def setPropertyKeyUndefined: Self = StObject.set(x, "propertyKey", js.undefined)
      
      inline def setRole(value: String | PropertyBindingInfo): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      inline def setType(value: String | PropertyBindingInfo): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
