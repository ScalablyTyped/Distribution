package typings.msnodesql

import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("msnodesql", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def open(connectionString: String): Connection = ^.asInstanceOf[js.Dynamic].applyDynamic("open")(connectionString.asInstanceOf[js.Any]).asInstanceOf[Connection]
  inline def open(connectionString: String, callback: OpenCallback): Connection = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(connectionString.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Connection]
  
  inline def query(connectionString: String, query: String): StreamEvents = (^.asInstanceOf[js.Dynamic].applyDynamic("query")(connectionString.asInstanceOf[js.Any], query.asInstanceOf[js.Any])).asInstanceOf[StreamEvents]
  inline def query(connectionString: String, query: String, callback: QueryCallback[Any]): StreamEvents = (^.asInstanceOf[js.Dynamic].applyDynamic("query")(connectionString.asInstanceOf[js.Any], query.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[StreamEvents]
  inline def query(connectionString: String, query: String, params: js.Array[Any]): StreamEvents = (^.asInstanceOf[js.Dynamic].applyDynamic("query")(connectionString.asInstanceOf[js.Any], query.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[StreamEvents]
  inline def query(connectionString: String, query: String, params: js.Array[Any], callback: QueryCallback[Any]): StreamEvents = (^.asInstanceOf[js.Dynamic].applyDynamic("query")(connectionString.asInstanceOf[js.Any], query.asInstanceOf[js.Any], params.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[StreamEvents]
  
  inline def queryRaw(connectionString: String, query: String): StreamEvents = (^.asInstanceOf[js.Dynamic].applyDynamic("queryRaw")(connectionString.asInstanceOf[js.Any], query.asInstanceOf[js.Any])).asInstanceOf[StreamEvents]
  inline def queryRaw(connectionString: String, query: String, callback: QueryRawCallback): StreamEvents = (^.asInstanceOf[js.Dynamic].applyDynamic("queryRaw")(connectionString.asInstanceOf[js.Any], query.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[StreamEvents]
  inline def queryRaw(connectionString: String, query: String, params: js.Array[Any]): StreamEvents = (^.asInstanceOf[js.Dynamic].applyDynamic("queryRaw")(connectionString.asInstanceOf[js.Any], query.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[StreamEvents]
  inline def queryRaw(connectionString: String, query: String, params: js.Array[Any], callback: QueryRawCallback): StreamEvents = (^.asInstanceOf[js.Dynamic].applyDynamic("queryRaw")(connectionString.asInstanceOf[js.Any], query.asInstanceOf[js.Any], params.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[StreamEvents]
  
  inline def query_T[T](connectionString: String, query: String, callback: QueryCallback[T]): StreamEvents = (^.asInstanceOf[js.Dynamic].applyDynamic("query")(connectionString.asInstanceOf[js.Any], query.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[StreamEvents]
  inline def query_T[T](connectionString: String, query: String, params: js.Array[Any], callback: QueryCallback[T]): StreamEvents = (^.asInstanceOf[js.Dynamic].applyDynamic("query")(connectionString.asInstanceOf[js.Any], query.asInstanceOf[js.Any], params.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[StreamEvents]
  
  @js.native
  trait Connection extends StObject {
    
    def beginTransaction(): Any = js.native
    def beginTransaction(callback: ErrorCallback): Any = js.native
    
    def close(): Any = js.native
    def close(callback: ErrorCallback): Any = js.native
    def close(immediately: Boolean): Any = js.native
    def close(immediately: Boolean, callback: ErrorCallback): Any = js.native
    
    def commit(): Any = js.native
    def commit(callback: ErrorCallback): Any = js.native
    
    def query(query: String): StreamEvents = js.native
    def query(query: String, callback: QueryCallback[Any]): StreamEvents = js.native
    def query(query: String, params: js.Array[Any]): StreamEvents = js.native
    def query(query: String, params: js.Array[Any], callback: QueryCallback[Any]): StreamEvents = js.native
    
    def queryRaw(query: String): StreamEvents = js.native
    def queryRaw(query: String, callback: QueryRawCallback): StreamEvents = js.native
    def queryRaw(query: String, params: js.Array[Any]): StreamEvents = js.native
    def queryRaw(query: String, params: js.Array[Any], callback: QueryRawCallback): StreamEvents = js.native
    
    @JSName("query")
    def query_T[T](query: String, callback: QueryCallback[T]): StreamEvents = js.native
    @JSName("query")
    def query_T[T](query: String, params: js.Array[Any], callback: QueryCallback[T]): StreamEvents = js.native
    
    def rollback(): Any = js.native
    def rollback(callback: ErrorCallback): Any = js.native
  }
  
  type ErrorCallback = js.Function1[/* err */ js.Error, Unit]
  
  type OpenCallback = js.Function2[/* err */ js.UndefOr[js.Error], /* connection */ js.UndefOr[Connection], Unit]
  
  type QueryCallback[T] = js.Function3[
    /* err */ js.UndefOr[js.Error], 
    /* results */ js.UndefOr[js.Array[T]], 
    /* more */ js.UndefOr[Boolean], 
    Unit
  ]
  
  type QueryRawCallback = js.Function3[
    /* err */ js.UndefOr[js.Error], 
    /* results */ js.UndefOr[QueryRawResult], 
    /* more */ js.UndefOr[Boolean], 
    Unit
  ]
  
  trait QueryRawColumn extends StObject {
    
    var name: js.UndefOr[String] = js.undefined
  }
  object QueryRawColumn {
    
    inline def apply(): QueryRawColumn = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[QueryRawColumn]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: QueryRawColumn] (val x: Self) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
  
  trait QueryRawResult extends StObject {
    
    var meta: js.Array[QueryRawColumn]
    
    var rows: js.Array[js.Array[Any]]
  }
  object QueryRawResult {
    
    inline def apply(meta: js.Array[QueryRawColumn], rows: js.Array[js.Array[Any]]): QueryRawResult = {
      val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
      __obj.asInstanceOf[QueryRawResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: QueryRawResult] (val x: Self) extends AnyVal {
      
      inline def setMeta(value: js.Array[QueryRawColumn]): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setMetaVarargs(value: QueryRawColumn*): Self = StObject.set(x, "meta", js.Array(value*))
      
      inline def setRows(value: js.Array[js.Array[Any]]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
      
      inline def setRowsVarargs(value: js.Array[Any]*): Self = StObject.set(x, "rows", js.Array(value*))
    }
  }
  
  type StreamEvents = EventEmitter
}
