package typings.nivoCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Hidden extends StObject {
  
  var hidden: Symbol
  
  var text: PartialCSSProperties
  
  var ticks: Text
  
  var title: TextPartial
}
object Hidden {
  
  inline def apply(hidden: Symbol, text: PartialCSSProperties, ticks: Text, title: TextPartial): Hidden = {
    val __obj = js.Dynamic.literal(hidden = hidden.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], ticks = ticks.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hidden]
  }
  
  extension [Self <: Hidden](x: Self) {
    
    inline def setHidden(value: Symbol): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    inline def setText(value: PartialCSSProperties): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTicks(value: Text): Self = StObject.set(x, "ticks", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: TextPartial): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
