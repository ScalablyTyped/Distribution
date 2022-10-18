package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.distTypesOctokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Value extends StObject {
  
  var done: Unit
  
  var value: OctokitResponse[Any, Double]
}
object Value {
  
  inline def apply(done: Unit, value: OctokitResponse[Any, Double]): Value = {
    val __obj = js.Dynamic.literal(done = done.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Value]
  }
  
  extension [Self <: Value](x: Self) {
    
    inline def setDone(value: Unit): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
    
    inline def setValue(value: OctokitResponse[Any, Double]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
