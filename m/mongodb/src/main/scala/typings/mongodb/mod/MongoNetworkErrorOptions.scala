package typings.mongodb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MongoNetworkErrorOptions extends StObject {
  
  /** Indicates the timeout happened before a connection handshake completed */
  var beforeHandshake: Boolean
}
object MongoNetworkErrorOptions {
  
  inline def apply(beforeHandshake: Boolean): MongoNetworkErrorOptions = {
    val __obj = js.Dynamic.literal(beforeHandshake = beforeHandshake.asInstanceOf[js.Any])
    __obj.asInstanceOf[MongoNetworkErrorOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MongoNetworkErrorOptions] (val x: Self) extends AnyVal {
    
    inline def setBeforeHandshake(value: Boolean): Self = StObject.set(x, "beforeHandshake", value.asInstanceOf[js.Any])
  }
}
