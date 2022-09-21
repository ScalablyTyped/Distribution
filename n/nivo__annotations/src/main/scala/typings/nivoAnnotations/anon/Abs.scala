package typings.nivoAnnotations.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Abs extends StObject {
  
  var abs: Double
}
object Abs {
  
  inline def apply(abs: Double): Abs = {
    val __obj = js.Dynamic.literal(abs = abs.asInstanceOf[js.Any])
    __obj.asInstanceOf[Abs]
  }
  
  extension [Self <: Abs](x: Self) {
    
    inline def setAbs(value: Double): Self = StObject.set(x, "abs", value.asInstanceOf[js.Any])
  }
}
