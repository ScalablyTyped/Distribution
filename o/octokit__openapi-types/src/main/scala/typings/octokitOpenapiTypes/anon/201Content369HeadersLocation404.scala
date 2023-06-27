package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `201Content369HeadersLocation404` extends StObject {
  
  /** @description Response */
  var `201`: Content369HeadersLocation
  
  var `404`: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['responses']['not_found'] */ js.Any
}
object `201Content369HeadersLocation404` {
  
  inline def apply(
    `201`: Content369HeadersLocation,
    `404`: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['responses']['not_found'] */ js.Any
  ): `201Content369HeadersLocation404` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("201")(`201`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`201Content369HeadersLocation404`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `201Content369HeadersLocation404`] (val x: Self) extends AnyVal {
    
    inline def set201(value: Content369HeadersLocation): Self = StObject.set(x, "201", value.asInstanceOf[js.Any])
    
    inline def set404(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['responses']['not_found'] */ js.Any
    ): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
  }
}
