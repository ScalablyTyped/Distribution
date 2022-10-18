package typings.next.anon

import typings.next.distClientComponentsReducerMod.FocusAndScrollRef
import typings.next.distServerAppRenderMod.FlightData
import typings.next.distServerAppRenderMod.FlightRouterState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChangeByServerResponse extends StObject {
  
  def changeByServerResponse(previousTree: FlightRouterState, flightData: FlightData): Unit
  
  var focusAndScrollRef: FocusAndScrollRef
  
  var tree: FlightRouterState
}
object ChangeByServerResponse {
  
  inline def apply(
    changeByServerResponse: (FlightRouterState, FlightData) => Unit,
    focusAndScrollRef: FocusAndScrollRef,
    tree: FlightRouterState
  ): ChangeByServerResponse = {
    val __obj = js.Dynamic.literal(changeByServerResponse = js.Any.fromFunction2(changeByServerResponse), focusAndScrollRef = focusAndScrollRef.asInstanceOf[js.Any], tree = tree.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeByServerResponse]
  }
  
  extension [Self <: ChangeByServerResponse](x: Self) {
    
    inline def setChangeByServerResponse(value: (FlightRouterState, FlightData) => Unit): Self = StObject.set(x, "changeByServerResponse", js.Any.fromFunction2(value))
    
    inline def setFocusAndScrollRef(value: FocusAndScrollRef): Self = StObject.set(x, "focusAndScrollRef", value.asInstanceOf[js.Any])
    
    inline def setTree(value: FlightRouterState): Self = StObject.set(x, "tree", value.asInstanceOf[js.Any])
  }
}
