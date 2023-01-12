package typings.nivoBar.distTypesTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BarDatumWithColor
  extends StObject
     with BarDatum {
  
  var color: String
}
object BarDatumWithColor {
  
  inline def apply(color: String): BarDatumWithColor = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any])
    __obj.asInstanceOf[BarDatumWithColor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BarDatumWithColor] (val x: Self) extends AnyVal {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
  }
}
