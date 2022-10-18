package typings.next.anon

import typings.next.nextInts.`6`
import typings.next.nextStrings.level
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Option extends StObject {
  
  val max: typings.next.nextInts.`1`
  
  val min: `6`
  
  val option: level
}
object Option {
  
  inline def apply(): Option = {
    val __obj = js.Dynamic.literal(max = 1, min = 6, option = "level")
    __obj.asInstanceOf[Option]
  }
  
  extension [Self <: Option](x: Self) {
    
    inline def setMax(value: typings.next.nextInts.`1`): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMin(value: `6`): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setOption(value: level): Self = StObject.set(x, "option", value.asInstanceOf[js.Any])
  }
}
