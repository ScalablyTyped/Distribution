package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200400401` extends StObject {
  
  /** @description Response */
  var `200`: Content596
  
  var `400`: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.anon.Actionsrunnerlabels['package_es_list_error'] */ js.Any
  
  var `401`: Content41
  
  var `403`: Content41
}
object `200400401` {
  
  inline def apply(
    `200`: Content596,
    `400`: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.anon.Actionsrunnerlabels['package_es_list_error'] */ js.Any,
    `401`: Content41,
    `403`: Content41
  ): `200400401` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("400")(`400`.asInstanceOf[js.Any])
    __obj.updateDynamic("401")(`401`.asInstanceOf[js.Any])
    __obj.updateDynamic("403")(`403`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200400401`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200400401`] (val x: Self) extends AnyVal {
    
    inline def set200(value: Content596): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set400(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.anon.Actionsrunnerlabels['package_es_list_error'] */ js.Any
    ): Self = StObject.set(x, "400", value.asInstanceOf[js.Any])
    
    inline def set401(value: Content41): Self = StObject.set(x, "401", value.asInstanceOf[js.Any])
    
    inline def set403(value: Content41): Self = StObject.set(x, "403", value.asInstanceOf[js.Any])
  }
}
