package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapMOverflowToolbarMod.OverflowToolbarSettings
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiMdcActionToolbarMod {
  
  @JSImport("sap/ui/mdc/ActionToolbar", JSImport.Default)
  @js.native
  /**
    * Constructor for a new ActionToolbar.
    *  **Note:**
    *  The control is experimental and the API / behavior is not finalized. It should only be used internally
    * in other mdc controls (e.g. chart/table).
    *  The content aggregation of the control must not be used.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends ActionToolbar {
    def this(/**
      * initial settings for the new control
      */
    mSettings: ActionToolbarSettings) = this()
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
      * initial settings for the new control
      */
    mSettings: ActionToolbarSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * initial settings for the new control
      */
    mSettings: ActionToolbarSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/mdc/ActionToolbar", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.mdc.ActionToolbar with name `sClassName` and enriches it with
      * the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.m.OverflowToolbar.extend}.
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
    oClassInfo: ClassInfo[T, ActionToolbar]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, ActionToolbar],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.mdc.ActionToolbar.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait ActionToolbar
    extends typings.openui5.sapMOverflowToolbarMod.default {
    
    /**
      * Adds some action to the aggregation {@link #getActions actions}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addAction(
      /**
      * The action to add; if empty, nothing is inserted
      */
    oAction: typings.openui5.sapUiMdcActiontoolbarActionToolbarActionMod.default
    ): this.type = js.native
    
    /**
      * Adds some begin to the aggregation {@link #getBegin begin}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addBegin(
      /**
      * The begin to add; if empty, nothing is inserted
      */
    oBegin: typings.openui5.sapUiCoreControlMod.default
    ): this.type = js.native
    
    /**
      * Adds some between to the aggregation {@link #getBetween between}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addBetween(
      /**
      * The between to add; if empty, nothing is inserted
      */
    oBetween: typings.openui5.sapUiCoreControlMod.default
    ): this.type = js.native
    
    /**
      * Adds some end to the aggregation {@link #getEnd end}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addEnd(
      /**
      * The end to add; if empty, nothing is inserted
      */
    oEnd: typings.openui5.sapUiCoreControlMod.default
    ): this.type = js.native
    
    /**
      * Destroys all the actions in the aggregation {@link #getActions actions}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyActions(): this.type = js.native
    
    /**
      * Destroys all the begin in the aggregation {@link #getBegin begin}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyBegin(): this.type = js.native
    
    /**
      * Destroys all the between in the aggregation {@link #getBetween between}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyBetween(): this.type = js.native
    
    /**
      * Destroys all the end in the aggregation {@link #getEnd end}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyEnd(): this.type = js.native
    
    /**
      * Gets content of aggregation {@link #getActions actions}.
      *
      * Further actions in the toolbar.
      */
    def getActions(): js.Array[typings.openui5.sapUiMdcActiontoolbarActionToolbarActionMod.default] = js.native
    
    /**
      * Gets content of aggregation {@link #getBegin begin}.
      *
      * Content shown at the begin of the toolbar (e.g. Title).
      */
    def getBegin(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    /**
      * Gets content of aggregation {@link #getBetween between}.
      *
      * Content shown between the title and actions on the toolbar.
      */
    def getBetween(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    /**
      * Gets content of aggregation {@link #getEnd end}.
      *
      * Content at the end of the toolbar.
      */
    def getEnd(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    /**
      * Gets current value of property {@link #getUseAsHeader useAsHeader}.
      *
      * Determines whether the toolbar is used as header (e.g. for a table).
      *
      * Default value is `true`.
      *
      * @returns Value of property `useAsHeader`
      */
    def getUseAsHeader(): Boolean = js.native
    
    /**
      * Checks for the provided `sap.ui.mdc.actiontoolbar.ActionToolbarAction` in the aggregation {@link #getActions actions}.
      * and returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfAction(
      /**
      * The action whose index is looked for
      */
    oAction: typings.openui5.sapUiMdcActiontoolbarActionToolbarActionMod.default
    ): int = js.native
    
    /**
      * Checks for the provided `sap.ui.core.Control` in the aggregation {@link #getBegin begin}. and returns
      * its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfBegin(
      /**
      * The begin whose index is looked for
      */
    oBegin: typings.openui5.sapUiCoreControlMod.default
    ): int = js.native
    
    /**
      * Checks for the provided `sap.ui.core.Control` in the aggregation {@link #getBetween between}. and returns
      * its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfBetween(
      /**
      * The between whose index is looked for
      */
    oBetween: typings.openui5.sapUiCoreControlMod.default
    ): int = js.native
    
    /**
      * Checks for the provided `sap.ui.core.Control` in the aggregation {@link #getEnd end}. and returns its
      * index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfEnd(/**
      * The end whose index is looked for
      */
    oEnd: typings.openui5.sapUiCoreControlMod.default): int = js.native
    
    /**
      * Inserts a action into the aggregation {@link #getActions actions}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertAction(
      /**
      * The action to insert; if empty, nothing is inserted
      */
    oAction: typings.openui5.sapUiMdcActiontoolbarActionToolbarActionMod.default,
      /**
      * The `0`-based index the action should be inserted at; for a negative value of `iIndex`, the action is
      * inserted at position 0; for a value greater than the current size of the aggregation, the action is inserted
      * at the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Inserts a begin into the aggregation {@link #getBegin begin}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertBegin(
      /**
      * The begin to insert; if empty, nothing is inserted
      */
    oBegin: typings.openui5.sapUiCoreControlMod.default,
      /**
      * The `0`-based index the begin should be inserted at; for a negative value of `iIndex`, the begin is inserted
      * at position 0; for a value greater than the current size of the aggregation, the begin is inserted at
      * the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Inserts a between into the aggregation {@link #getBetween between}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertBetween(
      /**
      * The between to insert; if empty, nothing is inserted
      */
    oBetween: typings.openui5.sapUiCoreControlMod.default,
      /**
      * The `0`-based index the between should be inserted at; for a negative value of `iIndex`, the between
      * is inserted at position 0; for a value greater than the current size of the aggregation, the between
      * is inserted at the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Inserts a end into the aggregation {@link #getEnd end}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertEnd(
      /**
      * The end to insert; if empty, nothing is inserted
      */
    oEnd: typings.openui5.sapUiCoreControlMod.default,
      /**
      * The `0`-based index the end should be inserted at; for a negative value of `iIndex`, the end is inserted
      * at position 0; for a value greater than the current size of the aggregation, the end is inserted at the
      * last position
      */
    iIndex: int
    ): this.type = js.native
    
    def removeAction(/**
      * The action to remove or its index or id
      */
    vAction: String): typings.openui5.sapUiMdcActiontoolbarActionToolbarActionMod.default | Null = js.native
    /**
      * Removes a action from the aggregation {@link #getActions actions}.
      *
      * @returns The removed action or `null`
      */
    def removeAction(/**
      * The action to remove or its index or id
      */
    vAction: int): typings.openui5.sapUiMdcActiontoolbarActionToolbarActionMod.default | Null = js.native
    def removeAction(
      /**
      * The action to remove or its index or id
      */
    vAction: typings.openui5.sapUiMdcActiontoolbarActionToolbarActionMod.default
    ): typings.openui5.sapUiMdcActiontoolbarActionToolbarActionMod.default | Null = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getActions actions}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllActions(): js.Array[typings.openui5.sapUiMdcActiontoolbarActionToolbarActionMod.default] = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getBegin begin}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllBegin(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getBetween between}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllBetween(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getEnd end}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllEnd(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    def removeBegin(/**
      * The begin to remove or its index or id
      */
    vBegin: String): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    /**
      * Removes a begin from the aggregation {@link #getBegin begin}.
      *
      * @returns The removed begin or `null`
      */
    def removeBegin(/**
      * The begin to remove or its index or id
      */
    vBegin: int): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    def removeBegin(
      /**
      * The begin to remove or its index or id
      */
    vBegin: typings.openui5.sapUiCoreControlMod.default
    ): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    
    def removeBetween(/**
      * The between to remove or its index or id
      */
    vBetween: String): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    /**
      * Removes a between from the aggregation {@link #getBetween between}.
      *
      * @returns The removed between or `null`
      */
    def removeBetween(/**
      * The between to remove or its index or id
      */
    vBetween: int): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    def removeBetween(
      /**
      * The between to remove or its index or id
      */
    vBetween: typings.openui5.sapUiCoreControlMod.default
    ): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    
    def removeEnd(/**
      * The end to remove or its index or id
      */
    vEnd: String): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    /**
      * Removes a end from the aggregation {@link #getEnd end}.
      *
      * @returns The removed end or `null`
      */
    def removeEnd(/**
      * The end to remove or its index or id
      */
    vEnd: int): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    def removeEnd(
      /**
      * The end to remove or its index or id
      */
    vEnd: typings.openui5.sapUiCoreControlMod.default
    ): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    
    /**
      * Sets a new value for property {@link #getUseAsHeader useAsHeader}.
      *
      * Determines whether the toolbar is used as header (e.g. for a table).
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setUseAsHeader(): this.type = js.native
    def setUseAsHeader(/**
      * New value for property `useAsHeader`
      */
    bUseAsHeader: Boolean): this.type = js.native
  }
  
  trait ActionToolbarSettings
    extends StObject
       with OverflowToolbarSettings {
    
    /**
      * Further actions in the toolbar.
      */
    var actions: js.UndefOr[
        js.Array[typings.openui5.sapUiMdcActiontoolbarActionToolbarActionMod.default] | typings.openui5.sapUiMdcActiontoolbarActionToolbarActionMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Content shown at the begin of the toolbar (e.g. Title).
      */
    var begin: js.UndefOr[
        js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Content shown between the title and actions on the toolbar.
      */
    var between: js.UndefOr[
        js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Content at the end of the toolbar.
      */
    var end: js.UndefOr[
        js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Determines whether the toolbar is used as header (e.g. for a table).
      */
    var useAsHeader: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object ActionToolbarSettings {
    
    inline def apply(): ActionToolbarSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ActionToolbarSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ActionToolbarSettings] (val x: Self) extends AnyVal {
      
      inline def setActions(
        value: js.Array[typings.openui5.sapUiMdcActiontoolbarActionToolbarActionMod.default] | typings.openui5.sapUiMdcActiontoolbarActionToolbarActionMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
      
      inline def setActionsVarargs(value: typings.openui5.sapUiMdcActiontoolbarActionToolbarActionMod.default*): Self = StObject.set(x, "actions", js.Array(value*))
      
      inline def setBegin(
        value: js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "begin", value.asInstanceOf[js.Any])
      
      inline def setBeginUndefined: Self = StObject.set(x, "begin", js.undefined)
      
      inline def setBeginVarargs(value: typings.openui5.sapUiCoreControlMod.default*): Self = StObject.set(x, "begin", js.Array(value*))
      
      inline def setBetween(
        value: js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "between", value.asInstanceOf[js.Any])
      
      inline def setBetweenUndefined: Self = StObject.set(x, "between", js.undefined)
      
      inline def setBetweenVarargs(value: typings.openui5.sapUiCoreControlMod.default*): Self = StObject.set(x, "between", js.Array(value*))
      
      inline def setEnd(
        value: js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      inline def setEndVarargs(value: typings.openui5.sapUiCoreControlMod.default*): Self = StObject.set(x, "end", js.Array(value*))
      
      inline def setUseAsHeader(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "useAsHeader", value.asInstanceOf[js.Any])
      
      inline def setUseAsHeaderUndefined: Self = StObject.set(x, "useAsHeader", js.undefined)
    }
  }
}
