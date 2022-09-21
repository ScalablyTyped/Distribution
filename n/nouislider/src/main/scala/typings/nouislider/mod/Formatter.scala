package typings.nouislider.mod

import typings.nouislider.nouisliderBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Formatter
  extends StObject
     with PartialFormatter {
  
  @JSName("from")
  def from_MFormatter(value: String): Double | `false`
}
object Formatter {
  
  inline def apply(from: String => Double | `false`, to: Double => String | Double): Formatter = {
    val __obj = js.Dynamic.literal(from = js.Any.fromFunction1(from), to = js.Any.fromFunction1(to))
    __obj.asInstanceOf[Formatter]
  }
  
  extension [Self <: Formatter](x: Self) {
    
    inline def setFrom(value: String => Double | `false`): Self = StObject.set(x, "from", js.Any.fromFunction1(value))
  }
}
