package typings.next.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Locales extends StObject {
  
  var locales: js.UndefOr[js.Array[String]] = js.undefined
}
object Locales {
  
  inline def apply(): Locales = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Locales]
  }
  
  extension [Self <: Locales](x: Self) {
    
    inline def setLocales(value: js.Array[String]): Self = StObject.set(x, "locales", value.asInstanceOf[js.Any])
    
    inline def setLocalesUndefined: Self = StObject.set(x, "locales", js.undefined)
    
    inline def setLocalesVarargs(value: String*): Self = StObject.set(x, "locales", js.Array(value*))
  }
}
