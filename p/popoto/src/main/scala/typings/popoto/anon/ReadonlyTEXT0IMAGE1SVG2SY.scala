package typings.popoto.anon

import typings.popoto.popotoInts.`0`
import typings.popoto.popotoInts.`1`
import typings.popoto.popotoInts.`2`
import typings.popoto.popotoInts.`3`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<{  TEXT :0,   IMAGE :1,   SVG :2,   SYMBOL :3}> */
trait ReadonlyTEXT0IMAGE1SVG2SY extends StObject {
  
  val IMAGE: `1`
  
  val SVG: `2`
  
  val SYMBOL: `3`
  
  val TEXT: `0`
}
object ReadonlyTEXT0IMAGE1SVG2SY {
  
  inline def apply(): ReadonlyTEXT0IMAGE1SVG2SY = {
    val __obj = js.Dynamic.literal(IMAGE = 1, SVG = 2, SYMBOL = 3, TEXT = 0)
    __obj.asInstanceOf[ReadonlyTEXT0IMAGE1SVG2SY]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReadonlyTEXT0IMAGE1SVG2SY] (val x: Self) extends AnyVal {
    
    inline def setIMAGE(value: `1`): Self = StObject.set(x, "IMAGE", value.asInstanceOf[js.Any])
    
    inline def setSVG(value: `2`): Self = StObject.set(x, "SVG", value.asInstanceOf[js.Any])
    
    inline def setSYMBOL(value: `3`): Self = StObject.set(x, "SYMBOL", value.asInstanceOf[js.Any])
    
    inline def setTEXT(value: `0`): Self = StObject.set(x, "TEXT", value.asInstanceOf[js.Any])
  }
}
