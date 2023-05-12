package typings.metroConfig.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeferStates extends StObject {
  
  var deferStates: js.Array[String]
}
object DeferStates {
  
  inline def apply(deferStates: js.Array[String]): DeferStates = {
    val __obj = js.Dynamic.literal(deferStates = deferStates.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeferStates]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeferStates] (val x: Self) extends AnyVal {
    
    inline def setDeferStates(value: js.Array[String]): Self = StObject.set(x, "deferStates", value.asInstanceOf[js.Any])
    
    inline def setDeferStatesVarargs(value: String*): Self = StObject.set(x, "deferStates", js.Array(value*))
  }
}
