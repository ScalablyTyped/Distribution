package typings.nodeRsa.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyBits extends StObject {
  
  /**
    * The length of the key in bits.
    */
  var b: Double
}
object KeyBits {
  
  inline def apply(b: Double): KeyBits = {
    val __obj = js.Dynamic.literal(b = b.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyBits]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KeyBits] (val x: Self) extends AnyVal {
    
    inline def setB(value: Double): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
  }
}
