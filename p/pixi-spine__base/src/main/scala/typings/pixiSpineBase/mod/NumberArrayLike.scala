package typings.pixiSpineBase.mod

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NumberArrayLike
  extends StObject
     with /* n */ NumberDictionary[Double] {
  
  val length: Double
}
object NumberArrayLike {
  
  inline def apply(length: Double): NumberArrayLike = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumberArrayLike]
  }
  
  extension [Self <: NumberArrayLike](x: Self) {
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
  }
}
