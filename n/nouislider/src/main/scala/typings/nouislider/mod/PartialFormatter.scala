package typings.nouislider.mod

import typings.nouislider.nouisliderBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PartialFormatter extends StObject {
  
  var from: js.UndefOr[js.Function1[/* value */ String, Double | `false`]] = js.undefined
  
  def to(value: Double): String | Double
}
object PartialFormatter {
  
  inline def apply(to: Double => String | Double): PartialFormatter = {
    val __obj = js.Dynamic.literal(to = js.Any.fromFunction1(to))
    __obj.asInstanceOf[PartialFormatter]
  }
  
  extension [Self <: PartialFormatter](x: Self) {
    
    inline def setFrom(value: /* value */ String => Double | `false`): Self = StObject.set(x, "from", js.Any.fromFunction1(value))
    
    inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    inline def setTo(value: Double => String | Double): Self = StObject.set(x, "to", js.Any.fromFunction1(value))
  }
}
