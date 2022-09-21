package typings.nginstackDatasource

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dataSourceColumnDefMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSImport("@nginstack/datasource/lib/DataSourceColumnDef", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with DataSourceColumnDef {
    
    /* CompleteClass */
    var aggregate: String = js.native
    
    /* CompleteClass */
    var alias: String = js.native
    
    /* CompleteClass */
    var backDepth: Double = js.native
    
    /* CompleteClass */
    var coalesceValue: Any = js.native
    
    /* CompleteClass */
    var depth: Double = js.native
    
    /* CompleteClass */
    var distinct: Boolean = js.native
    
    /* CompleteClass */
    var help: String = js.native
    
    /* CompleteClass */
    var pathDepth: Double = js.native
    
    /* CompleteClass */
    var pathHeight: Double = js.native
    
    /* CompleteClass */
    var pathRoot: Double | Null = js.native
    
    /* CompleteClass */
    var pivot: Boolean = js.native
    
    /* CompleteClass */
    var prefix: String | Null = js.native
    
    /* CompleteClass */
    var showGlobalActions: Boolean = js.native
    
    /* private */ /* CompleteClass */
    var sort: Any = js.native
    
    /* CompleteClass */
    var weight: String | Null = js.native
  }
  @JSImport("@nginstack/datasource/lib/DataSourceColumnDef", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object AggregateFunctions {
    
    @JSImport("@nginstack/datasource/lib/DataSourceColumnDef", "AggregateFunctions.AVG")
    @js.native
    val AVG: String = js.native
    
    @JSImport("@nginstack/datasource/lib/DataSourceColumnDef", "AggregateFunctions.COUNT")
    @js.native
    val COUNT: String = js.native
    
    @JSImport("@nginstack/datasource/lib/DataSourceColumnDef", "AggregateFunctions.MAX")
    @js.native
    val MAX: String = js.native
    
    @JSImport("@nginstack/datasource/lib/DataSourceColumnDef", "AggregateFunctions.MIN")
    @js.native
    val MIN: String = js.native
    
    @JSImport("@nginstack/datasource/lib/DataSourceColumnDef", "AggregateFunctions.NONE")
    @js.native
    val NONE: String = js.native
    
    @JSImport("@nginstack/datasource/lib/DataSourceColumnDef", "AggregateFunctions.SUM")
    @js.native
    val SUM: String = js.native
  }
  type AggregateFunctions = String
  
  object Order {
    
    @JSImport("@nginstack/datasource/lib/DataSourceColumnDef", "Order.ASC")
    @js.native
    val ASC: String = js.native
    
    @JSImport("@nginstack/datasource/lib/DataSourceColumnDef", "Order.DESC")
    @js.native
    val DESC: String = js.native
    
    @JSImport("@nginstack/datasource/lib/DataSourceColumnDef", "Order.NONE_1")
    @js.native
    val NONE_1: String = js.native
  }
  type Order = String
  
  trait DataSourceColumnDef extends StObject {
    
    var aggregate: String
    
    var alias: String
    
    var backDepth: Double
    
    var coalesceValue: Any
    
    var depth: Double
    
    var distinct: Boolean
    
    var help: String
    
    var pathDepth: Double
    
    var pathHeight: Double
    
    var pathRoot: Double | Null
    
    var pivot: Boolean
    
    var prefix: String | Null
    
    var showGlobalActions: Boolean
    
    /* private */ var sort: Any
    
    var weight: String | Null
  }
  object DataSourceColumnDef {
    
    inline def apply(
      aggregate: String,
      alias: String,
      backDepth: Double,
      coalesceValue: Any,
      depth: Double,
      distinct: Boolean,
      help: String,
      pathDepth: Double,
      pathHeight: Double,
      pivot: Boolean,
      showGlobalActions: Boolean,
      sort: Any
    ): DataSourceColumnDef = {
      val __obj = js.Dynamic.literal(aggregate = aggregate.asInstanceOf[js.Any], alias = alias.asInstanceOf[js.Any], backDepth = backDepth.asInstanceOf[js.Any], coalesceValue = coalesceValue.asInstanceOf[js.Any], depth = depth.asInstanceOf[js.Any], distinct = distinct.asInstanceOf[js.Any], help = help.asInstanceOf[js.Any], pathDepth = pathDepth.asInstanceOf[js.Any], pathHeight = pathHeight.asInstanceOf[js.Any], pivot = pivot.asInstanceOf[js.Any], showGlobalActions = showGlobalActions.asInstanceOf[js.Any], sort = sort.asInstanceOf[js.Any], pathRoot = null, prefix = null, weight = null)
      __obj.asInstanceOf[DataSourceColumnDef]
    }
    
    extension [Self <: DataSourceColumnDef](x: Self) {
      
      inline def setAggregate(value: String): Self = StObject.set(x, "aggregate", value.asInstanceOf[js.Any])
      
      inline def setAlias(value: String): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
      
      inline def setBackDepth(value: Double): Self = StObject.set(x, "backDepth", value.asInstanceOf[js.Any])
      
      inline def setCoalesceValue(value: Any): Self = StObject.set(x, "coalesceValue", value.asInstanceOf[js.Any])
      
      inline def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
      
      inline def setDistinct(value: Boolean): Self = StObject.set(x, "distinct", value.asInstanceOf[js.Any])
      
      inline def setHelp(value: String): Self = StObject.set(x, "help", value.asInstanceOf[js.Any])
      
      inline def setPathDepth(value: Double): Self = StObject.set(x, "pathDepth", value.asInstanceOf[js.Any])
      
      inline def setPathHeight(value: Double): Self = StObject.set(x, "pathHeight", value.asInstanceOf[js.Any])
      
      inline def setPathRoot(value: Double): Self = StObject.set(x, "pathRoot", value.asInstanceOf[js.Any])
      
      inline def setPathRootNull: Self = StObject.set(x, "pathRoot", null)
      
      inline def setPivot(value: Boolean): Self = StObject.set(x, "pivot", value.asInstanceOf[js.Any])
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixNull: Self = StObject.set(x, "prefix", null)
      
      inline def setShowGlobalActions(value: Boolean): Self = StObject.set(x, "showGlobalActions", value.asInstanceOf[js.Any])
      
      inline def setSort(value: Any): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
      
      inline def setWeight(value: String): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
      
      inline def setWeightNull: Self = StObject.set(x, "weight", null)
    }
  }
}
