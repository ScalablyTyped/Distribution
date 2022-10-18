package typings.next.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Exclude extends StObject {
  
  var exclude: js.UndefOr[js.Array[String]] = js.undefined
}
object Exclude {
  
  inline def apply(): Exclude = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Exclude]
  }
  
  extension [Self <: Exclude](x: Self) {
    
    inline def setExclude(value: js.Array[String]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
    
    inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
    
    inline def setExcludeVarargs(value: String*): Self = StObject.set(x, "exclude", js.Array(value*))
  }
}
