package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMSelectDialogBaseMod {
  
  @JSImport("sap/m/SelectDialogBase", JSImport.Default)
  @js.native
  /**
    * Constructor for a new SelectDialogBase.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends SelectDialogBase {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: SelectDialogBaseSettings) = this()
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
    mSettings: SelectDialogBaseSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: SelectDialogBaseSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/m/SelectDialogBase", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.SelectDialogBase with name `sClassName` and enriches it with the
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
    oClassInfo: ClassInfo[T, SelectDialogBase]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, SelectDialogBase],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.m.SelectDialogBase.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait SelectDialogBase
    extends typings.openui5.sapUiCoreControlMod.default {
    
    /**
      * @since 1.93
      *
      * Attaches event handler `fnFunction` to the {@link #event:selectionChange selectionChange} event of this
      * `sap.m.SelectDialogBase`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.SelectDialogBase` itself.
      *
      * Fires when selection is changed via user interaction inside the control.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachSelectionChange(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ SelectDialogBaseSelectionChangeEvent, Unit]
    ): this.type = js.native
    def attachSelectionChange(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ SelectDialogBaseSelectionChangeEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.SelectDialogBase` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * @since 1.93
      *
      * Attaches event handler `fnFunction` to the {@link #event:selectionChange selectionChange} event of this
      * `sap.m.SelectDialogBase`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.SelectDialogBase` itself.
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
    fnFunction: js.Function1[/* p1 */ SelectDialogBaseSelectionChangeEvent, Unit]
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
    fnFunction: js.Function1[/* p1 */ SelectDialogBaseSelectionChangeEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.SelectDialogBase` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @since 1.93
      *
      * Attaches event handler `fnFunction` to the {@link #event:updateFinished updateFinished} event of this
      * `sap.m.SelectDialogBase`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.SelectDialogBase` itself.
      *
      * Fires after `items` binding is updated and processed by the control.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachUpdateFinished(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ SelectDialogBaseUpdateFinishedEvent, Unit]
    ): this.type = js.native
    def attachUpdateFinished(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ SelectDialogBaseUpdateFinishedEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.SelectDialogBase` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * @since 1.93
      *
      * Attaches event handler `fnFunction` to the {@link #event:updateFinished updateFinished} event of this
      * `sap.m.SelectDialogBase`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.SelectDialogBase` itself.
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
    fnFunction: js.Function1[/* p1 */ SelectDialogBaseUpdateFinishedEvent, Unit]
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
    fnFunction: js.Function1[/* p1 */ SelectDialogBaseUpdateFinishedEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.SelectDialogBase` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @since 1.93
      *
      * Attaches event handler `fnFunction` to the {@link #event:updateStarted updateStarted} event of this `sap.m.SelectDialogBase`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.SelectDialogBase` itself.
      *
      * Fires before `items` binding is updated (e.g. sorting, filtering)
      *
      * **Note:** Event handler should not invalidate the control. *
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachUpdateStarted(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ SelectDialogBaseUpdateStartedEvent, Unit]
    ): this.type = js.native
    def attachUpdateStarted(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ SelectDialogBaseUpdateStartedEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.SelectDialogBase` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * @since 1.93
      *
      * Attaches event handler `fnFunction` to the {@link #event:updateStarted updateStarted} event of this `sap.m.SelectDialogBase`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.SelectDialogBase` itself.
      *
      * Fires before `items` binding is updated (e.g. sorting, filtering)
      *
      * **Note:** Event handler should not invalidate the control. *
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
    fnFunction: js.Function1[/* p1 */ SelectDialogBaseUpdateStartedEvent, Unit]
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
    fnFunction: js.Function1[/* p1 */ SelectDialogBaseUpdateStartedEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.SelectDialogBase` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @since 1.93
      *
      * Detaches event handler `fnFunction` from the {@link #event:selectionChange selectionChange} event of
      * this `sap.m.SelectDialogBase`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachSelectionChange(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ SelectDialogBaseSelectionChangeEvent, Unit]
    ): this.type = js.native
    def detachSelectionChange(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ SelectDialogBaseSelectionChangeEvent, Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @since 1.93
      *
      * Detaches event handler `fnFunction` from the {@link #event:updateFinished updateFinished} event of this
      * `sap.m.SelectDialogBase`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachUpdateFinished(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ SelectDialogBaseUpdateFinishedEvent, Unit]
    ): this.type = js.native
    def detachUpdateFinished(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ SelectDialogBaseUpdateFinishedEvent, Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @since 1.93
      *
      * Detaches event handler `fnFunction` from the {@link #event:updateStarted updateStarted} event of this
      * `sap.m.SelectDialogBase`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachUpdateStarted(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ SelectDialogBaseUpdateStartedEvent, Unit]
    ): this.type = js.native
    def detachUpdateStarted(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ SelectDialogBaseUpdateStartedEvent, Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @since 1.93
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Fires event {@link #event:selectionChange selectionChange} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireSelectionChange(): this.type = js.native
    def fireSelectionChange(
      /**
      * Parameters to pass along with the event
      */
    mParameters: SelectDialogBase$SelectionChangeEventParameters
    ): this.type = js.native
    
    /**
      * @since 1.93
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Fires event {@link #event:updateFinished updateFinished} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireUpdateFinished(): this.type = js.native
    def fireUpdateFinished(
      /**
      * Parameters to pass along with the event
      */
    mParameters: SelectDialogBase$UpdateFinishedEventParameters
    ): this.type = js.native
    
    /**
      * @since 1.93
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Fires event {@link #event:updateStarted updateStarted} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireUpdateStarted(): this.type = js.native
    def fireUpdateStarted(
      /**
      * Parameters to pass along with the event
      */
    mParameters: SelectDialogBase$UpdateStartedEventParameters
    ): this.type = js.native
  }
  
  trait SelectDialogBase$SelectionChangeEventParameters extends StObject {
    
    /**
      * The item whose selection has changed. In `MultiSelect` mode, only the up-most selected item is returned.
      * This parameter can be used for single-selection modes.
      */
    var listItem: js.UndefOr[typings.openui5.sapMListItemBaseMod.default] = js.undefined
    
    /**
      * Array of items whose selection has changed. This parameter can be used for `MultiSelect` mode.
      */
    var listItems: js.UndefOr[js.Array[typings.openui5.sapMListItemBaseMod.default]] = js.undefined
    
    /**
      * Indicates whether the select all action is triggered or not.
      */
    var selectAll: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Indicates whether the `listItem` parameter is selected or not.
      */
    var selected: js.UndefOr[Boolean] = js.undefined
  }
  object SelectDialogBase$SelectionChangeEventParameters {
    
    inline def apply(): SelectDialogBase$SelectionChangeEventParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SelectDialogBase$SelectionChangeEventParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SelectDialogBase$SelectionChangeEventParameters] (val x: Self) extends AnyVal {
      
      inline def setListItem(value: typings.openui5.sapMListItemBaseMod.default): Self = StObject.set(x, "listItem", value.asInstanceOf[js.Any])
      
      inline def setListItemUndefined: Self = StObject.set(x, "listItem", js.undefined)
      
      inline def setListItems(value: js.Array[typings.openui5.sapMListItemBaseMod.default]): Self = StObject.set(x, "listItems", value.asInstanceOf[js.Any])
      
      inline def setListItemsUndefined: Self = StObject.set(x, "listItems", js.undefined)
      
      inline def setListItemsVarargs(value: typings.openui5.sapMListItemBaseMod.default*): Self = StObject.set(x, "listItems", js.Array(value*))
      
      inline def setSelectAll(value: Boolean): Self = StObject.set(x, "selectAll", value.asInstanceOf[js.Any])
      
      inline def setSelectAllUndefined: Self = StObject.set(x, "selectAll", js.undefined)
      
      inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
    }
  }
  
  trait SelectDialogBase$UpdateFinishedEventParameters extends StObject {
    
    /**
      * Actual number of items.
      */
    var actual: js.UndefOr[int] = js.undefined
    
    /**
      * The reason of the update, e.g. Binding, Filter, Sort, Growing, Change, Refresh, Context.
      */
    var reason: js.UndefOr[String] = js.undefined
    
    /**
      * The total count of bound items. This can be used if the `growing` property is set to `true`.
      */
    var total: js.UndefOr[int] = js.undefined
  }
  object SelectDialogBase$UpdateFinishedEventParameters {
    
    inline def apply(): SelectDialogBase$UpdateFinishedEventParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SelectDialogBase$UpdateFinishedEventParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SelectDialogBase$UpdateFinishedEventParameters] (val x: Self) extends AnyVal {
      
      inline def setActual(value: int): Self = StObject.set(x, "actual", value.asInstanceOf[js.Any])
      
      inline def setActualUndefined: Self = StObject.set(x, "actual", js.undefined)
      
      inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
      
      inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
      
      inline def setTotal(value: int): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
      
      inline def setTotalUndefined: Self = StObject.set(x, "total", js.undefined)
    }
  }
  
  trait SelectDialogBase$UpdateStartedEventParameters extends StObject {
    
    /**
      * Actual number of items.
      */
    var actual: js.UndefOr[int] = js.undefined
    
    /**
      * The reason of the update, e.g. Binding, Filter, Sort, Growing, Change, Refresh, Context.
      */
    var reason: js.UndefOr[String] = js.undefined
    
    /**
      * The total count of bound items. This can be used if the `growing` property is set to `true`.
      */
    var total: js.UndefOr[int] = js.undefined
  }
  object SelectDialogBase$UpdateStartedEventParameters {
    
    inline def apply(): SelectDialogBase$UpdateStartedEventParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SelectDialogBase$UpdateStartedEventParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SelectDialogBase$UpdateStartedEventParameters] (val x: Self) extends AnyVal {
      
      inline def setActual(value: int): Self = StObject.set(x, "actual", value.asInstanceOf[js.Any])
      
      inline def setActualUndefined: Self = StObject.set(x, "actual", js.undefined)
      
      inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
      
      inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
      
      inline def setTotal(value: int): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
      
      inline def setTotalUndefined: Self = StObject.set(x, "total", js.undefined)
    }
  }
  
  type SelectDialogBaseSelectionChangeEvent = typings.openui5.sapUiBaseEventMod.default[SelectDialogBase$SelectionChangeEventParameters]
  
  type SelectDialogBaseSelectionChangeEventParameters = SelectDialogBase$SelectionChangeEventParameters
  
  trait SelectDialogBaseSettings
    extends StObject
       with ControlSettings {
    
    /**
      * @since 1.93
      *
      * Fires when selection is changed via user interaction inside the control.
      */
    var selectionChange: js.UndefOr[
        js.Function1[
          /* oEvent */ typings.openui5.sapUiBaseEventMod.default[SelectDialogBase$SelectionChangeEventParameters], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * @since 1.93
      *
      * Fires after `items` binding is updated and processed by the control.
      */
    var updateFinished: js.UndefOr[
        js.Function1[
          /* oEvent */ typings.openui5.sapUiBaseEventMod.default[SelectDialogBase$UpdateFinishedEventParameters], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * @since 1.93
      *
      * Fires before `items` binding is updated (e.g. sorting, filtering)
      *
      * **Note:** Event handler should not invalidate the control. *
      */
    var updateStarted: js.UndefOr[
        js.Function1[
          /* oEvent */ typings.openui5.sapUiBaseEventMod.default[SelectDialogBase$UpdateStartedEventParameters], 
          Unit
        ]
      ] = js.undefined
  }
  object SelectDialogBaseSettings {
    
    inline def apply(): SelectDialogBaseSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SelectDialogBaseSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SelectDialogBaseSettings] (val x: Self) extends AnyVal {
      
      inline def setSelectionChange(
        value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[SelectDialogBase$SelectionChangeEventParameters] => Unit
      ): Self = StObject.set(x, "selectionChange", js.Any.fromFunction1(value))
      
      inline def setSelectionChangeUndefined: Self = StObject.set(x, "selectionChange", js.undefined)
      
      inline def setUpdateFinished(
        value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[SelectDialogBase$UpdateFinishedEventParameters] => Unit
      ): Self = StObject.set(x, "updateFinished", js.Any.fromFunction1(value))
      
      inline def setUpdateFinishedUndefined: Self = StObject.set(x, "updateFinished", js.undefined)
      
      inline def setUpdateStarted(
        value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[SelectDialogBase$UpdateStartedEventParameters] => Unit
      ): Self = StObject.set(x, "updateStarted", js.Any.fromFunction1(value))
      
      inline def setUpdateStartedUndefined: Self = StObject.set(x, "updateStarted", js.undefined)
    }
  }
  
  type SelectDialogBaseUpdateFinishedEvent = typings.openui5.sapUiBaseEventMod.default[SelectDialogBase$UpdateFinishedEventParameters]
  
  type SelectDialogBaseUpdateFinishedEventParameters = SelectDialogBase$UpdateFinishedEventParameters
  
  type SelectDialogBaseUpdateStartedEvent = typings.openui5.sapUiBaseEventMod.default[SelectDialogBase$UpdateStartedEventParameters]
  
  type SelectDialogBaseUpdateStartedEventParameters = SelectDialogBase$UpdateStartedEventParameters
}
