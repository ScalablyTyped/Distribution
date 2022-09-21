package typings.nginstackWebFramework

import typings.nginstackWebFramework.anon.Callback
import typings.nginstackWebFramework.anon.Group
import typings.nginstackWebFramework.anon.PreserveExpressions
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object visualizationFiltersMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSImport("@nginstack/web-framework/lib/dsv/VisualizationFilters", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with VisualizationFilters
  @JSImport("@nginstack/web-framework/lib/dsv/VisualizationFilters", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@nginstack/web-framework/lib/dsv/VisualizationFilters", "DATE_EXPRESSION_PREFIX")
  @js.native
  def DATE_EXPRESSION_PREFIX: String = js.native
  inline def DATE_EXPRESSION_PREFIX_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DATE_EXPRESSION_PREFIX")(x.asInstanceOf[js.Any])
  
  inline def createFilterFields(filtersGrid: Any, dsv: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createFilterFields")(filtersGrid.asInstanceOf[js.Any], dsv.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def createFilterFields(filtersGrid: Any, dsv: Any, opt_options: Callback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createFilterFields")(filtersGrid.asInstanceOf[js.Any], dsv.asInstanceOf[js.Any], opt_options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def evaluateFilterExpressions(filterValues: Record[String, Any]): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("evaluateFilterExpressions")(filterValues.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def getFilterValuesFromGrid(grid: Any, dsv: Any): Record[String, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFilterValuesFromGrid")(grid.asInstanceOf[js.Any], dsv.asInstanceOf[js.Any])).asInstanceOf[Record[String, Any]]
  inline def getFilterValuesFromGrid(grid: Any, dsv: Any, opt_options: PreserveExpressions): Record[String, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFilterValuesFromGrid")(grid.asInstanceOf[js.Any], dsv.asInstanceOf[js.Any], opt_options.asInstanceOf[js.Any])).asInstanceOf[Record[String, Any]]
  
  inline def updateFilterFields(grid: Any, filterValues: Record[String, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateFilterFields")(grid.asInstanceOf[js.Any], filterValues.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type VisualizationFilter = typings.nginstackWebFramework.visualizationFilterMod.^
  
  @js.native
  trait VisualizationFilters extends StObject {
    
    def addFilter(filter: VisualizationFilter): Unit = js.native
    
    def forEach(f: js.Function1[/* arg0 */ VisualizationFilter, Unit]): Unit = js.native
    def forEach(f: js.Function1[/* arg0 */ VisualizationFilter, Unit], opt_obj: Any): Unit = js.native
    
    def getFilter(name: String): VisualizationFilter = js.native
    
    /* private */ var items_ : Any = js.native
    
    def orderedForEach(f: js.Function1[/* arg0 */ VisualizationFilter, Unit]): Unit = js.native
    def orderedForEach(f: js.Function1[/* arg0 */ VisualizationFilter, Unit], opt_obj: Any): Unit = js.native
    
    /* private */ var orderedNames_ : Any = js.native
    
    def toArray(): js.Array[VisualizationFilter] = js.native
    
    def toLayoutHeader(): js.Array[Group] = js.native
    
    def tryGetFilter(name: String): VisualizationFilter = js.native
  }
}
