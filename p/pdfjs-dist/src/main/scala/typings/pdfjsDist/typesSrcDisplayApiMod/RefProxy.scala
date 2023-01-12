package typings.pdfjsDist.typesSrcDisplayApiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RefProxy extends StObject {
  
  var gen: Double
  
  var num: Double
}
object RefProxy {
  
  inline def apply(gen: Double, num: Double): RefProxy = {
    val __obj = js.Dynamic.literal(gen = gen.asInstanceOf[js.Any], num = num.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefProxy]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RefProxy] (val x: Self) extends AnyVal {
    
    inline def setGen(value: Double): Self = StObject.set(x, "gen", value.asInstanceOf[js.Any])
    
    inline def setNum(value: Double): Self = StObject.set(x, "num", value.asInstanceOf[js.Any])
  }
}
