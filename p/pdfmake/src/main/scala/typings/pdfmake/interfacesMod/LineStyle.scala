package typings.pdfmake.interfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LineStyle extends StObject {
  
  /**
    * Makes the line dashed.
    *
    * Defaults to a solid line.
    */
  var dash: js.UndefOr[Dash] = js.undefined
}
object LineStyle {
  
  inline def apply(): LineStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LineStyle]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LineStyle] (val x: Self) extends AnyVal {
    
    inline def setDash(value: Dash): Self = StObject.set(x, "dash", value.asInstanceOf[js.Any])
    
    inline def setDashUndefined: Self = StObject.set(x, "dash", js.undefined)
  }
}
