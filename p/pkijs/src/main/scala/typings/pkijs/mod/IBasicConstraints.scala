package typings.pkijs.mod

import typings.asn1js.mod.Integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IBasicConstraints extends StObject {
  
  var cA: Boolean
  
  var pathLenConstraint: js.UndefOr[Double | Integer] = js.undefined
}
object IBasicConstraints {
  
  inline def apply(cA: Boolean): IBasicConstraints = {
    val __obj = js.Dynamic.literal(cA = cA.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBasicConstraints]
  }
  
  extension [Self <: IBasicConstraints](x: Self) {
    
    inline def setCA(value: Boolean): Self = StObject.set(x, "cA", value.asInstanceOf[js.Any])
    
    inline def setPathLenConstraint(value: Double | Integer): Self = StObject.set(x, "pathLenConstraint", value.asInstanceOf[js.Any])
    
    inline def setPathLenConstraintUndefined: Self = StObject.set(x, "pathLenConstraint", js.undefined)
  }
}
