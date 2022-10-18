package typings.openui5

import typings.openui5.anon.Actual
import typings.openui5.anon.ListItem
import typings.openui5.anon.ListItems
import typings.openui5.anon.Reason
import typings.openui5.anon.SrcControl
import typings.openui5.anon.SwipeContent
import typings.openui5.anon.Total
import typings.openui5.sap.ClassInfo
import typings.openui5.sapMLibraryMod.ListGrowingDirection
import typings.openui5.sapMLibraryMod.ListHeaderDesign
import typings.openui5.sapMLibraryMod.ListKeyboardMode
import typings.openui5.sapMLibraryMod.ListMode
import typings.openui5.sapMLibraryMod.ListSeparators
import typings.openui5.sapMLibraryMod.MultiSelectMode
import typings.openui5.sapMLibraryMod.Sticky
import typings.openui5.sapMLibraryMod.SwipeDirection
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiCoreLibraryMod.CSSSize
import typings.openui5.sapUiCoreLibraryMod.IContextMenu
import typings.openui5.sapUiCoreLibraryMod.ID
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMListBaseMod {
  
  @JSImport("sap/m/ListBase", JSImport.Default)
  @js.native
  /**
    * Constructor for a new ListBase.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends ListBase {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: ListBaseSettings) = this()
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
    mSettings: ListBaseSettings
    ) = this()
    def this(
      /**
      * Id for the new control, generated automatically if no id is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: ListBaseSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/m/ListBase", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.ListBase with name `sClassName` and enriches it with the information
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
    oClassInfo: ClassInfo[T, ListBase]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, ListBase],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.m.ListBase.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait ListBase
    extends typings.openui5.sapUiCoreControlMod.default {
    
    def addAriaLabelledBy(
      /**
      * The ariaLabelledBy to add; if empty, nothing is inserted
      */
    vAriaLabelledBy: typings.openui5.sapUiCoreControlMod.default
    ): this.type = js.native
    /**
      * @SINCE 1.28.0
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
    oItem: typings.openui5.sapMListItemBaseMod.default
    ): this.type = js.native
    
    /**
      * @SINCE 1.54
      *
      * Attaches event handler `fnFunction` to the {@link #event:beforeOpenContextMenu beforeOpenContextMenu}
      * event of this `sap.m.ListBase`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.ListBase` itself.
      *
      * Fired when the context menu is opened. When the context menu is opened, the binding context of the item
      * is set to the given `contextMenu`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachBeforeOpenContextMenu(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachBeforeOpenContextMenu(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.ListBase` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * @SINCE 1.54
      *
      * Attaches event handler `fnFunction` to the {@link #event:beforeOpenContextMenu beforeOpenContextMenu}
      * event of this `sap.m.ListBase`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.ListBase` itself.
      *
      * Fired when the context menu is opened. When the context menu is opened, the binding context of the item
      * is set to the given `contextMenu`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachBeforeOpenContextMenu(
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
    def attachBeforeOpenContextMenu(
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
      * Context object to call the event handler with. Defaults to this `sap.m.ListBase` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:delete delete} event of this `sap.m.ListBase`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.ListBase` itself.
      *
      * Fires when delete icon is pressed by user.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachDelete(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachDelete(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.ListBase` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:delete delete} event of this `sap.m.ListBase`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.ListBase` itself.
      *
      * Fires when delete icon is pressed by user.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachDelete(
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
    def attachDelete(
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
      * Context object to call the event handler with. Defaults to this `sap.m.ListBase` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @SINCE 1.16
      * @deprecated (since 1.16.3) - Instead, use "updateFinished" event.
      *
      * Attaches event handler `fnFunction` to the {@link #event:growingFinished growingFinished} event of this
      * `sap.m.ListBase`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.ListBase` itself.
      *
      * Fires after the new growing chunk has been fetched from the model and processed by the control.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachGrowingFinished(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachGrowingFinished(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.ListBase` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * @SINCE 1.16
      * @deprecated (since 1.16.3) - Instead, use "updateFinished" event.
      *
      * Attaches event handler `fnFunction` to the {@link #event:growingFinished growingFinished} event of this
      * `sap.m.ListBase`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.ListBase` itself.
      *
      * Fires after the new growing chunk has been fetched from the model and processed by the control.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachGrowingFinished(
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
    def attachGrowingFinished(
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
      * Context object to call the event handler with. Defaults to this `sap.m.ListBase` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @SINCE 1.16
      * @deprecated (since 1.16.3) - Instead, use `updateStarted` event with listening `changeReason`.
      *
      * Attaches event handler `fnFunction` to the {@link #event:growingStarted growingStarted} event of this
      * `sap.m.ListBase`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.ListBase` itself.
      *
      * Fires before the new growing chunk is requested from the model.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachGrowingStarted(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachGrowingStarted(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.ListBase` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * @SINCE 1.16
      * @deprecated (since 1.16.3) - Instead, use `updateStarted` event with listening `changeReason`.
      *
      * Attaches event handler `fnFunction` to the {@link #event:growingStarted growingStarted} event of this
      * `sap.m.ListBase`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.ListBase` itself.
      *
      * Fires before the new growing chunk is requested from the model.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachGrowingStarted(
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
    def attachGrowingStarted(
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
      * Context object to call the event handler with. Defaults to this `sap.m.ListBase` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @SINCE 1.20
      *
      * Attaches event handler `fnFunction` to the {@link #event:itemPress itemPress} event of this `sap.m.ListBase`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.ListBase` itself.
      *
      * Fires when an item is pressed unless the item's `type` property is `Inactive`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachItemPress(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachItemPress(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.ListBase` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * @SINCE 1.20
      *
      * Attaches event handler `fnFunction` to the {@link #event:itemPress itemPress} event of this `sap.m.ListBase`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.ListBase` itself.
      *
      * Fires when an item is pressed unless the item's `type` property is `Inactive`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachItemPress(
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
    def attachItemPress(
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
      * Context object to call the event handler with. Defaults to this `sap.m.ListBase` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @deprecated (since 1.16) - Use the `selectionChange` event instead.
      *
      * Attaches event handler `fnFunction` to the {@link #event:select select} event of this `sap.m.ListBase`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.ListBase` itself.
      *
      * Fires when selection is changed via user interaction. In `MultiSelect` mode, this event is also fired
      * on deselection.
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
      * Context object to call the event handler with. Defaults to this `sap.m.ListBase` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * @deprecated (since 1.16) - Use the `selectionChange` event instead.
      *
      * Attaches event handler `fnFunction` to the {@link #event:select select} event of this `sap.m.ListBase`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.ListBase` itself.
      *
      * Fires when selection is changed via user interaction. In `MultiSelect` mode, this event is also fired
      * on deselection.
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
      * Context object to call the event handler with. Defaults to this `sap.m.ListBase` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @SINCE 1.16
      *
      * Attaches event handler `fnFunction` to the {@link #event:selectionChange selectionChange} event of this
      * `sap.m.ListBase`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.ListBase` itself.
      *
      * Fires when selection is changed via user interaction inside the control.
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
      * Context object to call the event handler with. Defaults to this `sap.m.ListBase` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * @SINCE 1.16
      *
      * Attaches event handler `fnFunction` to the {@link #event:selectionChange selectionChange} event of this
      * `sap.m.ListBase`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.ListBase` itself.
      *
      * Fires when selection is changed via user interaction inside the control.
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
      * Context object to call the event handler with. Defaults to this `sap.m.ListBase` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:swipe swipe} event of this `sap.m.ListBase`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.ListBase` itself.
      *
      * Fires after user's swipe action and before the `swipeContent` is shown. On the `swipe` event handler,
      * `swipeContent` can be changed according to the swiped item. Calling the `preventDefault` method of the
      * event cancels the swipe action.
      *
      * **Note:** There is no accessible alternative provided by the control for swiping. Applications that use
      * this functionality must provide an accessible alternative UI to perform the same action.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachSwipe(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachSwipe(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.ListBase` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:swipe swipe} event of this `sap.m.ListBase`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.ListBase` itself.
      *
      * Fires after user's swipe action and before the `swipeContent` is shown. On the `swipe` event handler,
      * `swipeContent` can be changed according to the swiped item. Calling the `preventDefault` method of the
      * event cancels the swipe action.
      *
      * **Note:** There is no accessible alternative provided by the control for swiping. Applications that use
      * this functionality must provide an accessible alternative UI to perform the same action.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachSwipe(
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
    def attachSwipe(
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
      * Context object to call the event handler with. Defaults to this `sap.m.ListBase` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @SINCE 1.16.3
      *
      * Attaches event handler `fnFunction` to the {@link #event:updateFinished updateFinished} event of this
      * `sap.m.ListBase`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.ListBase` itself.
      *
      * Fires after `items` binding is updated and processed by the control.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachUpdateFinished(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachUpdateFinished(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.ListBase` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * @SINCE 1.16.3
      *
      * Attaches event handler `fnFunction` to the {@link #event:updateFinished updateFinished} event of this
      * `sap.m.ListBase`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.ListBase` itself.
      *
      * Fires after `items` binding is updated and processed by the control.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachUpdateFinished(
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
    def attachUpdateFinished(
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
      * Context object to call the event handler with. Defaults to this `sap.m.ListBase` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @SINCE 1.16.3
      *
      * Attaches event handler `fnFunction` to the {@link #event:updateStarted updateStarted} event of this `sap.m.ListBase`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.ListBase` itself.
      *
      * Fires before `items` binding is updated (e.g. sorting, filtering)
      *
      * **Note:** Event handler should not invalidate the control.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachUpdateStarted(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachUpdateStarted(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.ListBase` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * @SINCE 1.16.3
      *
      * Attaches event handler `fnFunction` to the {@link #event:updateStarted updateStarted} event of this `sap.m.ListBase`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.ListBase` itself.
      *
      * Fires before `items` binding is updated (e.g. sorting, filtering)
      *
      * **Note:** Event handler should not invalidate the control.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachUpdateStarted(
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
    def attachUpdateStarted(
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
      * Context object to call the event handler with. Defaults to this `sap.m.ListBase` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Binds aggregation {@link #getItems items} to model data.
      *
      * See {@link sap.ui.base.ManagedObject#bindAggregation ManagedObject.bindAggregation} for a detailed description
      * of the possible properties of `oBindingInfo`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def bindItems(/**
      * The binding information
      */
    oBindingInfo: AggregationBindingInfo): this.type = js.native
    
    /**
      * @SINCE 1.54
      *
      * Destroys the contextMenu in the aggregation {@link #getContextMenu contextMenu}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyContextMenu(): this.type = js.native
    
    /**
      * @SINCE 1.16
      *
      * Destroys the headerToolbar in the aggregation {@link #getHeaderToolbar headerToolbar}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyHeaderToolbar(): this.type = js.native
    
    /**
      * @SINCE 1.16
      *
      * Destroys the infoToolbar in the aggregation {@link #getInfoToolbar infoToolbar}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyInfoToolbar(): this.type = js.native
    
    /**
      * Destroys all the items in the aggregation {@link #getItems items}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyItems(): this.type = js.native
    
    /**
      * @SINCE 1.101
      *
      * Destroys the noData in the aggregation {@link #getNoData noData}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyNoData(): this.type = js.native
    
    /**
      * Destroys the swipeContent in the aggregation {@link #getSwipeContent swipeContent}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroySwipeContent(): this.type = js.native
    
    /**
      * @SINCE 1.54
      *
      * Detaches event handler `fnFunction` from the {@link #event:beforeOpenContextMenu beforeOpenContextMenu}
      * event of this `sap.m.ListBase`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachBeforeOpenContextMenu(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachBeforeOpenContextMenu(
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
      * Detaches event handler `fnFunction` from the {@link #event:delete delete} event of this `sap.m.ListBase`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachDelete(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachDelete(
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
      * @SINCE 1.16
      * @deprecated (since 1.16.3) - Instead, use "updateFinished" event.
      *
      * Detaches event handler `fnFunction` from the {@link #event:growingFinished growingFinished} event of
      * this `sap.m.ListBase`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachGrowingFinished(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachGrowingFinished(
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
      * @SINCE 1.16
      * @deprecated (since 1.16.3) - Instead, use `updateStarted` event with listening `changeReason`.
      *
      * Detaches event handler `fnFunction` from the {@link #event:growingStarted growingStarted} event of this
      * `sap.m.ListBase`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachGrowingStarted(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachGrowingStarted(
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
      * @SINCE 1.20
      *
      * Detaches event handler `fnFunction` from the {@link #event:itemPress itemPress} event of this `sap.m.ListBase`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachItemPress(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachItemPress(
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
      * @deprecated (since 1.16) - Use the `selectionChange` event instead.
      *
      * Detaches event handler `fnFunction` from the {@link #event:select select} event of this `sap.m.ListBase`.
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
      * @SINCE 1.16
      *
      * Detaches event handler `fnFunction` from the {@link #event:selectionChange selectionChange} event of
      * this `sap.m.ListBase`.
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
      * Detaches event handler `fnFunction` from the {@link #event:swipe swipe} event of this `sap.m.ListBase`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachSwipe(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachSwipe(
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
      * @SINCE 1.16.3
      *
      * Detaches event handler `fnFunction` from the {@link #event:updateFinished updateFinished} event of this
      * `sap.m.ListBase`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachUpdateFinished(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachUpdateFinished(
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
      * @SINCE 1.16.3
      *
      * Detaches event handler `fnFunction` from the {@link #event:updateStarted updateStarted} event of this
      * `sap.m.ListBase`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachUpdateStarted(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachUpdateStarted(
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
      * This method is a hook for the RenderManager that gets called during the rendering of child Controls.
      * It allows to add, remove and update existing accessibility attributes (ARIA) of those controls.
      */
    def enhanceAccessibilityState(
      /**
      * The Control that gets rendered by the RenderManager
      */
    oElement: typings.openui5.sapUiCoreControlMod.default,
      /**
      * The mapping of "aria-" prefixed attributes
      */
    mAriaProps: js.Object
    ): Unit = js.native
    
    /**
      * @SINCE 1.54
      *
      * Fires event {@link #event:beforeOpenContextMenu beforeOpenContextMenu} to attached listeners.
      *
      * Listeners may prevent the default action of this event by calling the `preventDefault` method on the
      * event object. The return value of this method indicates whether the default action should be executed.
      *
      * @returns Whether or not to prevent the default action
      */
    def fireBeforeOpenContextMenu(): Boolean = js.native
    def fireBeforeOpenContextMenu(/**
      * Parameters to pass along with the event
      */
    mParameters: ListItem): Boolean = js.native
    
    /**
      * Fires event {@link #event:delete delete} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireDelete(): this.type = js.native
    def fireDelete(/**
      * Parameters to pass along with the event
      */
    mParameters: ListItem): this.type = js.native
    
    /**
      * @SINCE 1.16
      * @deprecated (since 1.16.3) - Instead, use "updateFinished" event.
      *
      * Fires event {@link #event:growingFinished growingFinished} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireGrowingFinished(): this.type = js.native
    def fireGrowingFinished(/**
      * Parameters to pass along with the event
      */
    mParameters: Actual): this.type = js.native
    
    /**
      * @SINCE 1.16
      * @deprecated (since 1.16.3) - Instead, use `updateStarted` event with listening `changeReason`.
      *
      * Fires event {@link #event:growingStarted growingStarted} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireGrowingStarted(): this.type = js.native
    def fireGrowingStarted(/**
      * Parameters to pass along with the event
      */
    mParameters: Actual): this.type = js.native
    
    /**
      * @SINCE 1.20
      *
      * Fires event {@link #event:itemPress itemPress} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireItemPress(): this.type = js.native
    def fireItemPress(/**
      * Parameters to pass along with the event
      */
    mParameters: SrcControl): this.type = js.native
    
    /**
      * @deprecated (since 1.16) - Use the `selectionChange` event instead.
      *
      * Fires event {@link #event:select select} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireSelect(): this.type = js.native
    def fireSelect(/**
      * Parameters to pass along with the event
      */
    mParameters: ListItem): this.type = js.native
    
    /**
      * @SINCE 1.16
      *
      * Fires event {@link #event:selectionChange selectionChange} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireSelectionChange(): this.type = js.native
    def fireSelectionChange(/**
      * Parameters to pass along with the event
      */
    mParameters: ListItems): this.type = js.native
    
    /**
      * Fires event {@link #event:swipe swipe} to attached listeners.
      *
      * Listeners may prevent the default action of this event by calling the `preventDefault` method on the
      * event object. The return value of this method indicates whether the default action should be executed.
      *
      * @returns Whether or not to prevent the default action
      */
    def fireSwipe(): Boolean = js.native
    def fireSwipe(/**
      * Parameters to pass along with the event
      */
    mParameters: SwipeContent): Boolean = js.native
    
    /**
      * @SINCE 1.16.3
      *
      * Fires event {@link #event:updateFinished updateFinished} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireUpdateFinished(): this.type = js.native
    def fireUpdateFinished(/**
      * Parameters to pass along with the event
      */
    mParameters: Reason): this.type = js.native
    
    /**
      * @SINCE 1.16.3
      *
      * Fires event {@link #event:updateStarted updateStarted} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireUpdateStarted(): this.type = js.native
    def fireUpdateStarted(/**
      * Parameters to pass along with the event
      */
    mParameters: Reason): this.type = js.native
    
    /**
      * @SINCE 1.28.0
      *
      * Returns array of IDs of the elements which are the current targets of the association {@link #getAriaLabelledBy
      * ariaLabelledBy}.
      */
    def getAriaLabelledBy(): js.Array[ID] = js.native
    
    /**
      * @SINCE 1.54
      *
      * Gets content of aggregation {@link #getContextMenu contextMenu}.
      *
      * Defines the context menu of the items.
      */
    def getContextMenu(): IContextMenu = js.native
    
    /**
      * @SINCE 1.20.2
      *
      * Gets current value of property {@link #getEnableBusyIndicator enableBusyIndicator}.
      *
      * When this property is set to `true`, the control will automatically display a busy indicator when it
      * detects that data is being loaded. This busy indicator blocks the interaction with the items until data
      * loading is finished. By default, the busy indicator will be shown after one second. This behavior can
      * be customized by setting the `busyIndicatorDelay` property.
      *
      * Default value is `true`.
      *
      * @returns Value of property `enableBusyIndicator`
      */
    def getEnableBusyIndicator(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getFooterText footerText}.
      *
      * Defines the footer text that appears in the control.
      *
      * @returns Value of property `footerText`
      */
    def getFooterText(): String = js.native
    
    /**
      * @SINCE 1.16.0
      *
      * Gets current value of property {@link #getGrowing growing}.
      *
      * If set to `true`, enables the growing feature of the control to load more items by requesting from the
      * model. **Note:**: This feature only works when an `items` aggregation is bound. Growing must not be used
      * together with two-way binding.
      *
      * Default value is `false`.
      *
      * @returns Value of property `growing`
      */
    def getGrowing(): Boolean = js.native
    
    /**
      * @SINCE 1.40.0
      *
      * Gets current value of property {@link #getGrowingDirection growingDirection}.
      *
      * Defines the direction of the growing feature. If set to `Downwards` the user has to scroll down to load
      * more items or the growing button is displayed at the bottom. If set to `Upwards` the user has to scroll
      * up to load more items or the growing button is displayed at the top.
      *
      * Default value is `Downwards`.
      *
      * @returns Value of property `growingDirection`
      */
    def getGrowingDirection(): ListGrowingDirection | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ListGrowingDirection * / any */ String) = js.native
    
    /**
      * @SINCE 1.16
      *
      * Returns growing information as object with "actual" and "total" keys. Note: This function returns "null"
      * if "growing" feature is disabled.
      */
    def getGrowingInfo(): Total | Null = js.native
    
    /**
      * @SINCE 1.16.0
      *
      * Gets current value of property {@link #getGrowingScrollToLoad growingScrollToLoad}.
      *
      * If set to true, the user can scroll down/up to load more items. Otherwise a growing button is displayed
      * at the bottom/top of the control. **Note:** This property can only be used if the `growing` property
      * is set to `true` and only if there is one instance of `sap.m.List` or `sap.m.Table` inside the scrollable
      * scroll container (e.g `sap.m.Page`).
      *
      * Default value is `false`.
      *
      * @returns Value of property `growingScrollToLoad`
      */
    def getGrowingScrollToLoad(): Boolean = js.native
    
    /**
      * @SINCE 1.16.0
      *
      * Gets current value of property {@link #getGrowingThreshold growingThreshold}.
      *
      * Defines the number of items to be requested from the model for each grow. This property can only be used
      * if the `growing` property is set to `true`.
      *
      * Default value is `20`.
      *
      * @returns Value of property `growingThreshold`
      */
    def getGrowingThreshold(): int = js.native
    
    /**
      * @SINCE 1.16.0
      *
      * Gets current value of property {@link #getGrowingTriggerText growingTriggerText}.
      *
      * Defines the text displayed on the growing button. The default is a translated text ("More") coming from
      * the message bundle. This property can only be used if the `growing` property is set to `true`.
      *
      * @returns Value of property `growingTriggerText`
      */
    def getGrowingTriggerText(): String = js.native
    
    /**
      * @SINCE 1.14
      * @deprecated (since 1.16) - No longer has any functionality.
      *
      * Gets current value of property {@link #getHeaderDesign headerDesign}.
      *
      * Defines the header style of the control. Possible values are `Standard` and `Plain`.
      *
      * Default value is `Standard`.
      *
      * @returns Value of property `headerDesign`
      */
    def getHeaderDesign(): ListHeaderDesign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ListHeaderDesign * / any */ String) = js.native
    
    /**
      * Gets current value of property {@link #getHeaderText headerText}.
      *
      * Defines the header text that appears in the control. **Note:** If `headerToolbar` aggregation is set,
      * then this property is ignored.
      *
      * @returns Value of property `headerText`
      */
    def getHeaderText(): String = js.native
    
    /**
      * @SINCE 1.16
      *
      * Gets content of aggregation {@link #getHeaderToolbar headerToolbar}.
      *
      * The header area can be used as a toolbar to add extra controls for user interactions. **Note:** When
      * set, this overwrites the `headerText` property.
      */
    def getHeaderToolbar(): typings.openui5.sapMToolbarMod.default = js.native
    
    /**
      * Gets current value of property {@link #getIncludeItemInSelection includeItemInSelection}.
      *
      * Defines whether the items are selectable by clicking on the item itself (`true`) rather than having to
      * set the selection control first. **Note:** The `SingleSelectMaster` mode also provides this functionality
      * by default.
      *
      * Default value is `false`.
      *
      * @returns Value of property `includeItemInSelection`
      */
    def getIncludeItemInSelection(): Boolean = js.native
    
    /**
      * @SINCE 1.16
      *
      * Gets content of aggregation {@link #getInfoToolbar infoToolbar}.
      *
      * A toolbar that is placed below the header to show extra information to the user.
      */
    def getInfoToolbar(): typings.openui5.sapMToolbarMod.default = js.native
    
    /**
      * Gets current value of property {@link #getInset inset}.
      *
      * Defines the indentation of the container. Setting it to `true` indents the list.
      *
      * Default value is `false`.
      *
      * @returns Value of property `inset`
      */
    def getInset(): Boolean = js.native
    
    /**
      * @SINCE 1.16.5
      *
      * Returns the ItemNavigation delegate of the list
      */
    def getItemNavigation(): js.UndefOr[typings.openui5.sapUiCoreDelegateItemNavigationMod.default] = js.native
    
    /**
      * Gets content of aggregation {@link #getItems items}.
      *
      * Defines the items contained within this control.
      */
    def getItems(): js.Array[typings.openui5.sapMListItemBaseMod.default] = js.native
    
    /**
      * @SINCE 1.38.0
      *
      * Gets current value of property {@link #getKeyboardMode keyboardMode}.
      *
      * Defines keyboard handling behavior of the control.
      *
      * Default value is `Navigation`.
      *
      * @returns Value of property `keyboardMode`
      */
    def getKeyboardMode(): ListKeyboardMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ListKeyboardMode * / any */ String) = js.native
    
    /**
      * Returns the last list mode, the mode that is rendered This can be used to detect mode changes during
      * rendering
      */
    def getLastMode(): Unit = js.native
    
    /**
      * Gets current value of property {@link #getMode mode}.
      *
      * Defines the mode of the control (e.g. `None`, `SingleSelect`, `MultiSelect`, `Delete`).
      *
      * Default value is `None`.
      *
      * @returns Value of property `mode`
      */
    def getMode(): ListMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ListMode * / any */ String) = js.native
    
    /**
      * Gets current value of property {@link #getModeAnimationOn modeAnimationOn}.
      *
      * Defines if animations will be shown while switching between modes.
      *
      * Default value is `true`.
      *
      * @returns Value of property `modeAnimationOn`
      */
    def getModeAnimationOn(): Boolean = js.native
    
    /**
      * @SINCE 1.93
      *
      * Gets current value of property {@link #getMultiSelectMode multiSelectMode}.
      *
      * Defines the multi-selection mode for the control. If this property is set to the `Default` value, the
      * `sap.m.Table` control renders the Select All checkbox in the column header, otherwise the Deselect All
      * icon is rendered. The Select All checkbox allows the user to select all the items in the control, and
      * the Deselect All icon deselects the items. If the property is set to `ClearAll`, then selecting items
      * via the `selectAll` method is not possible. See {@link #selectAll selectAll} for more details.
      *
      * **Note:** This property must be used with the `MultiSelect` mode. If this property is set to `ClearAll`,
      * then a selection of multiple items is still possible via the range selection feature except CTRL +
      * A. Additionally, the CTRL + SHIFT + A key combination can be used for deselecting all the
      * items. For details on the range selection, please see {@link topic:8a0d4efa29d44ef39219c18d832012da Keyboard
      * Handling for Item Selection}.
      *
      * Default value is `Default`.
      *
      * @returns Value of property `multiSelectMode`
      */
    def getMultiSelectMode(): MultiSelectMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof MultiSelectMode * / any */ String) = js.native
    
    /**
      * @SINCE 1.101
      *
      * Gets content of aggregation {@link #getNoData noData}.
      *
      * Defines the custom visualization if there is no data available. **Note:** If both a `noDataText` property
      * and a `noData` aggregation are provided, the `noData` aggregation takes priority. If the `noData` aggregation
      * is undefined or set to null, the `noDataText` property is used instead.
      */
    def getNoData(): typings.openui5.sapUiCoreControlMod.default | String = js.native
    
    /**
      * Gets current value of property {@link #getNoDataText noDataText}.
      *
      * This text is displayed if the control contains no items. **Note:** If both a `noDataText` property and
      * a `noData` aggregation are provided, the `noData` aggregation takes priority. If the `noData` aggregation
      * is undefined or set to null, the `noDataText` property is used instead.
      *
      * @returns Value of property `noDataText`
      */
    def getNoDataText(): String = js.native
    
    /**
      * @SINCE 1.16.6
      *
      * Gets current value of property {@link #getRememberSelections rememberSelections}.
      *
      * If set to true, this control remembers and retains the selection of the items after a binding update
      * has been performed (e.g. sorting, filtering). **Note:** This feature works only if two-way data binding
      * for the `selected` property of the item is not used. It also needs to be turned off if the binding context
      * of the item does not always point to the same entry in the model, for example, if the order of the data
      * in the `JSONModel` is changed.
      *
      * Default value is `true`.
      *
      * @returns Value of property `rememberSelections`
      */
    def getRememberSelections(): Boolean = js.native
    
    /**
      * @SINCE 1.18.6
      *
      * Returns the binding contexts of the selected items. Note: This method returns an empty array if no databinding
      * is used.
      */
    def getSelectedContexts(): js.Array[typings.openui5.sapUiModelContextMod.default] = js.native
    def getSelectedContexts(
      /**
      * Set true to include even invisible selected items(e.g. the selections from the previous filters). Note:
      * In single selection modes, only the last selected item's binding context is returned in array.
      */
    bAll: Boolean
    ): js.Array[typings.openui5.sapUiModelContextMod.default] = js.native
    
    /**
      * Returns selected list item. When no item is selected, "null" is returned. When "multi-selection" is enabled
      * and multiple items are selected, only the up-most selected item is returned.
      */
    def getSelectedItem(): typings.openui5.sapMListItemBaseMod.default = js.native
    
    /**
      * Returns an array containing the selected list items. If no items are selected, an empty array is returned.
      */
    def getSelectedItems(): js.Array[typings.openui5.sapMListItemBaseMod.default] = js.native
    
    /**
      * Gets current value of property {@link #getShowNoData showNoData}.
      *
      * Defines whether or not the text specified in the `noDataText` property is displayed.
      *
      * Default value is `true`.
      *
      * @returns Value of property `showNoData`
      */
    def getShowNoData(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getShowSeparators showSeparators}.
      *
      * Defines which item separator style will be used.
      *
      * Default value is `All`.
      *
      * @returns Value of property `showSeparators`
      */
    def getShowSeparators(): ListSeparators | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ListSeparators * / any */ String) = js.native
    
    /**
      * Gets current value of property {@link #getShowUnread showUnread}.
      *
      * Activates the unread indicator for all items, if set to `true`.
      *
      * Default value is `false`.
      *
      * @returns Value of property `showUnread`
      */
    def getShowUnread(): Boolean = js.native
    
    /**
      * @SINCE 1.58
      *
      * Gets current value of property {@link #getSticky sticky}.
      *
      * Defines the section of the control that remains fixed at the top of the page during vertical scrolling
      * as long as the control is in the viewport.
      *
      * **Note:** Enabling sticky column headers in List controls will not have any effect.
      *
      * There are some known restrictions. A few are given below:
      * 	 - If the control is placed in layout containers that have the `overflow: hidden` or `overflow: auto`
      * 			style definition, this can prevent the sticky elements of the control from becoming fixed at the top
      * 			of the viewport.
      * 	 - If sticky column headers are enabled in the `sap.m.Table` control, setting focus on the column headers
      * 			will let the table scroll to the top.
      * 	 - A transparent toolbar design is not supported for sticky bars. The toolbar will automatically get
      * 			an intransparent background color.
      * 	 - This feature supports only the default height of the toolbar control.
      *
      * @returns Value of property `sticky`
      */
    def getSticky(): js.Array[
        Sticky | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Sticky * / any */ String)
      ] = js.native
    
    /**
      * Gets content of aggregation {@link #getSwipeContent swipeContent}.
      *
      * User can swipe to bring in this control on the right hand side of an item. **Note:**
      * 	 - For non-touch screen devices, this functionality is ignored.
      * 	 - There is no accessible alternative provided by the control for swiping. Applications that use this
      * 			functionality must provide an accessible alternative UI to perform the same action.
      */
    def getSwipeContent(): typings.openui5.sapUiCoreControlMod.default = js.native
    
    /**
      * Gets current value of property {@link #getSwipeDirection swipeDirection}.
      *
      * Defines the direction of the swipe movement (e.g LeftToRight, RightToLeft, Both) to display the control
      * defined in the `swipeContent` aggregation.
      *
      * Default value is `Both`.
      *
      * @returns Value of property `swipeDirection`
      */
    def getSwipeDirection(): SwipeDirection | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SwipeDirection * / any */ String) = js.native
    
    /**
      * Returns swiped list item. When no item is swiped, "null" is returned.
      */
    def getSwipedItem(): typings.openui5.sapMListItemBaseMod.default = js.native
    
    /**
      * Gets current value of property {@link #getWidth width}.
      *
      * Sets the width of the control.
      *
      * Default value is `"100%"`.
      *
      * @returns Value of property `width`
      */
    def getWidth(): CSSSize = js.native
    
    /**
      * Checks for the provided `sap.m.ListItemBase` in the aggregation {@link #getItems items}. and returns
      * its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfItem(/**
      * The item whose index is looked for
      */
    oItem: typings.openui5.sapMListItemBaseMod.default): int = js.native
    
    /**
      * Inserts a item into the aggregation {@link #getItems items}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertItem(
      /**
      * The item to insert; if empty, nothing is inserted
      */
    oItem: typings.openui5.sapMListItemBaseMod.default,
      /**
      * The `0`-based index the item should be inserted at; for a negative value of `iIndex`, the item is inserted
      * at position 0; for a value greater than the current size of the aggregation, the item is inserted at
      * the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * @SINCE 1.28.0
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
    def removeAllItems(): js.Array[typings.openui5.sapMListItemBaseMod.default] = js.native
    
    /**
      * @SINCE 1.28.0
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
    vItem: String): typings.openui5.sapMListItemBaseMod.default | Null = js.native
    /**
      * Removes a item from the aggregation {@link #getItems items}.
      *
      * @returns The removed item or `null`
      */
    def removeItem(/**
      * The item to remove or its index or id
      */
    vItem: int): typings.openui5.sapMListItemBaseMod.default | Null = js.native
    def removeItem(
      /**
      * The item to remove or its index or id
      */
    vItem: typings.openui5.sapMListItemBaseMod.default
    ): typings.openui5.sapMListItemBaseMod.default | Null = js.native
    
    /**
      * Removes visible selections of the current selection mode.
      */
    def removeSelections(
      /**
      * Since version 1.16.3. This control keeps old selections after filter or sorting. Set this parameter "true"
      * to remove all selections.
      */
    bAll: Boolean
    ): this.type = js.native
    
    /**
      * @SINCE 1.92
      *
      * Requests a specified number of items from the back end to load more data in the list. If the number of
      * items are not specified, the `growingThreshold` value is used to request more data.
      *
      * **Note:** To use this method, the `growing` feature must be enabled.
      *
      * See {@link #getGrowing growing} and {@link #getGrowingThreshold growingThreshold} for more information.
      */
    def requestItems(): Unit = js.native
    def requestItems(/**
      * A positive number of items to be requested
      */
    iItems: int): Unit = js.native
    
    /**
      * Scrolls the list so that the item with the given index is in the viewport. If the index is -1, it scrolls
      * to the bottom of the list. If the growing feature is enabled, the list is scrolled to the last available
      * item.
      *
      * Growing in combination with `growingScrollToLoad=true` can result in loading of new items when scrolling
      * to the bottom of the list.
      *
      * @returns A `Promise` that resolves after the table scrolls to the row with the given index
      */
    def scrollToIndex(/**
      * The list item index that must be scrolled into the viewport
      */
    iIndex: Double): js.Promise[Any] = js.native
    
    /**
      * @SINCE 1.16
      *
      * Selects all items in the `MultiSelection` mode.
      *
      * **Note:** If `growing` is enabled, only the visible items in the list are selected. Since version 1.93,
      * the items are not selected if `getMultiSelectMode=ClearAll`.
      */
    def selectAll(): this.type = js.native
    
    /**
      * @SINCE 1.54
      *
      * Sets the aggregated {@link #getContextMenu contextMenu}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setContextMenu(/**
      * The contextMenu to set
      */
    oContextMenu: IContextMenu): this.type = js.native
    
    /**
      * @SINCE 1.20.2
      *
      * Sets a new value for property {@link #getEnableBusyIndicator enableBusyIndicator}.
      *
      * When this property is set to `true`, the control will automatically display a busy indicator when it
      * detects that data is being loaded. This busy indicator blocks the interaction with the items until data
      * loading is finished. By default, the busy indicator will be shown after one second. This behavior can
      * be customized by setting the `busyIndicatorDelay` property.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setEnableBusyIndicator(): this.type = js.native
    def setEnableBusyIndicator(/**
      * New value for property `enableBusyIndicator`
      */
    bEnableBusyIndicator: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getFooterText footerText}.
      *
      * Defines the footer text that appears in the control.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setFooterText(): this.type = js.native
    def setFooterText(/**
      * New value for property `footerText`
      */
    sFooterText: String): this.type = js.native
    
    /**
      * @SINCE 1.16.0
      *
      * Sets a new value for property {@link #getGrowing growing}.
      *
      * If set to `true`, enables the growing feature of the control to load more items by requesting from the
      * model. **Note:**: This feature only works when an `items` aggregation is bound. Growing must not be used
      * together with two-way binding.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setGrowing(): this.type = js.native
    def setGrowing(/**
      * New value for property `growing`
      */
    bGrowing: Boolean): this.type = js.native
    
    /**
      * @SINCE 1.40.0
      *
      * Sets a new value for property {@link #getGrowingDirection growingDirection}.
      *
      * Defines the direction of the growing feature. If set to `Downwards` the user has to scroll down to load
      * more items or the growing button is displayed at the bottom. If set to `Upwards` the user has to scroll
      * up to load more items or the growing button is displayed at the top.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Downwards`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setGrowingDirection(): this.type = js.native
    def setGrowingDirection(
      /**
      * New value for property `growingDirection`
      */
    sGrowingDirection: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ListGrowingDirection * / any */ String
    ): this.type = js.native
    def setGrowingDirection(/**
      * New value for property `growingDirection`
      */
    sGrowingDirection: ListGrowingDirection): this.type = js.native
    
    /**
      * @SINCE 1.16.0
      *
      * Sets a new value for property {@link #getGrowingScrollToLoad growingScrollToLoad}.
      *
      * If set to true, the user can scroll down/up to load more items. Otherwise a growing button is displayed
      * at the bottom/top of the control. **Note:** This property can only be used if the `growing` property
      * is set to `true` and only if there is one instance of `sap.m.List` or `sap.m.Table` inside the scrollable
      * scroll container (e.g `sap.m.Page`).
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setGrowingScrollToLoad(): this.type = js.native
    def setGrowingScrollToLoad(/**
      * New value for property `growingScrollToLoad`
      */
    bGrowingScrollToLoad: Boolean): this.type = js.native
    
    /**
      * @SINCE 1.16.0
      *
      * Sets a new value for property {@link #getGrowingThreshold growingThreshold}.
      *
      * Defines the number of items to be requested from the model for each grow. This property can only be used
      * if the `growing` property is set to `true`.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `20`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setGrowingThreshold(): this.type = js.native
    def setGrowingThreshold(/**
      * New value for property `growingThreshold`
      */
    iGrowingThreshold: int): this.type = js.native
    
    /**
      * @SINCE 1.16.0
      *
      * Sets a new value for property {@link #getGrowingTriggerText growingTriggerText}.
      *
      * Defines the text displayed on the growing button. The default is a translated text ("More") coming from
      * the message bundle. This property can only be used if the `growing` property is set to `true`.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setGrowingTriggerText(): this.type = js.native
    def setGrowingTriggerText(/**
      * New value for property `growingTriggerText`
      */
    sGrowingTriggerText: String): this.type = js.native
    
    /**
      * @SINCE 1.14
      * @deprecated (since 1.16) - No longer has any functionality.
      *
      * Sets a new value for property {@link #getHeaderDesign headerDesign}.
      *
      * Defines the header style of the control. Possible values are `Standard` and `Plain`.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Standard`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setHeaderDesign(): this.type = js.native
    def setHeaderDesign(
      /**
      * New value for property `headerDesign`
      */
    sHeaderDesign: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ListHeaderDesign * / any */ String
    ): this.type = js.native
    def setHeaderDesign(/**
      * New value for property `headerDesign`
      */
    sHeaderDesign: ListHeaderDesign): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getHeaderText headerText}.
      *
      * Defines the header text that appears in the control. **Note:** If `headerToolbar` aggregation is set,
      * then this property is ignored.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setHeaderText(): this.type = js.native
    def setHeaderText(/**
      * New value for property `headerText`
      */
    sHeaderText: String): this.type = js.native
    
    /**
      * @SINCE 1.16
      *
      * Sets the aggregated {@link #getHeaderToolbar headerToolbar}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setHeaderToolbar(/**
      * The headerToolbar to set
      */
    oHeaderToolbar: typings.openui5.sapMToolbarMod.default): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getIncludeItemInSelection includeItemInSelection}.
      *
      * Defines whether the items are selectable by clicking on the item itself (`true`) rather than having to
      * set the selection control first. **Note:** The `SingleSelectMaster` mode also provides this functionality
      * by default.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setIncludeItemInSelection(): this.type = js.native
    def setIncludeItemInSelection(/**
      * New value for property `includeItemInSelection`
      */
    bIncludeItemInSelection: Boolean): this.type = js.native
    
    /**
      * @SINCE 1.16
      *
      * Sets the aggregated {@link #getInfoToolbar infoToolbar}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setInfoToolbar(/**
      * The infoToolbar to set
      */
    oInfoToolbar: typings.openui5.sapMToolbarMod.default): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getInset inset}.
      *
      * Defines the indentation of the container. Setting it to `true` indents the list.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setInset(): this.type = js.native
    def setInset(/**
      * New value for property `inset`
      */
    bInset: Boolean): this.type = js.native
    
    /**
      * @SINCE 1.38.0
      *
      * Sets a new value for property {@link #getKeyboardMode keyboardMode}.
      *
      * Defines keyboard handling behavior of the control.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Navigation`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setKeyboardMode(): this.type = js.native
    def setKeyboardMode(
      /**
      * New value for property `keyboardMode`
      */
    sKeyboardMode: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ListKeyboardMode * / any */ String
    ): this.type = js.native
    def setKeyboardMode(/**
      * New value for property `keyboardMode`
      */
    sKeyboardMode: ListKeyboardMode): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getMode mode}.
      *
      * Defines the mode of the control (e.g. `None`, `SingleSelect`, `MultiSelect`, `Delete`).
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
      * Sets a new value for property {@link #getModeAnimationOn modeAnimationOn}.
      *
      * Defines if animations will be shown while switching between modes.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setModeAnimationOn(): this.type = js.native
    def setModeAnimationOn(/**
      * New value for property `modeAnimationOn`
      */
    bModeAnimationOn: Boolean): this.type = js.native
    
    /**
      * @SINCE 1.93
      *
      * Sets a new value for property {@link #getMultiSelectMode multiSelectMode}.
      *
      * Defines the multi-selection mode for the control. If this property is set to the `Default` value, the
      * `sap.m.Table` control renders the Select All checkbox in the column header, otherwise the Deselect All
      * icon is rendered. The Select All checkbox allows the user to select all the items in the control, and
      * the Deselect All icon deselects the items. If the property is set to `ClearAll`, then selecting items
      * via the `selectAll` method is not possible. See {@link #selectAll selectAll} for more details.
      *
      * **Note:** This property must be used with the `MultiSelect` mode. If this property is set to `ClearAll`,
      * then a selection of multiple items is still possible via the range selection feature except CTRL +
      * A. Additionally, the CTRL + SHIFT + A key combination can be used for deselecting all the
      * items. For details on the range selection, please see {@link topic:8a0d4efa29d44ef39219c18d832012da Keyboard
      * Handling for Item Selection}.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Default`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setMultiSelectMode(): this.type = js.native
    def setMultiSelectMode(
      /**
      * New value for property `multiSelectMode`
      */
    sMultiSelectMode: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof MultiSelectMode * / any */ String
    ): this.type = js.native
    def setMultiSelectMode(/**
      * New value for property `multiSelectMode`
      */
    sMultiSelectMode: MultiSelectMode): this.type = js.native
    
    def setNoData(/**
      * The noData to set
      */
    vNoData: String): this.type = js.native
    /**
      * @SINCE 1.101
      *
      * Sets the aggregated {@link #getNoData noData}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setNoData(/**
      * The noData to set
      */
    vNoData: typings.openui5.sapUiCoreControlMod.default): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getNoDataText noDataText}.
      *
      * This text is displayed if the control contains no items. **Note:** If both a `noDataText` property and
      * a `noData` aggregation are provided, the `noData` aggregation takes priority. If the `noData` aggregation
      * is undefined or set to null, the `noDataText` property is used instead.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setNoDataText(): this.type = js.native
    def setNoDataText(/**
      * New value for property `noDataText`
      */
    sNoDataText: String): this.type = js.native
    
    /**
      * @SINCE 1.16.6
      *
      * Sets a new value for property {@link #getRememberSelections rememberSelections}.
      *
      * If set to true, this control remembers and retains the selection of the items after a binding update
      * has been performed (e.g. sorting, filtering). **Note:** This feature works only if two-way data binding
      * for the `selected` property of the item is not used. It also needs to be turned off if the binding context
      * of the item does not always point to the same entry in the model, for example, if the order of the data
      * in the `JSONModel` is changed.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setRememberSelections(): this.type = js.native
    def setRememberSelections(/**
      * New value for property `rememberSelections`
      */
    bRememberSelections: Boolean): this.type = js.native
    
    /**
      * Selects or deselects the given list item.
      */
    def setSelectedItem(
      /**
      * The list item whose selection to be changed. This parameter is mandatory.
      */
    oListItem: typings.openui5.sapMListItemBaseMod.default
    ): this.type = js.native
    def setSelectedItem(
      /**
      * The list item whose selection to be changed. This parameter is mandatory.
      */
    oListItem: typings.openui5.sapMListItemBaseMod.default,
      /**
      * Sets selected status of the list item
      */
    bSelect: Boolean
    ): this.type = js.native
    
    /**
      * Sets a list item to be selected by id. In single mode the method removes the previous selection.
      */
    def setSelectedItemById(/**
      * The id of the list item whose selection to be changed.
      */
    sId: String): this.type = js.native
    def setSelectedItemById(
      /**
      * The id of the list item whose selection to be changed.
      */
    sId: String,
      /**
      * Sets selected status of the list item
      */
    bSelect: Boolean
    ): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getShowNoData showNoData}.
      *
      * Defines whether or not the text specified in the `noDataText` property is displayed.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setShowNoData(): this.type = js.native
    def setShowNoData(/**
      * New value for property `showNoData`
      */
    bShowNoData: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getShowSeparators showSeparators}.
      *
      * Defines which item separator style will be used.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `All`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setShowSeparators(): this.type = js.native
    def setShowSeparators(
      /**
      * New value for property `showSeparators`
      */
    sShowSeparators: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ListSeparators * / any */ String
    ): this.type = js.native
    def setShowSeparators(/**
      * New value for property `showSeparators`
      */
    sShowSeparators: ListSeparators): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getShowUnread showUnread}.
      *
      * Activates the unread indicator for all items, if set to `true`.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setShowUnread(): this.type = js.native
    def setShowUnread(/**
      * New value for property `showUnread`
      */
    bShowUnread: Boolean): this.type = js.native
    
    /**
      * @SINCE 1.58
      *
      * Sets a new value for property {@link #getSticky sticky}.
      *
      * Defines the section of the control that remains fixed at the top of the page during vertical scrolling
      * as long as the control is in the viewport.
      *
      * **Note:** Enabling sticky column headers in List controls will not have any effect.
      *
      * There are some known restrictions. A few are given below:
      * 	 - If the control is placed in layout containers that have the `overflow: hidden` or `overflow: auto`
      * 			style definition, this can prevent the sticky elements of the control from becoming fixed at the top
      * 			of the viewport.
      * 	 - If sticky column headers are enabled in the `sap.m.Table` control, setting focus on the column headers
      * 			will let the table scroll to the top.
      * 	 - A transparent toolbar design is not supported for sticky bars. The toolbar will automatically get
      * 			an intransparent background color.
      * 	 - This feature supports only the default height of the toolbar control.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setSticky(
      /**
      * New value for property `sticky`
      */
    sSticky: js.Array[
          Sticky | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Sticky * / any */ String)
        ]
    ): this.type = js.native
    
    /**
      * Sets the aggregated {@link #getSwipeContent swipeContent}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setSwipeContent(/**
      * The swipeContent to set
      */
    oSwipeContent: typings.openui5.sapUiCoreControlMod.default): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getSwipeDirection swipeDirection}.
      *
      * Defines the direction of the swipe movement (e.g LeftToRight, RightToLeft, Both) to display the control
      * defined in the `swipeContent` aggregation.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Both`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setSwipeDirection(): this.type = js.native
    def setSwipeDirection(
      /**
      * New value for property `swipeDirection`
      */
    sSwipeDirection: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SwipeDirection * / any */ String
    ): this.type = js.native
    def setSwipeDirection(/**
      * New value for property `swipeDirection`
      */
    sSwipeDirection: SwipeDirection): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getWidth width}.
      *
      * Sets the width of the control.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `"100%"`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setWidth(): this.type = js.native
    def setWidth(/**
      * New value for property `width`
      */
    sWidth: CSSSize): this.type = js.native
    
    /**
      * After swipeContent is shown, user can interact with this control(e.g Tap). After interaction is done,
      * you can/should use this method to hide swipeContent from screen. Note: If users try to tap inside of
      * the list but outside of the swipeContent then control hides automatically.
      */
    def swipeOut(
      /**
      * This callback function is called with two parameters(swipedListItem and swipedContent) after swipe-out
      * animation is finished.
      */
    callback: js.Function
    ): this.type = js.native
    
    /**
      * Unbinds aggregation {@link #getItems items} from model data.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def unbindItems(): this.type = js.native
  }
  
  trait ListBaseSettings
    extends StObject
       with ControlSettings {
    
    /**
      * @SINCE 1.28.0
      *
      * Association to controls / ids which label this control (see WAI-ARIA attribute aria-labelledby).
      */
    var ariaLabelledBy: js.UndefOr[js.Array[typings.openui5.sapUiCoreControlMod.default | String]] = js.undefined
    
    /**
      * @SINCE 1.54
      *
      * Fired when the context menu is opened. When the context menu is opened, the binding context of the item
      * is set to the given `contextMenu`.
      */
    var beforeOpenContextMenu: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * @SINCE 1.54
      *
      * Defines the context menu of the items.
      */
    var contextMenu: js.UndefOr[IContextMenu] = js.undefined
    
    /**
      * Fires when delete icon is pressed by user.
      */
    var delete: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * @SINCE 1.20.2
      *
      * When this property is set to `true`, the control will automatically display a busy indicator when it
      * detects that data is being loaded. This busy indicator blocks the interaction with the items until data
      * loading is finished. By default, the busy indicator will be shown after one second. This behavior can
      * be customized by setting the `busyIndicatorDelay` property.
      */
    var enableBusyIndicator: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines the footer text that appears in the control.
      */
    var footerText: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * @SINCE 1.16.0
      *
      * If set to `true`, enables the growing feature of the control to load more items by requesting from the
      * model. **Note:**: This feature only works when an `items` aggregation is bound. Growing must not be used
      * together with two-way binding.
      */
    var growing: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.40.0
      *
      * Defines the direction of the growing feature. If set to `Downwards` the user has to scroll down to load
      * more items or the growing button is displayed at the bottom. If set to `Upwards` the user has to scroll
      * up to load more items or the growing button is displayed at the top.
      */
    var growingDirection: js.UndefOr[
        ListGrowingDirection | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ListGrowingDirection * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * @SINCE 1.16
      * @deprecated (since 1.16.3) - Instead, use "updateFinished" event.
      *
      * Fires after the new growing chunk has been fetched from the model and processed by the control.
      */
    var growingFinished: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * @SINCE 1.16.0
      *
      * If set to true, the user can scroll down/up to load more items. Otherwise a growing button is displayed
      * at the bottom/top of the control. **Note:** This property can only be used if the `growing` property
      * is set to `true` and only if there is one instance of `sap.m.List` or `sap.m.Table` inside the scrollable
      * scroll container (e.g `sap.m.Page`).
      */
    var growingScrollToLoad: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.16
      * @deprecated (since 1.16.3) - Instead, use `updateStarted` event with listening `changeReason`.
      *
      * Fires before the new growing chunk is requested from the model.
      */
    var growingStarted: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * @SINCE 1.16.0
      *
      * Defines the number of items to be requested from the model for each grow. This property can only be used
      * if the `growing` property is set to `true`.
      */
    var growingThreshold: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * @SINCE 1.16.0
      *
      * Defines the text displayed on the growing button. The default is a translated text ("More") coming from
      * the message bundle. This property can only be used if the `growing` property is set to `true`.
      */
    var growingTriggerText: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * @SINCE 1.14
      * @deprecated (since 1.16) - No longer has any functionality.
      *
      * Defines the header style of the control. Possible values are `Standard` and `Plain`.
      */
    var headerDesign: js.UndefOr[
        ListHeaderDesign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ListHeaderDesign * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Defines the header text that appears in the control. **Note:** If `headerToolbar` aggregation is set,
      * then this property is ignored.
      */
    var headerText: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * @SINCE 1.16
      *
      * The header area can be used as a toolbar to add extra controls for user interactions. **Note:** When
      * set, this overwrites the `headerText` property.
      */
    var headerToolbar: js.UndefOr[typings.openui5.sapMToolbarMod.default] = js.undefined
    
    /**
      * Defines whether the items are selectable by clicking on the item itself (`true`) rather than having to
      * set the selection control first. **Note:** The `SingleSelectMaster` mode also provides this functionality
      * by default.
      */
    var includeItemInSelection: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.16
      *
      * A toolbar that is placed below the header to show extra information to the user.
      */
    var infoToolbar: js.UndefOr[typings.openui5.sapMToolbarMod.default] = js.undefined
    
    /**
      * Defines the indentation of the container. Setting it to `true` indents the list.
      */
    var inset: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.20
      *
      * Fires when an item is pressed unless the item's `type` property is `Inactive`.
      */
    var itemPress: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Defines the items contained within this control.
      */
    var items: js.UndefOr[
        js.Array[typings.openui5.sapMListItemBaseMod.default] | typings.openui5.sapMListItemBaseMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.38.0
      *
      * Defines keyboard handling behavior of the control.
      */
    var keyboardMode: js.UndefOr[
        ListKeyboardMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ListKeyboardMode * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Defines the mode of the control (e.g. `None`, `SingleSelect`, `MultiSelect`, `Delete`).
      */
    var mode: js.UndefOr[
        ListMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ListMode * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Defines if animations will be shown while switching between modes.
      */
    var modeAnimationOn: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.93
      *
      * Defines the multi-selection mode for the control. If this property is set to the `Default` value, the
      * `sap.m.Table` control renders the Select All checkbox in the column header, otherwise the Deselect All
      * icon is rendered. The Select All checkbox allows the user to select all the items in the control, and
      * the Deselect All icon deselects the items. If the property is set to `ClearAll`, then selecting items
      * via the `selectAll` method is not possible. See {@link #selectAll selectAll} for more details.
      *
      * **Note:** This property must be used with the `MultiSelect` mode. If this property is set to `ClearAll`,
      * then a selection of multiple items is still possible via the range selection feature except CTRL +
      * A. Additionally, the CTRL + SHIFT + A key combination can be used for deselecting all the
      * items. For details on the range selection, please see {@link topic:8a0d4efa29d44ef39219c18d832012da Keyboard
      * Handling for Item Selection}.
      */
    var multiSelectMode: js.UndefOr[
        MultiSelectMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof MultiSelectMode * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * @SINCE 1.101
      *
      * Defines the custom visualization if there is no data available. **Note:** If both a `noDataText` property
      * and a `noData` aggregation are provided, the `noData` aggregation takes priority. If the `noData` aggregation
      * is undefined or set to null, the `noDataText` property is used instead.
      */
    var noData: js.UndefOr[String | typings.openui5.sapUiCoreControlMod.default | PropertyBindingInfo] = js.undefined
    
    /**
      * This text is displayed if the control contains no items. **Note:** If both a `noDataText` property and
      * a `noData` aggregation are provided, the `noData` aggregation takes priority. If the `noData` aggregation
      * is undefined or set to null, the `noDataText` property is used instead.
      */
    var noDataText: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * @SINCE 1.16.6
      *
      * If set to true, this control remembers and retains the selection of the items after a binding update
      * has been performed (e.g. sorting, filtering). **Note:** This feature works only if two-way data binding
      * for the `selected` property of the item is not used. It also needs to be turned off if the binding context
      * of the item does not always point to the same entry in the model, for example, if the order of the data
      * in the `JSONModel` is changed.
      */
    var rememberSelections: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @deprecated (since 1.16) - Use the `selectionChange` event instead.
      *
      * Fires when selection is changed via user interaction. In `MultiSelect` mode, this event is also fired
      * on deselection.
      */
    var select: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * @SINCE 1.16
      *
      * Fires when selection is changed via user interaction inside the control.
      */
    var selectionChange: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Defines whether or not the text specified in the `noDataText` property is displayed.
      */
    var showNoData: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines which item separator style will be used.
      */
    var showSeparators: js.UndefOr[
        ListSeparators | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ListSeparators * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Activates the unread indicator for all items, if set to `true`.
      */
    var showUnread: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.58
      *
      * Defines the section of the control that remains fixed at the top of the page during vertical scrolling
      * as long as the control is in the viewport.
      *
      * **Note:** Enabling sticky column headers in List controls will not have any effect.
      *
      * There are some known restrictions. A few are given below:
      * 	 - If the control is placed in layout containers that have the `overflow: hidden` or `overflow: auto`
      * 			style definition, this can prevent the sticky elements of the control from becoming fixed at the top
      * 			of the viewport.
      * 	 - If sticky column headers are enabled in the `sap.m.Table` control, setting focus on the column headers
      * 			will let the table scroll to the top.
      * 	 - A transparent toolbar design is not supported for sticky bars. The toolbar will automatically get
      * 			an intransparent background color.
      * 	 - This feature supports only the default height of the toolbar control.
      */
    var sticky: js.UndefOr[
        (js.Array[
          Sticky | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Sticky * / any */ String)
        ]) | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Fires after user's swipe action and before the `swipeContent` is shown. On the `swipe` event handler,
      * `swipeContent` can be changed according to the swiped item. Calling the `preventDefault` method of the
      * event cancels the swipe action.
      *
      * **Note:** There is no accessible alternative provided by the control for swiping. Applications that use
      * this functionality must provide an accessible alternative UI to perform the same action.
      */
    var swipe: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * User can swipe to bring in this control on the right hand side of an item. **Note:**
      * 	 - For non-touch screen devices, this functionality is ignored.
      * 	 - There is no accessible alternative provided by the control for swiping. Applications that use this
      * 			functionality must provide an accessible alternative UI to perform the same action.
      */
    var swipeContent: js.UndefOr[typings.openui5.sapUiCoreControlMod.default] = js.undefined
    
    /**
      * Defines the direction of the swipe movement (e.g LeftToRight, RightToLeft, Both) to display the control
      * defined in the `swipeContent` aggregation.
      */
    var swipeDirection: js.UndefOr[
        SwipeDirection | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SwipeDirection * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * @SINCE 1.16.3
      *
      * Fires after `items` binding is updated and processed by the control.
      */
    var updateFinished: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * @SINCE 1.16.3
      *
      * Fires before `items` binding is updated (e.g. sorting, filtering)
      *
      * **Note:** Event handler should not invalidate the control.
      */
    var updateStarted: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Sets the width of the control.
      */
    var width: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object ListBaseSettings {
    
    inline def apply(): ListBaseSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListBaseSettings]
    }
    
    extension [Self <: ListBaseSettings](x: Self) {
      
      inline def setAriaLabelledBy(value: js.Array[typings.openui5.sapUiCoreControlMod.default | String]): Self = StObject.set(x, "ariaLabelledBy", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelledByUndefined: Self = StObject.set(x, "ariaLabelledBy", js.undefined)
      
      inline def setAriaLabelledByVarargs(value: (typings.openui5.sapUiCoreControlMod.default | String)*): Self = StObject.set(x, "ariaLabelledBy", js.Array(value*))
      
      inline def setBeforeOpenContextMenu(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "beforeOpenContextMenu", js.Any.fromFunction1(value))
      
      inline def setBeforeOpenContextMenuUndefined: Self = StObject.set(x, "beforeOpenContextMenu", js.undefined)
      
      inline def setContextMenu(value: IContextMenu): Self = StObject.set(x, "contextMenu", value.asInstanceOf[js.Any])
      
      inline def setContextMenuUndefined: Self = StObject.set(x, "contextMenu", js.undefined)
      
      inline def setDelete(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "delete", js.Any.fromFunction1(value))
      
      inline def setDeleteUndefined: Self = StObject.set(x, "delete", js.undefined)
      
      inline def setEnableBusyIndicator(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "enableBusyIndicator", value.asInstanceOf[js.Any])
      
      inline def setEnableBusyIndicatorUndefined: Self = StObject.set(x, "enableBusyIndicator", js.undefined)
      
      inline def setFooterText(value: String | PropertyBindingInfo): Self = StObject.set(x, "footerText", value.asInstanceOf[js.Any])
      
      inline def setFooterTextUndefined: Self = StObject.set(x, "footerText", js.undefined)
      
      inline def setGrowing(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "growing", value.asInstanceOf[js.Any])
      
      inline def setGrowingDirection(
        value: ListGrowingDirection | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ListGrowingDirection * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "growingDirection", value.asInstanceOf[js.Any])
      
      inline def setGrowingDirectionUndefined: Self = StObject.set(x, "growingDirection", js.undefined)
      
      inline def setGrowingFinished(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "growingFinished", js.Any.fromFunction1(value))
      
      inline def setGrowingFinishedUndefined: Self = StObject.set(x, "growingFinished", js.undefined)
      
      inline def setGrowingScrollToLoad(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "growingScrollToLoad", value.asInstanceOf[js.Any])
      
      inline def setGrowingScrollToLoadUndefined: Self = StObject.set(x, "growingScrollToLoad", js.undefined)
      
      inline def setGrowingStarted(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "growingStarted", js.Any.fromFunction1(value))
      
      inline def setGrowingStartedUndefined: Self = StObject.set(x, "growingStarted", js.undefined)
      
      inline def setGrowingThreshold(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "growingThreshold", value.asInstanceOf[js.Any])
      
      inline def setGrowingThresholdUndefined: Self = StObject.set(x, "growingThreshold", js.undefined)
      
      inline def setGrowingTriggerText(value: String | PropertyBindingInfo): Self = StObject.set(x, "growingTriggerText", value.asInstanceOf[js.Any])
      
      inline def setGrowingTriggerTextUndefined: Self = StObject.set(x, "growingTriggerText", js.undefined)
      
      inline def setGrowingUndefined: Self = StObject.set(x, "growing", js.undefined)
      
      inline def setHeaderDesign(
        value: ListHeaderDesign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ListHeaderDesign * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "headerDesign", value.asInstanceOf[js.Any])
      
      inline def setHeaderDesignUndefined: Self = StObject.set(x, "headerDesign", js.undefined)
      
      inline def setHeaderText(value: String | PropertyBindingInfo): Self = StObject.set(x, "headerText", value.asInstanceOf[js.Any])
      
      inline def setHeaderTextUndefined: Self = StObject.set(x, "headerText", js.undefined)
      
      inline def setHeaderToolbar(value: typings.openui5.sapMToolbarMod.default): Self = StObject.set(x, "headerToolbar", value.asInstanceOf[js.Any])
      
      inline def setHeaderToolbarUndefined: Self = StObject.set(x, "headerToolbar", js.undefined)
      
      inline def setIncludeItemInSelection(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "includeItemInSelection", value.asInstanceOf[js.Any])
      
      inline def setIncludeItemInSelectionUndefined: Self = StObject.set(x, "includeItemInSelection", js.undefined)
      
      inline def setInfoToolbar(value: typings.openui5.sapMToolbarMod.default): Self = StObject.set(x, "infoToolbar", value.asInstanceOf[js.Any])
      
      inline def setInfoToolbarUndefined: Self = StObject.set(x, "infoToolbar", js.undefined)
      
      inline def setInset(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "inset", value.asInstanceOf[js.Any])
      
      inline def setInsetUndefined: Self = StObject.set(x, "inset", js.undefined)
      
      inline def setItemPress(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "itemPress", js.Any.fromFunction1(value))
      
      inline def setItemPressUndefined: Self = StObject.set(x, "itemPress", js.undefined)
      
      inline def setItems(
        value: js.Array[typings.openui5.sapMListItemBaseMod.default] | typings.openui5.sapMListItemBaseMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      inline def setItemsVarargs(value: typings.openui5.sapMListItemBaseMod.default*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setKeyboardMode(
        value: ListKeyboardMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ListKeyboardMode * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "keyboardMode", value.asInstanceOf[js.Any])
      
      inline def setKeyboardModeUndefined: Self = StObject.set(x, "keyboardMode", js.undefined)
      
      inline def setMode(
        value: ListMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ListMode * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeAnimationOn(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "modeAnimationOn", value.asInstanceOf[js.Any])
      
      inline def setModeAnimationOnUndefined: Self = StObject.set(x, "modeAnimationOn", js.undefined)
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setMultiSelectMode(
        value: MultiSelectMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof MultiSelectMode * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "multiSelectMode", value.asInstanceOf[js.Any])
      
      inline def setMultiSelectModeUndefined: Self = StObject.set(x, "multiSelectMode", js.undefined)
      
      inline def setNoData(value: String | typings.openui5.sapUiCoreControlMod.default | PropertyBindingInfo): Self = StObject.set(x, "noData", value.asInstanceOf[js.Any])
      
      inline def setNoDataText(value: String | PropertyBindingInfo): Self = StObject.set(x, "noDataText", value.asInstanceOf[js.Any])
      
      inline def setNoDataTextUndefined: Self = StObject.set(x, "noDataText", js.undefined)
      
      inline def setNoDataUndefined: Self = StObject.set(x, "noData", js.undefined)
      
      inline def setRememberSelections(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "rememberSelections", value.asInstanceOf[js.Any])
      
      inline def setRememberSelectionsUndefined: Self = StObject.set(x, "rememberSelections", js.undefined)
      
      inline def setSelect(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "select", js.Any.fromFunction1(value))
      
      inline def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
      
      inline def setSelectionChange(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "selectionChange", js.Any.fromFunction1(value))
      
      inline def setSelectionChangeUndefined: Self = StObject.set(x, "selectionChange", js.undefined)
      
      inline def setShowNoData(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showNoData", value.asInstanceOf[js.Any])
      
      inline def setShowNoDataUndefined: Self = StObject.set(x, "showNoData", js.undefined)
      
      inline def setShowSeparators(
        value: ListSeparators | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ListSeparators * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "showSeparators", value.asInstanceOf[js.Any])
      
      inline def setShowSeparatorsUndefined: Self = StObject.set(x, "showSeparators", js.undefined)
      
      inline def setShowUnread(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showUnread", value.asInstanceOf[js.Any])
      
      inline def setShowUnreadUndefined: Self = StObject.set(x, "showUnread", js.undefined)
      
      inline def setSticky(
        value: (js.Array[
              Sticky | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Sticky * / any */ String)
            ]) | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "sticky", value.asInstanceOf[js.Any])
      
      inline def setStickyUndefined: Self = StObject.set(x, "sticky", js.undefined)
      
      inline def setStickyVarargs(
        value: (Sticky | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Sticky * / any */ String))*
      ): Self = StObject.set(x, "sticky", js.Array(value*))
      
      inline def setSwipe(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "swipe", js.Any.fromFunction1(value))
      
      inline def setSwipeContent(value: typings.openui5.sapUiCoreControlMod.default): Self = StObject.set(x, "swipeContent", value.asInstanceOf[js.Any])
      
      inline def setSwipeContentUndefined: Self = StObject.set(x, "swipeContent", js.undefined)
      
      inline def setSwipeDirection(
        value: SwipeDirection | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SwipeDirection * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "swipeDirection", value.asInstanceOf[js.Any])
      
      inline def setSwipeDirectionUndefined: Self = StObject.set(x, "swipeDirection", js.undefined)
      
      inline def setSwipeUndefined: Self = StObject.set(x, "swipe", js.undefined)
      
      inline def setUpdateFinished(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "updateFinished", js.Any.fromFunction1(value))
      
      inline def setUpdateFinishedUndefined: Self = StObject.set(x, "updateFinished", js.undefined)
      
      inline def setUpdateStarted(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "updateStarted", js.Any.fromFunction1(value))
      
      inline def setUpdateStartedUndefined: Self = StObject.set(x, "updateStarted", js.undefined)
      
      inline def setWidth(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
