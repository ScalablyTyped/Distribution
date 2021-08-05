package typings.popmotionPose.typesMod

import typings.styleValueTypes.typesMod.ValueType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Value extends StObject {
  
  var raw: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ValueReaction */ js.Any
  
  var `type`: js.UndefOr[ValueType] = js.undefined
}
object Value {
  
  inline def apply(
    raw: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ValueReaction */ js.Any
  ): Value = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any])
    __obj.asInstanceOf[Value]
  }
  
  extension [Self <: Value](x: Self) {
    
    inline def setRaw(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ValueReaction */ js.Any
    ): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    inline def setType(value: ValueType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
