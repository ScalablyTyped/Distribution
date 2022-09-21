package typings.nivoAnnotations.anon

import typings.nivoCore.mod.CompleteTheme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Theme[Datum] extends StObject {
  
  var datum: Datum
  
  var theme: CompleteTheme
  
  var x: Double
  
  var y: Double
}
object Theme {
  
  inline def apply[Datum](datum: Datum, theme: CompleteTheme, x: Double, y: Double): Theme[Datum] = {
    val __obj = js.Dynamic.literal(datum = datum.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Theme[Datum]]
  }
  
  extension [Self <: Theme[?], Datum](x: Self & Theme[Datum]) {
    
    inline def setDatum(value: Datum): Self = StObject.set(x, "datum", value.asInstanceOf[js.Any])
    
    inline def setTheme(value: CompleteTheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
