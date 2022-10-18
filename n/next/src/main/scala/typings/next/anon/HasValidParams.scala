package typings.next.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HasValidParams extends StObject {
  
  var hasValidParams: Boolean
  
  var params: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ParsedUrlQuery */ Any
}
object HasValidParams {
  
  inline def apply(
    hasValidParams: Boolean,
    params: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ParsedUrlQuery */ Any
  ): HasValidParams = {
    val __obj = js.Dynamic.literal(hasValidParams = hasValidParams.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.asInstanceOf[HasValidParams]
  }
  
  extension [Self <: HasValidParams](x: Self) {
    
    inline def setHasValidParams(value: Boolean): Self = StObject.set(x, "hasValidParams", value.asInstanceOf[js.Any])
    
    inline def setParams(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ParsedUrlQuery */ Any
    ): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
  }
}
