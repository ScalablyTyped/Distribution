package typings.maximMazurokGapiClientGameservices.gapi.client.gameservices

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TargetState extends StObject {
  
  /** Details about Agones fleets. */
  var details: js.UndefOr[js.Array[TargetDetails]] = js.undefined
}
object TargetState {
  
  inline def apply(): TargetState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetState]
  }
  
  extension [Self <: TargetState](x: Self) {
    
    inline def setDetails(value: js.Array[TargetDetails]): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    inline def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
    
    inline def setDetailsVarargs(value: TargetDetails*): Self = StObject.set(x, "details", js.Array(value :_*))
  }
}
