package typings.openui5

import typings.openui5.anon.`8`
import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreElementMod.ElementSettings
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiUnifiedMenuItemBaseMod {
  
  @JSImport("sap/ui/unified/MenuItemBase", JSImport.Default)
  @js.native
  /**
    * Abstract base class `MenuItemBase` for menu item elements. Please use concrete subclasses.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends MenuItemBase {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: MenuItemBaseSettings) = this()
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
    mSettings: MenuItemBaseSettings
    ) = this()
    def this(
      /**
      * Id for the new control, generated automatically if no id is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: MenuItemBaseSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/unified/MenuItemBase", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.unified.MenuItemBase with name `sClassName` and enriches it with
      * the information contained in `oClassInfo`.
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
    oClassInfo: ClassInfo[T, MenuItemBase]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, MenuItemBase],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.unified.MenuItemBase.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait MenuItemBase
    extends typings.openui5.sapUiCoreElementMod.default {
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:select select} event of this `sap.ui.unified.MenuItemBase`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.unified.MenuItemBase` itself.
      *
      * Fired when the item is selected by the user. **Note:** The event is also available for items which have
      * a submenu. In general, applications must not handle event in this case because the user selection opens
      * the sub menu.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachSelect(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachSelect(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.unified.MenuItemBase` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:select select} event of this `sap.ui.unified.MenuItemBase`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.unified.MenuItemBase` itself.
      *
      * Fired when the item is selected by the user. **Note:** The event is also available for items which have
      * a submenu. In general, applications must not handle event in this case because the user selection opens
      * the sub menu.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachSelect(
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
    def attachSelect(
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
      * Context object to call the event handler with. Defaults to this `sap.ui.unified.MenuItemBase` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Destroys the submenu in the aggregation {@link #getSubmenu submenu}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroySubmenu(): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:select select} event of this `sap.ui.unified.MenuItemBase`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachSelect(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachSelect(
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
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Fires event {@link #event:select select} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireSelect(): this.type = js.native
    def fireSelect(/**
      * Parameters to pass along with the event
      */
    mParameters: `8`): this.type = js.native
    
    /**
      * Gets current value of property {@link #getEnabled enabled}.
      *
      * When an item is disabled the item can not be selected by the user. The enabled property of the item has
      * no effect when the menu of the item is disabled ({@link sap.ui.unified.Menu#getEnabled Menu#getEnabled}).
      *
      * Default value is `true`.
      *
      * @returns Value of property `enabled`
      */
    def getEnabled(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getStartsSection startsSection}.
      *
      * Defines whether a visual separator should be rendered before the item. **Note:** If an item is invisible
      * also the separator of this item is not shown.
      *
      * Default value is `false`.
      *
      * @returns Value of property `startsSection`
      */
    def getStartsSection(): Boolean = js.native
    
    /**
      * Gets content of aggregation {@link #getSubmenu submenu}.
      *
      * An optional submenu of the item which is opened when the item is selected by the user.
      */
    def getSubmenu(): typings.openui5.sapUiUnifiedMenuMod.default = js.native
    
    /**
      * Gets current value of property {@link #getVisible visible}.
      *
      * Invisible items do not appear in the menu.
      *
      * Default value is `true`.
      *
      * @returns Value of property `visible`
      */
    def getVisible(): Boolean = js.native
    
    /**
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Changes the visual hover state of the menu item.
      *
      * Subclasses may override this function.
      */
    def hover(
      /**
      * Specifies whether the item is currently hovered or not.
      */
    bHovered: Boolean,
      /**
      * The menu to which this item belongs
      */
    oMenu: typings.openui5.sapUiUnifiedMenuMod.default
    ): Unit = js.native
    
    /**
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Informs the item that the item HTML is now applied to the DOM.
      *
      * Subclasses may override this function.
      */
    def onAfterRendering(): Unit = js.native
    
    /**
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Event handler which is called whenever the submenu of the item is opened or closed.
      *
      * Subclasses may override this function.
      */
    def onSubmenuToggle(/**
      * Specifies whether the submenu of the item is opened or closed
      */
    bOpened: Boolean): Unit = js.native
    
    /**
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Produces the HTML of an item and writes it to render-output-buffer during the rendering of the corresponding
      * menu.
      *
      * Subclasses may override this function.
      */
    def render(
      /**
      * The `RenderManager` that can be used for writing to the render-output-buffer
      */
    oRenderManager: typings.openui5.sapUiCoreRenderManagerMod.default,
      /**
      * The item which should be rendered
      */
    oItem: MenuItemBase,
      /**
      * The menu to which this item belongs
      */
    oMenu: typings.openui5.sapUiUnifiedMenuMod.default
    ): Unit = js.native
    
    /**
      * Sets a new value for property {@link #getEnabled enabled}.
      *
      * When an item is disabled the item can not be selected by the user. The enabled property of the item has
      * no effect when the menu of the item is disabled ({@link sap.ui.unified.Menu#getEnabled Menu#getEnabled}).
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setEnabled(): this.type = js.native
    def setEnabled(/**
      * New value for property `enabled`
      */
    bEnabled: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getStartsSection startsSection}.
      *
      * Defines whether a visual separator should be rendered before the item. **Note:** If an item is invisible
      * also the separator of this item is not shown.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setStartsSection(): this.type = js.native
    def setStartsSection(/**
      * New value for property `startsSection`
      */
    bStartsSection: Boolean): this.type = js.native
    
    /**
      * Sets the aggregated {@link #getSubmenu submenu}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setSubmenu(/**
      * The submenu to set
      */
    oSubmenu: typings.openui5.sapUiUnifiedMenuMod.default): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getVisible visible}.
      *
      * Invisible items do not appear in the menu.
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
  
  trait MenuItemBaseSettings
    extends StObject
       with ElementSettings {
    
    /**
      * When an item is disabled the item can not be selected by the user. The enabled property of the item has
      * no effect when the menu of the item is disabled ({@link sap.ui.unified.Menu#getEnabled Menu#getEnabled}).
      */
    var enabled: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Fired when the item is selected by the user. **Note:** The event is also available for items which have
      * a submenu. In general, applications must not handle event in this case because the user selection opens
      * the sub menu.
      */
    var select: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Defines whether a visual separator should be rendered before the item. **Note:** If an item is invisible
      * also the separator of this item is not shown.
      */
    var startsSection: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * An optional submenu of the item which is opened when the item is selected by the user.
      */
    var submenu: js.UndefOr[typings.openui5.sapUiUnifiedMenuMod.default] = js.undefined
    
    /**
      * Invisible items do not appear in the menu.
      */
    var visible: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object MenuItemBaseSettings {
    
    inline def apply(): MenuItemBaseSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MenuItemBaseSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MenuItemBaseSettings] (val x: Self) extends AnyVal {
      
      inline def setEnabled(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setSelect(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "select", js.Any.fromFunction1(value))
      
      inline def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
      
      inline def setStartsSection(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "startsSection", value.asInstanceOf[js.Any])
      
      inline def setStartsSectionUndefined: Self = StObject.set(x, "startsSection", js.undefined)
      
      inline def setSubmenu(value: typings.openui5.sapUiUnifiedMenuMod.default): Self = StObject.set(x, "submenu", value.asInstanceOf[js.Any])
      
      inline def setSubmenuUndefined: Self = StObject.set(x, "submenu", js.undefined)
      
      inline def setVisible(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
}
