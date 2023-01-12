package typings.openui5

import typings.openui5.anon.ContentWidth
import typings.openui5.sap.ClassInfo
import typings.openui5.sapMLibraryMod.P13nPopupMode
import typings.openui5.sapMLibraryMod.p13n.IContent
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMP13nPopupMod {
  
  @JSImport("sap/m/p13n/Popup", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `Popup`.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends Popup {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: PopupSettings) = this()
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
    mSettings: PopupSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: PopupSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/m/p13n/Popup", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.p13n.Popup with name `sClassName` and enriches it with the information
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
    oClassInfo: ClassInfo[T, Popup]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, Popup],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.m.p13n.Popup.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait Popup
    extends typings.openui5.sapUiCoreControlMod.default {
    
    /**
      * Adds some additionalButton to the aggregation {@link #getAdditionalButtons additionalButtons}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addAdditionalButton(
      /**
      * The additionalButton to add; if empty, nothing is inserted
      */
    oAdditionalButton: typings.openui5.sapMButtonMod.default
    ): this.type = js.native
    
    /**
      * Adds a new panel to the `panels` aggregation.
      *
      * @returns The popup instance
      */
    def addPanel(/**
      * The panel instance
      */
    oPanel: IContent): Popup = js.native
    def addPanel(
      /**
      * The panel instance
      */
    oPanel: IContent,
      /**
      * Optional key to be used for the panel registration instead of using the id
      */
    sKey: String
    ): Popup = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:close close} event of this `sap.m.p13n.Popup`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.p13n.Popup` itself.
      *
      * This event is fired after the dialog has been closed.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachClose(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachClose(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.p13n.Popup` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:close close} event of this `sap.m.p13n.Popup`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.p13n.Popup` itself.
      *
      * This event is fired after the dialog has been closed.
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
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
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
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.p13n.Popup` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Destroys all the additionalButtons in the aggregation {@link #getAdditionalButtons additionalButtons}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyAdditionalButtons(): this.type = js.native
    
    /**
      * Destroys all the panels in the aggregation {@link #getPanels panels}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyPanels(): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:close close} event of this `sap.m.p13n.Popup`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachClose(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachClose(
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
      * Fires event {@link #event:close close} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireClose(): this.type = js.native
    def fireClose(/**
      * Parameters to pass along with the event
      */
    mParameters: js.Object): this.type = js.native
    
    /**
      * Gets content of aggregation {@link #getAdditionalButtons additionalButtons}.
      *
      * Additional set of `sap.m.Button` controls that are added to the existing Ok and Cancel buttons.
      */
    def getAdditionalButtons(): js.Array[typings.openui5.sapMButtonMod.default] = js.native
    
    /**
      * Gets current value of property {@link #getMode mode}.
      *
      * Describes the corresponding popup mode, see also {@link sap.m.P13nPopupMode}.
      *
      * Default value is `Dialog`.
      *
      * @returns Value of property `mode`
      */
    def getMode(): P13nPopupMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof P13nPopupMode * / any */ String) = js.native
    
    /**
      * Removes the current panels in the `panels` aggregation.
      *
      * @returns An array of panel instances
      */
    def getPanels(): js.Array[IContent] = js.native
    
    /**
      * Gets current value of property {@link #getReset reset}.
      *
      * A callback that will be executed once a reset has been triggered. **Note:** The Reset button will only
      * be shown in case this callback is provided.
      *
      * @returns Value of property `reset`
      */
    def getReset(): js.Function = js.native
    
    /**
      * Gets current value of property {@link #getTitle title}.
      *
      * Text describing the personalization popup.
      *
      * @returns Value of property `title`
      */
    def getTitle(): String = js.native
    
    /**
      * Gets current value of property {@link #getWarningText warningText}.
      *
      * Warning text which appears as a message prior to executing the rest callback. **Note:** The `warningText`
      * may only be used in case the `reset` callback has been provided.
      *
      * @returns Value of property `warningText`
      */
    def getWarningText(): String = js.native
    
    /**
      * Checks for the provided `sap.m.Button` in the aggregation {@link #getAdditionalButtons additionalButtons}.
      * and returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfAdditionalButton(
      /**
      * The additionalButton whose index is looked for
      */
    oAdditionalButton: typings.openui5.sapMButtonMod.default
    ): int = js.native
    
    /**
      * Checks for the provided `sap.m.p13n.IContent` in the aggregation {@link #getPanels panels}. and returns
      * its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfPanel(/**
      * The panel whose index is looked for
      */
    oPanel: IContent): int = js.native
    
    /**
      * Inserts a additionalButton into the aggregation {@link #getAdditionalButtons additionalButtons}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertAdditionalButton(
      /**
      * The additionalButton to insert; if empty, nothing is inserted
      */
    oAdditionalButton: typings.openui5.sapMButtonMod.default,
      /**
      * The `0`-based index the additionalButton should be inserted at; for a negative value of `iIndex`, the
      * additionalButton is inserted at position 0; for a value greater than the current size of the aggregation,
      * the additionalButton is inserted at the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Inserts a panel into the aggregation {@link #getPanels panels}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertPanel(
      /**
      * The panel to insert; if empty, nothing is inserted
      */
    oPanel: IContent,
      /**
      * The `0`-based index the panel should be inserted at; for a negative value of `iIndex`, the panel is inserted
      * at position 0; for a value greater than the current size of the aggregation, the panel is inserted at
      * the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Checks whether there is an open `Popup` control.
      *
      * @returns Flag that indicates if there is an open popup
      */
    def isOpen(): Boolean = js.native
    
    /**
      * Opens the `Popup` control.
      */
    def open(
      /**
      * The referenced control instance (used as anchor, for example, on popovers)
      */
    oSource: typings.openui5.sapUiCoreControlMod.default
    ): Unit = js.native
    def open(
      /**
      * The referenced control instance (used as anchor, for example, on popovers)
      */
    oSource: typings.openui5.sapUiCoreControlMod.default,
      /**
      * Configuration for the related popup container
      */
    mSettings: ContentWidth
    ): Unit = js.native
    
    def removeAdditionalButton(/**
      * The additionalButton to remove or its index or id
      */
    vAdditionalButton: String): typings.openui5.sapMButtonMod.default | Null = js.native
    /**
      * Removes a additionalButton from the aggregation {@link #getAdditionalButtons additionalButtons}.
      *
      * @returns The removed additionalButton or `null`
      */
    def removeAdditionalButton(/**
      * The additionalButton to remove or its index or id
      */
    vAdditionalButton: int): typings.openui5.sapMButtonMod.default | Null = js.native
    def removeAdditionalButton(
      /**
      * The additionalButton to remove or its index or id
      */
    vAdditionalButton: typings.openui5.sapMButtonMod.default
    ): typings.openui5.sapMButtonMod.default | Null = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getAdditionalButtons additionalButtons}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllAdditionalButtons(): js.Array[typings.openui5.sapMButtonMod.default] = js.native
    
    /**
      * Removes a panel instance.
      *
      * @returns The popup instance
      */
    def removePanel(/**
      * The panel instance
      */
    oPanel: IContent): Popup = js.native
    
    def setMode(
      /**
      * The mode used for the popup creation
      */
    sMode: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof P13nPopupMode * / any */ String
    ): Popup = js.native
    /**
      * Sets the desired popup mode, see also {@link sap.m.P13nPopupMode}.
      *
      * @returns The popup instance
      */
    def setMode(/**
      * The mode used for the popup creation
      */
    sMode: P13nPopupMode): Popup = js.native
    
    /**
      * Sets a new value for property {@link #getTitle title}.
      *
      * Text describing the personalization popup.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setTitle(/**
      * New value for property `title`
      */
    sTitle: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getWarningText warningText}.
      *
      * Warning text which appears as a message prior to executing the rest callback. **Note:** The `warningText`
      * may only be used in case the `reset` callback has been provided.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setWarningText(/**
      * New value for property `warningText`
      */
    sWarningText: String): this.type = js.native
  }
  
  trait PopupSettings
    extends StObject
       with ControlSettings {
    
    /**
      * Additional set of `sap.m.Button` controls that are added to the existing Ok and Cancel buttons.
      */
    var additionalButtons: js.UndefOr[
        js.Array[typings.openui5.sapMButtonMod.default] | typings.openui5.sapMButtonMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * This event is fired after the dialog has been closed.
      */
    var close: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Describes the corresponding popup mode, see also {@link sap.m.P13nPopupMode}.
      */
    var mode: js.UndefOr[
        P13nPopupMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof P13nPopupMode * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * The panels that are displayed by the `sap.m.p13n.Popup`.
      */
    var panels: js.UndefOr[
        js.Array[IContent] | IContent | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * A callback that will be executed once a reset has been triggered. **Note:** The Reset button will only
      * be shown in case this callback is provided.
      */
    var reset: js.UndefOr[
        js.Function | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Text describing the personalization popup.
      */
    var title: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Warning text which appears as a message prior to executing the rest callback. **Note:** The `warningText`
      * may only be used in case the `reset` callback has been provided.
      */
    var warningText: js.UndefOr[String | PropertyBindingInfo] = js.undefined
  }
  object PopupSettings {
    
    inline def apply(): PopupSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PopupSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PopupSettings] (val x: Self) extends AnyVal {
      
      inline def setAdditionalButtons(
        value: js.Array[typings.openui5.sapMButtonMod.default] | typings.openui5.sapMButtonMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "additionalButtons", value.asInstanceOf[js.Any])
      
      inline def setAdditionalButtonsUndefined: Self = StObject.set(x, "additionalButtons", js.undefined)
      
      inline def setAdditionalButtonsVarargs(value: typings.openui5.sapMButtonMod.default*): Self = StObject.set(x, "additionalButtons", js.Array(value*))
      
      inline def setClose(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "close", js.Any.fromFunction1(value))
      
      inline def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
      
      inline def setMode(
        value: P13nPopupMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof P13nPopupMode * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setPanels(
        value: js.Array[IContent] | IContent | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "panels", value.asInstanceOf[js.Any])
      
      inline def setPanelsUndefined: Self = StObject.set(x, "panels", js.undefined)
      
      inline def setPanelsVarargs(value: IContent*): Self = StObject.set(x, "panels", js.Array(value*))
      
      inline def setReset(value: js.Function | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "reset", value.asInstanceOf[js.Any])
      
      inline def setResetUndefined: Self = StObject.set(x, "reset", js.undefined)
      
      inline def setTitle(value: String | PropertyBindingInfo): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setWarningText(value: String | PropertyBindingInfo): Self = StObject.set(x, "warningText", value.asInstanceOf[js.Any])
      
      inline def setWarningTextUndefined: Self = StObject.set(x, "warningText", js.undefined)
    }
  }
}
