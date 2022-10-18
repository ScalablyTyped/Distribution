package typings.openui5

import typings.openui5.anon.PreviouslySelectedItems
import typings.openui5.anon.`11`
import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiCoreLibraryMod.CSSSize
import typings.openui5.sapUiWebcMainLibraryMod.ITreeItem
import typings.openui5.sapUiWebcMainLibraryMod.ListMode
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiWebcMainTreeMod {
  
  @JSImport("sap/ui/webc/main/Tree", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `Tree`.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends Tree {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: TreeSettings) = this()
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
    mSettings: TreeSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: TreeSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/webc/main/Tree", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.webc.main.Tree with name `sClassName` and enriches it with the
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
    oClassInfo: ClassInfo[T, Tree]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, Tree],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.webc.main.Tree.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiWebcCommonWebComponentMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiWebcCommonWebComponentMetadataMod.default]
  }
  
  @js.native
  trait Tree
    extends typings.openui5.sapUiWebcCommonWebComponentMod.default {
    
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
    oItem: ITreeItem): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:itemClick itemClick} event of this `sap.ui.webc.main.Tree`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.webc.main.Tree` itself.
      *
      * Fired when a tree item is activated.
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
      * Context object to call the event handler with. Defaults to this `sap.ui.webc.main.Tree` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:itemClick itemClick} event of this `sap.ui.webc.main.Tree`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.webc.main.Tree` itself.
      *
      * Fired when a tree item is activated.
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
      * Context object to call the event handler with. Defaults to this `sap.ui.webc.main.Tree` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:itemDelete itemDelete} event of this `sap.ui.webc.main.Tree`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.webc.main.Tree` itself.
      *
      * Fired when the Delete button of any tree item is pressed.
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
      * Context object to call the event handler with. Defaults to this `sap.ui.webc.main.Tree` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:itemDelete itemDelete} event of this `sap.ui.webc.main.Tree`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.webc.main.Tree` itself.
      *
      * Fired when the Delete button of any tree item is pressed.
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
      * Context object to call the event handler with. Defaults to this `sap.ui.webc.main.Tree` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:itemMouseout itemMouseout} event of this `sap.ui.webc.main.Tree`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.webc.main.Tree` itself.
      *
      * Fired when the mouse cursor leaves the tree item borders.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachItemMouseout(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachItemMouseout(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.webc.main.Tree` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:itemMouseout itemMouseout} event of this `sap.ui.webc.main.Tree`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.webc.main.Tree` itself.
      *
      * Fired when the mouse cursor leaves the tree item borders.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachItemMouseout(
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
    def attachItemMouseout(
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
      * Context object to call the event handler with. Defaults to this `sap.ui.webc.main.Tree` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:itemMouseover itemMouseover} event of this `sap.ui.webc.main.Tree`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.webc.main.Tree` itself.
      *
      * Fired when the mouse cursor enters the tree item borders.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachItemMouseover(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachItemMouseover(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.webc.main.Tree` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:itemMouseover itemMouseover} event of this `sap.ui.webc.main.Tree`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.webc.main.Tree` itself.
      *
      * Fired when the mouse cursor enters the tree item borders.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachItemMouseover(
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
    def attachItemMouseover(
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
      * Context object to call the event handler with. Defaults to this `sap.ui.webc.main.Tree` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:itemToggle itemToggle} event of this `sap.ui.webc.main.Tree`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.webc.main.Tree` itself.
      *
      * Fired when a tree item is expanded or collapsed. Note: You can call `preventDefault()` on the
      * event object to suppress the event, if needed. This may be handy for example if you want to dynamically
      * load tree items upon the user expanding a node. Even if you prevented the event's default behavior, you
      * can always manually call `toggle()` on a tree item.
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
      * Context object to call the event handler with. Defaults to this `sap.ui.webc.main.Tree` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:itemToggle itemToggle} event of this `sap.ui.webc.main.Tree`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.webc.main.Tree` itself.
      *
      * Fired when a tree item is expanded or collapsed. Note: You can call `preventDefault()` on the
      * event object to suppress the event, if needed. This may be handy for example if you want to dynamically
      * load tree items upon the user expanding a node. Even if you prevented the event's default behavior, you
      * can always manually call `toggle()` on a tree item.
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
      * Context object to call the event handler with. Defaults to this `sap.ui.webc.main.Tree` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:selectionChange selectionChange} event of this
      * `sap.ui.webc.main.Tree`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.webc.main.Tree` itself.
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
      * Context object to call the event handler with. Defaults to this `sap.ui.webc.main.Tree` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:selectionChange selectionChange} event of this
      * `sap.ui.webc.main.Tree`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.webc.main.Tree` itself.
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
      * Context object to call the event handler with. Defaults to this `sap.ui.webc.main.Tree` itself
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
      * Detaches event handler `fnFunction` from the {@link #event:itemClick itemClick} event of this `sap.ui.webc.main.Tree`.
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
      * Detaches event handler `fnFunction` from the {@link #event:itemDelete itemDelete} event of this `sap.ui.webc.main.Tree`.
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
      * Detaches event handler `fnFunction` from the {@link #event:itemMouseout itemMouseout} event of this `sap.ui.webc.main.Tree`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachItemMouseout(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachItemMouseout(
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
      * Detaches event handler `fnFunction` from the {@link #event:itemMouseover itemMouseover} event of this
      * `sap.ui.webc.main.Tree`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachItemMouseover(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachItemMouseover(
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
      * Detaches event handler `fnFunction` from the {@link #event:itemToggle itemToggle} event of this `sap.ui.webc.main.Tree`.
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
      * Detaches event handler `fnFunction` from the {@link #event:selectionChange selectionChange} event of
      * this `sap.ui.webc.main.Tree`.
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
    mParameters: `11`): Boolean = js.native
    
    /**
      * Fires event {@link #event:itemDelete itemDelete} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireItemDelete(): this.type = js.native
    def fireItemDelete(/**
      * Parameters to pass along with the event
      */
    mParameters: `11`): this.type = js.native
    
    /**
      * Fires event {@link #event:itemMouseout itemMouseout} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireItemMouseout(): this.type = js.native
    def fireItemMouseout(/**
      * Parameters to pass along with the event
      */
    mParameters: `11`): this.type = js.native
    
    /**
      * Fires event {@link #event:itemMouseover itemMouseover} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireItemMouseover(): this.type = js.native
    def fireItemMouseover(/**
      * Parameters to pass along with the event
      */
    mParameters: `11`): this.type = js.native
    
    /**
      * Fires event {@link #event:itemToggle itemToggle} to attached listeners.
      *
      * Listeners may prevent the default action of this event by calling the `preventDefault` method on the
      * event object. The return value of this method indicates whether the default action should be executed.
      *
      * @returns Whether or not to prevent the default action
      */
    def fireItemToggle(): Boolean = js.native
    def fireItemToggle(/**
      * Parameters to pass along with the event
      */
    mParameters: `11`): Boolean = js.native
    
    /**
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
      * Gets current value of property {@link #getFooterText footerText}.
      *
      * Defines the component footer text.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `footerText`
      */
    def getFooterText(): String = js.native
    
    /**
      * Gets content of aggregation {@link #getHeader header}.
      *
      * Defines the component header.
      *
      *  **Note:** When the `header` slot is set, the `headerText` property is ignored.
      */
    def getHeader(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    /**
      * Gets current value of property {@link #getHeaderText headerText}.
      *
      * Defines the component header text.
      *
      *  **Note:** If the `header` slot is set, this property is ignored.
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
      * Gets content of aggregation {@link #getItems items}.
      *
      * Defines the items of the component. Tree items may have other tree items as children.
      *
      *  **Note:** Use `sap.ui.webc.main.TreeItem` for the intended design.
      */
    def getItems(): js.Array[ITreeItem] = js.native
    
    /**
      * Gets current value of property {@link #getMode mode}.
      *
      * Defines the mode of the component. Since the tree uses a `sap.ui.webc.main.List` to display its structure,
      * the tree modes are exactly the same as the list modes, and are all applicable.
      *
      *
      *
      *  **Note:**
      *
      *
      * 	 - `None`
      * 	 - `SingleSelect`
      * 	 - `SingleSelectBegin`
      * 	 - `SingleSelectEnd`
      * 	 - `MultiSelect`
      * 	 - `Delete`
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
      * Checks for the provided `sap.ui.webc.main.ITreeItem` in the aggregation {@link #getItems items}. and
      * returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfItem(/**
      * The item whose index is looked for
      */
    oItem: ITreeItem): int = js.native
    
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
    oItem: ITreeItem,
      /**
      * The `0`-based index the item should be inserted at; for a negative value of `iIndex`, the item is inserted
      * at position 0; for a value greater than the current size of the aggregation, the item is inserted at
      * the last position
      */
    iIndex: int
    ): this.type = js.native
    
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
    def removeAllItems(): js.Array[ITreeItem] = js.native
    
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
    vItem: String): ITreeItem | Null = js.native
    /**
      * Removes a item from the aggregation {@link #getItems items}.
      *
      * @returns The removed item or `null`
      */
    def removeItem(/**
      * The item to remove or its index or id
      */
    vItem: int): ITreeItem | Null = js.native
    def removeItem(/**
      * The item to remove or its index or id
      */
    vItem: ITreeItem): ITreeItem | Null = js.native
    
    /**
      * Sets a new value for property {@link #getFooterText footerText}.
      *
      * Defines the component footer text.
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
      * Sets a new value for property {@link #getHeaderText headerText}.
      *
      * Defines the component header text.
      *
      *  **Note:** If the `header` slot is set, this property is ignored.
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
      * Sets a new value for property {@link #getMode mode}.
      *
      * Defines the mode of the component. Since the tree uses a `sap.ui.webc.main.List` to display its structure,
      * the tree modes are exactly the same as the list modes, and are all applicable.
      *
      *
      *
      *  **Note:**
      *
      *
      * 	 - `None`
      * 	 - `SingleSelect`
      * 	 - `SingleSelectBegin`
      * 	 - `SingleSelectEnd`
      * 	 - `MultiSelect`
      * 	 - `Delete`
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
    
    /**
      * Perform Depth-First-Search walk on the tree and run a callback on each node
      */
    def walk(
      /**
      * function to execute on each node of the tree with 2 arguments: the node and the level
      */
    callback: js.Function
    ): Unit = js.native
  }
  
  trait TreeSettings
    extends StObject
       with ControlSettings {
    
    /**
      * Defines the component footer text.
      */
    var footerText: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Defines the component header.
      *
      *  **Note:** When the `header` slot is set, the `headerText` property is ignored.
      */
    var header: js.UndefOr[
        js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines the component header text.
      *
      *  **Note:** If the `header` slot is set, this property is ignored.
      */
    var headerText: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Defines the height of the control
      */
    var height: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Fired when a tree item is activated.
      */
    var itemClick: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Fired when the Delete button of any tree item is pressed.
      *
      *  **Note:** A Delete button is displayed on each item, when the component `mode` property is set to `Delete`.
      */
    var itemDelete: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Fired when the mouse cursor leaves the tree item borders.
      */
    var itemMouseout: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Fired when the mouse cursor enters the tree item borders.
      */
    var itemMouseover: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Fired when a tree item is expanded or collapsed. Note: You can call `preventDefault()` on the
      * event object to suppress the event, if needed. This may be handy for example if you want to dynamically
      * load tree items upon the user expanding a node. Even if you prevented the event's default behavior, you
      * can always manually call `toggle()` on a tree item.
      */
    var itemToggle: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Defines the items of the component. Tree items may have other tree items as children.
      *
      *  **Note:** Use `sap.ui.webc.main.TreeItem` for the intended design.
      */
    var items: js.UndefOr[
        js.Array[ITreeItem] | ITreeItem | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines the mode of the component. Since the tree uses a `sap.ui.webc.main.List` to display its structure,
      * the tree modes are exactly the same as the list modes, and are all applicable.
      *
      *
      *
      *  **Note:**
      *
      *
      * 	 - `None`
      * 	 - `SingleSelect`
      * 	 - `SingleSelectBegin`
      * 	 - `SingleSelectEnd`
      * 	 - `MultiSelect`
      * 	 - `Delete`
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
      * Defines the width of the control
      */
    var width: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object TreeSettings {
    
    inline def apply(): TreeSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TreeSettings]
    }
    
    extension [Self <: TreeSettings](x: Self) {
      
      inline def setFooterText(value: String | PropertyBindingInfo): Self = StObject.set(x, "footerText", value.asInstanceOf[js.Any])
      
      inline def setFooterTextUndefined: Self = StObject.set(x, "footerText", js.undefined)
      
      inline def setHeader(
        value: js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setHeaderText(value: String | PropertyBindingInfo): Self = StObject.set(x, "headerText", value.asInstanceOf[js.Any])
      
      inline def setHeaderTextUndefined: Self = StObject.set(x, "headerText", js.undefined)
      
      inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      inline def setHeaderVarargs(value: typings.openui5.sapUiCoreControlMod.default*): Self = StObject.set(x, "header", js.Array(value*))
      
      inline def setHeight(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setItemClick(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "itemClick", js.Any.fromFunction1(value))
      
      inline def setItemClickUndefined: Self = StObject.set(x, "itemClick", js.undefined)
      
      inline def setItemDelete(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "itemDelete", js.Any.fromFunction1(value))
      
      inline def setItemDeleteUndefined: Self = StObject.set(x, "itemDelete", js.undefined)
      
      inline def setItemMouseout(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "itemMouseout", js.Any.fromFunction1(value))
      
      inline def setItemMouseoutUndefined: Self = StObject.set(x, "itemMouseout", js.undefined)
      
      inline def setItemMouseover(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "itemMouseover", js.Any.fromFunction1(value))
      
      inline def setItemMouseoverUndefined: Self = StObject.set(x, "itemMouseover", js.undefined)
      
      inline def setItemToggle(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "itemToggle", js.Any.fromFunction1(value))
      
      inline def setItemToggleUndefined: Self = StObject.set(x, "itemToggle", js.undefined)
      
      inline def setItems(
        value: js.Array[ITreeItem] | ITreeItem | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      inline def setItemsVarargs(value: ITreeItem*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setMode(
        value: ListMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ListMode * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setNoDataText(value: String | PropertyBindingInfo): Self = StObject.set(x, "noDataText", value.asInstanceOf[js.Any])
      
      inline def setNoDataTextUndefined: Self = StObject.set(x, "noDataText", js.undefined)
      
      inline def setSelectionChange(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "selectionChange", js.Any.fromFunction1(value))
      
      inline def setSelectionChangeUndefined: Self = StObject.set(x, "selectionChange", js.undefined)
      
      inline def setWidth(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
