package typings.nginstackWebFramework.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PreserveExpressions extends StObject {
  
  var preserveExpressions: js.UndefOr[Boolean] = js.undefined
}
object PreserveExpressions {
  
  inline def apply(): PreserveExpressions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PreserveExpressions]
  }
  
  extension [Self <: PreserveExpressions](x: Self) {
    
    inline def setPreserveExpressions(value: Boolean): Self = StObject.set(x, "preserveExpressions", value.asInstanceOf[js.Any])
    
    inline def setPreserveExpressionsUndefined: Self = StObject.set(x, "preserveExpressions", js.undefined)
  }
}
