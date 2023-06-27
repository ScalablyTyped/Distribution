package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200422500` extends StObject {
  
  /** @description Response */
  var `200`: Content374
  
  var `422`: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['responses']['validation_failed'] */ js.Any
  
  var `500`: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['responses']['internal_error'] */ js.Any
  
  var `503`: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['responses']['service_unavailable'] */ js.Any
}
object `200422500` {
  
  inline def apply(
    `200`: Content374,
    `422`: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['responses']['validation_failed'] */ js.Any,
    `500`: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['responses']['internal_error'] */ js.Any,
    `503`: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['responses']['service_unavailable'] */ js.Any
  ): `200422500` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.updateDynamic("500")(`500`.asInstanceOf[js.Any])
    __obj.updateDynamic("503")(`503`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200422500`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200422500`] (val x: Self) extends AnyVal {
    
    inline def set200(value: Content374): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set422(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['responses']['validation_failed'] */ js.Any
    ): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
    
    inline def set500(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['responses']['internal_error'] */ js.Any
    ): Self = StObject.set(x, "500", value.asInstanceOf[js.Any])
    
    inline def set503(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['responses']['service_unavailable'] */ js.Any
    ): Self = StObject.set(x, "503", value.asInstanceOf[js.Any])
  }
}
