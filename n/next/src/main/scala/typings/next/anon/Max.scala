package typings.next.anon

import typings.next.nextInts.`100`
import typings.next.nextStrings.quality
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Max extends StObject {
  
  val max: `100`
  
  val min: typings.next.nextInts.`0`
  
  val option: quality
}
object Max {
  
  inline def apply(): Max = {
    val __obj = js.Dynamic.literal(max = 100, min = 0, option = "quality")
    __obj.asInstanceOf[Max]
  }
  
  extension [Self <: Max](x: Self) {
    
    inline def setMax(value: `100`): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMin(value: typings.next.nextInts.`0`): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setOption(value: quality): Self = StObject.set(x, "option", value.asInstanceOf[js.Any])
  }
}
