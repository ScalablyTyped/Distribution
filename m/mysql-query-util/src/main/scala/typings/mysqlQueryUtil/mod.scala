package typings.mysqlQueryUtil

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("mysql-query-util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def delete(options: IterableOptions): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("delete")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
  inline def delete(tableName: String): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("delete")(tableName.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
  inline def delete(tableName: String, params: js.Array[js.Array[String | Double]]): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("delete")(tableName.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  
  inline def insert(options: IterableOptions): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("insert")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
  inline def insert(tableName: String, data: js.Object): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("insert")(tableName.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  
  inline def query(queryType: String, tableName: String): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("query")(queryType.asInstanceOf[js.Any], tableName.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def query(queryType: String, tableName: String, fields: Any): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("query")(queryType.asInstanceOf[js.Any], tableName.asInstanceOf[js.Any], fields.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def query(queryType: String, tableName: String, fields: Any, data: Any): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("query")(queryType.asInstanceOf[js.Any], tableName.asInstanceOf[js.Any], fields.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def query(queryType: String, tableName: String, fields: Any, data: Any, params: Any): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("query")(queryType.asInstanceOf[js.Any], tableName.asInstanceOf[js.Any], fields.asInstanceOf[js.Any], data.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def query(queryType: String, tableName: String, fields: Any, data: Unit, params: Any): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("query")(queryType.asInstanceOf[js.Any], tableName.asInstanceOf[js.Any], fields.asInstanceOf[js.Any], data.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def query(queryType: String, tableName: String, fields: Unit, data: Any): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("query")(queryType.asInstanceOf[js.Any], tableName.asInstanceOf[js.Any], fields.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def query(queryType: String, tableName: String, fields: Unit, data: Any, params: Any): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("query")(queryType.asInstanceOf[js.Any], tableName.asInstanceOf[js.Any], fields.asInstanceOf[js.Any], data.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def query(queryType: String, tableName: String, fields: Unit, data: Unit, params: Any): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("query")(queryType.asInstanceOf[js.Any], tableName.asInstanceOf[js.Any], fields.asInstanceOf[js.Any], data.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  
  inline def select(options: IterableOptions): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("select")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
  inline def select(tableName: String): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("select")(tableName.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
  inline def select(tableName: String, fields: js.Array[String]): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("select")(tableName.asInstanceOf[js.Any], fields.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def select(tableName: String, fields: js.Array[String], params: js.Array[js.Array[String | Double]]): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("select")(tableName.asInstanceOf[js.Any], fields.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def select(tableName: String, fields: Unit, params: js.Array[js.Array[String | Double]]): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("select")(tableName.asInstanceOf[js.Any], fields.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  
  inline def setConnection(options: connectionString): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("setConnection")(options.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def update(option: IterableOptions): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("update")(option.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
  inline def update(tableName: String, data: js.Object, params: js.Array[js.Array[String | Double]]): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(tableName.asInstanceOf[js.Any], data.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  
  trait IterableOptions extends StObject {
    
    var data: js.UndefOr[js.Object] = js.undefined
    
    var fields: js.UndefOr[js.Array[String]] = js.undefined
    
    var params: js.UndefOr[js.Array[js.Array[String | Double]]] = js.undefined
    
    var tableName: String
  }
  object IterableOptions {
    
    inline def apply(tableName: String): IterableOptions = {
      val __obj = js.Dynamic.literal(tableName = tableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[IterableOptions]
    }
    
    extension [Self <: IterableOptions](x: Self) {
      
      inline def setData(value: js.Object): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setFields(value: js.Array[String]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
      
      inline def setFieldsVarargs(value: String*): Self = StObject.set(x, "fields", js.Array(value*))
      
      inline def setParams(value: js.Array[js.Array[String | Double]]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      inline def setParamsVarargs(value: (js.Array[String | Double])*): Self = StObject.set(x, "params", js.Array(value*))
      
      inline def setTableName(value: String): Self = StObject.set(x, "tableName", value.asInstanceOf[js.Any])
    }
  }
  
  trait connectionString extends StObject {
    
    /**
      * The maximum number of connections to create at once. (Default: 10)
      */
    var connectionLimit: js.UndefOr[Double] = js.undefined
    
    /**
      * Name of the database to use for this connection
      */
    var database: String
    
    /**
      * The hostname of the database you are connecting to. (Default: localhost)
      */
    var host: String
    
    /**
      * The password of that MySQL user
      */
    var password: String
    
    /**
      * The MySQL user to authenticate as
      */
    var user: String
  }
  object connectionString {
    
    inline def apply(database: String, host: String, password: String, user: String): connectionString = {
      val __obj = js.Dynamic.literal(database = database.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
      __obj.asInstanceOf[connectionString]
    }
    
    extension [Self <: connectionString](x: Self) {
      
      inline def setConnectionLimit(value: Double): Self = StObject.set(x, "connectionLimit", value.asInstanceOf[js.Any])
      
      inline def setConnectionLimitUndefined: Self = StObject.set(x, "connectionLimit", js.undefined)
      
      inline def setDatabase(value: String): Self = StObject.set(x, "database", value.asInstanceOf[js.Any])
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      inline def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    }
  }
}
