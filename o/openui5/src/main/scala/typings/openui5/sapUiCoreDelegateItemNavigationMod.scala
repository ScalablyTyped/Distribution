package typings.openui5

import typings.openui5.jQuery.Event
import typings.openui5.sap.ClassInfo
import typings.std.Element
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiCoreDelegateItemNavigationMod {
  
  @JSImport("sap/ui/core/delegate/ItemNavigation", JSImport.Default)
  @js.native
  open class default protected () extends ItemNavigation {
    /**
      * Creates an `ItemNavigation` delegate that can be attached to controls requiring capabilities for keyboard
      * navigation between items.
      */
    def this(
      /**
      * The root DOM reference that includes all items
      */
    oDomRef: Element,
      /**
      * Array of DOM references representing the items for the navigation
      */
    aItemDomRefs: js.Array[Element]
    ) = this()
    def this(
      /**
      * The root DOM reference that includes all items
      */
    oDomRef: Element,
      /**
      * Array of DOM references representing the items for the navigation
      */
    aItemDomRefs: js.Array[Element],
      /**
      * Whether the selected element should be in the tab chain or not
      */
    bNotInTabChain: Boolean
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/core/delegate/ItemNavigation", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.core.delegate.ItemNavigation with name `sClassName` and enriches
      * it with the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.base.EventProvider.extend}.
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
    oClassInfo: ClassInfo[T, ItemNavigation]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, ItemNavigation],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.core.delegate.ItemNavigation.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiBaseMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiBaseMetadataMod.default]
  }
  
  @js.native
  trait ItemNavigation
    extends typings.openui5.sapUiBaseEventProviderMod.default {
    
    /**
      * Returns disabled modifiers These modifiers will not be handled by the `ItemNavigation`
      *
      * @returns Object that includes event type with disabled keys as an array
      */
    def getDisabledModifiers(
      /**
      * Object that includes event type with disabled keys as an array
      */
    oDisabledModifiers: js.Object
    ): js.Object = js.native
    
    /**
      * Returns the array of item DOM references
      *
      * @returns Array of item DOM references
      */
    def getItemDomRefs(): js.Array[Element] = js.native
    
    /**
      * Returns the root DOM reference surrounding the items
      *
      * @returns Root DOM reference
      */
    def getRootDomRef(): Element = js.native
    
    /**
      * Check whether given event has disabled modifier or not
      *
      * @returns Flag if disabled modifiers are set
      */
    def hasDisabledModifier(/**
      * jQuery event
      */
    oEvent: Event): Boolean = js.native
    
    /**
      * Sets whether the items are displayed in columns.
      *
      * If columns are used, the Arrow Up and Arrow Down keys navigate to the next or previous item of the column.
      * If the first or last item of the column is reached, the next focused item is then in the next or previous
      * column.
      *
      * @returns `this` to allow method chaining
      */
    def setColumns(
      /**
      * Count of columns for the table mode or cycling mode
      */
    iColumns: int,
      /**
      * Forbids jumping to an other column with Arrow Up and Arrow Down keys
      */
    bNoColumnChange: Boolean
    ): this.type = js.native
    
    /**
      * Sets whether the `ItemNavigation` should cycle through the items.
      *
      * If cycling is disabled the navigation stops at the first and last item, if the corresponding arrow keys
      * are used.
      *
      * @returns `this` to allow method chaining
      */
    def setCycling(/**
      * Set to true if cycling should be done, else false
      */
    bCycling: Boolean): this.type = js.native
    
    /**
      * Sets the disabled modifiers These modifiers will not be handled by the `ItemNavigation`
      *
      *
      * ```javascript
      *
      * Example: Disable shift + up handling of the `ItemNavigation`
      *
      * oItemNavigation.setDisabledModifiers({
      *     sapnext : ["shift"]
      * });
      *
      * Possible keys are : "shift", "alt", "ctrl", "meta"
      * Possible events are : "sapnext", "sapprevious", "saphome", "sapend"
      * ```
      *
      *
      * @returns `this` to allow method chaining
      */
    def setDisabledModifiers(
      /**
      * Object that includes event type with disabled keys as an array
      */
    oDisabledModifiers: js.Object
    ): this.type = js.native
    
    /**
      * Sets behavior of HOME and END keys if columns are used.
      *
      * @returns `this` to allow method chaining
      */
    def setHomeEndColumnMode(
      /**
      * HOME -> go to first item in row; END -> go to last item in row
      */
    bStayInRow: Boolean,
      /**
      * HOME/END with CTRL -> go to first/last item of all
      */
    bCtrlEnabled: Boolean
    ): this.type = js.native
    
    /**
      * Sets the item DOM references as an array for the items
      *
      * @returns `this` to allow method chaining
      */
    def setItemDomRefs(
      /**
      * Array of DOM references or DOM node list object, representing the items
      */
    aItemDomRefs: js.Array[Element]
    ): this.type = js.native
    
    /**
      * Sets the page size of the item navigation to allow Page Up and Page Down keys.
      *
      * @returns `this` to allow method chaining
      */
    def setPageSize(/**
      * The page size, needs to be at least 1
      */
    iPageSize: int): this.type = js.native
    
    /**
      * Sets the root DOM reference surrounding the items
      *
      * @returns `this` to allow method chaining
      */
    def setRootDomRef(/**
      * Root DOM reference
      */
    oDomRef: Element): this.type = js.native
    
    /**
      * Sets the selected index if the used control supports selection.
      *
      * @returns `this` to allow method chaining
      */
    def setSelectedIndex(/**
      * Index of the first selected item
      */
    iIndex: int): this.type = js.native
    
    /**
      * Sets whether the `ItemNavigation` should use the table mode to navigate through the items (navigation
      * in a grid).
      *
      * @returns `this` to allow method chaining
      */
    def setTableMode(/**
      * Set to true if table mode should be used, else false
      */
    bTableMode: Boolean): this.type = js.native
    def setTableMode(
      /**
      * Set to true if table mode should be used, else false
      */
    bTableMode: Boolean,
      /**
      * This sets a different behavior for table mode. In this mode we keep using table navigation but there
      * are some differences. e.g.
      * 	 - Page-up moves focus to the first row, not to the first cell like in table mode
      * 	 - Page-down moves focus to the last row, not to the last cell like in table mode
      */
    bTableList: Boolean
    ): this.type = js.native
  }
}
