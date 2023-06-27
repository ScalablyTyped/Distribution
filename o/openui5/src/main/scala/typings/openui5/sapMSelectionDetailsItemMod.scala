package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreElementMod.ElementSettings
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMSelectionDetailsItemMod {
  
  @JSImport("sap/m/SelectionDetailsItem", JSImport.Default)
  @js.native
  /**
    * Protected:  Do not call from applications (only from related classes in the framework)
    *
    * Constructor for a new SelectionDetailsItem.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends SelectionDetailsItem {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: SelectionDetailsItemSettings) = this()
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
    mSettings: SelectionDetailsItemSettings
    ) = this()
    def this(
      /**
      * Id for the new control, generated automatically if no id is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: SelectionDetailsItemSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/m/SelectionDetailsItem", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Creates a new subclass of class sap.m.SelectionDetailsItem with name `sClassName` and enriches it with
      * the information contained in `oClassInfo`.
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
    oClassInfo: ClassInfo[T, SelectionDetailsItem]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, SelectionDetailsItem],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Returns a metadata object for class sap.m.SelectionDetailsItem.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait SelectionDetailsItem
    extends typings.openui5.sapUiCoreElementMod.default {
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Adds some action to the aggregation {@link #getActions actions}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addAction(
      /**
      * The action to add; if empty, nothing is inserted
      */
    oAction: typings.openui5.sapUiCoreItemMod.default
    ): this.type = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Adds some line to the aggregation {@link #getLines lines}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addLine(
      /**
      * The line to add; if empty, nothing is inserted
      */
    oLine: typings.openui5.sapMSelectionDetailsItemLineMod.default
    ): this.type = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Binds aggregation {@link #getLines lines} to model data.
      *
      * See {@link sap.ui.base.ManagedObject#bindAggregation ManagedObject.bindAggregation} for a detailed description
      * of the possible properties of `oBindingInfo`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def bindLines(/**
      * The binding information
      */
    oBindingInfo: AggregationBindingInfo): this.type = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Destroys all the actions in the aggregation {@link #getActions actions}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyActions(): this.type = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Destroys all the lines in the aggregation {@link #getLines lines}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyLines(): this.type = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Gets content of aggregation {@link #getActions actions}.
      *
      * Contains custom actions shown below the main content of the item.
      */
    def getActions(): js.Array[typings.openui5.sapUiCoreItemMod.default] = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Gets current value of property {@link #getEnableNav enableNav}.
      *
      * Determines whether or not the item is active and a navigation event is triggered on press.
      *
      * Default value is `false`.
      *
      * @returns Value of property `enableNav`
      */
    def getEnableNav(): Boolean = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Returns the public facade of the SelectionDetailsItem for non inner framework usages.
      *
      * @returns The reduced facade for outer framework usages.
      */
    def getFacade(): typings.openui5.sapUiBaseInterfaceMod.default = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Gets content of aggregation {@link #getLines lines}.
      *
      * Contains a record of information about, for example, measures and dimensions. These entries are usually
      * obtained via selection in chart controls.
      */
    def getLines(): js.Array[typings.openui5.sapMSelectionDetailsItemLineMod.default] = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Checks for the provided `sap.ui.core.Item` in the aggregation {@link #getActions actions}. and returns
      * its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfAction(
      /**
      * The action whose index is looked for
      */
    oAction: typings.openui5.sapUiCoreItemMod.default
    ): int = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Checks for the provided `sap.m.SelectionDetailsItemLine` in the aggregation {@link #getLines lines}.
      * and returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfLine(
      /**
      * The line whose index is looked for
      */
    oLine: typings.openui5.sapMSelectionDetailsItemLineMod.default
    ): int = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Inserts a action into the aggregation {@link #getActions actions}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertAction(
      /**
      * The action to insert; if empty, nothing is inserted
      */
    oAction: typings.openui5.sapUiCoreItemMod.default,
      /**
      * The `0`-based index the action should be inserted at; for a negative value of `iIndex`, the action is
      * inserted at position 0; for a value greater than the current size of the aggregation, the action is inserted
      * at the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Inserts a line into the aggregation {@link #getLines lines}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertLine(
      /**
      * The line to insert; if empty, nothing is inserted
      */
    oLine: typings.openui5.sapMSelectionDetailsItemLineMod.default,
      /**
      * The `0`-based index the line should be inserted at; for a negative value of `iIndex`, the line is inserted
      * at position 0; for a value greater than the current size of the aggregation, the line is inserted at
      * the last position
      */
    iIndex: int
    ): this.type = js.native
    
    def removeAction(/**
      * The action to remove or its index or id
      */
    vAction: String): typings.openui5.sapUiCoreItemMod.default | Null = js.native
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Removes a action from the aggregation {@link #getActions actions}.
      *
      * @returns The removed action or `null`
      */
    def removeAction(/**
      * The action to remove or its index or id
      */
    vAction: int): typings.openui5.sapUiCoreItemMod.default | Null = js.native
    def removeAction(
      /**
      * The action to remove or its index or id
      */
    vAction: typings.openui5.sapUiCoreItemMod.default
    ): typings.openui5.sapUiCoreItemMod.default | Null = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Removes all the controls from the aggregation {@link #getActions actions}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllActions(): js.Array[typings.openui5.sapUiCoreItemMod.default] = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Removes all the controls from the aggregation {@link #getLines lines}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllLines(): js.Array[typings.openui5.sapMSelectionDetailsItemLineMod.default] = js.native
    
    def removeLine(/**
      * The line to remove or its index or id
      */
    vLine: String): typings.openui5.sapMSelectionDetailsItemLineMod.default | Null = js.native
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Removes a line from the aggregation {@link #getLines lines}.
      *
      * @returns The removed line or `null`
      */
    def removeLine(/**
      * The line to remove or its index or id
      */
    vLine: int): typings.openui5.sapMSelectionDetailsItemLineMod.default | Null = js.native
    def removeLine(
      /**
      * The line to remove or its index or id
      */
    vLine: typings.openui5.sapMSelectionDetailsItemLineMod.default
    ): typings.openui5.sapMSelectionDetailsItemLineMod.default | Null = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Sets a new value for property {@link #getEnableNav enableNav}.
      *
      * Determines whether or not the item is active and a navigation event is triggered on press.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setEnableNav(): this.type = js.native
    def setEnableNav(/**
      * New value for property `enableNav`
      */
    bEnableNav: Boolean): this.type = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Unbinds aggregation {@link #getLines lines} from model data.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def unbindLines(): this.type = js.native
  }
  
  trait SelectionDetailsItemSettings
    extends StObject
       with ElementSettings {
    
    /**
      * Contains custom actions shown below the main content of the item.
      */
    var actions: js.UndefOr[
        js.Array[typings.openui5.sapUiCoreItemMod.default] | typings.openui5.sapUiCoreItemMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Determines whether or not the item is active and a navigation event is triggered on press.
      */
    var enableNav: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Contains a record of information about, for example, measures and dimensions. These entries are usually
      * obtained via selection in chart controls.
      */
    var lines: js.UndefOr[
        js.Array[typings.openui5.sapMSelectionDetailsItemLineMod.default] | typings.openui5.sapMSelectionDetailsItemLineMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object SelectionDetailsItemSettings {
    
    inline def apply(): SelectionDetailsItemSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SelectionDetailsItemSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SelectionDetailsItemSettings] (val x: Self) extends AnyVal {
      
      inline def setActions(
        value: js.Array[typings.openui5.sapUiCoreItemMod.default] | typings.openui5.sapUiCoreItemMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
      
      inline def setActionsVarargs(value: typings.openui5.sapUiCoreItemMod.default*): Self = StObject.set(x, "actions", js.Array(value*))
      
      inline def setEnableNav(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "enableNav", value.asInstanceOf[js.Any])
      
      inline def setEnableNavUndefined: Self = StObject.set(x, "enableNav", js.undefined)
      
      inline def setLines(
        value: js.Array[typings.openui5.sapMSelectionDetailsItemLineMod.default] | typings.openui5.sapMSelectionDetailsItemLineMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "lines", value.asInstanceOf[js.Any])
      
      inline def setLinesUndefined: Self = StObject.set(x, "lines", js.undefined)
      
      inline def setLinesVarargs(value: typings.openui5.sapMSelectionDetailsItemLineMod.default*): Self = StObject.set(x, "lines", js.Array(value*))
    }
  }
}
