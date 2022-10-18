package typings.nginstackWebFramework

import org.scalablytyped.runtime.StringDictionary
import typings.nginstackWebFramework.anon.ClassKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDsvDataVisualizationMod {
  
  inline def apply(definition: Any): Unit = ^.asInstanceOf[js.Dynamic].apply(definition.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("@nginstack/web-framework/lib/dsv/DataVisualization", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with DataVisualization {
    def this(definition: Any) = this()
    
    /* protected */ /* CompleteClass */
    override def createMap_(array: js.Array[Any]): StringDictionary[Any] = js.native
    
    /* protected */ /* CompleteClass */
    override def dataSourceOptions_(): Any = js.native
    
    /* CompleteClass */
    var dataSourceQuery: typings.nginstackDatasource.libDataSourceQueryMod.^ = js.native
    
    /* private */ /* CompleteClass */
    var dataSource_ : Any = js.native
    
    /* CompleteClass */
    var filters: typings.nginstackWebFramework.libDsvVisualizationFiltersMod.^ = js.native
    
    /* protected */ /* CompleteClass */
    override def getFiltersForQuerying_(filterValues: Any): js.Array[ClassKey] = js.native
    
    /* CompleteClass */
    override def hasData(): Boolean = js.native
    
    /* CompleteClass */
    var help: String = js.native
    
    /* protected */ /* CompleteClass */
    override def initFilters_(): Unit = js.native
  }
  @JSImport("@nginstack/web-framework/lib/dsv/DataVisualization", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait DataVisualization extends StObject {
    
    /* protected */ def createMap_(array: js.Array[Any]): StringDictionary[Any]
    
    /* protected */ def dataSourceOptions_(): Any
    
    var dataSourceQuery: typings.nginstackDatasource.libDataSourceQueryMod.^
    
    /* private */ var dataSource_ : Any
    
    var filters: typings.nginstackWebFramework.libDsvVisualizationFiltersMod.^
    
    /* protected */ def getFiltersForQuerying_(filterValues: Any): js.Array[ClassKey]
    
    def hasData(): Boolean
    
    var help: String
    
    /* protected */ def initFilters_(): Unit
  }
  object DataVisualization {
    
    inline def apply(
      createMap_ : js.Array[Any] => StringDictionary[Any],
      dataSourceOptions_ : () => Any,
      dataSourceQuery: typings.nginstackDatasource.libDataSourceQueryMod.^,
      dataSource_ : Any,
      filters: typings.nginstackWebFramework.libDsvVisualizationFiltersMod.^,
      getFiltersForQuerying_ : Any => js.Array[ClassKey],
      hasData: () => Boolean,
      help: String,
      initFilters_ : () => Unit
    ): DataVisualization = {
      val __obj = js.Dynamic.literal(createMap_ = js.Any.fromFunction1(createMap_), dataSourceOptions_ = js.Any.fromFunction0(dataSourceOptions_), dataSourceQuery = dataSourceQuery.asInstanceOf[js.Any], dataSource_ = dataSource_.asInstanceOf[js.Any], filters = filters.asInstanceOf[js.Any], getFiltersForQuerying_ = js.Any.fromFunction1(getFiltersForQuerying_), hasData = js.Any.fromFunction0(hasData), help = help.asInstanceOf[js.Any], initFilters_ = js.Any.fromFunction0(initFilters_))
      __obj.asInstanceOf[DataVisualization]
    }
    
    extension [Self <: DataVisualization](x: Self) {
      
      inline def setCreateMap_(value: js.Array[Any] => StringDictionary[Any]): Self = StObject.set(x, "createMap_", js.Any.fromFunction1(value))
      
      inline def setDataSourceOptions_(value: () => Any): Self = StObject.set(x, "dataSourceOptions_", js.Any.fromFunction0(value))
      
      inline def setDataSourceQuery(value: typings.nginstackDatasource.libDataSourceQueryMod.^): Self = StObject.set(x, "dataSourceQuery", value.asInstanceOf[js.Any])
      
      inline def setDataSource_(value: Any): Self = StObject.set(x, "dataSource_", value.asInstanceOf[js.Any])
      
      inline def setFilters(value: typings.nginstackWebFramework.libDsvVisualizationFiltersMod.^): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      inline def setGetFiltersForQuerying_(value: Any => js.Array[ClassKey]): Self = StObject.set(x, "getFiltersForQuerying_", js.Any.fromFunction1(value))
      
      inline def setHasData(value: () => Boolean): Self = StObject.set(x, "hasData", js.Any.fromFunction0(value))
      
      inline def setHelp(value: String): Self = StObject.set(x, "help", value.asInstanceOf[js.Any])
      
      inline def setInitFilters_(value: () => Unit): Self = StObject.set(x, "initFilters_", js.Any.fromFunction0(value))
    }
  }
}
