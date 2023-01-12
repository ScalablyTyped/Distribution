package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Log extends StObject {
  
  /**
    * Public key of the CT Log encoded in BASE-64 format
    */
  var key: String
  
  /**
    * Identifier of the CT Log encoded in BASE-64 format
    */
  var log_id: String
}
object Log {
  
  inline def apply(key: String, log_id: String): Log = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], log_id = log_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Log]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Log] (val x: Self) extends AnyVal {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setLog_id(value: String): Self = StObject.set(x, "log_id", value.asInstanceOf[js.Any])
  }
}
