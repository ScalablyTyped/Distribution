package typings.octokitTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Total extends StObject {
  
  var author: Avatarurl
  
  var total: Double
  
  var weeks: js.Array[A]
}
object Total {
  
  inline def apply(author: Avatarurl, total: Double, weeks: js.Array[A]): Total = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any], weeks = weeks.asInstanceOf[js.Any])
    __obj.asInstanceOf[Total]
  }
  
  extension [Self <: Total](x: Self) {
    
    inline def setAuthor(value: Avatarurl): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    
    inline def setWeeks(value: js.Array[A]): Self = StObject.set(x, "weeks", value.asInstanceOf[js.Any])
    
    inline def setWeeksVarargs(value: A*): Self = StObject.set(x, "weeks", js.Array(value :_*))
  }
}
