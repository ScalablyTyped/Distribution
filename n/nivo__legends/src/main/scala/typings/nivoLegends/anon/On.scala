package typings.nivoLegends.anon

import typings.propTypes.mod.InferProps
import typings.propTypes.mod.Validator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait On extends StObject {
  
  var on: Validator[String]
  
  var style: Validator[InferProps[ItemBackground]]
}
object On {
  
  inline def apply(on: Validator[String], style: Validator[InferProps[ItemBackground]]): On = {
    val __obj = js.Dynamic.literal(on = on.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[On]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: On] (val x: Self) extends AnyVal {
    
    inline def setOn(value: Validator[String]): Self = StObject.set(x, "on", value.asInstanceOf[js.Any])
    
    inline def setStyle(value: Validator[InferProps[ItemBackground]]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
  }
}
