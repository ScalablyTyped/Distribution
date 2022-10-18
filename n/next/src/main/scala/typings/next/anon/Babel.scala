package typings.next.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Babel extends StObject {
  
  /** Default babel-loader configuration */
  var babel: Any
}
object Babel {
  
  inline def apply(babel: Any): Babel = {
    val __obj = js.Dynamic.literal(babel = babel.asInstanceOf[js.Any])
    __obj.asInstanceOf[Babel]
  }
  
  extension [Self <: Babel](x: Self) {
    
    inline def setBabel(value: Any): Self = StObject.set(x, "babel", value.asInstanceOf[js.Any])
  }
}
