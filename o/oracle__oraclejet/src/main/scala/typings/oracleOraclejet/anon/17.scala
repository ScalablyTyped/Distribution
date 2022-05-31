package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `17` extends StObject {
  
  def attached(param0: String): Unit
}
object `17` {
  
  inline def apply(attached: String => Unit): `17` = {
    val __obj = js.Dynamic.literal(attached = js.Any.fromFunction1(attached))
    __obj.asInstanceOf[`17`]
  }
  
  extension [Self <: `17`](x: Self) {
    
    inline def setAttached(value: String => Unit): Self = StObject.set(x, "attached", js.Any.fromFunction1(value))
  }
}
