package typings.maximMazurokGapiClientFirebaserules.gapi.client.firebaserules

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VisitedExpression extends StObject {
  
  /** Position in the `Source` or `Ruleset` where an expression was visited. */
  var sourcePosition: js.UndefOr[SourcePosition] = js.undefined
  
  /** The evaluated value for the visited expression, e.g. true/false */
  var value: js.UndefOr[Any] = js.undefined
}
object VisitedExpression {
  
  inline def apply(): VisitedExpression = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VisitedExpression]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VisitedExpression] (val x: Self) extends AnyVal {
    
    inline def setSourcePosition(value: SourcePosition): Self = StObject.set(x, "sourcePosition", value.asInstanceOf[js.Any])
    
    inline def setSourcePositionUndefined: Self = StObject.set(x, "sourcePosition", js.undefined)
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
