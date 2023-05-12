package typings.playcanvas.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PreferHighPrecision extends StObject {
  
  var preferHighPrecision: Boolean
}
object PreferHighPrecision {
  
  inline def apply(preferHighPrecision: Boolean): PreferHighPrecision = {
    val __obj = js.Dynamic.literal(preferHighPrecision = preferHighPrecision.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreferHighPrecision]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PreferHighPrecision] (val x: Self) extends AnyVal {
    
    inline def setPreferHighPrecision(value: Boolean): Self = StObject.set(x, "preferHighPrecision", value.asInstanceOf[js.Any])
  }
}
