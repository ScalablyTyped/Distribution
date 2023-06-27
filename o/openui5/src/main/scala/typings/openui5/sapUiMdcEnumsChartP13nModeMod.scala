package typings.openui5

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiMdcEnumsChartP13nModeMod {
  
  /**
    * @since 1.115
    *
    * Defines the personalization mode of the chart.
    */
  @JSImport("sap/ui/mdc/enums/ChartP13nMode", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ChartP13nMode & String] = js.native
    
    /* "Filter" */ val Filter: typings.openui5.sapUiMdcEnumsChartP13nModeMod.ChartP13nMode.Filter & String = js.native
    
    /* "Item" */ val Item: typings.openui5.sapUiMdcEnumsChartP13nModeMod.ChartP13nMode.Item & String = js.native
    
    /* "Sort" */ val Sort: typings.openui5.sapUiMdcEnumsChartP13nModeMod.ChartP13nMode.Sort & String = js.native
    
    /* "Type" */ val Type: typings.openui5.sapUiMdcEnumsChartP13nModeMod.ChartP13nMode.Type & String = js.native
  }
  
  @js.native
  sealed trait ChartP13nMode extends StObject
  /**
    * @since 1.115
    *
    * Defines the personalization mode of the chart.
    */
  @JSImport("sap/ui/mdc/enums/ChartP13nMode", "ChartP13nMode")
  @js.native
  object ChartP13nMode extends StObject {
    
    /**
      * Filter personalization is enabled.
      */
    @js.native
    sealed trait Filter
      extends StObject
         with ChartP13nMode
    
    /**
      * Item personalization is enabled.
      */
    @js.native
    sealed trait Item
      extends StObject
         with ChartP13nMode
    
    /**
      * Sort personalization is enabled.
      */
    @js.native
    sealed trait Sort
      extends StObject
         with ChartP13nMode
    
    /**
      * Chart type personalization is enabled.
      */
    @js.native
    sealed trait Type
      extends StObject
         with ChartP13nMode
  }
}
