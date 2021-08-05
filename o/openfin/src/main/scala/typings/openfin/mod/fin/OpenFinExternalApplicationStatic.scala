package typings.openfin.mod.fin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpenFinExternalApplicationStatic extends StObject {
  
  /**
    * Returns an External Application object that represents an existing external application.
    */
  def wrap(uuid: String): OpenFinExternalApplication
}
object OpenFinExternalApplicationStatic {
  
  inline def apply(wrap: String => OpenFinExternalApplication): OpenFinExternalApplicationStatic = {
    val __obj = js.Dynamic.literal(wrap = js.Any.fromFunction1(wrap))
    __obj.asInstanceOf[OpenFinExternalApplicationStatic]
  }
  
  extension [Self <: OpenFinExternalApplicationStatic](x: Self) {
    
    inline def setWrap(value: String => OpenFinExternalApplication): Self = StObject.set(x, "wrap", js.Any.fromFunction1(value))
  }
}
