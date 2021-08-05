package typings.normalizeJss.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OutlineOffset extends StObject {
  
  var appearance: String
  
  var outlineOffset: String
}
object OutlineOffset {
  
  inline def apply(appearance: String, outlineOffset: String): OutlineOffset = {
    val __obj = js.Dynamic.literal(appearance = appearance.asInstanceOf[js.Any], outlineOffset = outlineOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutlineOffset]
  }
  
  extension [Self <: OutlineOffset](x: Self) {
    
    inline def setAppearance(value: String): Self = StObject.set(x, "appearance", value.asInstanceOf[js.Any])
    
    inline def setOutlineOffset(value: String): Self = StObject.set(x, "outlineOffset", value.asInstanceOf[js.Any])
  }
}
