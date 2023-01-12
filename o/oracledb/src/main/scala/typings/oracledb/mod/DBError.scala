package typings.oracledb.mod

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DBError
  extends StObject
     with Error {
  
  /**
    * The Oracle error number. This value is undefined for non-Oracle errors and for messages prefixed with NJS or DPI.
    */
  var errorNum: js.UndefOr[Double] = js.undefined
  
  /**
    * Generally offset is the character offset into the SQL text that resulted in the Oracle error.
    *
    * The value may be 0 in non-SQL contexts. This value is undefined for non-Oracle errors and for messages prefixed with NJS or DPI.
    */
  var offset: js.UndefOr[Double] = js.undefined
}
object DBError {
  
  inline def apply(message: String, name: String): DBError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DBError]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DBError] (val x: Self) extends AnyVal {
    
    inline def setErrorNum(value: Double): Self = StObject.set(x, "errorNum", value.asInstanceOf[js.Any])
    
    inline def setErrorNumUndefined: Self = StObject.set(x, "errorNum", js.undefined)
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
  }
}
