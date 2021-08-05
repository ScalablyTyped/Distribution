package typings.mongodb.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Coll extends StObject {
  
  var coll: String
  
  var db: String
}
object Coll {
  
  inline def apply(coll: String, db: String): Coll = {
    val __obj = js.Dynamic.literal(coll = coll.asInstanceOf[js.Any], db = db.asInstanceOf[js.Any])
    __obj.asInstanceOf[Coll]
  }
  
  extension [Self <: Coll](x: Self) {
    
    inline def setColl(value: String): Self = StObject.set(x, "coll", value.asInstanceOf[js.Any])
    
    inline def setDb(value: String): Self = StObject.set(x, "db", value.asInstanceOf[js.Any])
  }
}
