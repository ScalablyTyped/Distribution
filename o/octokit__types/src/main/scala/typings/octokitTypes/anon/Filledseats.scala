package typings.octokitTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Filledseats extends StObject {
  
  var filled_seats: Double
  
  var name: String
  
  var private_repos: Double
  
  var seats: Double
  
  var space: Double
}
object Filledseats {
  
  inline def apply(filled_seats: Double, name: String, private_repos: Double, seats: Double, space: Double): Filledseats = {
    val __obj = js.Dynamic.literal(filled_seats = filled_seats.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], private_repos = private_repos.asInstanceOf[js.Any], seats = seats.asInstanceOf[js.Any], space = space.asInstanceOf[js.Any])
    __obj.asInstanceOf[Filledseats]
  }
  
  extension [Self <: Filledseats](x: Self) {
    
    inline def setFilled_seats(value: Double): Self = StObject.set(x, "filled_seats", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPrivate_repos(value: Double): Self = StObject.set(x, "private_repos", value.asInstanceOf[js.Any])
    
    inline def setSeats(value: Double): Self = StObject.set(x, "seats", value.asInstanceOf[js.Any])
    
    inline def setSpace(value: Double): Self = StObject.set(x, "space", value.asInstanceOf[js.Any])
  }
}
