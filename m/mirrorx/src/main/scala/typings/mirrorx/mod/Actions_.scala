package typings.mirrorx.mod

import org.scalablytyped.runtime.StringDictionary
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
  implicit class Actions_Ops[Self <: Actions_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setRouting(value: routeActions): Self = this.set("routing", value.asInstanceOf[js.Any])
  }
}
