package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiMdcValuehelpBaseFilterableListContentMod.FilterableListContentSettings
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiMdcValuehelpContentMdctableMod {
  
  @JSImport("sap/ui/mdc/valuehelp/content/MDCTable", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `MDCTable` content.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends MDCTable {
    def this(/**
      * Initial settings for the new element
      */
    mSettings: MDCTableSettings) = this()
    def this(/**
      * ID for the new element, generated automatically if no ID is given
      */
    sId: String) = this()
    def this(
      /**
      * ID for the new element, generated automatically if no ID is given
      */
    sId: String,
      /**
      * Initial settings for the new element
      */
    mSettings: MDCTableSettings
    ) = this()
    def this(
      /**
      * ID for the new element, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new element
      */
    mSettings: MDCTableSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/mdc/valuehelp/content/MDCTable", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.mdc.valuehelp.content.MDCTable with name `sClassName` and enriches
      * it with the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.mdc.valuehelp.base.FilterableListContent.extend}.
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
    oClassInfo: ClassInfo[T, MDCTable]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, MDCTable],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.mdc.valuehelp.content.MDCTable.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait MDCTable
    extends typings.openui5.sapUiMdcValuehelpBaseFilterableListContentMod.default {
    
    /**
      * Destroys the table in the aggregation {@link #getTable table}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyTable(): this.type = js.native
    
    /**
      * Gets current value of property {@link #getForceBind forceBind}.
      *
      * This property will lead to a rebind on newly inserted tables after initial filters are set, immediately
      * before the table is shown for the first time.
      *
      * **Note:** This only takes effect if autoBindOnInit is disabled on the `Table`
      *
      * Default value is `false`.
      *
      * @returns Value of property `forceBind`
      */
    def getForceBind(): Boolean = js.native
    
    /**
      * Gets content of aggregation {@link #getTable table}.
      *
      * Table to be used in value help
      *
      * **Note:** Set the right selection mode (multiple selection or single selection) as it cannot be determined
      * automatically for every case. (Maybe for multi-value {@link sap.ui.mdc.FilterField FilterField} controls
      * only single selection from table might be wanted.)
      */
    def getTable(): typings.openui5.sapUiMdcTableMod.default = js.native
    
    /**
      * Sets a new value for property {@link #getForceBind forceBind}.
      *
      * This property will lead to a rebind on newly inserted tables after initial filters are set, immediately
      * before the table is shown for the first time.
      *
      * **Note:** This only takes effect if autoBindOnInit is disabled on the `Table`
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setForceBind(): this.type = js.native
    def setForceBind(/**
      * New value for property `forceBind`
      */
    bForceBind: Boolean): this.type = js.native
    
    /**
      * Sets the aggregated {@link #getTable table}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setTable(/**
      * The table to set
      */
    oTable: typings.openui5.sapUiMdcTableMod.default): this.type = js.native
  }
  
  trait MDCTableSettings
    extends StObject
       with FilterableListContentSettings {
    
    /**
      * This property will lead to a rebind on newly inserted tables after initial filters are set, immediately
      * before the table is shown for the first time.
      *
      * **Note:** This only takes effect if autoBindOnInit is disabled on the `Table`
      */
    var forceBind: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Table to be used in value help
      *
      * **Note:** Set the right selection mode (multiple selection or single selection) as it cannot be determined
      * automatically for every case. (Maybe for multi-value {@link sap.ui.mdc.FilterField FilterField} controls
      * only single selection from table might be wanted.)
      */
    var table: js.UndefOr[typings.openui5.sapUiMdcTableMod.default] = js.undefined
  }
  object MDCTableSettings {
    
    inline def apply(): MDCTableSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MDCTableSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MDCTableSettings] (val x: Self) extends AnyVal {
      
      inline def setForceBind(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "forceBind", value.asInstanceOf[js.Any])
      
      inline def setForceBindUndefined: Self = StObject.set(x, "forceBind", js.undefined)
      
      inline def setTable(value: typings.openui5.sapUiMdcTableMod.default): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
      
      inline def setTableUndefined: Self = StObject.set(x, "table", js.undefined)
    }
  }
}
