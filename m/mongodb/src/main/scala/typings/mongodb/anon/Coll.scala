package typings.mongodb.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Coll extends StObject {
  
  var coll: String = js.native
  
  var db: String = js.native
}
object Coll {
  
  @scala.inline
  def apply(coll: String, db: String): Coll = {
    val __obj = js.Dynamic.literal(coll = coll.asInstanceOf[js.Any], db = db.asInstanceOf[js.Any])
    __obj.asInstanceOf[Coll]
  }
  
  @scala.inline
  implicit class CollMutableBuilder[Self <: Coll] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColl(value: String): Self = StObject.set(x, "coll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDb(value: String): Self = StObject.set(x, "db", value.asInstanceOf[js.Any])
  }
}
