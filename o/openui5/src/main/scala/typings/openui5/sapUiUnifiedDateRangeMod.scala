package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreElementMod.ElementSettings
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiUnifiedDateRangeMod {
  
  @JSImport("sap/ui/unified/DateRange", JSImport.Default)
  @js.native
  /**
    * Constructor for a new DateRange.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends DateRange {
    def this(/**
      * initial settings for the new control
      */
    mSettings: DateRangeSettings) = this()
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
    mSettings: DateRangeSettings
    ) = this()
    def this(
      /**
      * id for the new control, generated automatically if no id is given
      */
    sId: Unit,
      /**
      * initial settings for the new control
      */
    mSettings: DateRangeSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/unified/DateRange", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.unified.DateRange with name `sClassName` and enriches it with
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
    oClassInfo: ClassInfo[T, DateRange]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, DateRange],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.unified.DateRange.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait DateRange
    extends typings.openui5.sapUiCoreElementMod.default {
    
    /**
      * Gets current value of property {@link #getEndDate endDate}.
      *
      * End date for a date range. If empty only a single date is presented by this DateRange element. This must
      * be a UI5Date or JavaScript Date object.
      *
      * @returns Value of property `endDate`
      */
    def getEndDate(): js.Object = js.native
    
    /**
      * Gets current value of property {@link #getStartDate startDate}.
      *
      * Start date for a date range. This must be a UI5Date or JavaScript Date object.
      *
      * @returns Value of property `startDate`
      */
    def getStartDate(): js.Object = js.native
    
    /**
      * Set end date for a date range.
      *
      * @returns Reference to `this` for method chaining
      */
    def setEndDate(): this.type = js.native
    def setEndDate(/**
      * A date instance
      */
    oDate: js.Date): this.type = js.native
    def setEndDate(
      /**
      * A date instance
      */
    oDate: js.Date,
      /**
      * If true, `endDate` is not marked as changed
      */
    bInvalidate: Boolean
    ): this.type = js.native
    def setEndDate(
      /**
      * A date instance
      */
    oDate: Unit,
      /**
      * If true, `endDate` is not marked as changed
      */
    bInvalidate: Boolean
    ): this.type = js.native
    def setEndDate(/**
      * A date instance
      */
    oDate: typings.openui5.sapUiCoreDateUi5dateMod.default): this.type = js.native
    def setEndDate(
      /**
      * A date instance
      */
    oDate: typings.openui5.sapUiCoreDateUi5dateMod.default,
      /**
      * If true, `endDate` is not marked as changed
      */
    bInvalidate: Boolean
    ): this.type = js.native
    
    /**
      * Set start date for a date range.
      *
      * @returns Reference to `this` for method chaining
      */
    def setStartDate(): this.type = js.native
    def setStartDate(/**
      * A date instance
      */
    oDate: js.Date): this.type = js.native
    def setStartDate(
      /**
      * A date instance
      */
    oDate: js.Date,
      /**
      * If true, `startDate` is not marked as changed
      */
    bInvalidate: Boolean
    ): this.type = js.native
    def setStartDate(
      /**
      * A date instance
      */
    oDate: Unit,
      /**
      * If true, `startDate` is not marked as changed
      */
    bInvalidate: Boolean
    ): this.type = js.native
    def setStartDate(/**
      * A date instance
      */
    oDate: typings.openui5.sapUiCoreDateUi5dateMod.default): this.type = js.native
    def setStartDate(
      /**
      * A date instance
      */
    oDate: typings.openui5.sapUiCoreDateUi5dateMod.default,
      /**
      * If true, `startDate` is not marked as changed
      */
    bInvalidate: Boolean
    ): this.type = js.native
  }
  
  trait DateRangeSettings
    extends StObject
       with ElementSettings {
    
    /**
      * End date for a date range. If empty only a single date is presented by this DateRange element. This must
      * be a UI5Date or JavaScript Date object.
      */
    var endDate: js.UndefOr[
        js.Object | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Start date for a date range. This must be a UI5Date or JavaScript Date object.
      */
    var startDate: js.UndefOr[
        js.Object | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object DateRangeSettings {
    
    inline def apply(): DateRangeSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DateRangeSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DateRangeSettings] (val x: Self) extends AnyVal {
      
      inline def setEndDate(value: js.Object | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
      
      inline def setEndDateUndefined: Self = StObject.set(x, "endDate", js.undefined)
      
      inline def setStartDate(value: js.Object | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
      
      inline def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
    }
  }
}
