package typings.prettier.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CursorResult extends StObject {
  
  var cursorOffset: Double = js.native
  
  var formatted: String = js.native
}
object CursorResult {
  
  @scala.inline
  def apply(cursorOffset: Double, formatted: String): CursorResult = {
    val __obj = js.Dynamic.literal(cursorOffset = cursorOffset.asInstanceOf[js.Any], formatted = formatted.asInstanceOf[js.Any])
    __obj.asInstanceOf[CursorResult]
  }
  
  @scala.inline
  implicit class CursorResultMutableBuilder[Self <: CursorResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCursorOffset(value: Double): Self = StObject.set(x, "cursorOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatted(value: String): Self = StObject.set(x, "formatted", value.asInstanceOf[js.Any])
  }
}
