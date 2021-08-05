package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UsersListEndpoint extends StObject {
  
  /**
    * The integer ID of the last User that you've seen.
    */
  var since: js.UndefOr[String] = js.undefined
}
object UsersListEndpoint {
  
  inline def apply(): UsersListEndpoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UsersListEndpoint]
  }
  
  extension [Self <: UsersListEndpoint](x: Self) {
    
    inline def setSince(value: String): Self = StObject.set(x, "since", value.asInstanceOf[js.Any])
    
    inline def setSinceUndefined: Self = StObject.set(x, "since", js.undefined)
  }
}
