package typings.nginstackWebFramework.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Write extends StObject {
  
  def write(arg0: String, arg1: Boolean): Any
}
object Write {
  
  inline def apply(write: (String, Boolean) => Any): Write = {
    val __obj = js.Dynamic.literal(write = js.Any.fromFunction2(write))
    __obj.asInstanceOf[Write]
  }
  
  extension [Self <: Write](x: Self) {
    
    inline def setWrite(value: (String, Boolean) => Any): Self = StObject.set(x, "write", js.Any.fromFunction2(value))
  }
}
