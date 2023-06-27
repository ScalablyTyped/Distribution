package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `301304404` extends StObject {
  
  /** @description Response */
  var `200`: `716`
  
  var `301`: Content41
  
  var `304`: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.anon.Actionsrunnerlabels['not_modified'] */ js.Any
  
  var `404`: Content41
  
  var `410`: Content41
}
object `301304404` {
  
  inline def apply(
    `200`: `716`,
    `301`: Content41,
    `304`: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.anon.Actionsrunnerlabels['not_modified'] */ js.Any,
    `404`: Content41,
    `410`: Content41
  ): `301304404` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("301")(`301`.asInstanceOf[js.Any])
    __obj.updateDynamic("304")(`304`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.updateDynamic("410")(`410`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`301304404`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `301304404`] (val x: Self) extends AnyVal {
    
    inline def set200(value: `716`): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set301(value: Content41): Self = StObject.set(x, "301", value.asInstanceOf[js.Any])
    
    inline def set304(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.anon.Actionsrunnerlabels['not_modified'] */ js.Any
    ): Self = StObject.set(x, "304", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content41): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
    
    inline def set410(value: Content41): Self = StObject.set(x, "410", value.asInstanceOf[js.Any])
  }
}
