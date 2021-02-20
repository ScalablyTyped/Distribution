package typings.msnodesql

import typings.node.eventsMod.EventEmitter
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("msnodesql", "open")
  @js.native
  def open(connectionString: String): Connection = js.native
  @JSImport("msnodesql", "open")
  @js.native
  def open(connectionString: String, callback: OpenCallback): Connection = js.native
  
  @JSImport("msnodesql", "query")
  @js.native
  def query(connectionString: String, query: String): StreamEvents = js.native
  @JSImport("msnodesql", "query")
  @js.native
  def query(connectionString: String, query: String, callback: QueryCallback[_]): StreamEvents = js.native
  @JSImport("msnodesql", "query")
  @js.native
  def query(connectionString: String, query: String, params: js.Array[_]): StreamEvents = js.native
  @JSImport("msnodesql", "query")
  @js.native
  def query(connectionString: String, query: String, params: js.Array[_], callback: QueryCallback[_]): StreamEvents = js.native
  
  @JSImport("msnodesql", "queryRaw")
  @js.native
  def queryRaw(connectionString: String, query: String): StreamEvents = js.native
  @JSImport("msnodesql", "queryRaw")
  @js.native
  def queryRaw(connectionString: String, query: String, callback: QueryRawCallback): StreamEvents = js.native
  @JSImport("msnodesql", "queryRaw")
  @js.native
  def queryRaw(connectionString: String, query: String, params: js.Array[_]): StreamEvents = js.native
  @JSImport("msnodesql", "queryRaw")
  @js.native
  def queryRaw(connectionString: String, query: String, params: js.Array[_], callback: QueryRawCallback): StreamEvents = js.native
  
  @JSImport("msnodesql", "query")
  @js.native
  def query_T[T](connectionString: String, query: String, callback: QueryCallback[T]): StreamEvents = js.native
  @JSImport("msnodesql", "query")
  @js.native
  def query_T[T](connectionString: String, query: String, params: js.Array[_], callback: QueryCallback[T]): StreamEvents = js.native
  
  @js.native
  trait Connection extends StObject {
    
    def beginTransaction(): js.Any = js.native
    def beginTransaction(callback: ErrorCallback): js.Any = js.native
    
    def close(): js.Any = js.native
    def close(callback: ErrorCallback): js.Any = js.native
    def close(immediately: Boolean): js.Any = js.native
    def close(immediately: Boolean, callback: ErrorCallback): js.Any = js.native
    
    def commit(): js.Any = js.native
    def commit(callback: ErrorCallback): js.Any = js.native
    
    def query(query: String): StreamEvents = js.native
    def query(query: String, callback: QueryCallback[_]): StreamEvents = js.native
    def query(query: String, params: js.Array[_]): StreamEvents = js.native
    def query(query: String, params: js.Array[_], callback: QueryCallback[_]): StreamEvents = js.native
    
    def queryRaw(query: String): StreamEvents = js.native
    def queryRaw(query: String, callback: QueryRawCallback): StreamEvents = js.native
    def queryRaw(query: String, params: js.Array[_]): StreamEvents = js.native
    def queryRaw(query: String, params: js.Array[_], callback: QueryRawCallback): StreamEvents = js.native
    
    @JSName("query")
    def query_T[T](query: String, callback: QueryCallback[T]): StreamEvents = js.native
    @JSName("query")
    def query_T[T](query: String, params: js.Array[_], callback: QueryCallback[T]): StreamEvents = js.native
    
    def rollback(): js.Any = js.native
    def rollback(callback: ErrorCallback): js.Any = js.native
  }
  
  type ErrorCallback = js.Function1[/* err */ Error, Unit]
  
  type OpenCallback = js.Function2[/* err */ js.UndefOr[Error], /* connection */ js.UndefOr[Connection], Unit]
  
  type QueryCallback[T] = js.Function3[
    /* err */ js.UndefOr[Error], 
    /* results */ js.UndefOr[js.Array[T]], 
    /* more */ js.UndefOr[Boolean], 
    Unit
  ]
  
  type QueryRawCallback = js.Function3[
    /* err */ js.UndefOr[Error], 
    /* results */ js.UndefOr[QueryRawResult], 
    /* more */ js.UndefOr[Boolean], 
    Unit
  ]
  
  @js.native
  trait QueryRawColumn extends StObject {
    
    var name: js.UndefOr[String] = js.native
  }
  object QueryRawColumn {
    
    @scala.inline
    def apply(): QueryRawColumn = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[QueryRawColumn]
    }
    
    @scala.inline
    implicit class QueryRawColumnMutableBuilder[Self <: QueryRawColumn] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
  
  @js.native
  trait QueryRawResult extends StObject {
    
    var meta: js.Array[QueryRawColumn] = js.native
    
    var rows: js.Array[js.Array[_]] = js.native
  }
  object QueryRawResult {
    
    @scala.inline
    def apply(meta: js.Array[QueryRawColumn], rows: js.Array[js.Array[_]]): QueryRawResult = {
      val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
      __obj.asInstanceOf[QueryRawResult]
    }
    
    @scala.inline
    implicit class QueryRawResultMutableBuilder[Self <: QueryRawResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMeta(value: js.Array[QueryRawColumn]): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetaVarargs(value: QueryRawColumn*): Self = StObject.set(x, "meta", js.Array(value :_*))
      
      @scala.inline
      def setRows(value: js.Array[js.Array[_]]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowsVarargs(value: js.Array[js.Any]*): Self = StObject.set(x, "rows", js.Array(value :_*))
    }
  }
  
  type StreamEvents = EventEmitter
}
