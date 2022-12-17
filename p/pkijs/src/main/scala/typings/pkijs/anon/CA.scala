package typings.pkijs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CA extends StObject {
  
  var cA: js.UndefOr[String] = js.undefined
  
  var pathLenConstraint: js.UndefOr[String] = js.undefined
}
object CA {
  
  inline def apply(): CA = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CA]
  }
  
  extension [Self <: CA](x: Self) {
    
    inline def setCA(value: String): Self = StObject.set(x, "cA", value.asInstanceOf[js.Any])
    
    inline def setCAUndefined: Self = StObject.set(x, "cA", js.undefined)
    
    inline def setPathLenConstraint(value: String): Self = StObject.set(x, "pathLenConstraint", value.asInstanceOf[js.Any])
    
    inline def setPathLenConstraintUndefined: Self = StObject.set(x, "pathLenConstraint", js.undefined)
  }
}
