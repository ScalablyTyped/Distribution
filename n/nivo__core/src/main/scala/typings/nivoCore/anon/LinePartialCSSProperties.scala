package typings.nivoCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LinePartialCSSProperties extends StObject {
  
  var line: PartialCSSProperties
}
object LinePartialCSSProperties {
  
  inline def apply(line: PartialCSSProperties): LinePartialCSSProperties = {
    val __obj = js.Dynamic.literal(line = line.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinePartialCSSProperties]
  }
  
  extension [Self <: LinePartialCSSProperties](x: Self) {
    
    inline def setLine(value: PartialCSSProperties): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
  }
}
