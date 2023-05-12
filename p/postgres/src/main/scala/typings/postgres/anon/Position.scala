package typings.postgres.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Position extends StObject {
  
  var position: js.BigInt
  
  var size: js.BigInt
}
object Position {
  
  inline def apply(position: js.BigInt, size: js.BigInt): Position = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Position]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Position] (val x: Self) extends AnyVal {
    
    inline def setPosition(value: js.BigInt): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setSize(value: js.BigInt): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
