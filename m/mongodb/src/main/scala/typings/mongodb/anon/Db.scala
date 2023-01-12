package typings.mongodb.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Db extends StObject {
  
  var db: String
}
object Db {
  
  inline def apply(db: String): Db = {
    val __obj = js.Dynamic.literal(db = db.asInstanceOf[js.Any])
    __obj.asInstanceOf[Db]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Db] (val x: Self) extends AnyVal {
    
    inline def setDb(value: String): Self = StObject.set(x, "db", value.asInstanceOf[js.Any])
  }
}
