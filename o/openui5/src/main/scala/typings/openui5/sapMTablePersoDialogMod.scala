package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.ManagedObjectSettings
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreLibraryMod.CSSSize
import typings.openui5.sapUiCoreLibraryMod.ID
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMTablePersoDialogMod {
  
  @JSImport("sap/m/TablePersoDialog", JSImport.Default)
  @js.native
  /**
    * The TablePersoDialog can be used to display and allow modification of personalization settings relating
    * to a Table. It displays the columns of the table that it refers to by using
    * 	 - The result of calling sap.m.TablePersoProvider's 'getCaption' callback if it is implemented and delivers
    * 			a non-null value for a column
    * 	 - the column header control's 'text' property if no caption property is available
    * 	 - the column header control's 'title' property if neither 'text' nor 'caption' property are available
    *
    * 	 - the column id is displayed as last fallback, if none of the above is at hand. In that case, a warning
    * 			is logged.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends TablePersoDialog {
    def this(/**
      * optional map/JSON-object with initial settings for the new component instance
      */
    mSettings: TablePersoDialogSettings) = this()
    def this(/**
      * optional id for the new control; generated automatically if no non-empty id is given Note: this can be
      * omitted, no matter whether `mSettings` will be given or not!
      */
    sId: String) = this()
    def this(
      /**
      * optional id for the new control; generated automatically if no non-empty id is given Note: this can be
      * omitted, no matter whether `mSettings` will be given or not!
      */
    sId: String,
      /**
      * optional map/JSON-object with initial settings for the new component instance
      */
    mSettings: TablePersoDialogSettings
    ) = this()
    def this(
      /**
      * optional id for the new control; generated automatically if no non-empty id is given Note: this can be
      * omitted, no matter whether `mSettings` will be given or not!
      */
    sId: Unit,
      /**
      * optional map/JSON-object with initial settings for the new component instance
      */
    mSettings: TablePersoDialogSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/m/TablePersoDialog", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.TablePersoDialog with name `sClassName` and enriches it with the
      * information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.base.ManagedObject.extend}.
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
    oClassInfo: ClassInfo[T, TablePersoDialog]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, TablePersoDialog],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.m.TablePersoDialog.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiBaseManagedObjectMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiBaseManagedObjectMetadataMod.default]
  }
  
  @js.native
  trait TablePersoDialog
    extends typings.openui5.sapUiBaseManagedObjectMod.default {
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:cancel cancel} event of this `sap.m.TablePersoDialog`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.TablePersoDialog` itself.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachCancel(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachCancel(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.TablePersoDialog` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:cancel cancel} event of this `sap.m.TablePersoDialog`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.TablePersoDialog` itself.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachCancel(
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
    def attachCancel(
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
      * Context object to call the event handler with. Defaults to this `sap.m.TablePersoDialog` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:confirm confirm} event of this `sap.m.TablePersoDialog`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.TablePersoDialog` itself.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachConfirm(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachConfirm(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.TablePersoDialog` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:confirm confirm} event of this `sap.m.TablePersoDialog`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.TablePersoDialog` itself.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachConfirm(
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
    def attachConfirm(
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
      * Context object to call the event handler with. Defaults to this `sap.m.TablePersoDialog` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @deprecated (since 1.30.1) - This aggregate is no longer used. It collided with the TablePersoController's
      * persoService reference
      *
      * Destroys the persoService in the aggregation {@link #getPersoService persoService}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyPersoService(): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:cancel cancel} event of this `sap.m.TablePersoDialog`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachCancel(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachCancel(
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
      * Detaches event handler `fnFunction` from the {@link #event:confirm confirm} event of this `sap.m.TablePersoDialog`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachConfirm(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachConfirm(
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
      * Fires event {@link #event:cancel cancel} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireCancel(): this.type = js.native
    def fireCancel(/**
      * Parameters to pass along with the event
      */
    mParameters: js.Object): this.type = js.native
    
    /**
      * Fires event {@link #event:confirm confirm} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireConfirm(): this.type = js.native
    def fireConfirm(/**
      * Parameters to pass along with the event
      */
    mParameters: js.Object): this.type = js.native
    
    /**
      * Gets current value of property {@link #getColumnInfoCallback columnInfoCallback}.
      *
      * @returns Value of property `columnInfoCallback`
      */
    def getColumnInfoCallback(): js.Object = js.native
    
    /**
      * Gets current value of property {@link #getContentHeight contentHeight}.
      *
      * @returns Value of property `contentHeight`
      */
    def getContentHeight(): CSSSize = js.native
    
    /**
      * Gets current value of property {@link #getContentWidth contentWidth}.
      *
      * @returns Value of property `contentWidth`
      */
    def getContentWidth(): CSSSize = js.native
    
    /**
      * Gets current value of property {@link #getHasGrouping hasGrouping}.
      *
      * @returns Value of property `hasGrouping`
      */
    def getHasGrouping(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getInitialColumnState initialColumnState}.
      *
      * @returns Value of property `initialColumnState`
      */
    def getInitialColumnState(): js.Object = js.native
    
    /**
      * ID of the element which is the current target of the association {@link #getPersoDialogFor persoDialogFor},
      * or `null`.
      */
    def getPersoDialogFor(): ID = js.native
    
    /**
      * Gets current value of property {@link #getPersoMap persoMap}.
      *
      * @returns Value of property `persoMap`
      */
    def getPersoMap(): js.Object = js.native
    
    /**
      * @deprecated (since 1.30.1) - This aggregate is no longer used. It collided with the TablePersoController's
      * persoService reference
      *
      * Gets content of aggregation {@link #getPersoService persoService}.
      *
      * Refers to the service for reading and writing the personalization.
      */
    def getPersoService(): js.Object = js.native
    
    /**
      * Gets current value of property {@link #getShowResetAll showResetAll}.
      *
      * @returns Value of property `showResetAll`
      */
    def getShowResetAll(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getShowSelectAll showSelectAll}.
      *
      * @returns Value of property `showSelectAll`
      */
    def getShowSelectAll(): Boolean = js.native
    
    /**
      * Initializes the TablePersoDialog instance after creation.
      */
    def init(): Unit = js.native
    
    /**
      * Sets the content of the dialog, being list items representing the associated table's column settings,
      * and opens the dialog
      */
    def open(): Unit = js.native
    
    /**
      * Returns the personalizations made. Currently supports a 'columns' property which holds an array of settings,
      * one element per column in the associated table. The element contains column-specific information as follows:
      * id: column id; order: new order; text: the column's header text that was displayed in the dialog; visible:
      * visibility (true or false).
      *
      * @returns the personalization data
      */
    def retrievePersonalizations(): js.Object = js.native
    
    /**
      * Sets a new value for property {@link #getColumnInfoCallback columnInfoCallback}.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setColumnInfoCallback(/**
      * New value for property `columnInfoCallback`
      */
    oColumnInfoCallback: js.Object): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getContentHeight contentHeight}.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setContentHeight(/**
      * New value for property `contentHeight`
      */
    sContentHeight: CSSSize): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getContentWidth contentWidth}.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setContentWidth(/**
      * New value for property `contentWidth`
      */
    sContentWidth: CSSSize): this.type = js.native
    
    /**
      * Setter to turn on/ switch off TablePersoDialog's grouping mode.
      *
      * @returns the TablePersoDialog instance.
      */
    def setHasGrouping(/**
      * groping mode on or off.
      */
    bHasGrouping: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getInitialColumnState initialColumnState}.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setInitialColumnState(/**
      * New value for property `initialColumnState`
      */
    oInitialColumnState: js.Object): this.type = js.native
    
    def setPersoDialogFor(
      /**
      * ID of an element which becomes the new target of this persoDialogFor association; alternatively, an element
      * instance may be given
      */
    oPersoDialogFor: typings.openui5.sapMTableMod.default
    ): this.type = js.native
    /**
      * Sets the associated {@link #getPersoDialogFor persoDialogFor}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setPersoDialogFor(
      /**
      * ID of an element which becomes the new target of this persoDialogFor association; alternatively, an element
      * instance may be given
      */
    oPersoDialogFor: ID
    ): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getPersoMap persoMap}.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setPersoMap(/**
      * New value for property `persoMap`
      */
    oPersoMap: js.Object): this.type = js.native
    
    /**
      * @deprecated (since 1.30.1) - This aggregate is no longer used. It collided with the TablePersoController's
      * persoService reference
      *
      * Sets the aggregated {@link #getPersoService persoService}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setPersoService(/**
      * The persoService to set
      */
    oPersoService: js.Object): this.type = js.native
    
    /**
      * Setter to show/hide TablePersoDialog's 'Undo Personalization' button.
      *
      * @returns the TablePersoDialog instance.
      */
    def setShowResetAll(/**
      * 'undo Personalization' button visible or not.
      */
    bShowResetAll: Boolean): this.type = js.native
    
    /**
      * Setter to show/hide TablePersoDialog's 'selectAll' checkbox.
      *
      * @returns the TablePersoDialog instance.
      */
    def setShowSelectAll(/**
      * selectAll checkbox visible or not.
      */
    bShowSelectAll: Boolean): this.type = js.native
  }
  
  trait TablePersoDialogSettings
    extends StObject
       with ManagedObjectSettings {
    
    var cancel: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    var columnInfoCallback: js.UndefOr[
        js.Object | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    var confirm: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    var contentHeight: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    var contentWidth: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    var hasGrouping: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    var initialColumnState: js.UndefOr[
        js.Object | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * The table which shall be personalized.
      */
    var persoDialogFor: js.UndefOr[typings.openui5.sapMTableMod.default | String] = js.undefined
    
    var persoMap: js.UndefOr[
        js.Object | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @deprecated (since 1.30.1) - This aggregate is no longer used. It collided with the TablePersoController's
      * persoService reference
      *
      * Refers to the service for reading and writing the personalization.
      */
    var persoService: js.UndefOr[js.Object] = js.undefined
    
    var showResetAll: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    var showSelectAll: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object TablePersoDialogSettings {
    
    inline def apply(): TablePersoDialogSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TablePersoDialogSettings]
    }
    
    extension [Self <: TablePersoDialogSettings](x: Self) {
      
      inline def setCancel(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction1(value))
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setColumnInfoCallback(value: js.Object | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "columnInfoCallback", value.asInstanceOf[js.Any])
      
      inline def setColumnInfoCallbackUndefined: Self = StObject.set(x, "columnInfoCallback", js.undefined)
      
      inline def setConfirm(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "confirm", js.Any.fromFunction1(value))
      
      inline def setConfirmUndefined: Self = StObject.set(x, "confirm", js.undefined)
      
      inline def setContentHeight(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "contentHeight", value.asInstanceOf[js.Any])
      
      inline def setContentHeightUndefined: Self = StObject.set(x, "contentHeight", js.undefined)
      
      inline def setContentWidth(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "contentWidth", value.asInstanceOf[js.Any])
      
      inline def setContentWidthUndefined: Self = StObject.set(x, "contentWidth", js.undefined)
      
      inline def setHasGrouping(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "hasGrouping", value.asInstanceOf[js.Any])
      
      inline def setHasGroupingUndefined: Self = StObject.set(x, "hasGrouping", js.undefined)
      
      inline def setInitialColumnState(value: js.Object | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "initialColumnState", value.asInstanceOf[js.Any])
      
      inline def setInitialColumnStateUndefined: Self = StObject.set(x, "initialColumnState", js.undefined)
      
      inline def setPersoDialogFor(value: typings.openui5.sapMTableMod.default | String): Self = StObject.set(x, "persoDialogFor", value.asInstanceOf[js.Any])
      
      inline def setPersoDialogForUndefined: Self = StObject.set(x, "persoDialogFor", js.undefined)
      
      inline def setPersoMap(value: js.Object | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "persoMap", value.asInstanceOf[js.Any])
      
      inline def setPersoMapUndefined: Self = StObject.set(x, "persoMap", js.undefined)
      
      inline def setPersoService(value: js.Object): Self = StObject.set(x, "persoService", value.asInstanceOf[js.Any])
      
      inline def setPersoServiceUndefined: Self = StObject.set(x, "persoService", js.undefined)
      
      inline def setShowResetAll(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showResetAll", value.asInstanceOf[js.Any])
      
      inline def setShowResetAllUndefined: Self = StObject.set(x, "showResetAll", js.undefined)
      
      inline def setShowSelectAll(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showSelectAll", value.asInstanceOf[js.Any])
      
      inline def setShowSelectAllUndefined: Self = StObject.set(x, "showSelectAll", js.undefined)
    }
  }
}
