package typings.next.anon

import typings.next.nextInts.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `1` extends StObject {
  
  val level: `2`
}
object `1` {
  
  inline def apply(): `1` = {
    val __obj = js.Dynamic.literal(level = 2)
    __obj.asInstanceOf[`1`]
  }
  
  extension [Self <: `1`](x: Self) {
    
    inline def setLevel(value: `2`): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
  }
}
