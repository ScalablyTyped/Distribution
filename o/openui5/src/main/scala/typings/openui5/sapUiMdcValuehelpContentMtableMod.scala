package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiMdcValuehelpBaseFilterableListContentMod.FilterableListContentSettings
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiMdcValuehelpContentMtableMod {
  
  @JSImport("sap/ui/mdc/valuehelp/content/MTable", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `MTable` content.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends MTable {
    def this(/**
      * Initial settings for the new element
      */
    mSettings: MTableSettings) = this()
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
    mSettings: MTableSettings
    ) = this()
    def this(
      /**
      * ID for the new element, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new element
      */
    mSettings: MTableSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/mdc/valuehelp/content/MTable", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.mdc.valuehelp.content.MTable with name `sClassName` and enriches
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
    oClassInfo: ClassInfo[T, MTable]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, MTable],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.mdc.valuehelp.content.MTable.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait MTable
    extends typings.openui5.sapUiMdcValuehelpBaseFilterableListContentMod.default {
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:contentUpdated contentUpdated} event of this
      * `sap.ui.mdc.valuehelp.content.MTable`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.mdc.valuehelp.content.MTable` itself.
      *
      * This event is fired if the content of the table is updated
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachContentUpdated(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
    ): this.type = js.native
    def attachContentUpdated(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.mdc.valuehelp.content.MTable`
      * itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:contentUpdated contentUpdated} event of this
      * `sap.ui.mdc.valuehelp.content.MTable`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.mdc.valuehelp.content.MTable` itself.
      *
      * This event is fired if the content of the table is updated
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachContentUpdated(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
    ): this.type = js.native
    def attachContentUpdated(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.mdc.valuehelp.content.MTable`
      * itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Destroys the table in the aggregation {@link #getTable table}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyTable(): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:contentUpdated contentUpdated} event of this
      * `sap.ui.mdc.valuehelp.content.MTable`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachContentUpdated(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
    ): this.type = js.native
    def detachContentUpdated(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Fires event {@link #event:contentUpdated contentUpdated} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireContentUpdated(): this.type = js.native
    def fireContentUpdated(/**
      * Parameters to pass along with the event
      */
    mParameters: js.Object): this.type = js.native
    
    /**
      * Gets content of aggregation {@link #getTable table}.
      *
      * Table to be used in value help
      *
      * **Note:** Set the right selection mode (multiple selection or single selection) as it cannot be determined
      * automatically for every case. (In type-ahead also for multi-value {@link sap.ui.mdc.FilterField FilterField }
      * controls only single selection from table might be wanted.)
      */
    def getTable(): typings.openui5.sapMTableMod.default = js.native
    
    /**
      * Sets the aggregated {@link #getTable table}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setTable(/**
      * The table to set
      */
    oTable: typings.openui5.sapMTableMod.default): this.type = js.native
  }
  
  trait MTable$ContentUpdatedEventParameters extends StObject
  
  type MTableContentUpdatedEvent = typings.openui5.sapUiBaseEventMod.default[MTable$ContentUpdatedEventParameters]
  
  type MTableContentUpdatedEventParameters = MTable$ContentUpdatedEventParameters
  
  trait MTableSettings
    extends StObject
       with FilterableListContentSettings {
    
    /**
      * This event is fired if the content of the table is updated
      */
    var contentUpdated: js.UndefOr[
        js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
      ] = js.undefined
    
    /**
      * Table to be used in value help
      *
      * **Note:** Set the right selection mode (multiple selection or single selection) as it cannot be determined
      * automatically for every case. (In type-ahead also for multi-value {@link sap.ui.mdc.FilterField FilterField }
      * controls only single selection from table might be wanted.)
      */
    var table: js.UndefOr[typings.openui5.sapMTableMod.default] = js.undefined
  }
  object MTableSettings {
    
    inline def apply(): MTableSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MTableSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MTableSettings] (val x: Self) extends AnyVal {
      
      inline def setContentUpdated(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[js.Object] => Unit): Self = StObject.set(x, "contentUpdated", js.Any.fromFunction1(value))
      
      inline def setContentUpdatedUndefined: Self = StObject.set(x, "contentUpdated", js.undefined)
      
      inline def setTable(value: typings.openui5.sapMTableMod.default): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
      
      inline def setTableUndefined: Self = StObject.set(x, "table", js.undefined)
    }
  }
}
