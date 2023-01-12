package typings.node.cryptoMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ECKeyPairKeyObjectOptions extends StObject {
  
  /**
    * Name of the curve to use
    */
  var namedCurve: String
}
object ECKeyPairKeyObjectOptions {
  
  inline def apply(namedCurve: String): ECKeyPairKeyObjectOptions = {
    val __obj = js.Dynamic.literal(namedCurve = namedCurve.asInstanceOf[js.Any])
    __obj.asInstanceOf[ECKeyPairKeyObjectOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ECKeyPairKeyObjectOptions] (val x: Self) extends AnyVal {
    
    inline def setNamedCurve(value: String): Self = StObject.set(x, "namedCurve", value.asInstanceOf[js.Any])
  }
}
