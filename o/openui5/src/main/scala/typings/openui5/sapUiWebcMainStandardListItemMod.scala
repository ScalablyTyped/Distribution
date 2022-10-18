package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiCoreLibraryMod.ValueState
import typings.openui5.sapUiWebcMainLibraryMod.IListItem
import typings.openui5.sapUiWebcMainLibraryMod.ListItemType
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiWebcMainStandardListItemMod {
  
  @JSImport("sap/ui/webc/main/StandardListItem", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `StandardListItem`.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends StandardListItem {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: StandardListItemSettings) = this()
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
    mSettings: StandardListItemSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: StandardListItemSettings
    ) = this()
    
    /* CompleteClass */
    var __implements__sap_ui_webc_main_IListItem: Boolean = js.native
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/webc/main/StandardListItem", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.webc.main.StandardListItem with name `sClassName` and enriches
      * it with the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.webc.common.WebComponent.extend}.
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
    oClassInfo: ClassInfo[T, StandardListItem]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, StandardListItem],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.webc.main.StandardListItem.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiWebcCommonWebComponentMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiWebcCommonWebComponentMetadataMod.default]
  }
  
  @js.native
  trait StandardListItem
    extends typings.openui5.sapUiWebcCommonWebComponentMod.default
       with IListItem {
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:detailClick detailClick} event of this `sap.ui.webc.main.StandardListItem`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.webc.main.StandardListItem` itself.
      *
      * Fired when the user clicks on the detail button when type is `Detail`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachDetailClick(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachDetailClick(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.webc.main.StandardListItem` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:detailClick detailClick} event of this `sap.ui.webc.main.StandardListItem`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.webc.main.StandardListItem` itself.
      *
      * Fired when the user clicks on the detail button when type is `Detail`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachDetailClick(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachDetailClick(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.webc.main.StandardListItem` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:detailClick detailClick} event of this `sap.ui.webc.main.StandardListItem`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachDetailClick(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachDetailClick(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Fires event {@link #event:detailClick detailClick} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireDetailClick(): this.type = js.native
    def fireDetailClick(/**
      * Parameters to pass along with the event
      */
    mParameters: js.Object): this.type = js.native
    
    /**
      * Gets current value of property {@link #getAccessibleName accessibleName}.
      *
      * Defines the text alternative of the component. Note: If not provided a default text alternative will
      * be set, if present.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `accessibleName`
      */
    def getAccessibleName(): String = js.native
    
    /**
      * Gets current value of property {@link #getAdditionalText additionalText}.
      *
      * Defines the `additionalText`, displayed in the end of the list item.
      *
      * @returns Value of property `additionalText`
      */
    def getAdditionalText(): String = js.native
    
    /**
      * Gets current value of property {@link #getAdditionalTextState additionalTextState}.
      *
      * Defines the state of the `additionalText`.
      *  Available options are: `"None"` (by default), `"Success"`, `"Warning"`, `"Information"` and `"Erorr"`.
      *
      * Default value is `None`.
      *
      * @returns Value of property `additionalTextState`
      */
    def getAdditionalTextState(): ValueState | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ValueState * / any */ String) = js.native
    
    /**
      * Gets current value of property {@link #getDescription description}.
      *
      * Defines the description displayed right under the item text, if such is present.
      *
      * @returns Value of property `description`
      */
    def getDescription(): String = js.native
    
    /**
      * Gets current value of property {@link #getIcon icon}.
      *
      * Defines the `icon` source URI.
      *
      *  **Note:** SAP-icons font provides numerous built-in icons. To find all the available icons, see the
      * {@link demo:sap/m/demokit/iconExplorer/webapp/index.html Icon Explorer}.
      *
      * @returns Value of property `icon`
      */
    def getIcon(): String = js.native
    
    /**
      * Gets current value of property {@link #getIconEnd iconEnd}.
      *
      * Defines whether the `icon` should be displayed in the beginning of the list item or in the end.
      *
      *  **Note:** If `image` is set, the `icon` would be displayed after the `image`.
      *
      * Default value is `false`.
      *
      * @returns Value of property `iconEnd`
      */
    def getIconEnd(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getImage image}.
      *
      * Defines the `image` source URI.
      *
      *  **Note:** The `image` would be displayed in the beginning of the list item.
      *
      * @returns Value of property `image`
      */
    def getImage(): String = js.native
    
    /**
      * Gets current value of property {@link #getSelected selected}.
      *
      * Defines the selected state of the `ListItem`.
      *
      * Default value is `false`.
      *
      * @returns Value of property `selected`
      */
    def getSelected(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getText text}.
      *
      * Defines the content of the control
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `text`
      */
    def getText(): String = js.native
    
    /**
      * Gets current value of property {@link #getType type}.
      *
      * Defines the visual indication and behavior of the list items. Available options are `Active` (by default),
      * `Inactive` and `Detail`.
      *
      *  **Note:** When set to `Active`, the item will provide visual response upon press and hover, while with
      * type `Inactive` and `Detail` - will not.
      *
      * Default value is `Active`.
      *
      * @returns Value of property `type`
      */
    def getType(): ListItemType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ListItemType * / any */ String) = js.native
    
    /**
      * Sets a new value for property {@link #getAccessibleName accessibleName}.
      *
      * Defines the text alternative of the component. Note: If not provided a default text alternative will
      * be set, if present.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `empty string`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setAccessibleName(): this.type = js.native
    def setAccessibleName(/**
      * New value for property `accessibleName`
      */
    sAccessibleName: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getAdditionalText additionalText}.
      *
      * Defines the `additionalText`, displayed in the end of the list item.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setAdditionalText(/**
      * New value for property `additionalText`
      */
    sAdditionalText: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getAdditionalTextState additionalTextState}.
      *
      * Defines the state of the `additionalText`.
      *  Available options are: `"None"` (by default), `"Success"`, `"Warning"`, `"Information"` and `"Erorr"`.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `None`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setAdditionalTextState(): this.type = js.native
    def setAdditionalTextState(
      /**
      * New value for property `additionalTextState`
      */
    sAdditionalTextState: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ValueState * / any */ String
    ): this.type = js.native
    def setAdditionalTextState(/**
      * New value for property `additionalTextState`
      */
    sAdditionalTextState: ValueState): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getDescription description}.
      *
      * Defines the description displayed right under the item text, if such is present.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setDescription(/**
      * New value for property `description`
      */
    sDescription: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getIcon icon}.
      *
      * Defines the `icon` source URI.
      *
      *  **Note:** SAP-icons font provides numerous built-in icons. To find all the available icons, see the
      * {@link demo:sap/m/demokit/iconExplorer/webapp/index.html Icon Explorer}.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setIcon(/**
      * New value for property `icon`
      */
    sIcon: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getIconEnd iconEnd}.
      *
      * Defines whether the `icon` should be displayed in the beginning of the list item or in the end.
      *
      *  **Note:** If `image` is set, the `icon` would be displayed after the `image`.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setIconEnd(): this.type = js.native
    def setIconEnd(/**
      * New value for property `iconEnd`
      */
    bIconEnd: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getImage image}.
      *
      * Defines the `image` source URI.
      *
      *  **Note:** The `image` would be displayed in the beginning of the list item.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setImage(/**
      * New value for property `image`
      */
    sImage: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getSelected selected}.
      *
      * Defines the selected state of the `ListItem`.
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
    
    /**
      * Sets a new value for property {@link #getText text}.
      *
      * Defines the content of the control
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `empty string`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setText(): this.type = js.native
    def setText(/**
      * New value for property `text`
      */
    sText: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getType type}.
      *
      * Defines the visual indication and behavior of the list items. Available options are `Active` (by default),
      * `Inactive` and `Detail`.
      *
      *  **Note:** When set to `Active`, the item will provide visual response upon press and hover, while with
      * type `Inactive` and `Detail` - will not.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Active`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setType(): this.type = js.native
    def setType(
      /**
      * New value for property `type`
      */
    sType: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ListItemType * / any */ String
    ): this.type = js.native
    def setType(/**
      * New value for property `type`
      */
    sType: ListItemType): this.type = js.native
  }
  
  trait StandardListItemSettings
    extends StObject
       with ControlSettings {
    
    /**
      * Defines the text alternative of the component. Note: If not provided a default text alternative will
      * be set, if present.
      */
    var accessibleName: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Defines the `additionalText`, displayed in the end of the list item.
      */
    var additionalText: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Defines the state of the `additionalText`.
      *  Available options are: `"None"` (by default), `"Success"`, `"Warning"`, `"Information"` and `"Erorr"`.
      */
    var additionalTextState: js.UndefOr[
        ValueState | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ValueState * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Defines the description displayed right under the item text, if such is present.
      */
    var description: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Fired when the user clicks on the detail button when type is `Detail`.
      */
    var detailClick: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Defines the `icon` source URI.
      *
      *  **Note:** SAP-icons font provides numerous built-in icons. To find all the available icons, see the
      * {@link demo:sap/m/demokit/iconExplorer/webapp/index.html Icon Explorer}.
      */
    var icon: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Defines whether the `icon` should be displayed in the beginning of the list item or in the end.
      *
      *  **Note:** If `image` is set, the `icon` would be displayed after the `image`.
      */
    var iconEnd: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines the `image` source URI.
      *
      *  **Note:** The `image` would be displayed in the beginning of the list item.
      */
    var image: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Defines the selected state of the `ListItem`.
      */
    var selected: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines the content of the control
      */
    var text: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Defines the visual indication and behavior of the list items. Available options are `Active` (by default),
      * `Inactive` and `Detail`.
      *
      *  **Note:** When set to `Active`, the item will provide visual response upon press and hover, while with
      * type `Inactive` and `Detail` - will not.
      */
    var `type`: js.UndefOr[
        ListItemType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ListItemType * / any */ String) | PropertyBindingInfo
      ] = js.undefined
  }
  object StandardListItemSettings {
    
    inline def apply(): StandardListItemSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StandardListItemSettings]
    }
    
    extension [Self <: StandardListItemSettings](x: Self) {
      
      inline def setAccessibleName(value: String | PropertyBindingInfo): Self = StObject.set(x, "accessibleName", value.asInstanceOf[js.Any])
      
      inline def setAccessibleNameUndefined: Self = StObject.set(x, "accessibleName", js.undefined)
      
      inline def setAdditionalText(value: String | PropertyBindingInfo): Self = StObject.set(x, "additionalText", value.asInstanceOf[js.Any])
      
      inline def setAdditionalTextState(
        value: ValueState | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ValueState * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "additionalTextState", value.asInstanceOf[js.Any])
      
      inline def setAdditionalTextStateUndefined: Self = StObject.set(x, "additionalTextState", js.undefined)
      
      inline def setAdditionalTextUndefined: Self = StObject.set(x, "additionalText", js.undefined)
      
      inline def setDescription(value: String | PropertyBindingInfo): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setDetailClick(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "detailClick", js.Any.fromFunction1(value))
      
      inline def setDetailClickUndefined: Self = StObject.set(x, "detailClick", js.undefined)
      
      inline def setIcon(value: String | PropertyBindingInfo): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconEnd(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "iconEnd", value.asInstanceOf[js.Any])
      
      inline def setIconEndUndefined: Self = StObject.set(x, "iconEnd", js.undefined)
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setImage(value: String | PropertyBindingInfo): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
      
      inline def setSelected(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
      
      inline def setText(value: String | PropertyBindingInfo): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setType(
        value: ListItemType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ListItemType * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
