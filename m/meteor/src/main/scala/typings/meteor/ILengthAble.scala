package typings.meteor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ILengthAble extends StObject {
  
  var length: Double = js.native
}
object ILengthAble {
  
  @scala.inline
  def apply(length: Double): ILengthAble = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILengthAble]
  }
  
  @scala.inline
  implicit class ILengthAbleMutableBuilder[Self <: ILengthAble] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
  }
}
