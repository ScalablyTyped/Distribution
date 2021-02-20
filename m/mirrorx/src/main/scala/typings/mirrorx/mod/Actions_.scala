package typings.mirrorx.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Actions_
  extends /* propName */ StringDictionary[js.Any] {
  
  var routing: routeActions = js.native
}
object Actions_ {
  
  @scala.inline
  def apply(routing: routeActions): Actions_ = {
    val __obj = js.Dynamic.literal(routing = routing.asInstanceOf[js.Any])
    __obj.asInstanceOf[Actions_]
  }
  
  @scala.inline
  implicit class Actions_MutableBuilder[Self <: Actions_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRouting(value: routeActions): Self = StObject.set(x, "routing", value.asInstanceOf[js.Any])
  }
}
