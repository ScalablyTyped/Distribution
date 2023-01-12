package typings.nivoCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Line extends StObject {
  
  var line: Stroke
}
object Line {
  
  inline def apply(line: Stroke): Line = {
    val __obj = js.Dynamic.literal(line = line.asInstanceOf[js.Any])
    __obj.asInstanceOf[Line]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Line] (val x: Self) extends AnyVal {
    
    inline def setLine(value: Stroke): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
  }
}
