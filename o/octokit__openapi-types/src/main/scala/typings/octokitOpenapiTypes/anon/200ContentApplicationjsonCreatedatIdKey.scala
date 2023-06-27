package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentApplicationjsonCreatedatIdKey` extends StObject {
  
  /** @description Response */
  var `200`: ContentApplicationjsonCreatedatIdKey
  
  var `304`: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.anon.Actionsrunnerlabels['not_modified'] */ js.Any
  
  var `401`: Content41
  
  var `403`: Content41
  
  var `404`: Content41
}
object `200ContentApplicationjsonCreatedatIdKey` {
  
  inline def apply(
    `200`: ContentApplicationjsonCreatedatIdKey,
    `304`: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.anon.Actionsrunnerlabels['not_modified'] */ js.Any,
    `401`: Content41,
    `403`: Content41,
    `404`: Content41
  ): `200ContentApplicationjsonCreatedatIdKey` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("304")(`304`.asInstanceOf[js.Any])
    __obj.updateDynamic("401")(`401`.asInstanceOf[js.Any])
    __obj.updateDynamic("403")(`403`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentApplicationjsonCreatedatIdKey`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200ContentApplicationjsonCreatedatIdKey`] (val x: Self) extends AnyVal {
    
    inline def set200(value: ContentApplicationjsonCreatedatIdKey): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set304(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.anon.Actionsrunnerlabels['not_modified'] */ js.Any
    ): Self = StObject.set(x, "304", value.asInstanceOf[js.Any])
    
    inline def set401(value: Content41): Self = StObject.set(x, "401", value.asInstanceOf[js.Any])
    
    inline def set403(value: Content41): Self = StObject.set(x, "403", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content41): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
  }
}
