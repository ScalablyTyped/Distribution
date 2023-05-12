package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Per extends StObject {
  
  var per: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['per'] */ js.Any
  ] = js.undefined
}
object Per {
  
  inline def apply(): Per = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Per]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Per] (val x: Self) extends AnyVal {
    
    inline def setPer(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['per'] */ js.Any
    ): Self = StObject.set(x, "per", value.asInstanceOf[js.Any])
    
    inline def setPerUndefined: Self = StObject.set(x, "per", js.undefined)
  }
}
