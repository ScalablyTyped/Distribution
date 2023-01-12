package typings.normalizeJss.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OutlineWidth extends StObject {
  
  var outlineWidth: Double
}
object OutlineWidth {
  
  inline def apply(outlineWidth: Double): OutlineWidth = {
    val __obj = js.Dynamic.literal(outlineWidth = outlineWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutlineWidth]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OutlineWidth] (val x: Self) extends AnyVal {
    
    inline def setOutlineWidth(value: Double): Self = StObject.set(x, "outlineWidth", value.asInstanceOf[js.Any])
  }
}
