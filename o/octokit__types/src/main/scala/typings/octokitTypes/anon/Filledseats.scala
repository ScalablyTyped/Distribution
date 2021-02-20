package typings.octokitTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Filledseats extends StObject {
  
  var filled_seats: Double = js.native
  
  var name: String = js.native
  
  var private_repos: Double = js.native
  
  var seats: Double = js.native
  
  var space: Double = js.native
}
object Filledseats {
  
  @scala.inline
  def apply(filled_seats: Double, name: String, private_repos: Double, seats: Double, space: Double): Filledseats = {
    val __obj = js.Dynamic.literal(filled_seats = filled_seats.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], private_repos = private_repos.asInstanceOf[js.Any], seats = seats.asInstanceOf[js.Any], space = space.asInstanceOf[js.Any])
    __obj.asInstanceOf[Filledseats]
  }
  
  @scala.inline
  implicit class FilledseatsMutableBuilder[Self <: Filledseats] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilled_seats(value: Double): Self = StObject.set(x, "filled_seats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivate_repos(value: Double): Self = StObject.set(x, "private_repos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeats(value: Double): Self = StObject.set(x, "seats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpace(value: Double): Self = StObject.set(x, "space", value.asInstanceOf[js.Any])
  }
}
