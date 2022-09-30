package typings.popoto.anon

import typings.popoto.popotoInts.`0`
import typings.popoto.popotoInts.`1`
import typings.popoto.popotoInts.`2`
import typings.popoto.popotoInts.`3`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMAGE extends StObject {
  
  var IMAGE: `1`
  
  var SVG: `2`
  
  var SYMBOL: `3`
  
  var TEXT: `0`
}
object IMAGE {
  
  inline def apply(): IMAGE = {
    val __obj = js.Dynamic.literal(IMAGE = 1, SVG = 2, SYMBOL = 3, TEXT = 0)
    __obj.asInstanceOf[IMAGE]
  }
  
  extension [Self <: IMAGE](x: Self) {
    
    inline def setIMAGE(value: `1`): Self = StObject.set(x, "IMAGE", value.asInstanceOf[js.Any])
    
    inline def setSVG(value: `2`): Self = StObject.set(x, "SVG", value.asInstanceOf[js.Any])
    
    inline def setSYMBOL(value: `3`): Self = StObject.set(x, "SYMBOL", value.asInstanceOf[js.Any])
    
    inline def setTEXT(value: `0`): Self = StObject.set(x, "TEXT", value.asInstanceOf[js.Any])
  }
}
