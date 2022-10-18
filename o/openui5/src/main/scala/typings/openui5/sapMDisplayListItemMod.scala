package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapMListItemBaseMod.ListItemBaseSettings
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreLibraryMod.TextDirection
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMDisplayListItemMod {
  
  @JSImport("sap/m/DisplayListItem", JSImport.Default)
  @js.native
  /**
    * Constructor for a new DisplayListItem.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    * See:
    * 	{@link fiori:/display-list-item/ Display List Item}
    */
  open class default () extends DisplayListItem {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: DisplayListItemSettings) = this()
    def this(/**
      * Id for the new control, generated automatically if no id is given
      */
    sId: String) = this()
    def this(
      /**
      * Id for the new control, generated automatically if no id is given
      */
    sId: String,
      /**
      * Initial settings for the new control
      */
    mSettings: DisplayListItemSettings
    ) = this()
    def this(
      /**
      * Id for the new control, generated automatically if no id is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: DisplayListItemSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/m/DisplayListItem", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.DisplayListItem with name `sClassName` and enriches it with the
      * information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.m.ListItemBase.extend}.
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
    oClassInfo: ClassInfo[T, DisplayListItem]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, DisplayListItem],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.m.DisplayListItem.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait DisplayListItem
    extends typings.openui5.sapMListItemBaseMod.default {
    
    /**
      * Gets current value of property {@link #getLabel label}.
      *
      * Defines the label of the list item.
      *
      * @returns Value of property `label`
      */
    def getLabel(): String = js.native
    
    /**
      * Gets current value of property {@link #getValue value}.
      *
      * Defines the value of the list item.
      *
      * @returns Value of property `value`
      */
    def getValue(): String = js.native
    
    /**
      * @SINCE 1.28.0
      *
      * Gets current value of property {@link #getValueTextDirection valueTextDirection}.
      *
      * Defines the `value` text directionality with enumerated options. By default, the control inherits text
      * direction from the DOM.
      *
      * Default value is `Inherit`.
      *
      * @returns Value of property `valueTextDirection`
      */
    def getValueTextDirection(): TextDirection | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextDirection * / any */ String) = js.native
    
    /**
      * Sets a new value for property {@link #getLabel label}.
      *
      * Defines the label of the list item.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setLabel(): this.type = js.native
    def setLabel(/**
      * New value for property `label`
      */
    sLabel: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getValue value}.
      *
      * Defines the value of the list item.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setValue(): this.type = js.native
    def setValue(/**
      * New value for property `value`
      */
    sValue: String): this.type = js.native
    
    /**
      * @SINCE 1.28.0
      *
      * Sets a new value for property {@link #getValueTextDirection valueTextDirection}.
      *
      * Defines the `value` text directionality with enumerated options. By default, the control inherits text
      * direction from the DOM.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Inherit`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setValueTextDirection(): this.type = js.native
    def setValueTextDirection(
      /**
      * New value for property `valueTextDirection`
      */
    sValueTextDirection: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextDirection * / any */ String
    ): this.type = js.native
    def setValueTextDirection(/**
      * New value for property `valueTextDirection`
      */
    sValueTextDirection: TextDirection): this.type = js.native
  }
  
  trait DisplayListItemSettings
    extends StObject
       with ListItemBaseSettings {
    
    /**
      * Defines the label of the list item.
      */
    var label: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Defines the value of the list item.
      */
    var value: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * @SINCE 1.28.0
      *
      * Defines the `value` text directionality with enumerated options. By default, the control inherits text
      * direction from the DOM.
      */
    var valueTextDirection: js.UndefOr[
        TextDirection | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextDirection * / any */ String) | PropertyBindingInfo
      ] = js.undefined
  }
  object DisplayListItemSettings {
    
    inline def apply(): DisplayListItemSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DisplayListItemSettings]
    }
    
    extension [Self <: DisplayListItemSettings](x: Self) {
      
      inline def setLabel(value: String | PropertyBindingInfo): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setValue(value: String | PropertyBindingInfo): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueTextDirection(
        value: TextDirection | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextDirection * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "valueTextDirection", value.asInstanceOf[js.Any])
      
      inline def setValueTextDirectionUndefined: Self = StObject.set(x, "valueTextDirection", js.undefined)
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
