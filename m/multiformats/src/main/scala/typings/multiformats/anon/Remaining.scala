package typings.multiformats.anon

import typings.multiformats.distTypesSrcBlockInterfaceMod.BlockCursorView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Remaining[T /* <: Any */]
  extends StObject
     with BlockCursorView[T] {
  
  var remaining: Unit
  
  var value: T
}
object Remaining {
  
  inline def apply[T /* <: Any */](remaining: Unit, value: T): Remaining[T] = {
    val __obj = js.Dynamic.literal(remaining = remaining.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Remaining[T]]
  }
  
  extension [Self <: Remaining[?], T /* <: Any */](x: Self & Remaining[T]) {
    
    inline def setRemaining(value: Unit): Self = StObject.set(x, "remaining", value.asInstanceOf[js.Any])
    
    inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
