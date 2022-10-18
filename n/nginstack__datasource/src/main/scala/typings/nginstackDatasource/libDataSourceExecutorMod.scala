package typings.nginstackDatasource

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDataSourceExecutorMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSImport("@nginstack/datasource/lib/DataSourceExecutor", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with DataSourceExecutor {
    
    /* private */ /* CompleteClass */
    var addDataSource: Any = js.native
    
    /* private */ /* CompleteClass */
    var dataSources_ : Any = js.native
    
    /* CompleteClass */
    override def execute(): Unit = js.native
    
    /* CompleteClass */
    override def getDataSet(index: Double): DataSet = js.native
  }
  @JSImport("@nginstack/datasource/lib/DataSourceExecutor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type DataSet = typings.nginstackEngine.libDatasetDataSetMod.^
  
  trait DataSourceExecutor extends StObject {
    
    /* private */ var addDataSource: Any
    
    /* private */ var dataSources_ : Any
    
    def execute(): Unit
    
    def getDataSet(index: Double): DataSet
  }
  object DataSourceExecutor {
    
    inline def apply(addDataSource: Any, dataSources_ : Any, execute: () => Unit, getDataSet: Double => DataSet): DataSourceExecutor = {
      val __obj = js.Dynamic.literal(addDataSource = addDataSource.asInstanceOf[js.Any], dataSources_ = dataSources_.asInstanceOf[js.Any], execute = js.Any.fromFunction0(execute), getDataSet = js.Any.fromFunction1(getDataSet))
      __obj.asInstanceOf[DataSourceExecutor]
    }
    
    extension [Self <: DataSourceExecutor](x: Self) {
      
      inline def setAddDataSource(value: Any): Self = StObject.set(x, "addDataSource", value.asInstanceOf[js.Any])
      
      inline def setDataSources_(value: Any): Self = StObject.set(x, "dataSources_", value.asInstanceOf[js.Any])
      
      inline def setExecute(value: () => Unit): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
      
      inline def setGetDataSet(value: Double => DataSet): Self = StObject.set(x, "getDataSet", js.Any.fromFunction1(value))
    }
  }
}
