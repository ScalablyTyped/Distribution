package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiCoreLibraryMod.CSSSize
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiCommonsTabStripMod {
  
  @JSImport("sap/ui/commons/TabStrip", JSImport.Default)
  @js.native
  /**
    * Constructor for a new TabStrip.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends TabStrip {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: TabStripSettings) = this()
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
    mSettings: TabStripSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: TabStripSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/commons/TabStrip", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.commons.TabStrip with name `sClassName` and enriches it with the
      * information contained in `oClassInfo`.
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
    oClassInfo: ClassInfo[T, TabStrip]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, TabStrip],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.commons.TabStrip.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait TabStrip
    extends typings.openui5.sapUiCoreControlMod.default {
    
    /**
      * Adds some tab to the aggregation {@link #getTabs tabs}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addTab(
      /**
      * The tab to add; if empty, nothing is inserted
      */
    oTab: typings.openui5.sapUiCommonsTabMod.default
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:close close} event of this `sap.ui.commons.TabStrip`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.commons.TabStrip` itself.
      *
      * Fires when the user closes a tab.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachClose(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ TabStripCloseEvent, Unit]
    ): this.type = js.native
    def attachClose(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ TabStripCloseEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.commons.TabStrip` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:close close} event of this `sap.ui.commons.TabStrip`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.commons.TabStrip` itself.
      *
      * Fires when the user closes a tab.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachClose(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ TabStripCloseEvent, Unit]
    ): this.type = js.native
    def attachClose(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ TabStripCloseEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.commons.TabStrip` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:select select} event of this `sap.ui.commons.TabStrip`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.commons.TabStrip` itself.
      *
      * Fires when the user selects a tab.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachSelect(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ TabStripSelectEvent, Unit]
    ): this.type = js.native
    def attachSelect(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ TabStripSelectEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.commons.TabStrip` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:select select} event of this `sap.ui.commons.TabStrip`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.commons.TabStrip` itself.
      *
      * Fires when the user selects a tab.
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
    fnFunction: js.Function1[/* p1 */ TabStripSelectEvent, Unit]
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
    fnFunction: js.Function1[/* p1 */ TabStripSelectEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.commons.TabStrip` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Closes a tab (if the tab is selected, the next one will be selected; if it's the last tab, the previous
      * one will be selected).
      *
      * This method should be called if the close event is fired. It can not be called automatically because
      * the consumer might need to run some logic before the tab is closed.
      */
    def closeTab(/**
      * The index of the tab that should be closed
      */
    iIndex: int): Unit = js.native
    
    /**
      * Creates a Tab and adds it to the TabStrip.
      *
      * @returns oTab The created tab control
      */
    def createTab(
      /**
      * Defines the title text of the newly created tab
      */
    sText: String,
      /**
      * Defines the root control of the content area
      */
    oContent: typings.openui5.sapUiCoreControlMod.default
    ): typings.openui5.sapUiCommonsTabMod.default = js.native
    
    /**
      * Destroys all the tabs in the aggregation {@link #getTabs tabs}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyTabs(): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:close close} event of this `sap.ui.commons.TabStrip`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachClose(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ TabStripCloseEvent, Unit]
    ): this.type = js.native
    def detachClose(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ TabStripCloseEvent, Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:select select} event of this `sap.ui.commons.TabStrip`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachSelect(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ TabStripSelectEvent, Unit]
    ): this.type = js.native
    def detachSelect(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ TabStripSelectEvent, Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Fires event {@link #event:close close} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireClose(): this.type = js.native
    def fireClose(/**
      * Parameters to pass along with the event
      */
    mParameters: TabStrip$CloseEventParameters): this.type = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Fires event {@link #event:select select} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireSelect(): this.type = js.native
    def fireSelect(/**
      * Parameters to pass along with the event
      */
    mParameters: TabStrip$SelectEventParameters): this.type = js.native
    
    /**
      * Gets current value of property {@link #getEnableTabReordering enableTabReordering}.
      *
      * Specifies whether tab reordering is enabled.
      *
      * Default value is `false`.
      *
      * @returns Value of property `enableTabReordering`
      */
    def getEnableTabReordering(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getHeight height}.
      *
      * Specifies the height of the tab bar and content area.
      *
      * @returns Value of property `height`
      */
    def getHeight(): CSSSize = js.native
    
    /**
      * Gets current value of property {@link #getSelectedIndex selectedIndex}.
      *
      * Specifies the index of the currently selected tab.
      *
      * Default value is `0`.
      *
      * @returns Value of property `selectedIndex`
      */
    def getSelectedIndex(): int = js.native
    
    /**
      * Gets content of aggregation {@link #getTabs tabs}.
      *
      * The tabs contained in the TabStrip.
      */
    def getTabs(): js.Array[typings.openui5.sapUiCommonsTabMod.default] = js.native
    
    /**
      * Gets current value of property {@link #getWidth width}.
      *
      * Specifies the width of the bar and content area.
      *
      * @returns Value of property `width`
      */
    def getWidth(): CSSSize = js.native
    
    /**
      * Checks for the provided `sap.ui.commons.Tab` in the aggregation {@link #getTabs tabs}. and returns its
      * index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfTab(/**
      * The tab whose index is looked for
      */
    oTab: typings.openui5.sapUiCommonsTabMod.default): int = js.native
    
    /**
      * Inserts a tab into the aggregation {@link #getTabs tabs}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertTab(
      /**
      * The tab to insert; if empty, nothing is inserted
      */
    oTab: typings.openui5.sapUiCommonsTabMod.default,
      /**
      * The `0`-based index the tab should be inserted at; for a negative value of `iIndex`, the tab is inserted
      * at position 0; for a value greater than the current size of the aggregation, the tab is inserted at the
      * last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Called before the rendering of the control is started.
      */
    def onBeforeRendering(): Unit = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getTabs tabs}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllTabs(): js.Array[typings.openui5.sapUiCommonsTabMod.default] = js.native
    
    def removeTab(/**
      * The tab to remove or its index or id
      */
    vTab: String): typings.openui5.sapUiCommonsTabMod.default | Null = js.native
    /**
      * Removes a tab from the aggregation {@link #getTabs tabs}.
      *
      * @returns The removed tab or `null`
      */
    def removeTab(/**
      * The tab to remove or its index or id
      */
    vTab: int): typings.openui5.sapUiCommonsTabMod.default | Null = js.native
    def removeTab(/**
      * The tab to remove or its index or id
      */
    vTab: typings.openui5.sapUiCommonsTabMod.default): typings.openui5.sapUiCommonsTabMod.default | Null = js.native
    
    /**
      * Sets whether tab reordering is enabled.
      *
      * @returns Pointer to the control instance for chaining.
      */
    def setEnableTabReordering(/**
      * The value.
      */
    bValue: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getHeight height}.
      *
      * Specifies the height of the tab bar and content area.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setHeight(): this.type = js.native
    def setHeight(/**
      * New value for property `height`
      */
    sHeight: CSSSize): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getSelectedIndex selectedIndex}.
      *
      * Specifies the index of the currently selected tab.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `0`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setSelectedIndex(): this.type = js.native
    def setSelectedIndex(/**
      * New value for property `selectedIndex`
      */
    iSelectedIndex: int): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getWidth width}.
      *
      * Specifies the width of the bar and content area.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setWidth(): this.type = js.native
    def setWidth(/**
      * New value for property `width`
      */
    sWidth: CSSSize): this.type = js.native
  }
  
  trait TabStrip$CloseEventParameters extends StObject {
    
    /**
      * The index of the closed tab.
      */
    var index: js.UndefOr[int] = js.undefined
  }
  object TabStrip$CloseEventParameters {
    
    inline def apply(): TabStrip$CloseEventParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TabStrip$CloseEventParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TabStrip$CloseEventParameters] (val x: Self) extends AnyVal {
      
      inline def setIndex(value: int): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    }
  }
  
  trait TabStrip$SelectEventParameters extends StObject {
    
    /**
      * The index of the selected tab.
      */
    var index: js.UndefOr[int] = js.undefined
  }
  object TabStrip$SelectEventParameters {
    
    inline def apply(): TabStrip$SelectEventParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TabStrip$SelectEventParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TabStrip$SelectEventParameters] (val x: Self) extends AnyVal {
      
      inline def setIndex(value: int): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    }
  }
  
  type TabStripCloseEvent = typings.openui5.sapUiBaseEventMod.default[TabStrip$CloseEventParameters]
  
  type TabStripCloseEventParameters = TabStrip$CloseEventParameters
  
  type TabStripSelectEvent = typings.openui5.sapUiBaseEventMod.default[TabStrip$SelectEventParameters]
  
  type TabStripSelectEventParameters = TabStrip$SelectEventParameters
  
  trait TabStripSettings
    extends StObject
       with ControlSettings {
    
    /**
      * Fires when the user closes a tab.
      */
    var close: js.UndefOr[
        js.Function1[
          /* oEvent */ typings.openui5.sapUiBaseEventMod.default[TabStrip$CloseEventParameters], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * Specifies whether tab reordering is enabled.
      */
    var enableTabReordering: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Specifies the height of the tab bar and content area.
      */
    var height: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Fires when the user selects a tab.
      */
    var select: js.UndefOr[
        js.Function1[
          /* oEvent */ typings.openui5.sapUiBaseEventMod.default[TabStrip$SelectEventParameters], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * Specifies the index of the currently selected tab.
      */
    var selectedIndex: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * The tabs contained in the TabStrip.
      */
    var tabs: js.UndefOr[
        js.Array[typings.openui5.sapUiCommonsTabMod.default] | typings.openui5.sapUiCommonsTabMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Specifies the width of the bar and content area.
      */
    var width: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object TabStripSettings {
    
    inline def apply(): TabStripSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TabStripSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TabStripSettings] (val x: Self) extends AnyVal {
      
      inline def setClose(
        value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[TabStrip$CloseEventParameters] => Unit
      ): Self = StObject.set(x, "close", js.Any.fromFunction1(value))
      
      inline def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
      
      inline def setEnableTabReordering(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "enableTabReordering", value.asInstanceOf[js.Any])
      
      inline def setEnableTabReorderingUndefined: Self = StObject.set(x, "enableTabReordering", js.undefined)
      
      inline def setHeight(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setSelect(
        value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[TabStrip$SelectEventParameters] => Unit
      ): Self = StObject.set(x, "select", js.Any.fromFunction1(value))
      
      inline def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
      
      inline def setSelectedIndex(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "selectedIndex", value.asInstanceOf[js.Any])
      
      inline def setSelectedIndexUndefined: Self = StObject.set(x, "selectedIndex", js.undefined)
      
      inline def setTabs(
        value: js.Array[typings.openui5.sapUiCommonsTabMod.default] | typings.openui5.sapUiCommonsTabMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "tabs", value.asInstanceOf[js.Any])
      
      inline def setTabsUndefined: Self = StObject.set(x, "tabs", js.undefined)
      
      inline def setTabsVarargs(value: typings.openui5.sapUiCommonsTabMod.default*): Self = StObject.set(x, "tabs", js.Array(value*))
      
      inline def setWidth(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
