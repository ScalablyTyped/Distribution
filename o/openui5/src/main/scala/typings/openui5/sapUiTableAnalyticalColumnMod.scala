package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiTableColumnMod.ColumnSettings
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiTableAnalyticalColumnMod {
  
  @JSImport("sap/ui/table/AnalyticalColumn", JSImport.Default)
  @js.native
  /**
    * Constructor for a new AnalyticalColumn.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends AnalyticalColumn {
    def this(/**
      * initial settings for the new control
      */
    mSettings: AnalyticalColumnSettings) = this()
    def this(/**
      * id for the new control, generated automatically if no id is given
      */
    sId: String) = this()
    def this(
      /**
      * id for the new control, generated automatically if no id is given
      */
    sId: String,
      /**
      * initial settings for the new control
      */
    mSettings: AnalyticalColumnSettings
    ) = this()
    def this(
      /**
      * id for the new control, generated automatically if no id is given
      */
    sId: Unit,
      /**
      * initial settings for the new control
      */
    mSettings: AnalyticalColumnSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/table/AnalyticalColumn", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.table.AnalyticalColumn with name `sClassName` and enriches it
      * with the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.table.Column.extend}.
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
    oClassInfo: ClassInfo[T, AnalyticalColumn]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, AnalyticalColumn],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.table.AnalyticalColumn.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait AnalyticalColumn
    extends typings.openui5.sapUiTableColumnMod.default {
    
    /**
      * Gets current value of property {@link #getGroupHeaderFormatter groupHeaderFormatter}.
      *
      * If the column is grouped, this formatter is used to format the value in the group header
      *
      * @returns Value of property `groupHeaderFormatter`
      */
    def getGroupHeaderFormatter(): js.Function = js.native
    
    /**
      * Gets current value of property {@link #getInResult inResult}.
      *
      * Specifies that the dimension referred to by the column shall be included in the granularity of the data
      * result. It allows a finer distinction between a visible/grouped/(included)inResult column.
      *
      * Default value is `false`.
      *
      * @returns Value of property `inResult`
      */
    def getInResult(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getLeadingProperty leadingProperty}.
      *
      * Defines the primary model property which is used inside the Column. In case of the analytical extension
      * this means the property which is grouped by for dimensions or the property which is summed for measures.
      *
      * @returns Value of property `leadingProperty`
      */
    def getLeadingProperty(): String = js.native
    
    /**
      * Gets current value of property {@link #getShowIfGrouped showIfGrouped}.
      *
      * Specifies whether the column is displayed within the table even if it is grouped or not. A grouped column
      * has the same value for every rows within the group.
      *
      * Default value is `false`.
      *
      * @returns Value of property `showIfGrouped`
      */
    def getShowIfGrouped(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getSummed summed}.
      *
      * If defined a sum for this column is calculated
      *
      * Default value is `false`.
      *
      * @returns Value of property `summed`
      */
    def getSummed(): Boolean = js.native
    
    /**
      * Sets a new value for property {@link #getGroupHeaderFormatter groupHeaderFormatter}.
      *
      * If the column is grouped, this formatter is used to format the value in the group header
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setGroupHeaderFormatter(): this.type = js.native
    def setGroupHeaderFormatter(/**
      * New value for property `groupHeaderFormatter`
      */
    fnGroupHeaderFormatter: js.Function): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getInResult inResult}.
      *
      * Specifies that the dimension referred to by the column shall be included in the granularity of the data
      * result. It allows a finer distinction between a visible/grouped/(included)inResult column.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setInResult(): this.type = js.native
    def setInResult(/**
      * New value for property `inResult`
      */
    bInResult: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getLeadingProperty leadingProperty}.
      *
      * Defines the primary model property which is used inside the Column. In case of the analytical extension
      * this means the property which is grouped by for dimensions or the property which is summed for measures.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setLeadingProperty(): this.type = js.native
    def setLeadingProperty(/**
      * New value for property `leadingProperty`
      */
    sLeadingProperty: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getShowIfGrouped showIfGrouped}.
      *
      * Specifies whether the column is displayed within the table even if it is grouped or not. A grouped column
      * has the same value for every rows within the group.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setShowIfGrouped(): this.type = js.native
    def setShowIfGrouped(/**
      * New value for property `showIfGrouped`
      */
    bShowIfGrouped: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getSummed summed}.
      *
      * If defined a sum for this column is calculated
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setSummed(): this.type = js.native
    def setSummed(/**
      * New value for property `summed`
      */
    bSummed: Boolean): this.type = js.native
  }
  
  trait AnalyticalColumnSettings
    extends StObject
       with ColumnSettings {
    
    /**
      * If the column is grouped, this formatter is used to format the value in the group header
      */
    var groupHeaderFormatter: js.UndefOr[
        js.Function | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Specifies that the dimension referred to by the column shall be included in the granularity of the data
      * result. It allows a finer distinction between a visible/grouped/(included)inResult column.
      */
    var inResult: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines the primary model property which is used inside the Column. In case of the analytical extension
      * this means the property which is grouped by for dimensions or the property which is summed for measures.
      */
    var leadingProperty: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Specifies whether the column is displayed within the table even if it is grouped or not. A grouped column
      * has the same value for every rows within the group.
      */
    var showIfGrouped: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * If defined a sum for this column is calculated
      */
    var summed: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object AnalyticalColumnSettings {
    
    inline def apply(): AnalyticalColumnSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AnalyticalColumnSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AnalyticalColumnSettings] (val x: Self) extends AnyVal {
      
      inline def setGroupHeaderFormatter(value: js.Function | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "groupHeaderFormatter", value.asInstanceOf[js.Any])
      
      inline def setGroupHeaderFormatterUndefined: Self = StObject.set(x, "groupHeaderFormatter", js.undefined)
      
      inline def setInResult(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "inResult", value.asInstanceOf[js.Any])
      
      inline def setInResultUndefined: Self = StObject.set(x, "inResult", js.undefined)
      
      inline def setLeadingProperty(value: String | PropertyBindingInfo): Self = StObject.set(x, "leadingProperty", value.asInstanceOf[js.Any])
      
      inline def setLeadingPropertyUndefined: Self = StObject.set(x, "leadingProperty", js.undefined)
      
      inline def setShowIfGrouped(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showIfGrouped", value.asInstanceOf[js.Any])
      
      inline def setShowIfGroupedUndefined: Self = StObject.set(x, "showIfGrouped", js.undefined)
      
      inline def setSummed(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "summed", value.asInstanceOf[js.Any])
      
      inline def setSummedUndefined: Self = StObject.set(x, "summed", js.undefined)
    }
  }
}
