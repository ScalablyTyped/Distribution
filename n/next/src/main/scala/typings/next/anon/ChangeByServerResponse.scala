package typings.next.anon

import typings.next.distClientComponentsReducerMod.FocusAndScrollRef
import typings.next.distServerAppRenderMod.FlightData
import typings.next.distServerAppRenderMod.FlightRouterState
import typings.std.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChangeByServerResponse extends StObject {
  
  def changeByServerResponse(previousTree: FlightRouterState, flightData: FlightData): Unit = js.native
  def changeByServerResponse(previousTree: FlightRouterState, flightData: FlightData, overrideCanonicalUrl: URL): Unit = js.native
  
  var focusAndScrollRef: FocusAndScrollRef = js.native
  
  var tree: FlightRouterState = js.native
}
