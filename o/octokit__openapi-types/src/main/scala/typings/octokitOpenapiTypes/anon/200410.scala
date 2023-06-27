package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200410` extends StObject {
  
  /** @description Response */
  var `200`: Content329
  
  var `410`: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['responses']['gone'] */ js.Any
}
object `200410` {
  
  inline def apply(
    `200`: Content329,
    `410`: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['responses']['gone'] */ js.Any
  ): `200410` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("410")(`410`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200410`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200410`] (val x: Self) extends AnyVal {
    
    inline def set200(value: Content329): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set410(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['responses']['gone'] */ js.Any
    ): Self = StObject.set(x, "410", value.asInstanceOf[js.Any])
  }
}
