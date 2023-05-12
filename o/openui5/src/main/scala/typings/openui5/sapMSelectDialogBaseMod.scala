package typings.openui5

import typings.openui5.anon.ListItems
import typings.openui5.anon.Reason
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
      * @SINCE 1.93
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
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachSelectionChange(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.SelectDialogBase` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * @SINCE 1.93
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
      * Context object to call the event handler with. Defaults to this `sap.m.SelectDialogBase` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @SINCE 1.93
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
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachUpdateFinished(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.SelectDialogBase` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * @SINCE 1.93
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
      * Context object to call the event handler with. Defaults to this `sap.m.SelectDialogBase` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @SINCE 1.93
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
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachUpdateStarted(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.SelectDialogBase` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * @SINCE 1.93
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
      * Context object to call the event handler with. Defaults to this `sap.m.SelectDialogBase` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @SINCE 1.93
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
      * @SINCE 1.93
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
      * @SINCE 1.93
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
      * @SINCE 1.93
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
    mParameters: ListItems): this.type = js.native
    
    /**
      * @SINCE 1.93
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
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
      * @SINCE 1.93
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
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
  }
  
  trait SelectDialogBaseSettings
    extends StObject
       with ControlSettings {
    
    /**
      * @SINCE 1.93
      *
      * Fires when selection is changed via user interaction inside the control.
      */
    var selectionChange: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * @SINCE 1.93
      *
      * Fires after `items` binding is updated and processed by the control.
      */
    var updateFinished: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * @SINCE 1.93
      *
      * Fires before `items` binding is updated (e.g. sorting, filtering)
      *
      * **Note:** Event handler should not invalidate the control. *
      */
    var updateStarted: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
  }
  object SelectDialogBaseSettings {
    
    inline def apply(): SelectDialogBaseSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SelectDialogBaseSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SelectDialogBaseSettings] (val x: Self) extends AnyVal {
      
      inline def setSelectionChange(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "selectionChange", js.Any.fromFunction1(value))
      
      inline def setSelectionChangeUndefined: Self = StObject.set(x, "selectionChange", js.undefined)
      
      inline def setUpdateFinished(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "updateFinished", js.Any.fromFunction1(value))
      
      inline def setUpdateFinishedUndefined: Self = StObject.set(x, "updateFinished", js.undefined)
      
      inline def setUpdateStarted(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "updateStarted", js.Any.fromFunction1(value))
      
      inline def setUpdateStartedUndefined: Self = StObject.set(x, "updateStarted", js.undefined)
    }
  }
}
