package typings.mysql2.queryMod

import typings.node.NodeJS.ErrnoException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueryError extends ErrnoException {
  
  /**
    * Either a MySQL server error (e.g. 'ER_ACCESS_DENIED_ERROR'),
    * a node.js error (e.g. 'ECONNREFUSED') or an internal error
    * (e.g. 'PROTOCOL_CONNECTION_LOST').
    */
  @JSName("code")
  var code_QueryError: String = js.native
  
  /**
    * Boolean, indicating if this error is terminal to the connection object.
    */
  var fatal: Boolean = js.native
  
  /**
    * The field count
    */
  var fieldCount: js.UndefOr[Double] = js.native
  
  /**
    * The sql state
    */
  var sqlState: js.UndefOr[String] = js.native
  
  /**
    * The sql state marker
    */
  var sqlStateMarker: js.UndefOr[String] = js.native
}
object QueryError {
  
  @scala.inline
  def apply(code: String, fatal: Boolean, message: String, name: String): QueryError = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], fatal = fatal.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryError]
  }
  
  @scala.inline
  implicit class QueryErrorOps[Self <: QueryError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCode(value: String): Self = this.set("code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFatal(value: Boolean): Self = this.set("fatal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldCount(value: Double): Self = this.set("fieldCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFieldCount: Self = this.set("fieldCount", js.undefined)
    
    @scala.inline
    def setSqlState(value: String): Self = this.set("sqlState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSqlState: Self = this.set("sqlState", js.undefined)
    
    @scala.inline
    def setSqlStateMarker(value: String): Self = this.set("sqlStateMarker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSqlStateMarker: Self = this.set("sqlStateMarker", js.undefined)
  }
}
