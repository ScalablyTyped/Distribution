package typings.pdfjsDist.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PDFRef extends StObject {
  
  var gen: js.Any
  
  var num: Double
}
object PDFRef {
  
  inline def apply(gen: js.Any, num: Double): PDFRef = {
    val __obj = js.Dynamic.literal(gen = gen.asInstanceOf[js.Any], num = num.asInstanceOf[js.Any])
    __obj.asInstanceOf[PDFRef]
  }
  
  extension [Self <: PDFRef](x: Self) {
    
    inline def setGen(value: js.Any): Self = StObject.set(x, "gen", value.asInstanceOf[js.Any])
    
    inline def setNum(value: Double): Self = StObject.set(x, "num", value.asInstanceOf[js.Any])
  }
}
