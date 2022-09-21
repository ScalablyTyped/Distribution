package typings.pixiSpineBase.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ITransformConstraint extends StObject {
  
  var data: ITransformConstraintData
}
object ITransformConstraint {
  
  inline def apply(data: ITransformConstraintData): ITransformConstraint = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITransformConstraint]
  }
  
  extension [Self <: ITransformConstraint](x: Self) {
    
    inline def setData(value: ITransformConstraintData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
