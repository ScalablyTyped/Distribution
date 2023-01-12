package typings.meteor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ILengthAble extends StObject {
  
  var length: Double
}
object ILengthAble {
  
  inline def apply(length: Double): ILengthAble = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILengthAble]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ILengthAble] (val x: Self) extends AnyVal {
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
  }
}
