package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200503` extends StObject {
  
  /** @description Response */
  var `200`: Content306
  
  var `503`: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['responses']['porter_maintenance'] */ js.Any
}
object `200503` {
  
  inline def apply(
    `200`: Content306,
    `503`: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['responses']['porter_maintenance'] */ js.Any
  ): `200503` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("503")(`503`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200503`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200503`] (val x: Self) extends AnyVal {
    
    inline def set200(value: Content306): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set503(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['responses']['porter_maintenance'] */ js.Any
    ): Self = StObject.set(x, "503", value.asInstanceOf[js.Any])
  }
}
