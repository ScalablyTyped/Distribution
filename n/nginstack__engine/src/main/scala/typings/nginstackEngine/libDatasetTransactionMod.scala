package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDatasetTransactionMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  inline def apply(opt_database: Connection): Unit = ^.asInstanceOf[js.Dynamic].apply(opt_database.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def apply(opt_database: Database): Unit = ^.asInstanceOf[js.Dynamic].apply(opt_database.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/dataset/Transaction", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with Transaction {
    def this(opt_database: Connection) = this()
    def this(opt_database: Database) = this()
    
    /* CompleteClass */
    override def add(ds: typings.nginstackEngine.libDatasetDataSetMod.^): Unit = js.native
    
    /* CompleteClass */
    override def commit(): Double = js.native
    
    /* CompleteClass */
    override def contains(ds: typings.nginstackEngine.libDatasetDataSetMod.^): Boolean = js.native
    
    /* private */ /* CompleteClass */
    var dataById_ : Any = js.native
    
    /* private */ /* CompleteClass */
    var data_ : Any = js.native
    
    /* private */ /* CompleteClass */
    var database_ : Any = js.native
    
    /* CompleteClass */
    override def get(id: String): typings.nginstackEngine.libDatasetDataSetMod.^ = js.native
    
    /* CompleteClass */
    override def getOrSet(id: String, createFunc: js.Function0[typings.nginstackEngine.libDatasetDataSetMod.^]): Any = js.native
    
    /* CompleteClass */
    override def rollback(): Unit = js.native
    
    /* CompleteClass */
    override def set(id: String, dataSet: typings.nginstackEngine.libDatasetDataSetMod.^): Unit = js.native
  }
  @JSImport("@nginstack/engine/lib/dataset/Transaction", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type Connection = typings.nginstackEngine.libConnectionConnectionMod.^
  
  type Database = typings.nginstackEngine.libDatabaseDatabaseMod.^
  
  trait Transaction extends StObject {
    
    def add(ds: typings.nginstackEngine.libDatasetDataSetMod.^): Unit
    
    def commit(): Double
    
    def contains(ds: typings.nginstackEngine.libDatasetDataSetMod.^): Boolean
    
    /* private */ var dataById_ : Any
    
    /* private */ var data_ : Any
    
    /* private */ var database_ : Any
    
    def get(id: String): typings.nginstackEngine.libDatasetDataSetMod.^
    
    def getOrSet(id: String, createFunc: js.Function0[typings.nginstackEngine.libDatasetDataSetMod.^]): Any
    
    def rollback(): Unit
    
    def set(id: String, dataSet: typings.nginstackEngine.libDatasetDataSetMod.^): Unit
  }
  object Transaction {
    
    inline def apply(
      add: typings.nginstackEngine.libDatasetDataSetMod.^ => Unit,
      commit: () => Double,
      contains: typings.nginstackEngine.libDatasetDataSetMod.^ => Boolean,
      dataById_ : Any,
      data_ : Any,
      database_ : Any,
      get: String => typings.nginstackEngine.libDatasetDataSetMod.^,
      getOrSet: (String, js.Function0[typings.nginstackEngine.libDatasetDataSetMod.^]) => Any,
      rollback: () => Unit,
      set: (String, typings.nginstackEngine.libDatasetDataSetMod.^) => Unit
    ): Transaction = {
      val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), commit = js.Any.fromFunction0(commit), contains = js.Any.fromFunction1(contains), dataById_ = dataById_.asInstanceOf[js.Any], data_ = data_.asInstanceOf[js.Any], database_ = database_.asInstanceOf[js.Any], get = js.Any.fromFunction1(get), getOrSet = js.Any.fromFunction2(getOrSet), rollback = js.Any.fromFunction0(rollback), set = js.Any.fromFunction2(set))
      __obj.asInstanceOf[Transaction]
    }
    
    extension [Self <: Transaction](x: Self) {
      
      inline def setAdd(value: typings.nginstackEngine.libDatasetDataSetMod.^ => Unit): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
      
      inline def setCommit(value: () => Double): Self = StObject.set(x, "commit", js.Any.fromFunction0(value))
      
      inline def setContains(value: typings.nginstackEngine.libDatasetDataSetMod.^ => Boolean): Self = StObject.set(x, "contains", js.Any.fromFunction1(value))
      
      inline def setDataById_(value: Any): Self = StObject.set(x, "dataById_", value.asInstanceOf[js.Any])
      
      inline def setData_(value: Any): Self = StObject.set(x, "data_", value.asInstanceOf[js.Any])
      
      inline def setDatabase_(value: Any): Self = StObject.set(x, "database_", value.asInstanceOf[js.Any])
      
      inline def setGet(value: String => typings.nginstackEngine.libDatasetDataSetMod.^): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      inline def setGetOrSet(value: (String, js.Function0[typings.nginstackEngine.libDatasetDataSetMod.^]) => Any): Self = StObject.set(x, "getOrSet", js.Any.fromFunction2(value))
      
      inline def setRollback(value: () => Unit): Self = StObject.set(x, "rollback", js.Any.fromFunction0(value))
      
      inline def setSet(value: (String, typings.nginstackEngine.libDatasetDataSetMod.^) => Unit): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
    }
  }
}
