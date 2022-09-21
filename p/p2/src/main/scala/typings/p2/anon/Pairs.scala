package typings.p2.anon

import typings.p2.p2Strings.postBroadphase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Pairs extends StObject {
  
  var pairs: js.Array[typings.p2.mod.Body]
  
  var `type`: postBroadphase
}
object Pairs {
  
  inline def apply(pairs: js.Array[typings.p2.mod.Body]): Pairs = {
    val __obj = js.Dynamic.literal(pairs = pairs.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("postBroadphase")
    __obj.asInstanceOf[Pairs]
  }
  
  extension [Self <: Pairs](x: Self) {
    
    inline def setPairs(value: js.Array[typings.p2.mod.Body]): Self = StObject.set(x, "pairs", value.asInstanceOf[js.Any])
    
    inline def setPairsVarargs(value: typings.p2.mod.Body*): Self = StObject.set(x, "pairs", js.Array(value*))
    
    inline def setType(value: postBroadphase): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
