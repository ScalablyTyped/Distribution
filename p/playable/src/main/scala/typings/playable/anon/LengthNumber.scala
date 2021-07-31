package typings.playable.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LengthNumber extends StObject {
  
  var length: Double
}
object LengthNumber {
  
  @scala.inline
  def apply(length: Double): LengthNumber = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any])
    __obj.asInstanceOf[LengthNumber]
  }
  
  @scala.inline
  implicit class LengthNumberMutableBuilder[Self <: LengthNumber] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
  }
}
