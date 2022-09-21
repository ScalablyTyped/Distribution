package typings.multiformats.anon

import typings.multiformats.mod.CID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Remaining extends StObject {
  
  var remaining: String
  
  var value: CID
}
object Remaining {
  
  inline def apply(remaining: String, value: CID): Remaining = {
    val __obj = js.Dynamic.literal(remaining = remaining.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Remaining]
  }
  
  extension [Self <: Remaining](x: Self) {
    
    inline def setRemaining(value: String): Self = StObject.set(x, "remaining", value.asInstanceOf[js.Any])
    
    inline def setValue(value: CID): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
