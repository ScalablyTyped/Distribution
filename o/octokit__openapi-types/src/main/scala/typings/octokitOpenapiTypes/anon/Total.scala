package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Total extends StObject {
  
  var author: Avatarurl | Null
  
  /** @example 135 */
  var total: Double
  
  /**
    * @example [
    *   {
    *     "w": "1367712000",
    *     "a": 6898,
    *     "d": 77,
    *     "c": 10
    *   }
    * ]
    */
  var weeks: js.Array[A]
}
object Total {
  
  inline def apply(total: Double, weeks: js.Array[A]): Total = {
    val __obj = js.Dynamic.literal(total = total.asInstanceOf[js.Any], weeks = weeks.asInstanceOf[js.Any], author = null)
    __obj.asInstanceOf[Total]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Total] (val x: Self) extends AnyVal {
    
    inline def setAuthor(value: Avatarurl): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    inline def setAuthorNull: Self = StObject.set(x, "author", null)
    
    inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    
    inline def setWeeks(value: js.Array[A]): Self = StObject.set(x, "weeks", value.asInstanceOf[js.Any])
    
    inline def setWeeksVarargs(value: A*): Self = StObject.set(x, "weeks", js.Array(value*))
  }
}
