package typings.plotlyJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dash extends StObject {
  
  var color: js.UndefOr[String] = js.undefined
  
  var dash: js.UndefOr[typings.plotlyJs.libTracesOhclMod.Dash] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
}
object Dash {
  
  inline def apply(): Dash = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Dash]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Dash] (val x: Self) extends AnyVal {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setDash(value: typings.plotlyJs.libTracesOhclMod.Dash): Self = StObject.set(x, "dash", value.asInstanceOf[js.Any])
    
    inline def setDashUndefined: Self = StObject.set(x, "dash", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
