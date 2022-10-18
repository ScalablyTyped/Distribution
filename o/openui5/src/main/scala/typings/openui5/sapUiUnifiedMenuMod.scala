package typings.openui5

import typings.openui5.anon.`5`
import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiCoreLibraryMod.Collision
import typings.openui5.sapUiCoreLibraryMod.Dock
import typings.openui5.sapUiCoreLibraryMod.IContextMenu
import typings.openui5.sapUiCoreLibraryMod.ID
import typings.std.Element
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiUnifiedMenuMod {
  
  @JSImport("sap/ui/unified/Menu", JSImport.Default)
  @js.native
  /**
    * Constructor for a new Menu control.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends Menu {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: MenuSettings) = this()
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
    mSettings: MenuSettings
    ) = this()
    def this(
      /**
      * Id for the new control, generated automatically if no id is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: MenuSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/unified/Menu", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.unified.Menu with name `sClassName` and enriches it with the information
      * contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.core.Control.extend}.
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
    oClassInfo: ClassInfo[T, Menu]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, Menu],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.unified.Menu.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait Menu
    extends typings.openui5.sapUiCoreControlMod.default
       with IContextMenu {
    
    def addAriaLabelledBy(
      /**
      * The ariaLabelledBy to add; if empty, nothing is inserted
      */
    vAriaLabelledBy: typings.openui5.sapUiCoreControlMod.default
    ): this.type = js.native
    /**
      * @SINCE 1.26.3
      *
      * Adds some ariaLabelledBy into the association {@link #getAriaLabelledBy ariaLabelledBy}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addAriaLabelledBy(/**
      * The ariaLabelledBy to add; if empty, nothing is inserted
      */
    vAriaLabelledBy: ID): this.type = js.native
    
    /**
      * Adds some item to the aggregation {@link #getItems items}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addItem(
      /**
      * The item to add; if empty, nothing is inserted
      */
    oItem: typings.openui5.sapUiUnifiedMenuItemBaseMod.default
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:itemSelect itemSelect} event of this `sap.ui.unified.Menu`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.unified.Menu` itself.
      *
      * Fired on the root menu of a menu hierarchy whenever a user selects an item within the menu or within
      * one of its direct or indirect submenus. **Note:** There is also a select event available for each single
      * menu item. This event and the event of the menu items are redundant.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachItemSelect(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachItemSelect(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.unified.Menu` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:itemSelect itemSelect} event of this `sap.ui.unified.Menu`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.unified.Menu` itself.
      *
      * Fired on the root menu of a menu hierarchy whenever a user selects an item within the menu or within
      * one of its direct or indirect submenus. **Note:** There is also a select event available for each single
      * menu item. This event and the event of the menu items are redundant.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachItemSelect(
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
    def attachItemSelect(
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
      * Context object to call the event handler with. Defaults to this `sap.ui.unified.Menu` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Closes the menu.
      */
    def close(): Unit = js.native
    
    /**
      * Destroys all the items in the aggregation {@link #getItems items}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyItems(): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:itemSelect itemSelect} event of this `sap.ui.unified.Menu`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachItemSelect(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachItemSelect(
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
      * Fires event {@link #event:itemSelect itemSelect} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireItemSelect(): this.type = js.native
    def fireItemSelect(/**
      * Parameters to pass along with the event
      */
    mParameters: `5`): this.type = js.native
    
    /**
      * @deprecated (since 1.27.0) - replaced by `ariaLabelledBy` association
      *
      * Gets current value of property {@link #getAriaDescription ariaDescription}.
      *
      * Accessible label / description of the menu for assistive technologies like screenreaders.
      *
      * @returns Value of property `ariaDescription`
      */
    def getAriaDescription(): String = js.native
    
    /**
      * @SINCE 1.26.3
      *
      * Returns array of IDs of the elements which are the current targets of the association {@link #getAriaLabelledBy
      * ariaLabelledBy}.
      */
    def getAriaLabelledBy(): js.Array[ID] = js.native
    
    /**
      * Gets current value of property {@link #getEnabled enabled}.
      *
      * When a menu is disabled none of its items can be selected by the user. The enabled property of an item
      * (@link sap.ui.unified.MenuItemBase#getEnabled) has no effect when the menu of the item is disabled.
      *
      * Default value is `true`.
      *
      * @returns Value of property `enabled`
      */
    def getEnabled(): Boolean = js.native
    
    /**
      * Gets content of aggregation {@link #getItems items}.
      *
      * The available actions to be displayed as items of the menu.
      */
    def getItems(): js.Array[typings.openui5.sapUiUnifiedMenuItemBaseMod.default] = js.native
    
    /**
      * Gets current value of property {@link #getMaxVisibleItems maxVisibleItems}.
      *
      * The maximum number of items which are displayed before an overflow mechanism takes effect. A value smaller
      * than 1 means an infinite number of visible items. The overall height of the menu is limited by the height
      * of the screen. If the maximum possible height is reached, an overflow takes effect, even if the maximum
      * number of visible items is not yet reached.
      *
      * Default value is `0`.
      *
      * @returns Value of property `maxVisibleItems`
      */
    def getMaxVisibleItems(): int = js.native
    
    /**
      * @SINCE 1.25.0
      *
      * Gets current value of property {@link #getPageSize pageSize}.
      *
      * The keyboard can be used to navigate through the items of a menu. Beside the arrow keys for single steps
      * and the Home / End keys for jumping to the first / last item, the Page Up / Page
      * Down keys can be used to jump an arbitrary number of items up or down. This number can be defined
      * via the `pageSize` property. For values smaller than 1, paging behaves in a similar way to when using
      * the Home / End keys. If the value equals 1, the paging behavior is similar to that of the
      * arrow keys.
      *
      * Default value is `5`.
      *
      * @returns Value of property `pageSize`
      */
    def getPageSize(): int = js.native
    
    /**
      * Checks for the provided `sap.ui.unified.MenuItemBase` in the aggregation {@link #getItems items}. and
      * returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfItem(
      /**
      * The item whose index is looked for
      */
    oItem: typings.openui5.sapUiUnifiedMenuItemBaseMod.default
    ): int = js.native
    
    /**
      * Inserts a item into the aggregation {@link #getItems items}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertItem(
      /**
      * The item to insert; if empty, nothing is inserted
      */
    oItem: typings.openui5.sapUiUnifiedMenuItemBaseMod.default,
      /**
      * The `0`-based index the item should be inserted at; for a negative value of `iIndex`, the item is inserted
      * at position 0; for a value greater than the current size of the aggregation, the item is inserted at
      * the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Opens the menu at the specified position.
      *
      * The position of the menu is defined relative to an element in the visible DOM by specifying the docking
      * location of the menu and of the related element.
      *
      * See {@link sap.ui.core.Popup#open Popup#open} for further details about popup positioning.
      */
    def open(
      /**
      * Indicates whether or not the first item shall be highlighted when the menu is opened (keyboard case)
      */
    bWithKeyboard: Boolean,
      /**
      * The element which will get the focus back again after the menu was closed
      */
    oOpenerRef: typings.openui5.sapUiCoreElementMod.default,
      /**
      * The reference docking location of the menu for positioning the menu on the screen
      */
    my: Dock,
      /**
      * The 'of' element's reference docking location for positioning the menu on the screen
      */
    at: Dock,
      /**
      * The menu is positioned relatively to this element based on the given dock locations
      */
    of: typings.openui5.sapUiCoreElementMod.default
    ): Unit = js.native
    def open(
      /**
      * Indicates whether or not the first item shall be highlighted when the menu is opened (keyboard case)
      */
    bWithKeyboard: Boolean,
      /**
      * The element which will get the focus back again after the menu was closed
      */
    oOpenerRef: typings.openui5.sapUiCoreElementMod.default,
      /**
      * The reference docking location of the menu for positioning the menu on the screen
      */
    my: Dock,
      /**
      * The 'of' element's reference docking location for positioning the menu on the screen
      */
    at: Dock,
      /**
      * The menu is positioned relatively to this element based on the given dock locations
      */
    of: typings.openui5.sapUiCoreElementMod.default,
      /**
      * The offset relative to the docking point, specified as a string with space-separated pixel values (e.g.
      * "10 0" to move the popup 10 pixels to the right)
      */
    offset: String
    ): Unit = js.native
    def open(
      /**
      * Indicates whether or not the first item shall be highlighted when the menu is opened (keyboard case)
      */
    bWithKeyboard: Boolean,
      /**
      * The element which will get the focus back again after the menu was closed
      */
    oOpenerRef: typings.openui5.sapUiCoreElementMod.default,
      /**
      * The reference docking location of the menu for positioning the menu on the screen
      */
    my: Dock,
      /**
      * The 'of' element's reference docking location for positioning the menu on the screen
      */
    at: Dock,
      /**
      * The menu is positioned relatively to this element based on the given dock locations
      */
    of: typings.openui5.sapUiCoreElementMod.default,
      /**
      * The offset relative to the docking point, specified as a string with space-separated pixel values (e.g.
      * "10 0" to move the popup 10 pixels to the right)
      */
    offset: String,
      /**
      * The collision defines how the position of the menu should be adjusted in case it overflows the window
      * in some direction
      */
    collision: Collision
    ): Unit = js.native
    def open(
      /**
      * Indicates whether or not the first item shall be highlighted when the menu is opened (keyboard case)
      */
    bWithKeyboard: Boolean,
      /**
      * The element which will get the focus back again after the menu was closed
      */
    oOpenerRef: typings.openui5.sapUiCoreElementMod.default,
      /**
      * The reference docking location of the menu for positioning the menu on the screen
      */
    my: Dock,
      /**
      * The 'of' element's reference docking location for positioning the menu on the screen
      */
    at: Dock,
      /**
      * The menu is positioned relatively to this element based on the given dock locations
      */
    of: typings.openui5.sapUiCoreElementMod.default,
      /**
      * The offset relative to the docking point, specified as a string with space-separated pixel values (e.g.
      * "10 0" to move the popup 10 pixels to the right)
      */
    offset: Unit,
      /**
      * The collision defines how the position of the menu should be adjusted in case it overflows the window
      * in some direction
      */
    collision: Collision
    ): Unit = js.native
    def open(
      /**
      * Indicates whether or not the first item shall be highlighted when the menu is opened (keyboard case)
      */
    bWithKeyboard: Boolean,
      /**
      * The element which will get the focus back again after the menu was closed
      */
    oOpenerRef: typings.openui5.sapUiCoreElementMod.default,
      /**
      * The reference docking location of the menu for positioning the menu on the screen
      */
    my: Dock,
      /**
      * The 'of' element's reference docking location for positioning the menu on the screen
      */
    at: Dock,
      /**
      * The menu is positioned relatively to this element based on the given dock locations
      */
    of: Element
    ): Unit = js.native
    def open(
      /**
      * Indicates whether or not the first item shall be highlighted when the menu is opened (keyboard case)
      */
    bWithKeyboard: Boolean,
      /**
      * The element which will get the focus back again after the menu was closed
      */
    oOpenerRef: typings.openui5.sapUiCoreElementMod.default,
      /**
      * The reference docking location of the menu for positioning the menu on the screen
      */
    my: Dock,
      /**
      * The 'of' element's reference docking location for positioning the menu on the screen
      */
    at: Dock,
      /**
      * The menu is positioned relatively to this element based on the given dock locations
      */
    of: Element,
      /**
      * The offset relative to the docking point, specified as a string with space-separated pixel values (e.g.
      * "10 0" to move the popup 10 pixels to the right)
      */
    offset: String
    ): Unit = js.native
    def open(
      /**
      * Indicates whether or not the first item shall be highlighted when the menu is opened (keyboard case)
      */
    bWithKeyboard: Boolean,
      /**
      * The element which will get the focus back again after the menu was closed
      */
    oOpenerRef: typings.openui5.sapUiCoreElementMod.default,
      /**
      * The reference docking location of the menu for positioning the menu on the screen
      */
    my: Dock,
      /**
      * The 'of' element's reference docking location for positioning the menu on the screen
      */
    at: Dock,
      /**
      * The menu is positioned relatively to this element based on the given dock locations
      */
    of: Element,
      /**
      * The offset relative to the docking point, specified as a string with space-separated pixel values (e.g.
      * "10 0" to move the popup 10 pixels to the right)
      */
    offset: String,
      /**
      * The collision defines how the position of the menu should be adjusted in case it overflows the window
      * in some direction
      */
    collision: Collision
    ): Unit = js.native
    def open(
      /**
      * Indicates whether or not the first item shall be highlighted when the menu is opened (keyboard case)
      */
    bWithKeyboard: Boolean,
      /**
      * The element which will get the focus back again after the menu was closed
      */
    oOpenerRef: typings.openui5.sapUiCoreElementMod.default,
      /**
      * The reference docking location of the menu for positioning the menu on the screen
      */
    my: Dock,
      /**
      * The 'of' element's reference docking location for positioning the menu on the screen
      */
    at: Dock,
      /**
      * The menu is positioned relatively to this element based on the given dock locations
      */
    of: Element,
      /**
      * The offset relative to the docking point, specified as a string with space-separated pixel values (e.g.
      * "10 0" to move the popup 10 pixels to the right)
      */
    offset: Unit,
      /**
      * The collision defines how the position of the menu should be adjusted in case it overflows the window
      * in some direction
      */
    collision: Collision
    ): Unit = js.native
    def open(
      /**
      * Indicates whether or not the first item shall be highlighted when the menu is opened (keyboard case)
      */
    bWithKeyboard: Boolean,
      /**
      * The element which will get the focus back again after the menu was closed
      */
    oOpenerRef: Element,
      /**
      * The reference docking location of the menu for positioning the menu on the screen
      */
    my: Dock,
      /**
      * The 'of' element's reference docking location for positioning the menu on the screen
      */
    at: Dock,
      /**
      * The menu is positioned relatively to this element based on the given dock locations
      */
    of: typings.openui5.sapUiCoreElementMod.default
    ): Unit = js.native
    def open(
      /**
      * Indicates whether or not the first item shall be highlighted when the menu is opened (keyboard case)
      */
    bWithKeyboard: Boolean,
      /**
      * The element which will get the focus back again after the menu was closed
      */
    oOpenerRef: Element,
      /**
      * The reference docking location of the menu for positioning the menu on the screen
      */
    my: Dock,
      /**
      * The 'of' element's reference docking location for positioning the menu on the screen
      */
    at: Dock,
      /**
      * The menu is positioned relatively to this element based on the given dock locations
      */
    of: typings.openui5.sapUiCoreElementMod.default,
      /**
      * The offset relative to the docking point, specified as a string with space-separated pixel values (e.g.
      * "10 0" to move the popup 10 pixels to the right)
      */
    offset: String
    ): Unit = js.native
    def open(
      /**
      * Indicates whether or not the first item shall be highlighted when the menu is opened (keyboard case)
      */
    bWithKeyboard: Boolean,
      /**
      * The element which will get the focus back again after the menu was closed
      */
    oOpenerRef: Element,
      /**
      * The reference docking location of the menu for positioning the menu on the screen
      */
    my: Dock,
      /**
      * The 'of' element's reference docking location for positioning the menu on the screen
      */
    at: Dock,
      /**
      * The menu is positioned relatively to this element based on the given dock locations
      */
    of: typings.openui5.sapUiCoreElementMod.default,
      /**
      * The offset relative to the docking point, specified as a string with space-separated pixel values (e.g.
      * "10 0" to move the popup 10 pixels to the right)
      */
    offset: String,
      /**
      * The collision defines how the position of the menu should be adjusted in case it overflows the window
      * in some direction
      */
    collision: Collision
    ): Unit = js.native
    def open(
      /**
      * Indicates whether or not the first item shall be highlighted when the menu is opened (keyboard case)
      */
    bWithKeyboard: Boolean,
      /**
      * The element which will get the focus back again after the menu was closed
      */
    oOpenerRef: Element,
      /**
      * The reference docking location of the menu for positioning the menu on the screen
      */
    my: Dock,
      /**
      * The 'of' element's reference docking location for positioning the menu on the screen
      */
    at: Dock,
      /**
      * The menu is positioned relatively to this element based on the given dock locations
      */
    of: typings.openui5.sapUiCoreElementMod.default,
      /**
      * The offset relative to the docking point, specified as a string with space-separated pixel values (e.g.
      * "10 0" to move the popup 10 pixels to the right)
      */
    offset: Unit,
      /**
      * The collision defines how the position of the menu should be adjusted in case it overflows the window
      * in some direction
      */
    collision: Collision
    ): Unit = js.native
    def open(
      /**
      * Indicates whether or not the first item shall be highlighted when the menu is opened (keyboard case)
      */
    bWithKeyboard: Boolean,
      /**
      * The element which will get the focus back again after the menu was closed
      */
    oOpenerRef: Element,
      /**
      * The reference docking location of the menu for positioning the menu on the screen
      */
    my: Dock,
      /**
      * The 'of' element's reference docking location for positioning the menu on the screen
      */
    at: Dock,
      /**
      * The menu is positioned relatively to this element based on the given dock locations
      */
    of: Element
    ): Unit = js.native
    def open(
      /**
      * Indicates whether or not the first item shall be highlighted when the menu is opened (keyboard case)
      */
    bWithKeyboard: Boolean,
      /**
      * The element which will get the focus back again after the menu was closed
      */
    oOpenerRef: Element,
      /**
      * The reference docking location of the menu for positioning the menu on the screen
      */
    my: Dock,
      /**
      * The 'of' element's reference docking location for positioning the menu on the screen
      */
    at: Dock,
      /**
      * The menu is positioned relatively to this element based on the given dock locations
      */
    of: Element,
      /**
      * The offset relative to the docking point, specified as a string with space-separated pixel values (e.g.
      * "10 0" to move the popup 10 pixels to the right)
      */
    offset: String
    ): Unit = js.native
    def open(
      /**
      * Indicates whether or not the first item shall be highlighted when the menu is opened (keyboard case)
      */
    bWithKeyboard: Boolean,
      /**
      * The element which will get the focus back again after the menu was closed
      */
    oOpenerRef: Element,
      /**
      * The reference docking location of the menu for positioning the menu on the screen
      */
    my: Dock,
      /**
      * The 'of' element's reference docking location for positioning the menu on the screen
      */
    at: Dock,
      /**
      * The menu is positioned relatively to this element based on the given dock locations
      */
    of: Element,
      /**
      * The offset relative to the docking point, specified as a string with space-separated pixel values (e.g.
      * "10 0" to move the popup 10 pixels to the right)
      */
    offset: String,
      /**
      * The collision defines how the position of the menu should be adjusted in case it overflows the window
      * in some direction
      */
    collision: Collision
    ): Unit = js.native
    def open(
      /**
      * Indicates whether or not the first item shall be highlighted when the menu is opened (keyboard case)
      */
    bWithKeyboard: Boolean,
      /**
      * The element which will get the focus back again after the menu was closed
      */
    oOpenerRef: Element,
      /**
      * The reference docking location of the menu for positioning the menu on the screen
      */
    my: Dock,
      /**
      * The 'of' element's reference docking location for positioning the menu on the screen
      */
    at: Dock,
      /**
      * The menu is positioned relatively to this element based on the given dock locations
      */
    of: Element,
      /**
      * The offset relative to the docking point, specified as a string with space-separated pixel values (e.g.
      * "10 0" to move the popup 10 pixels to the right)
      */
    offset: Unit,
      /**
      * The collision defines how the position of the menu should be adjusted in case it overflows the window
      * in some direction
      */
    collision: Collision
    ): Unit = js.native
    
    /**
      * @SINCE 1.26.3
      *
      * Removes all the controls in the association named {@link #getAriaLabelledBy ariaLabelledBy}.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllAriaLabelledBy(): js.Array[ID] = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getItems items}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllItems(): js.Array[typings.openui5.sapUiUnifiedMenuItemBaseMod.default] = js.native
    
    /**
      * @SINCE 1.26.3
      *
      * Removes an ariaLabelledBy from the association named {@link #getAriaLabelledBy ariaLabelledBy}.
      *
      * @returns The removed ariaLabelledBy or `null`
      */
    def removeAriaLabelledBy(/**
      * The ariaLabelledBy to be removed or its index or ID
      */
    vAriaLabelledBy: int): ID | Null = js.native
    def removeAriaLabelledBy(
      /**
      * The ariaLabelledBy to be removed or its index or ID
      */
    vAriaLabelledBy: typings.openui5.sapUiCoreControlMod.default
    ): ID | Null = js.native
    def removeAriaLabelledBy(/**
      * The ariaLabelledBy to be removed or its index or ID
      */
    vAriaLabelledBy: ID): ID | Null = js.native
    
    def removeItem(/**
      * The item to remove or its index or id
      */
    vItem: String): typings.openui5.sapUiUnifiedMenuItemBaseMod.default | Null = js.native
    /**
      * Removes a item from the aggregation {@link #getItems items}.
      *
      * @returns The removed item or `null`
      */
    def removeItem(/**
      * The item to remove or its index or id
      */
    vItem: int): typings.openui5.sapUiUnifiedMenuItemBaseMod.default | Null = js.native
    def removeItem(
      /**
      * The item to remove or its index or id
      */
    vItem: typings.openui5.sapUiUnifiedMenuItemBaseMod.default
    ): typings.openui5.sapUiUnifiedMenuItemBaseMod.default | Null = js.native
    
    /**
      * @deprecated (since 1.27.0) - replaced by `ariaLabelledBy` association
      *
      * Sets a new value for property {@link #getAriaDescription ariaDescription}.
      *
      * Accessible label / description of the menu for assistive technologies like screenreaders.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setAriaDescription(): this.type = js.native
    def setAriaDescription(/**
      * New value for property `ariaDescription`
      */
    sAriaDescription: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getEnabled enabled}.
      *
      * When a menu is disabled none of its items can be selected by the user. The enabled property of an item
      * (@link sap.ui.unified.MenuItemBase#getEnabled) has no effect when the menu of the item is disabled.
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
      * Sets a new value for property {@link #getMaxVisibleItems maxVisibleItems}.
      *
      * The maximum number of items which are displayed before an overflow mechanism takes effect. A value smaller
      * than 1 means an infinite number of visible items. The overall height of the menu is limited by the height
      * of the screen. If the maximum possible height is reached, an overflow takes effect, even if the maximum
      * number of visible items is not yet reached.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `0`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setMaxVisibleItems(): this.type = js.native
    def setMaxVisibleItems(/**
      * New value for property `maxVisibleItems`
      */
    iMaxVisibleItems: int): this.type = js.native
    
    /**
      * @SINCE 1.25.0
      *
      * Sets a new value for property {@link #getPageSize pageSize}.
      *
      * The keyboard can be used to navigate through the items of a menu. Beside the arrow keys for single steps
      * and the Home / End keys for jumping to the first / last item, the Page Up / Page
      * Down keys can be used to jump an arbitrary number of items up or down. This number can be defined
      * via the `pageSize` property. For values smaller than 1, paging behaves in a similar way to when using
      * the Home / End keys. If the value equals 1, the paging behavior is similar to that of the
      * arrow keys.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `5`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setPageSize(): this.type = js.native
    def setPageSize(/**
      * New value for property `pageSize`
      */
    iPageSize: int): this.type = js.native
  }
  
  trait MenuSettings
    extends StObject
       with ControlSettings {
    
    /**
      * @deprecated (since 1.27.0) - replaced by `ariaLabelledBy` association
      *
      * Accessible label / description of the menu for assistive technologies like screenreaders.
      */
    var ariaDescription: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * @SINCE 1.26.3
      *
      * Reference to accessible labels (ids of existing DOM elements or controls) for assistive technologies
      * like screenreaders.
      */
    var ariaLabelledBy: js.UndefOr[js.Array[typings.openui5.sapUiCoreControlMod.default | String]] = js.undefined
    
    /**
      * When a menu is disabled none of its items can be selected by the user. The enabled property of an item
      * (@link sap.ui.unified.MenuItemBase#getEnabled) has no effect when the menu of the item is disabled.
      */
    var enabled: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Fired on the root menu of a menu hierarchy whenever a user selects an item within the menu or within
      * one of its direct or indirect submenus. **Note:** There is also a select event available for each single
      * menu item. This event and the event of the menu items are redundant.
      */
    var itemSelect: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * The available actions to be displayed as items of the menu.
      */
    var items: js.UndefOr[
        js.Array[typings.openui5.sapUiUnifiedMenuItemBaseMod.default] | typings.openui5.sapUiUnifiedMenuItemBaseMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * The maximum number of items which are displayed before an overflow mechanism takes effect. A value smaller
      * than 1 means an infinite number of visible items. The overall height of the menu is limited by the height
      * of the screen. If the maximum possible height is reached, an overflow takes effect, even if the maximum
      * number of visible items is not yet reached.
      */
    var maxVisibleItems: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * @SINCE 1.25.0
      *
      * The keyboard can be used to navigate through the items of a menu. Beside the arrow keys for single steps
      * and the Home / End keys for jumping to the first / last item, the Page Up / Page
      * Down keys can be used to jump an arbitrary number of items up or down. This number can be defined
      * via the `pageSize` property. For values smaller than 1, paging behaves in a similar way to when using
      * the Home / End keys. If the value equals 1, the paging behavior is similar to that of the
      * arrow keys.
      */
    var pageSize: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
  }
  object MenuSettings {
    
    inline def apply(): MenuSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MenuSettings]
    }
    
    extension [Self <: MenuSettings](x: Self) {
      
      inline def setAriaDescription(value: String | PropertyBindingInfo): Self = StObject.set(x, "ariaDescription", value.asInstanceOf[js.Any])
      
      inline def setAriaDescriptionUndefined: Self = StObject.set(x, "ariaDescription", js.undefined)
      
      inline def setAriaLabelledBy(value: js.Array[typings.openui5.sapUiCoreControlMod.default | String]): Self = StObject.set(x, "ariaLabelledBy", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelledByUndefined: Self = StObject.set(x, "ariaLabelledBy", js.undefined)
      
      inline def setAriaLabelledByVarargs(value: (typings.openui5.sapUiCoreControlMod.default | String)*): Self = StObject.set(x, "ariaLabelledBy", js.Array(value*))
      
      inline def setEnabled(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setItemSelect(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "itemSelect", js.Any.fromFunction1(value))
      
      inline def setItemSelectUndefined: Self = StObject.set(x, "itemSelect", js.undefined)
      
      inline def setItems(
        value: js.Array[typings.openui5.sapUiUnifiedMenuItemBaseMod.default] | typings.openui5.sapUiUnifiedMenuItemBaseMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      inline def setItemsVarargs(value: typings.openui5.sapUiUnifiedMenuItemBaseMod.default*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setMaxVisibleItems(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "maxVisibleItems", value.asInstanceOf[js.Any])
      
      inline def setMaxVisibleItemsUndefined: Self = StObject.set(x, "maxVisibleItems", js.undefined)
      
      inline def setPageSize(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    }
  }
}
