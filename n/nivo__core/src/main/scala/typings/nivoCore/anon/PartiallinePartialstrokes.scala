package typings.nivoCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  line :std.Partial<{  stroke :string,   strokeWidth :number,   strokeOpacity :number,   strokeDasharray :string}>}> */
trait PartiallinePartialstrokes extends StObject {
  
  var line: js.UndefOr[Partialstrokestringstroke] = js.undefined
}
object PartiallinePartialstrokes {
  
  inline def apply(): PartiallinePartialstrokes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartiallinePartialstrokes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartiallinePartialstrokes] (val x: Self) extends AnyVal {
    
    inline def setLine(value: Partialstrokestringstroke): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
  }
}
