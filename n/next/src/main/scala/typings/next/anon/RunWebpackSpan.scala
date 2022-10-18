package typings.next.anon

import typings.next.distTraceMod.Span
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RunWebpackSpan extends StObject {
  
  var runWebpackSpan: Span
}
object RunWebpackSpan {
  
  inline def apply(runWebpackSpan: Span): RunWebpackSpan = {
    val __obj = js.Dynamic.literal(runWebpackSpan = runWebpackSpan.asInstanceOf[js.Any])
    __obj.asInstanceOf[RunWebpackSpan]
  }
  
  extension [Self <: RunWebpackSpan](x: Self) {
    
    inline def setRunWebpackSpan(value: Span): Self = StObject.set(x, "runWebpackSpan", value.asInstanceOf[js.Any])
  }
}
