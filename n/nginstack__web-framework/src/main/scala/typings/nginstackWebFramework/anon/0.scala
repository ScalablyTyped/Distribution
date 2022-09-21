package typings.nginstackWebFramework.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0` extends StObject {
  
  def write(arg0: String): Any
}
object `0` {
  
  inline def apply(write: String => Any): `0` = {
    val __obj = js.Dynamic.literal(write = js.Any.fromFunction1(write))
    __obj.asInstanceOf[`0`]
  }
  
  extension [Self <: `0`](x: Self) {
    
    inline def setWrite(value: String => Any): Self = StObject.set(x, "write", js.Any.fromFunction1(value))
  }
}
