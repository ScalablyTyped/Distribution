package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Filledseats extends StObject {
  
  var filled_seats: js.UndefOr[Double] = js.undefined
  
  var name: String
  
  var private_repos: Double
  
  var seats: js.UndefOr[Double] = js.undefined
  
  var space: Double
}
object Filledseats {
  
  inline def apply(name: String, private_repos: Double, space: Double): Filledseats = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], private_repos = private_repos.asInstanceOf[js.Any], space = space.asInstanceOf[js.Any])
    __obj.asInstanceOf[Filledseats]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Filledseats] (val x: Self) extends AnyVal {
    
    inline def setFilled_seats(value: Double): Self = StObject.set(x, "filled_seats", value.asInstanceOf[js.Any])
    
    inline def setFilled_seatsUndefined: Self = StObject.set(x, "filled_seats", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPrivate_repos(value: Double): Self = StObject.set(x, "private_repos", value.asInstanceOf[js.Any])
    
    inline def setSeats(value: Double): Self = StObject.set(x, "seats", value.asInstanceOf[js.Any])
    
    inline def setSeatsUndefined: Self = StObject.set(x, "seats", js.undefined)
    
    inline def setSpace(value: Double): Self = StObject.set(x, "space", value.asInstanceOf[js.Any])
  }
}
