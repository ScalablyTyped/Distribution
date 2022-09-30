package typings.popoto.anon

import typings.popoto.popotoInts.`0`
import typings.popoto.popotoInts.`1`
import typings.popoto.popotoInts.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<{  RELATION :0,   VALUE :1,   SEGMENT :2}> */
trait ReadonlyRELATION0VALUE1SE extends StObject {
  
  val RELATION: `0`
  
  val SEGMENT: `2`
  
  val VALUE: `1`
}
object ReadonlyRELATION0VALUE1SE {
  
  inline def apply(): ReadonlyRELATION0VALUE1SE = {
    val __obj = js.Dynamic.literal(RELATION = 0, SEGMENT = 2, VALUE = 1)
    __obj.asInstanceOf[ReadonlyRELATION0VALUE1SE]
  }
  
  extension [Self <: ReadonlyRELATION0VALUE1SE](x: Self) {
    
    inline def setRELATION(value: `0`): Self = StObject.set(x, "RELATION", value.asInstanceOf[js.Any])
    
    inline def setSEGMENT(value: `2`): Self = StObject.set(x, "SEGMENT", value.asInstanceOf[js.Any])
    
    inline def setVALUE(value: `1`): Self = StObject.set(x, "VALUE", value.asInstanceOf[js.Any])
  }
}
