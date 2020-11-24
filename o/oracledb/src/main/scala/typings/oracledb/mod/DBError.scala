package typings.oracledb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DBError extends js.Object {
  
  /**
    * The Oracle error number. This value is undefined for non-Oracle errors and for messages prefixed with NJS or DPI.
    */
  var errorNum: js.UndefOr[Double] = js.native
  
  /**
    * The text of the error message.
    *
    * The error may be a standard Oracle message with a prefix like ORA or PLS.
    *
    * Alternatively it may be a node-oracledb specific error prefixed with NJS or DPI.
    */
  var message: String = js.native
  
  /**
    * Generally offset is the character offset into the SQL text that resulted in the Oracle error.
    *
    * The value may be 0 in non-SQL contexts. This value is undefined for non-Oracle errors and for messages prefixed with NJS or DPI.
    */
  var offset: js.UndefOr[Double] = js.native
}
object DBError {
  
  @scala.inline
  def apply(message: String): DBError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[DBError]
  }
  
  @scala.inline
  implicit class DBErrorOps[Self <: DBError] (val x: Self) extends AnyVal {
    
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
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorNum(value: Double): Self = this.set("errorNum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorNum: Self = this.set("errorNum", js.undefined)
    
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
  }
}
