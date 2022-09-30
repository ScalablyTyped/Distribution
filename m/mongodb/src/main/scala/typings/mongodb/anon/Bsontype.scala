package typings.mongodb.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bsontype extends StObject {
  
  var _bsontype: String
}
object Bsontype {
  
  inline def apply(_bsontype: String): Bsontype = {
    val __obj = js.Dynamic.literal(_bsontype = _bsontype.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bsontype]
  }
  
  extension [Self <: Bsontype](x: Self) {
    
    inline def set_bsontype(value: String): Self = StObject.set(x, "_bsontype", value.asInstanceOf[js.Any])
  }
}
