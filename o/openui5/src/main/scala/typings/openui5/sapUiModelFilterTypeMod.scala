package typings.openui5

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiModelFilterTypeMod {
  
  /**
    * Enumeration of the possible filter types.
    *
    * Each {@link sap.ui.model.ListBinding list binding} maintains two separate lists of filters: one for filters
    * defined by the control that owns the binding, and another list for filters that an application can define
    * in addition. When executing the filter operation, both sets of filters are combined.
    *
    * See method {@link sap.ui.model.ListBinding#filter ListBinding#filter} on how to specify the filter type.
    * When no filter type is given to that method, the behavior depends on the specific model implementation
    * and should be documented in the API reference for that model.
    */
  @JSImport("sap/ui/model/FilterType", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[FilterType & String] = js.native
    
    /* "Application" */ val Application: typings.openui5.sapUiModelFilterTypeMod.FilterType.Application & String = js.native
    
    /* "Control" */ val Control: typings.openui5.sapUiModelFilterTypeMod.FilterType.Control & String = js.native
  }
  
  @js.native
  sealed trait FilterType extends StObject
  /**
    * Enumeration of the possible filter types.
    *
    * Each {@link sap.ui.model.ListBinding list binding} maintains two separate lists of filters: one for filters
    * defined by the control that owns the binding, and another list for filters that an application can define
    * in addition. When executing the filter operation, both sets of filters are combined.
    *
    * See method {@link sap.ui.model.ListBinding#filter ListBinding#filter} on how to specify the filter type.
    * When no filter type is given to that method, the behavior depends on the specific model implementation
    * and should be documented in the API reference for that model.
    */
  @JSImport("sap/ui/model/FilterType", "FilterType")
  @js.native
  object FilterType extends StObject {
    
    /**
      * Filters which are provided by the application.
      */
    @js.native
    sealed trait Application
      extends StObject
         with FilterType
    
    /**
      * Filters which are set by a control itself.
      *
      * Some controls implement filter capabilities as part of their behavior, e.g. table columns or facet filters.
      * When such controls define filters for a binding, they should use filter type `Control` to keep their
      * filters separated from filters that the application might define in addition.
      */
    @js.native
    sealed trait Control
      extends StObject
         with FilterType
  }
}
