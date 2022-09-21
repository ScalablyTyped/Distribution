package typings.nzh

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Langs extends StObject {
  
  var b: Lang
  
  var hk_b: Lang
  
  var hk_s: Lang
  
  var s: Lang
}
object Langs {
  
  inline def apply(b: Lang, hk_b: Lang, hk_s: Lang, s: Lang): Langs = {
    val __obj = js.Dynamic.literal(b = b.asInstanceOf[js.Any], hk_b = hk_b.asInstanceOf[js.Any], hk_s = hk_s.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any])
    __obj.asInstanceOf[Langs]
  }
  
  extension [Self <: Langs](x: Self) {
    
    inline def setB(value: Lang): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
    
    inline def setHk_b(value: Lang): Self = StObject.set(x, "hk_b", value.asInstanceOf[js.Any])
    
    inline def setHk_s(value: Lang): Self = StObject.set(x, "hk_s", value.asInstanceOf[js.Any])
    
    inline def setS(value: Lang): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
  }
}
