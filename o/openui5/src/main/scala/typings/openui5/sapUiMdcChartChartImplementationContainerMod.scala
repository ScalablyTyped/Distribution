package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiCoreLibraryMod.ID
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiMdcChartChartImplementationContainerMod {
  
  @JSImport("sap/ui/mdc/chart/ChartImplementationContainer", JSImport.Default)
  @js.native
  /**
    * Constructor for a new ChartImplementationContainer.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends ChartImplementationContainer {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: ChartImplementationContainerSettings) = this()
    def this(/**
      * ID for the new control, generated automatically if no id is given
      */
    sId: String) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no id is given
      */
    sId: String,
      /**
      * Initial settings for the new control
      */
    mSettings: ChartImplementationContainerSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no id is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: ChartImplementationContainerSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/mdc/chart/ChartImplementationContainer", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.mdc.chart.ChartImplementationContainer with name `sClassName`
      * and enriches it with the information contained in `oClassInfo`.
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
    oClassInfo: ClassInfo[T, ChartImplementationContainer]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, ChartImplementationContainer],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.mdc.chart.ChartImplementationContainer.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait ChartImplementationContainer
    extends typings.openui5.sapUiCoreControlMod.default {
    
    /**
      * Destroys the content in the aggregation {@link #getContent content}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyContent(): this.type = js.native
    
    /**
      * Destroys the noDataContent in the aggregation {@link #getNoDataContent noDataContent}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyNoDataContent(): this.type = js.native
    
    /**
      * ID of the element which is the current target of the association {@link #getChartNoDataContent chartNoDataContent},
      * or `null`.
      */
    def getChartNoDataContent(): ID = js.native
    
    /**
      * Gets content of aggregation {@link #getContent content}.
      *
      * Content/Chart to be visualized.
      */
    def getContent(): typings.openui5.sapUiCoreControlMod.default = js.native
    
    /**
      * Gets content of aggregation {@link #getNoDataContent noDataContent}.
      *
      * Control that is shown when there is no data available inside the chart.
      *  This can be used if the standard behavior of the used chart control needs to be overriden.
      *  To show this `noDataContent`, set {@link ap.ui.mdc.chart.ChartImplementationContainer#showNoDataStruct showNoDataStruct}.
      */
    def getNoDataContent(): typings.openui5.sapUiCoreControlMod.default = js.native
    
    /**
      * Gets current value of property {@link #getShowNoDataStruct showNoDataStruct}.
      *
      * Toggles the visibility of the noDataContent & content
      *
      * Default value is `true`.
      *
      * @returns Value of property `showNoDataStruct`
      */
    def getShowNoDataStruct(): Boolean = js.native
  }
  
  trait ChartImplementationContainerSettings
    extends StObject
       with ControlSettings {
    
    /**
      * Association to `noData` content set in the chart.
      *  If set, this will be used instead of the `noDataContent` aggregation.
      */
    var chartNoDataContent: js.UndefOr[typings.openui5.sapUiCoreControlMod.default | String] = js.undefined
    
    /**
      * Content/Chart to be visualized.
      */
    var content: js.UndefOr[typings.openui5.sapUiCoreControlMod.default] = js.undefined
    
    /**
      * Control that is shown when there is no data available inside the chart.
      *  This can be used if the standard behavior of the used chart control needs to be overriden.
      *  To show this `noDataContent`, set {@link ap.ui.mdc.chart.ChartImplementationContainer#showNoDataStruct showNoDataStruct}.
      */
    var noDataContent: js.UndefOr[typings.openui5.sapUiCoreControlMod.default] = js.undefined
    
    /**
      * Toggles the visibility of the noDataContent & content
      */
    var showNoDataStruct: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object ChartImplementationContainerSettings {
    
    inline def apply(): ChartImplementationContainerSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChartImplementationContainerSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ChartImplementationContainerSettings] (val x: Self) extends AnyVal {
      
      inline def setChartNoDataContent(value: typings.openui5.sapUiCoreControlMod.default | String): Self = StObject.set(x, "chartNoDataContent", value.asInstanceOf[js.Any])
      
      inline def setChartNoDataContentUndefined: Self = StObject.set(x, "chartNoDataContent", js.undefined)
      
      inline def setContent(value: typings.openui5.sapUiCoreControlMod.default): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setNoDataContent(value: typings.openui5.sapUiCoreControlMod.default): Self = StObject.set(x, "noDataContent", value.asInstanceOf[js.Any])
      
      inline def setNoDataContentUndefined: Self = StObject.set(x, "noDataContent", js.undefined)
      
      inline def setShowNoDataStruct(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showNoDataStruct", value.asInstanceOf[js.Any])
      
      inline def setShowNoDataStructUndefined: Self = StObject.set(x, "showNoDataStruct", js.undefined)
    }
  }
}
