package typings.openui5

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiMdcEnumsChartToolbarActionTypeMod {
  
  /**
    * @since 1.115
    *
    * Defines the types of chart actions in the toolbar.
    *  Can be used to remove some of the default `ToolbarAction`. For more information, see @link sap.ui.mdc.Chart#ignoreToolbarActions}.
    */
  @JSImport("sap/ui/mdc/enums/ChartToolbarActionType", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ChartToolbarActionType & String] = js.native
    
    /* "DrillDownUp" */ val DrillDownUp: typings.openui5.sapUiMdcEnumsChartToolbarActionTypeMod.ChartToolbarActionType.DrillDownUp & String = js.native
    
    /* "FullScreen" */ val FullScreen: typings.openui5.sapUiMdcEnumsChartToolbarActionTypeMod.ChartToolbarActionType.FullScreen & String = js.native
    
    /* "Legend" */ val Legend: typings.openui5.sapUiMdcEnumsChartToolbarActionTypeMod.ChartToolbarActionType.Legend & String = js.native
    
    /* "ZoomInOut" */ val ZoomInOut: typings.openui5.sapUiMdcEnumsChartToolbarActionTypeMod.ChartToolbarActionType.ZoomInOut & String = js.native
  }
  
  @js.native
  sealed trait ChartToolbarActionType extends StObject
  /**
    * @since 1.115
    *
    * Defines the types of chart actions in the toolbar.
    *  Can be used to remove some of the default `ToolbarAction`. For more information, see @link sap.ui.mdc.Chart#ignoreToolbarActions}.
    */
  @JSImport("sap/ui/mdc/enums/ChartToolbarActionType", "ChartToolbarActionType")
  @js.native
  object ChartToolbarActionType extends StObject {
    
    /**
      * Drill-down and drill-up action.
      */
    @js.native
    sealed trait DrillDownUp
      extends StObject
         with ChartToolbarActionType
    
    /**
      * Full screen action.
      */
    @js.native
    sealed trait FullScreen
      extends StObject
         with ChartToolbarActionType
    
    /**
      * Legend action.
      */
    @js.native
    sealed trait Legend
      extends StObject
         with ChartToolbarActionType
    
    /**
      * Zoom-in and zoom-out action.
      */
    @js.native
    sealed trait ZoomInOut
      extends StObject
         with ChartToolbarActionType
  }
}
