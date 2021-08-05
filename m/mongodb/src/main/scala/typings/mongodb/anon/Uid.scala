package typings.mongodb.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Uid extends StObject {
  
  var id: js.Any
  
  var uid: js.Any
}
object Uid {
  
  inline def apply(id: js.Any, uid: js.Any): Uid = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Uid]
  }
  
  extension [Self <: Uid](x: Self) {
    
    inline def setId(value: js.Any): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setUid(value: js.Any): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
  }
}
