package typings.nivoColors.anon

import typings.react.mod.CSSProperties
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  line :std.Partial<std.Partial<react.react.CSSProperties>>}> */
trait PartiallinePartialPartial extends StObject {
  
  var line: js.UndefOr[Partial[Partial[CSSProperties]]] = js.undefined
}
object PartiallinePartialPartial {
  
  inline def apply(): PartiallinePartialPartial = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartiallinePartialPartial]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartiallinePartialPartial] (val x: Self) extends AnyVal {
    
    inline def setLine(value: Partial[Partial[CSSProperties]]): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
  }
}
