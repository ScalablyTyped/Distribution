package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReposListPublicEndpoint extends StObject {
  
  /**
    * The integer ID of the last repository that you've seen.
    */
  var since: js.UndefOr[Double] = js.undefined
}
object ReposListPublicEndpoint {
  
  inline def apply(): ReposListPublicEndpoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReposListPublicEndpoint]
  }
  
  extension [Self <: ReposListPublicEndpoint](x: Self) {
    
    inline def setSince(value: Double): Self = StObject.set(x, "since", value.asInstanceOf[js.Any])
    
    inline def setSinceUndefined: Self = StObject.set(x, "since", js.undefined)
  }
}
