package typings.plugapi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FollowJoinData extends StObject {
  
  var id: String
  
  var r: Double
  
  var un: String
}
object FollowJoinData {
  
  inline def apply(id: String, r: Double, un: String): FollowJoinData = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any], un = un.asInstanceOf[js.Any])
    __obj.asInstanceOf[FollowJoinData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FollowJoinData] (val x: Self) extends AnyVal {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setR(value: Double): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
    
    inline def setUn(value: String): Self = StObject.set(x, "un", value.asInstanceOf[js.Any])
  }
}
