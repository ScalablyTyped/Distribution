package typings.mysql.mod

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MysqlError
  extends StObject
     with Error {
  
  /**
    * Either a MySQL server error (e.g. 'ER_ACCESS_DENIED_ERROR'),
    * a node.js error (e.g. 'ECONNREFUSED') or an internal error
    * (e.g. 'PROTOCOL_CONNECTION_LOST').
    */
  var code: String
  
  /**
    * The error number for the error code
    */
  var errno: Double
  
  /**
    * Boolean, indicating if this error is terminal to the connection object.
    */
  var fatal: Boolean
  
  /**
    * The field count
    */
  var fieldCount: js.UndefOr[Double] = js.undefined
  
  /**
    * SQL of failed query
    */
  var sql: js.UndefOr[String] = js.undefined
  
  /**
    * Error message from MySQL
    */
  var sqlMessage: js.UndefOr[String] = js.undefined
  
  /**
    * The sql state
    */
  var sqlState: js.UndefOr[String] = js.undefined
  
  /**
    * The sql state marker
    */
  var sqlStateMarker: js.UndefOr[String] = js.undefined
}
object MysqlError {
  
  @scala.inline
  def apply(code: String, errno: Double, fatal: Boolean, message: String, name: String): MysqlError = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], errno = errno.asInstanceOf[js.Any], fatal = fatal.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[MysqlError]
  }
  
  @scala.inline
  implicit class MysqlErrorMutableBuilder[Self <: MysqlError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrno(value: Double): Self = StObject.set(x, "errno", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFatal(value: Boolean): Self = StObject.set(x, "fatal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldCount(value: Double): Self = StObject.set(x, "fieldCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldCountUndefined: Self = StObject.set(x, "fieldCount", js.undefined)
    
    @scala.inline
    def setSql(value: String): Self = StObject.set(x, "sql", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSqlMessage(value: String): Self = StObject.set(x, "sqlMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSqlMessageUndefined: Self = StObject.set(x, "sqlMessage", js.undefined)
    
    @scala.inline
    def setSqlState(value: String): Self = StObject.set(x, "sqlState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSqlStateMarker(value: String): Self = StObject.set(x, "sqlStateMarker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSqlStateMarkerUndefined: Self = StObject.set(x, "sqlStateMarker", js.undefined)
    
    @scala.inline
    def setSqlStateUndefined: Self = StObject.set(x, "sqlState", js.undefined)
    
    @scala.inline
    def setSqlUndefined: Self = StObject.set(x, "sql", js.undefined)
  }
}
