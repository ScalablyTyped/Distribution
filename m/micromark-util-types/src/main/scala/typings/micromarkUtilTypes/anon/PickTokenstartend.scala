package typings.micromarkUtilTypes.anon

import typings.micromarkUtilTypes.mod.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<micromark-util-types.micromark-util-types.Token, 'start' | 'end'> */
trait PickTokenstartend extends StObject {
  
  var end: Point
  
  var start: Point
}
object PickTokenstartend {
  
  inline def apply(end: Point, start: Point): PickTokenstartend = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickTokenstartend]
  }
  
  extension [Self <: PickTokenstartend](x: Self) {
    
    inline def setEnd(value: Point): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setStart(value: Point): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
