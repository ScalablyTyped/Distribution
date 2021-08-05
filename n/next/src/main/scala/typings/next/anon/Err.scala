package typings.next.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Err extends StObject {
  
  var err: js.Any
}
object Err {
  
  inline def apply(err: js.Any): Err = {
    val __obj = js.Dynamic.literal(err = err.asInstanceOf[js.Any])
    __obj.asInstanceOf[Err]
  }
  
  extension [Self <: Err](x: Self) {
    
    inline def setErr(value: js.Any): Self = StObject.set(x, "err", value.asInstanceOf[js.Any])
  }
}
