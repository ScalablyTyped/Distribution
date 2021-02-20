package typings.prettier.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CursorOptions extends Options {
  
  /**
    * Specify where the cursor is.
    */
  var cursorOffset: Double = js.native
  
  @JSName("rangeEnd")
  var rangeEnd_CursorOptions: js.UndefOr[scala.Nothing] = js.native
  
  @JSName("rangeStart")
  var rangeStart_CursorOptions: js.UndefOr[scala.Nothing] = js.native
}
object CursorOptions {
  
  @scala.inline
  def apply(cursorOffset: Double): CursorOptions = {
    val __obj = js.Dynamic.literal(cursorOffset = cursorOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[CursorOptions]
  }
  
  @scala.inline
  implicit class CursorOptionsMutableBuilder[Self <: CursorOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCursorOffset(value: Double): Self = StObject.set(x, "cursorOffset", value.asInstanceOf[js.Any])
  }
}
