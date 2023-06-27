package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `401Content41403ContentApplicationjsonErrors` extends StObject {
  
  var `304`: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.anon.Actionsrunnerlabels['not_modified'] */ js.Any
  
  var `401`: Content41
  
  /** @description Forbidden */
  var `403`: ContentApplicationjsonErrors
  
  var `404`: Content41
}
object `401Content41403ContentApplicationjsonErrors` {
  
  inline def apply(
    `304`: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.anon.Actionsrunnerlabels['not_modified'] */ js.Any,
    `401`: Content41,
    `403`: ContentApplicationjsonErrors,
    `404`: Content41
  ): `401Content41403ContentApplicationjsonErrors` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("304")(`304`.asInstanceOf[js.Any])
    __obj.updateDynamic("401")(`401`.asInstanceOf[js.Any])
    __obj.updateDynamic("403")(`403`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`401Content41403ContentApplicationjsonErrors`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `401Content41403ContentApplicationjsonErrors`] (val x: Self) extends AnyVal {
    
    inline def set304(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.anon.Actionsrunnerlabels['not_modified'] */ js.Any
    ): Self = StObject.set(x, "304", value.asInstanceOf[js.Any])
    
    inline def set401(value: Content41): Self = StObject.set(x, "401", value.asInstanceOf[js.Any])
    
    inline def set403(value: ContentApplicationjsonErrors): Self = StObject.set(x, "403", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content41): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
  }
}
