package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiCoreElementMod.ElementSettings
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiMdcChartSelectionDetailsActionsMod {
  
  @JSImport("sap/ui/mdc/chart/SelectionDetailsActions", JSImport.Default)
  @js.native
  /**
    * Constructor for a new SelectionDetailsActions.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends SelectionDetailsActions {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: SelectionDetailsActionsSettings) = this()
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
    mSettings: SelectionDetailsActionsSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: SelectionDetailsActionsSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/mdc/chart/SelectionDetailsActions", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.mdc.chart.SelectionDetailsActions with name `sClassName` and enriches
      * it with the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.core.Element.extend}.
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
    oClassInfo: ClassInfo[T, SelectionDetailsActions]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, SelectionDetailsActions],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.mdc.chart.SelectionDetailsActions.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait SelectionDetailsActions
    extends typings.openui5.sapUiCoreElementMod.default {
    
    /**
      * Adds some actionGroup to the aggregation {@link #getActionGroups actionGroups}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addActionGroup(
      /**
      * The actionGroup to add; if empty, nothing is inserted
      */
    oActionGroup: typings.openui5.sapUiCoreItemMod.default
    ): this.type = js.native
    
    /**
      * Adds some detailsAction to the aggregation {@link #getDetailsActions detailsActions}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addDetailsAction(
      /**
      * The detailsAction to add; if empty, nothing is inserted
      */
    oDetailsAction: typings.openui5.sapUiCoreItemMod.default
    ): this.type = js.native
    
    /**
      * Adds some detailsItemAction to the aggregation {@link #getDetailsItemActions detailsItemActions}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addDetailsItemAction(
      /**
      * The detailsItemAction to add; if empty, nothing is inserted
      */
    oDetailsItemAction: typings.openui5.sapUiCoreItemMod.default
    ): this.type = js.native
    
    /**
      * Destroys all the actionGroups in the aggregation {@link #getActionGroups actionGroups}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyActionGroups(): this.type = js.native
    
    /**
      * Destroys all the detailsActions in the aggregation {@link #getDetailsActions detailsActions}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyDetailsActions(): this.type = js.native
    
    /**
      * Destroys all the detailsItemActions in the aggregation {@link #getDetailsItemActions detailsItemActions}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyDetailsItemActions(): this.type = js.native
    
    /**
      * Gets content of aggregation {@link #getActionGroups actionGroups}.
      *
      * Action `item` shown in the Groups area of the details.
      */
    def getActionGroups(): js.Array[typings.openui5.sapUiCoreItemMod.default] = js.native
    
    /**
      * Gets content of aggregation {@link #getDetailsActions detailsActions}.
      *
      * Action `item` shown in the Details area of the details.
      */
    def getDetailsActions(): js.Array[typings.openui5.sapUiCoreItemMod.default] = js.native
    
    /**
      * Gets content of aggregation {@link #getDetailsItemActions detailsItemActions}.
      *
      * Action `item` shown in the Items area of the details popover.
      */
    def getDetailsItemActions(): js.Array[typings.openui5.sapUiCoreItemMod.default] = js.native
    
    /**
      * Checks for the provided `sap.ui.core.Item` in the aggregation {@link #getActionGroups actionGroups}.
      * and returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfActionGroup(
      /**
      * The actionGroup whose index is looked for
      */
    oActionGroup: typings.openui5.sapUiCoreItemMod.default
    ): int = js.native
    
    /**
      * Checks for the provided `sap.ui.core.Item` in the aggregation {@link #getDetailsActions detailsActions}.
      * and returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfDetailsAction(
      /**
      * The detailsAction whose index is looked for
      */
    oDetailsAction: typings.openui5.sapUiCoreItemMod.default
    ): int = js.native
    
    /**
      * Checks for the provided `sap.ui.core.Item` in the aggregation {@link #getDetailsItemActions detailsItemActions}.
      * and returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfDetailsItemAction(
      /**
      * The detailsItemAction whose index is looked for
      */
    oDetailsItemAction: typings.openui5.sapUiCoreItemMod.default
    ): int = js.native
    
    /**
      * Inserts a actionGroup into the aggregation {@link #getActionGroups actionGroups}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertActionGroup(
      /**
      * The actionGroup to insert; if empty, nothing is inserted
      */
    oActionGroup: typings.openui5.sapUiCoreItemMod.default,
      /**
      * The `0`-based index the actionGroup should be inserted at; for a negative value of `iIndex`, the actionGroup
      * is inserted at position 0; for a value greater than the current size of the aggregation, the actionGroup
      * is inserted at the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Inserts a detailsAction into the aggregation {@link #getDetailsActions detailsActions}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertDetailsAction(
      /**
      * The detailsAction to insert; if empty, nothing is inserted
      */
    oDetailsAction: typings.openui5.sapUiCoreItemMod.default,
      /**
      * The `0`-based index the detailsAction should be inserted at; for a negative value of `iIndex`, the detailsAction
      * is inserted at position 0; for a value greater than the current size of the aggregation, the detailsAction
      * is inserted at the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Inserts a detailsItemAction into the aggregation {@link #getDetailsItemActions detailsItemActions}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertDetailsItemAction(
      /**
      * The detailsItemAction to insert; if empty, nothing is inserted
      */
    oDetailsItemAction: typings.openui5.sapUiCoreItemMod.default,
      /**
      * The `0`-based index the detailsItemAction should be inserted at; for a negative value of `iIndex`, the
      * detailsItemAction is inserted at position 0; for a value greater than the current size of the aggregation,
      * the detailsItemAction is inserted at the last position
      */
    iIndex: int
    ): this.type = js.native
    
    def removeActionGroup(/**
      * The actionGroup to remove or its index or id
      */
    vActionGroup: String): typings.openui5.sapUiCoreItemMod.default | Null = js.native
    /**
      * Removes a actionGroup from the aggregation {@link #getActionGroups actionGroups}.
      *
      * @returns The removed actionGroup or `null`
      */
    def removeActionGroup(/**
      * The actionGroup to remove or its index or id
      */
    vActionGroup: int): typings.openui5.sapUiCoreItemMod.default | Null = js.native
    def removeActionGroup(
      /**
      * The actionGroup to remove or its index or id
      */
    vActionGroup: typings.openui5.sapUiCoreItemMod.default
    ): typings.openui5.sapUiCoreItemMod.default | Null = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getActionGroups actionGroups}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllActionGroups(): js.Array[typings.openui5.sapUiCoreItemMod.default] = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getDetailsActions detailsActions}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllDetailsActions(): js.Array[typings.openui5.sapUiCoreItemMod.default] = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getDetailsItemActions detailsItemActions}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllDetailsItemActions(): js.Array[typings.openui5.sapUiCoreItemMod.default] = js.native
    
    def removeDetailsAction(/**
      * The detailsAction to remove or its index or id
      */
    vDetailsAction: String): typings.openui5.sapUiCoreItemMod.default | Null = js.native
    /**
      * Removes a detailsAction from the aggregation {@link #getDetailsActions detailsActions}.
      *
      * @returns The removed detailsAction or `null`
      */
    def removeDetailsAction(/**
      * The detailsAction to remove or its index or id
      */
    vDetailsAction: int): typings.openui5.sapUiCoreItemMod.default | Null = js.native
    def removeDetailsAction(
      /**
      * The detailsAction to remove or its index or id
      */
    vDetailsAction: typings.openui5.sapUiCoreItemMod.default
    ): typings.openui5.sapUiCoreItemMod.default | Null = js.native
    
    def removeDetailsItemAction(/**
      * The detailsItemAction to remove or its index or id
      */
    vDetailsItemAction: String): typings.openui5.sapUiCoreItemMod.default | Null = js.native
    /**
      * Removes a detailsItemAction from the aggregation {@link #getDetailsItemActions detailsItemActions}.
      *
      * @returns The removed detailsItemAction or `null`
      */
    def removeDetailsItemAction(/**
      * The detailsItemAction to remove or its index or id
      */
    vDetailsItemAction: int): typings.openui5.sapUiCoreItemMod.default | Null = js.native
    def removeDetailsItemAction(
      /**
      * The detailsItemAction to remove or its index or id
      */
    vDetailsItemAction: typings.openui5.sapUiCoreItemMod.default
    ): typings.openui5.sapUiCoreItemMod.default | Null = js.native
  }
  
  trait SelectionDetailsActionsSettings
    extends StObject
       with ElementSettings {
    
    /**
      * Action `item` shown in the Groups area of the details.
      */
    var actionGroups: js.UndefOr[
        js.Array[typings.openui5.sapUiCoreItemMod.default] | typings.openui5.sapUiCoreItemMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Action `item` shown in the Details area of the details.
      */
    var detailsActions: js.UndefOr[
        js.Array[typings.openui5.sapUiCoreItemMod.default] | typings.openui5.sapUiCoreItemMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Action `item` shown in the Items area of the details popover.
      */
    var detailsItemActions: js.UndefOr[
        js.Array[typings.openui5.sapUiCoreItemMod.default] | typings.openui5.sapUiCoreItemMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object SelectionDetailsActionsSettings {
    
    inline def apply(): SelectionDetailsActionsSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SelectionDetailsActionsSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SelectionDetailsActionsSettings] (val x: Self) extends AnyVal {
      
      inline def setActionGroups(
        value: js.Array[typings.openui5.sapUiCoreItemMod.default] | typings.openui5.sapUiCoreItemMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "actionGroups", value.asInstanceOf[js.Any])
      
      inline def setActionGroupsUndefined: Self = StObject.set(x, "actionGroups", js.undefined)
      
      inline def setActionGroupsVarargs(value: typings.openui5.sapUiCoreItemMod.default*): Self = StObject.set(x, "actionGroups", js.Array(value*))
      
      inline def setDetailsActions(
        value: js.Array[typings.openui5.sapUiCoreItemMod.default] | typings.openui5.sapUiCoreItemMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "detailsActions", value.asInstanceOf[js.Any])
      
      inline def setDetailsActionsUndefined: Self = StObject.set(x, "detailsActions", js.undefined)
      
      inline def setDetailsActionsVarargs(value: typings.openui5.sapUiCoreItemMod.default*): Self = StObject.set(x, "detailsActions", js.Array(value*))
      
      inline def setDetailsItemActions(
        value: js.Array[typings.openui5.sapUiCoreItemMod.default] | typings.openui5.sapUiCoreItemMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "detailsItemActions", value.asInstanceOf[js.Any])
      
      inline def setDetailsItemActionsUndefined: Self = StObject.set(x, "detailsItemActions", js.undefined)
      
      inline def setDetailsItemActionsVarargs(value: typings.openui5.sapUiCoreItemMod.default*): Self = StObject.set(x, "detailsItemActions", js.Array(value*))
    }
  }
}
