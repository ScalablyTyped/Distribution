package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FeatureTarget extends StObject {
  
  // The ID of the entity that's targeted in the include or exclude rule, or all_users to target all users.
  var id: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The kind of entity that's targeted. The possible values are: group, administrativeUnit, role, unknownFutureValue.
  var targetType: js.UndefOr[NullableOption[FeatureTargetType]] = js.undefined
}
object FeatureTarget {
  
  inline def apply(): FeatureTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FeatureTarget]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FeatureTarget] (val x: Self) extends AnyVal {
    
    inline def setId(value: NullableOption[String]): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setTargetType(value: NullableOption[FeatureTargetType]): Self = StObject.set(x, "targetType", value.asInstanceOf[js.Any])
    
    inline def setTargetTypeNull: Self = StObject.set(x, "targetType", null)
    
    inline def setTargetTypeUndefined: Self = StObject.set(x, "targetType", js.undefined)
  }
}
