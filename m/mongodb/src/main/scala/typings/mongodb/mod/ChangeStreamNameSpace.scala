package typings.mongodb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChangeStreamNameSpace extends StObject {
  
  var coll: String
  
  var db: String
}
object ChangeStreamNameSpace {
  
  inline def apply(coll: String, db: String): ChangeStreamNameSpace = {
    val __obj = js.Dynamic.literal(coll = coll.asInstanceOf[js.Any], db = db.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeStreamNameSpace]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChangeStreamNameSpace] (val x: Self) extends AnyVal {
    
    inline def setColl(value: String): Self = StObject.set(x, "coll", value.asInstanceOf[js.Any])
    
    inline def setDb(value: String): Self = StObject.set(x, "db", value.asInstanceOf[js.Any])
  }
}
