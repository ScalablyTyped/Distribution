package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Value extends StObject {
  
  var done: Unit
  
  var value: OctokitResponse[js.Any]
}
object Value {
  
  @scala.inline
  def apply(done: Unit, value: OctokitResponse[js.Any]): Value = {
    val __obj = js.Dynamic.literal(done = done.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Value]
  }
  
  @scala.inline
  implicit class ValueMutableBuilder[Self <: Value] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDone(value: Unit): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: OctokitResponse[js.Any]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
