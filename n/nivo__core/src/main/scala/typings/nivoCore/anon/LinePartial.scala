package typings.nivoCore.anon

import typings.react.mod.CSSProperties
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LinePartial extends StObject {
  
  var line: Partial[CSSProperties]
}
object LinePartial {
  
  inline def apply(line: Partial[CSSProperties]): LinePartial = {
    val __obj = js.Dynamic.literal(line = line.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinePartial]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LinePartial] (val x: Self) extends AnyVal {
    
    inline def setLine(value: Partial[CSSProperties]): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
  }
}
