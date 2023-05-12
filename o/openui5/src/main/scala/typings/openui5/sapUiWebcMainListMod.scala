package typings.openui5

import typings.openui5.anon.PreviouslySelectedItems
import typings.openui5.anon.`13`
import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiCoreLibraryMod.CSSSize
import typings.openui5.sapUiCoreLibraryMod.ID
import typings.openui5.sapUiWebcMainLibraryMod.IListItem
import typings.openui5.sapUiWebcMainLibraryMod.ListGrowingMode
import typings.openui5.sapUiWebcMainLibraryMod.ListMode
import typings.openui5.sapUiWebcMainLibraryMod.ListSeparators
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiWebcMainListMod {
  
  @JSImport("sap/ui/webc/main/List", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `List`.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default ()
    extends typings.openui5.sapUiWebcMainListMod.List {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: ListSettings) = this()
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
    mSettings: ListSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: ListSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/webc/main/List", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.webc.main.List with name `sClassName` and enriches it with the
      * information contained in `oClassInfo`.
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
    oClassInfo: ClassInfo[T, typings.openui5.sapUiWebcMainListMod.List]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, typings.openui5.sapUiWebcMainListMod.List],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.webc.main.List.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiWebcCommonWebComponentMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiWebcCommonWebComponentMetadataMod.default]
  }
  
  @js.native
  trait List
    extends typings.openui5.sapUiWebcCommonWebComponentMod.default {
    
    def addAriaLabelledBy(
      /**
      * The ariaLabelledBy to add; if empty, nothing is inserted
      */
    vAriaLabelledBy: typings.openui5.sapUiCoreControlMod.default
    ): this.type = js.native
    /**
      * Adds some ariaLabelledBy into the association {@link #getAriaLabelledBy ariaLabelledBy}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addAriaLabelledBy(/**
      * The ariaLabelledBy to add; if empty, nothing is inserted
      */
    vAriaLabelledBy: ID): this.type = js.native
    
    /**
      * Adds some header to the aggregation {@link #getHeader header}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addHeader(
      /**
      * The header to add; if empty, nothing is inserted
      */
    oHeader: typings.openui5.sapUiCoreControlMod.default
    ): this.type = js.native
    
    /**
      * Adds some item to the aggregation {@link #getItems items}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addItem(/**
      * The item to add; if empty, nothing is inserted
      */
    oItem: IListItem): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:itemClick itemClick} event of this `sap.ui.webc.main.List`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.webc.main.List` itself.
      *
      * Fired when an item is activated, unless the item's `type` property is set to `Inactive`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachItemClick(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachItemClick(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.webc.main.List` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:itemClick itemClick} event of this `sap.ui.webc.main.List`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.webc.main.List` itself.
      *
      * Fired when an item is activated, unless the item's `type` property is set to `Inactive`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachItemClick(
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
    def attachItemClick(
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
      * Context object to call the event handler with. Defaults to this `sap.ui.webc.main.List` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:itemClose itemClose} event of this `sap.ui.webc.main.List`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.webc.main.List` itself.
      *
      * Fired when the `Close` button of any item is clicked
      *
      *  **Note:** This event is only applicable to list items that can be closed (such as notification list
      * items), not to be confused with `item-delete`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachItemClose(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachItemClose(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.webc.main.List` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:itemClose itemClose} event of this `sap.ui.webc.main.List`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.webc.main.List` itself.
      *
      * Fired when the `Close` button of any item is clicked
      *
      *  **Note:** This event is only applicable to list items that can be closed (such as notification list
      * items), not to be confused with `item-delete`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachItemClose(
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
    def attachItemClose(
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
      * Context object to call the event handler with. Defaults to this `sap.ui.webc.main.List` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:itemDelete itemDelete} event of this `sap.ui.webc.main.List`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.webc.main.List` itself.
      *
      * Fired when the Delete button of any item is pressed.
      *
      *  **Note:** A Delete button is displayed on each item, when the component `mode` property is set to `Delete`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachItemDelete(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachItemDelete(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.webc.main.List` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:itemDelete itemDelete} event of this `sap.ui.webc.main.List`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.webc.main.List` itself.
      *
      * Fired when the Delete button of any item is pressed.
      *
      *  **Note:** A Delete button is displayed on each item, when the component `mode` property is set to `Delete`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachItemDelete(
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
    def attachItemDelete(
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
      * Context object to call the event handler with. Defaults to this `sap.ui.webc.main.List` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:itemToggle itemToggle} event of this `sap.ui.webc.main.List`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.webc.main.List` itself.
      *
      * Fired when the `Toggle` button of any item is clicked.
      *
      *  **Note:** This event is only applicable to list items that can be toggled (such as notification group
      * list items).
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachItemToggle(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachItemToggle(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.webc.main.List` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:itemToggle itemToggle} event of this `sap.ui.webc.main.List`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.webc.main.List` itself.
      *
      * Fired when the `Toggle` button of any item is clicked.
      *
      *  **Note:** This event is only applicable to list items that can be toggled (such as notification group
      * list items).
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachItemToggle(
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
    def attachItemToggle(
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
      * Context object to call the event handler with. Defaults to this `sap.ui.webc.main.List` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:loadMore loadMore} event of this `sap.ui.webc.main.List`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.webc.main.List` itself.
      *
      * Fired when the user scrolls to the bottom of the list.
      *
      *  **Note:** The event is fired when the `growing='Scroll'` property is enabled.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachLoadMore(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachLoadMore(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.webc.main.List` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:loadMore loadMore} event of this `sap.ui.webc.main.List`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.webc.main.List` itself.
      *
      * Fired when the user scrolls to the bottom of the list.
      *
      *  **Note:** The event is fired when the `growing='Scroll'` property is enabled.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachLoadMore(
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
    def attachLoadMore(
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
      * Context object to call the event handler with. Defaults to this `sap.ui.webc.main.List` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:selectionChange selectionChange} event of this
      * `sap.ui.webc.main.List`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.webc.main.List` itself.
      *
      * Fired when selection is changed by user interaction in `SingleSelect`, `SingleSelectBegin`, `SingleSelectEnd`
      * and `MultiSelect` modes.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachSelectionChange(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachSelectionChange(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.webc.main.List` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:selectionChange selectionChange} event of this
      * `sap.ui.webc.main.List`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.webc.main.List` itself.
      *
      * Fired when selection is changed by user interaction in `SingleSelect`, `SingleSelectBegin`, `SingleSelectEnd`
      * and `MultiSelect` modes.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachSelectionChange(
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
    def attachSelectionChange(
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
      * Context object to call the event handler with. Defaults to this `sap.ui.webc.main.List` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Destroys all the header in the aggregation {@link #getHeader header}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyHeader(): this.type = js.native
    
    /**
      * Destroys all the items in the aggregation {@link #getItems items}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyItems(): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:itemClick itemClick} event of this `sap.ui.webc.main.List`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachItemClick(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachItemClick(
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
      * Detaches event handler `fnFunction` from the {@link #event:itemClose itemClose} event of this `sap.ui.webc.main.List`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachItemClose(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachItemClose(
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
      * Detaches event handler `fnFunction` from the {@link #event:itemDelete itemDelete} event of this `sap.ui.webc.main.List`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachItemDelete(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachItemDelete(
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
      * Detaches event handler `fnFunction` from the {@link #event:itemToggle itemToggle} event of this `sap.ui.webc.main.List`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachItemToggle(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachItemToggle(
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
      * Detaches event handler `fnFunction` from the {@link #event:loadMore loadMore} event of this `sap.ui.webc.main.List`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachLoadMore(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachLoadMore(
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
      * Detaches event handler `fnFunction` from the {@link #event:selectionChange selectionChange} event of
      * this `sap.ui.webc.main.List`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachSelectionChange(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachSelectionChange(
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
      * Fires event {@link #event:itemClick itemClick} to attached listeners.
      *
      * Listeners may prevent the default action of this event by calling the `preventDefault` method on the
      * event object. The return value of this method indicates whether the default action should be executed.
      *
      * @returns Whether or not to prevent the default action
      */
    def fireItemClick(): Boolean = js.native
    def fireItemClick(/**
      * Parameters to pass along with the event
      */
    mParameters: `13`): Boolean = js.native
    
    /**
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Fires event {@link #event:itemClose itemClose} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireItemClose(): this.type = js.native
    def fireItemClose(/**
      * Parameters to pass along with the event
      */
    mParameters: `13`): this.type = js.native
    
    /**
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Fires event {@link #event:itemDelete itemDelete} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireItemDelete(): this.type = js.native
    def fireItemDelete(/**
      * Parameters to pass along with the event
      */
    mParameters: `13`): this.type = js.native
    
    /**
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Fires event {@link #event:itemToggle itemToggle} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireItemToggle(): this.type = js.native
    def fireItemToggle(/**
      * Parameters to pass along with the event
      */
    mParameters: `13`): this.type = js.native
    
    /**
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Fires event {@link #event:loadMore loadMore} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireLoadMore(): this.type = js.native
    def fireLoadMore(/**
      * Parameters to pass along with the event
      */
    mParameters: js.Object): this.type = js.native
    
    /**
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Fires event {@link #event:selectionChange selectionChange} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireSelectionChange(): this.type = js.native
    def fireSelectionChange(/**
      * Parameters to pass along with the event
      */
    mParameters: PreviouslySelectedItems): this.type = js.native
    
    /**
      * Gets current value of property {@link #getAccessibleName accessibleName}.
      *
      * Defines the accessible name of the component.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `accessibleName`
      */
    def getAccessibleName(): String = js.native
    
    /**
      * Gets current value of property {@link #getAccessibleRole accessibleRole}.
      *
      * Defines the accessible role of the component.
      *
      *
      *
      * Default value is `"list"`.
      *
      * @returns Value of property `accessibleRole`
      */
    def getAccessibleRole(): String = js.native
    
    /**
      * Returns array of IDs of the elements which are the current targets of the association {@link #getAriaLabelledBy
      * ariaLabelledBy}.
      */
    def getAriaLabelledBy(): js.Array[ID] = js.native
    
    /**
      * Gets current value of property {@link #getBusyDelay busyDelay}.
      *
      * Defines the delay in milliseconds, after which the busy indicator will show up for this component.
      *
      * Default value is `1000`.
      *
      * @returns Value of property `busyDelay`
      */
    def getBusyDelay(): int = js.native
    
    /**
      * Gets current value of property {@link #getFooterText footerText}.
      *
      * Defines the footer text.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `footerText`
      */
    def getFooterText(): String = js.native
    
    /**
      * Gets current value of property {@link #getGrowing growing}.
      *
      * Defines whether the component will have growing capability either by pressing a `More` button, or via
      * user scroll. In both cases `load-more` event is fired.
      *
      *
      *
      * Available options:
      *
      *  `Button` - Shows a `More` button at the bottom of the list, pressing of which triggers the `load-more`
      * event.
      *  `Scroll` - The `load-more` event is triggered when the user scrolls to the bottom of the list;
      *  `None` (default) - The growing is off.
      *
      *
      *
      * **Restrictions:** `growing="Scroll"` is not supported for Internet Explorer, on IE the component will
      * fallback to `growing="Button"`.
      *
      * Default value is `None`.
      *
      * @returns Value of property `growing`
      */
    def getGrowing(): ListGrowingMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ListGrowingMode * / any */ String) = js.native
    
    /**
      * Gets content of aggregation {@link #getHeader header}.
      *
      * Defines the component header.
      *
      *  **Note:** When `header` is set, the `headerText` property is ignored.
      */
    def getHeader(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    /**
      * Gets current value of property {@link #getHeaderText headerText}.
      *
      * Defines the component header text.
      *
      *  **Note:** If `header` is set this property is ignored.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `headerText`
      */
    def getHeaderText(): String = js.native
    
    /**
      * Gets current value of property {@link #getHeight height}.
      *
      * Defines the height of the control
      *
      * @returns Value of property `height`
      */
    def getHeight(): CSSSize = js.native
    
    /**
      * Gets current value of property {@link #getIndent indent}.
      *
      * Determines whether the component is indented.
      *
      * Default value is `false`.
      *
      * @returns Value of property `indent`
      */
    def getIndent(): Boolean = js.native
    
    /**
      * Gets content of aggregation {@link #getItems items}.
      *
      * Defines the items of the component.
      *
      *  **Note:** Use `sap.ui.webc.main.StandardListItem`, `sap.ui.webc.main.CustomListItem`, and `sap.ui.webc.main.GroupHeaderListItem`
      * for the intended design.
      */
    def getItems(): js.Array[IListItem] = js.native
    
    /**
      * Gets current value of property {@link #getMode mode}.
      *
      * Defines the mode of the component.
      *
      *  **Note:** Available options are `None`, `SingleSelect`, `SingleSelectBegin`, `SingleSelectEnd`, `MultiSelect`,
      * and `Delete`.
      *
      * Default value is `None`.
      *
      * @returns Value of property `mode`
      */
    def getMode(): ListMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ListMode * / any */ String) = js.native
    
    /**
      * Gets current value of property {@link #getNoDataText noDataText}.
      *
      * Defines the text that is displayed when the component contains no items.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `noDataText`
      */
    def getNoDataText(): String = js.native
    
    /**
      * Gets current value of property {@link #getSeparators separators}.
      *
      * Defines the item separator style that is used.
      *
      *  **Notes:**
      * 	 - Avalaible options are `All`, `Inner`, and `None`.
      * 	 - When set to `None`, none of the items are separated by horizontal lines.
      * 	 - When set to `Inner`, the first item doesn't have a top separator and the last item doesn't have a
      * 			bottom separator.
      *
      * Default value is `All`.
      *
      * @returns Value of property `separators`
      */
    def getSeparators(): ListSeparators | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ListSeparators * / any */ String) = js.native
    
    /**
      * Gets current value of property {@link #getWidth width}.
      *
      * Defines the width of the control
      *
      * @returns Value of property `width`
      */
    def getWidth(): CSSSize = js.native
    
    /**
      * Checks for the provided `sap.ui.core.Control` in the aggregation {@link #getHeader header}. and returns
      * its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfHeader(
      /**
      * The header whose index is looked for
      */
    oHeader: typings.openui5.sapUiCoreControlMod.default
    ): int = js.native
    
    /**
      * Checks for the provided `sap.ui.webc.main.IListItem` in the aggregation {@link #getItems items}. and
      * returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfItem(/**
      * The item whose index is looked for
      */
    oItem: IListItem): int = js.native
    
    /**
      * Inserts a header into the aggregation {@link #getHeader header}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertHeader(
      /**
      * The header to insert; if empty, nothing is inserted
      */
    oHeader: typings.openui5.sapUiCoreControlMod.default,
      /**
      * The `0`-based index the header should be inserted at; for a negative value of `iIndex`, the header is
      * inserted at position 0; for a value greater than the current size of the aggregation, the header is inserted
      * at the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Inserts a item into the aggregation {@link #getItems items}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertItem(
      /**
      * The item to insert; if empty, nothing is inserted
      */
    oItem: IListItem,
      /**
      * The `0`-based index the item should be inserted at; for a negative value of `iIndex`, the item is inserted
      * at position 0; for a value greater than the current size of the aggregation, the item is inserted at
      * the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Removes all the controls in the association named {@link #getAriaLabelledBy ariaLabelledBy}.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllAriaLabelledBy(): js.Array[ID] = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getHeader header}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllHeader(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getItems items}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllItems(): js.Array[IListItem] = js.native
    
    /**
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
    
    def removeHeader(/**
      * The header to remove or its index or id
      */
    vHeader: String): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    /**
      * Removes a header from the aggregation {@link #getHeader header}.
      *
      * @returns The removed header or `null`
      */
    def removeHeader(/**
      * The header to remove or its index or id
      */
    vHeader: int): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    def removeHeader(
      /**
      * The header to remove or its index or id
      */
    vHeader: typings.openui5.sapUiCoreControlMod.default
    ): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    
    def removeItem(/**
      * The item to remove or its index or id
      */
    vItem: String): IListItem | Null = js.native
    /**
      * Removes a item from the aggregation {@link #getItems items}.
      *
      * @returns The removed item or `null`
      */
    def removeItem(/**
      * The item to remove or its index or id
      */
    vItem: int): IListItem | Null = js.native
    def removeItem(/**
      * The item to remove or its index or id
      */
    vItem: IListItem): IListItem | Null = js.native
    
    /**
      * Sets a new value for property {@link #getAccessibleName accessibleName}.
      *
      * Defines the accessible name of the component.
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
      * Sets a new value for property {@link #getAccessibleRole accessibleRole}.
      *
      * Defines the accessible role of the component.
      *
      *
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `"list"`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setAccessibleRole(): this.type = js.native
    def setAccessibleRole(/**
      * New value for property `accessibleRole`
      */
    sAccessibleRole: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getBusy busy}.
      *
      * Defines if the component would display a loading indicator over the list.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setBusy(): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getBusyDelay busyDelay}.
      *
      * Defines the delay in milliseconds, after which the busy indicator will show up for this component.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `1000`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setBusyDelay(): this.type = js.native
    def setBusyDelay(/**
      * New value for property `busyDelay`
      */
    iBusyDelay: int): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getFooterText footerText}.
      *
      * Defines the footer text.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `empty string`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setFooterText(): this.type = js.native
    def setFooterText(/**
      * New value for property `footerText`
      */
    sFooterText: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getGrowing growing}.
      *
      * Defines whether the component will have growing capability either by pressing a `More` button, or via
      * user scroll. In both cases `load-more` event is fired.
      *
      *
      *
      * Available options:
      *
      *  `Button` - Shows a `More` button at the bottom of the list, pressing of which triggers the `load-more`
      * event.
      *  `Scroll` - The `load-more` event is triggered when the user scrolls to the bottom of the list;
      *  `None` (default) - The growing is off.
      *
      *
      *
      * **Restrictions:** `growing="Scroll"` is not supported for Internet Explorer, on IE the component will
      * fallback to `growing="Button"`.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `None`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setGrowing(): this.type = js.native
    def setGrowing(
      /**
      * New value for property `growing`
      */
    sGrowing: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ListGrowingMode * / any */ String
    ): this.type = js.native
    def setGrowing(/**
      * New value for property `growing`
      */
    sGrowing: ListGrowingMode): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getHeaderText headerText}.
      *
      * Defines the component header text.
      *
      *  **Note:** If `header` is set this property is ignored.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `empty string`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setHeaderText(): this.type = js.native
    def setHeaderText(/**
      * New value for property `headerText`
      */
    sHeaderText: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getHeight height}.
      *
      * Defines the height of the control
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setHeight(/**
      * New value for property `height`
      */
    sHeight: CSSSize): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getIndent indent}.
      *
      * Determines whether the component is indented.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setIndent(): this.type = js.native
    def setIndent(/**
      * New value for property `indent`
      */
    bIndent: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getMode mode}.
      *
      * Defines the mode of the component.
      *
      *  **Note:** Available options are `None`, `SingleSelect`, `SingleSelectBegin`, `SingleSelectEnd`, `MultiSelect`,
      * and `Delete`.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `None`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setMode(): this.type = js.native
    def setMode(
      /**
      * New value for property `mode`
      */
    sMode: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ListMode * / any */ String
    ): this.type = js.native
    def setMode(/**
      * New value for property `mode`
      */
    sMode: ListMode): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getNoDataText noDataText}.
      *
      * Defines the text that is displayed when the component contains no items.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `empty string`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setNoDataText(): this.type = js.native
    def setNoDataText(/**
      * New value for property `noDataText`
      */
    sNoDataText: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getSeparators separators}.
      *
      * Defines the item separator style that is used.
      *
      *  **Notes:**
      * 	 - Avalaible options are `All`, `Inner`, and `None`.
      * 	 - When set to `None`, none of the items are separated by horizontal lines.
      * 	 - When set to `Inner`, the first item doesn't have a top separator and the last item doesn't have a
      * 			bottom separator.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `All`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setSeparators(): this.type = js.native
    def setSeparators(
      /**
      * New value for property `separators`
      */
    sSeparators: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ListSeparators * / any */ String
    ): this.type = js.native
    def setSeparators(/**
      * New value for property `separators`
      */
    sSeparators: ListSeparators): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getWidth width}.
      *
      * Defines the width of the control
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setWidth(/**
      * New value for property `width`
      */
    sWidth: CSSSize): this.type = js.native
  }
  
  trait ListSettings
    extends StObject
       with ControlSettings {
    
    /**
      * Defines the accessible name of the component.
      */
    var accessibleName: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Defines the accessible role of the component.
      */
    var accessibleRole: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Receives id(or many ids) of the controls that label this control.
      */
    var ariaLabelledBy: js.UndefOr[js.Array[typings.openui5.sapUiCoreControlMod.default | String]] = js.undefined
    
    /**
      * Defines the delay in milliseconds, after which the busy indicator will show up for this component.
      */
    var busyDelay: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * Defines the footer text.
      */
    var footerText: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Defines whether the component will have growing capability either by pressing a `More` button, or via
      * user scroll. In both cases `load-more` event is fired.
      *
      *
      *
      * Available options:
      *
      *  `Button` - Shows a `More` button at the bottom of the list, pressing of which triggers the `load-more`
      * event.
      *  `Scroll` - The `load-more` event is triggered when the user scrolls to the bottom of the list;
      *  `None` (default) - The growing is off.
      *
      *
      *
      * **Restrictions:** `growing="Scroll"` is not supported for Internet Explorer, on IE the component will
      * fallback to `growing="Button"`.
      */
    var growing: js.UndefOr[
        ListGrowingMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ListGrowingMode * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Defines the component header.
      *
      *  **Note:** When `header` is set, the `headerText` property is ignored.
      */
    var header: js.UndefOr[
        js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines the component header text.
      *
      *  **Note:** If `header` is set this property is ignored.
      */
    var headerText: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Defines the height of the control
      */
    var height: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Determines whether the component is indented.
      */
    var indent: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Fired when an item is activated, unless the item's `type` property is set to `Inactive`.
      */
    var itemClick: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Fired when the `Close` button of any item is clicked
      *
      *  **Note:** This event is only applicable to list items that can be closed (such as notification list
      * items), not to be confused with `item-delete`.
      */
    var itemClose: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Fired when the Delete button of any item is pressed.
      *
      *  **Note:** A Delete button is displayed on each item, when the component `mode` property is set to `Delete`.
      */
    var itemDelete: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Fired when the `Toggle` button of any item is clicked.
      *
      *  **Note:** This event is only applicable to list items that can be toggled (such as notification group
      * list items).
      */
    var itemToggle: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Defines the items of the component.
      *
      *  **Note:** Use `sap.ui.webc.main.StandardListItem`, `sap.ui.webc.main.CustomListItem`, and `sap.ui.webc.main.GroupHeaderListItem`
      * for the intended design.
      */
    var items: js.UndefOr[
        js.Array[IListItem] | IListItem | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Fired when the user scrolls to the bottom of the list.
      *
      *  **Note:** The event is fired when the `growing='Scroll'` property is enabled.
      */
    var loadMore: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Defines the mode of the component.
      *
      *  **Note:** Available options are `None`, `SingleSelect`, `SingleSelectBegin`, `SingleSelectEnd`, `MultiSelect`,
      * and `Delete`.
      */
    var mode: js.UndefOr[
        ListMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ListMode * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Defines the text that is displayed when the component contains no items.
      */
    var noDataText: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Fired when selection is changed by user interaction in `SingleSelect`, `SingleSelectBegin`, `SingleSelectEnd`
      * and `MultiSelect` modes.
      */
    var selectionChange: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Defines the item separator style that is used.
      *
      *  **Notes:**
      * 	 - Avalaible options are `All`, `Inner`, and `None`.
      * 	 - When set to `None`, none of the items are separated by horizontal lines.
      * 	 - When set to `Inner`, the first item doesn't have a top separator and the last item doesn't have a
      * 			bottom separator.
      */
    var separators: js.UndefOr[
        ListSeparators | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ListSeparators * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Defines the width of the control
      */
    var width: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object ListSettings {
    
    inline def apply(): ListSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ListSettings] (val x: Self) extends AnyVal {
      
      inline def setAccessibleName(value: String | PropertyBindingInfo): Self = StObject.set(x, "accessibleName", value.asInstanceOf[js.Any])
      
      inline def setAccessibleNameUndefined: Self = StObject.set(x, "accessibleName", js.undefined)
      
      inline def setAccessibleRole(value: String | PropertyBindingInfo): Self = StObject.set(x, "accessibleRole", value.asInstanceOf[js.Any])
      
      inline def setAccessibleRoleUndefined: Self = StObject.set(x, "accessibleRole", js.undefined)
      
      inline def setAriaLabelledBy(value: js.Array[typings.openui5.sapUiCoreControlMod.default | String]): Self = StObject.set(x, "ariaLabelledBy", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelledByUndefined: Self = StObject.set(x, "ariaLabelledBy", js.undefined)
      
      inline def setAriaLabelledByVarargs(value: (typings.openui5.sapUiCoreControlMod.default | String)*): Self = StObject.set(x, "ariaLabelledBy", js.Array(value*))
      
      inline def setBusyDelay(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "busyDelay", value.asInstanceOf[js.Any])
      
      inline def setBusyDelayUndefined: Self = StObject.set(x, "busyDelay", js.undefined)
      
      inline def setFooterText(value: String | PropertyBindingInfo): Self = StObject.set(x, "footerText", value.asInstanceOf[js.Any])
      
      inline def setFooterTextUndefined: Self = StObject.set(x, "footerText", js.undefined)
      
      inline def setGrowing(
        value: ListGrowingMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ListGrowingMode * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "growing", value.asInstanceOf[js.Any])
      
      inline def setGrowingUndefined: Self = StObject.set(x, "growing", js.undefined)
      
      inline def setHeader(
        value: js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setHeaderText(value: String | PropertyBindingInfo): Self = StObject.set(x, "headerText", value.asInstanceOf[js.Any])
      
      inline def setHeaderTextUndefined: Self = StObject.set(x, "headerText", js.undefined)
      
      inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      inline def setHeaderVarargs(value: typings.openui5.sapUiCoreControlMod.default*): Self = StObject.set(x, "header", js.Array(value*))
      
      inline def setHeight(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setIndent(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
      
      inline def setIndentUndefined: Self = StObject.set(x, "indent", js.undefined)
      
      inline def setItemClick(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "itemClick", js.Any.fromFunction1(value))
      
      inline def setItemClickUndefined: Self = StObject.set(x, "itemClick", js.undefined)
      
      inline def setItemClose(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "itemClose", js.Any.fromFunction1(value))
      
      inline def setItemCloseUndefined: Self = StObject.set(x, "itemClose", js.undefined)
      
      inline def setItemDelete(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "itemDelete", js.Any.fromFunction1(value))
      
      inline def setItemDeleteUndefined: Self = StObject.set(x, "itemDelete", js.undefined)
      
      inline def setItemToggle(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "itemToggle", js.Any.fromFunction1(value))
      
      inline def setItemToggleUndefined: Self = StObject.set(x, "itemToggle", js.undefined)
      
      inline def setItems(
        value: js.Array[IListItem] | IListItem | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      inline def setItemsVarargs(value: IListItem*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setLoadMore(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "loadMore", js.Any.fromFunction1(value))
      
      inline def setLoadMoreUndefined: Self = StObject.set(x, "loadMore", js.undefined)
      
      inline def setMode(
        value: ListMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ListMode * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setNoDataText(value: String | PropertyBindingInfo): Self = StObject.set(x, "noDataText", value.asInstanceOf[js.Any])
      
      inline def setNoDataTextUndefined: Self = StObject.set(x, "noDataText", js.undefined)
      
      inline def setSelectionChange(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "selectionChange", js.Any.fromFunction1(value))
      
      inline def setSelectionChangeUndefined: Self = StObject.set(x, "selectionChange", js.undefined)
      
      inline def setSeparators(
        value: ListSeparators | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ListSeparators * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "separators", value.asInstanceOf[js.Any])
      
      inline def setSeparatorsUndefined: Self = StObject.set(x, "separators", js.undefined)
      
      inline def setWidth(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
