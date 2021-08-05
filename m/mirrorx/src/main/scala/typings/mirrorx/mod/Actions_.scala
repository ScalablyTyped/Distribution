package typings.mirrorx.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Actions_
  extends StObject
     with /* propName */ StringDictionary[js.Any] {
  
  var routing: routeActions
}
object Actions_ {
  
  inline def apply(routing: routeActions): Actions_ = {
    val __obj = js.Dynamic.literal(routing = routing.asInstanceOf[js.Any])
    __obj.asInstanceOf[Actions_]
  }
  
  extension [Self <: Actions_](x: Self) {
    
    inline def setRouting(value: routeActions): Self = StObject.set(x, "routing", value.asInstanceOf[js.Any])
  }
}
