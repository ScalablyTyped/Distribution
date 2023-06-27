package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreElementMod.ElementSettings
import typings.openui5.sapUiCoreLibraryMod.URI
import typings.openui5.sapUiMdcEnumsTableRowActionMod.TableRowAction
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiMdcTableRowActionItemMod {
  
  @JSImport("sap/ui/mdc/table/RowActionItem", JSImport.Default)
  @js.native
  /**
    * Constructor for new RowActionItem.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends RowActionItem {
    def this(/**
      * initial settings for the new control
      */
    mSettings: RowActionItemSettings) = this()
    def this(/**
      * Optional ID for the new object; generated automatically if no non-empty ID is given
      */
    sId: String) = this()
    def this(
      /**
      * Optional ID for the new object; generated automatically if no non-empty ID is given
      */
    sId: String,
      /**
      * initial settings for the new control
      */
    mSettings: RowActionItemSettings
    ) = this()
    def this(
      /**
      * Optional ID for the new object; generated automatically if no non-empty ID is given
      */
    sId: Unit,
      /**
      * initial settings for the new control
      */
    mSettings: RowActionItemSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/mdc/table/RowActionItem", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.mdc.table.RowActionItem with name `sClassName` and enriches it
      * with the information contained in `oClassInfo`.
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
    oClassInfo: ClassInfo[T, RowActionItem]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, RowActionItem],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.mdc.table.RowActionItem.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait RowActionItem
    extends typings.openui5.sapUiCoreElementMod.default {
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:press press} event of this `sap.ui.mdc.table.RowActionItem`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.mdc.table.RowActionItem` itself.
      *
      * Fired when the row action item is pressed.
      *
      * `sap.ui.table.Table`: The press event is fired when a row action item is pressed.
      *
      * `sap.m.Table`: The press event is fired when a row with a row action item is pressed. The `sap.ui.mdc.Table`'s
      * `rowPress` event is fired as well, when pressing a row with a row action item.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachPress(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ RowActionItemPressEvent, Unit]
    ): this.type = js.native
    def attachPress(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ RowActionItemPressEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.mdc.table.RowActionItem` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:press press} event of this `sap.ui.mdc.table.RowActionItem`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.mdc.table.RowActionItem` itself.
      *
      * Fired when the row action item is pressed.
      *
      * `sap.ui.table.Table`: The press event is fired when a row action item is pressed.
      *
      * `sap.m.Table`: The press event is fired when a row with a row action item is pressed. The `sap.ui.mdc.Table`'s
      * `rowPress` event is fired as well, when pressing a row with a row action item.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachPress(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ RowActionItemPressEvent, Unit]
    ): this.type = js.native
    def attachPress(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ RowActionItemPressEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.mdc.table.RowActionItem` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:press press} event of this `sap.ui.mdc.table.RowActionItem`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachPress(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ RowActionItemPressEvent, Unit]
    ): this.type = js.native
    def detachPress(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ RowActionItemPressEvent, Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Fires event {@link #event:press press} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def firePress(): this.type = js.native
    def firePress(
      /**
      * Parameters to pass along with the event
      */
    mParameters: RowActionItem$PressEventParameters
    ): this.type = js.native
    
    /**
      * Gets current value of property {@link #getIcon icon}.
      *
      * Icon for the row action item.
      *
      * A custom icon cannot be set when using `sap.m.Table`
      *
      * @returns Value of property `icon`
      */
    def getIcon(): URI = js.native
    
    /**
      * Gets current value of property {@link #getText text}.
      *
      * Text for the row action item.
      *
      * Custom text cannot be set when using `sap.m.Table`.
      *
      * @returns Value of property `text`
      */
    def getText(): String = js.native
    
    /**
      * Gets current value of property {@link #getType type}.
      *
      * Type of the row action item.
      *
      * As of version 1.98, only sap.ui.mdc.enums.TableRowAction.Navigation is available. Setting the type ensures
      * default values for the properties `icon` and `text`. If an icon or text is set explicitly this setting
      * is used.
      *
      * @returns Value of property `type`
      */
    def getType(): TableRowAction | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TableRowAction * / any */ String) = js.native
    
    /**
      * Gets current value of property {@link #getVisible visible}.
      *
      * Whether the item should be visible on the screen.
      *
      * Default value is `true`.
      *
      * @returns Value of property `visible`
      */
    def getVisible(): Boolean = js.native
    
    /**
      * Sets a new value for property {@link #getIcon icon}.
      *
      * Icon for the row action item.
      *
      * A custom icon cannot be set when using `sap.m.Table`
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setIcon(/**
      * New value for property `icon`
      */
    sIcon: URI): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getText text}.
      *
      * Text for the row action item.
      *
      * Custom text cannot be set when using `sap.m.Table`.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setText(/**
      * New value for property `text`
      */
    sText: String): this.type = js.native
    
    def setType(
      /**
      * New value for property `type`
      */
    sType: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TableRowAction * / any */ String
    ): this.type = js.native
    /**
      * Sets a new value for property {@link #getType type}.
      *
      * Type of the row action item.
      *
      * As of version 1.98, only sap.ui.mdc.enums.TableRowAction.Navigation is available. Setting the type ensures
      * default values for the properties `icon` and `text`. If an icon or text is set explicitly this setting
      * is used.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setType(/**
      * New value for property `type`
      */
    sType: TableRowAction): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getVisible visible}.
      *
      * Whether the item should be visible on the screen.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setVisible(): this.type = js.native
    def setVisible(/**
      * New value for property `visible`
      */
    bVisible: Boolean): this.type = js.native
  }
  
  trait RowActionItem$PressEventParameters extends StObject {
    
    /**
      * The binding context of the pressed row action
      */
    var bindingContext: js.UndefOr[typings.openui5.sapUiModelContextMod.default] = js.undefined
  }
  object RowActionItem$PressEventParameters {
    
    inline def apply(): RowActionItem$PressEventParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RowActionItem$PressEventParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RowActionItem$PressEventParameters] (val x: Self) extends AnyVal {
      
      inline def setBindingContext(value: typings.openui5.sapUiModelContextMod.default): Self = StObject.set(x, "bindingContext", value.asInstanceOf[js.Any])
      
      inline def setBindingContextUndefined: Self = StObject.set(x, "bindingContext", js.undefined)
    }
  }
  
  type RowActionItemPressEvent = typings.openui5.sapUiBaseEventMod.default[RowActionItem$PressEventParameters]
  
  type RowActionItemPressEventParameters = RowActionItem$PressEventParameters
  
  trait RowActionItemSettings
    extends StObject
       with ElementSettings {
    
    /**
      * Icon for the row action item.
      *
      * A custom icon cannot be set when using `sap.m.Table`
      */
    var icon: js.UndefOr[URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * Fired when the row action item is pressed.
      *
      * `sap.ui.table.Table`: The press event is fired when a row action item is pressed.
      *
      * `sap.m.Table`: The press event is fired when a row with a row action item is pressed. The `sap.ui.mdc.Table`'s
      * `rowPress` event is fired as well, when pressing a row with a row action item.
      */
    var press: js.UndefOr[
        js.Function1[
          /* oEvent */ typings.openui5.sapUiBaseEventMod.default[RowActionItem$PressEventParameters], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * Text for the row action item.
      *
      * Custom text cannot be set when using `sap.m.Table`.
      */
    var text: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Type of the row action item.
      *
      * As of version 1.98, only sap.ui.mdc.enums.TableRowAction.Navigation is available. Setting the type ensures
      * default values for the properties `icon` and `text`. If an icon or text is set explicitly this setting
      * is used.
      */
    var `type`: js.UndefOr[
        TableRowAction | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TableRowAction * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Whether the item should be visible on the screen.
      */
    var visible: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object RowActionItemSettings {
    
    inline def apply(): RowActionItemSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RowActionItemSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RowActionItemSettings] (val x: Self) extends AnyVal {
      
      inline def setIcon(value: URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setPress(
        value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[RowActionItem$PressEventParameters] => Unit
      ): Self = StObject.set(x, "press", js.Any.fromFunction1(value))
      
      inline def setPressUndefined: Self = StObject.set(x, "press", js.undefined)
      
      inline def setText(value: String | PropertyBindingInfo): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setType(
        value: TableRowAction | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TableRowAction * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setVisible(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
}
