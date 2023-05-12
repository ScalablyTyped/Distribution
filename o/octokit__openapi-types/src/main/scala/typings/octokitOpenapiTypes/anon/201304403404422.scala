package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `201304403404422` extends StObject {
  
  /** @description Response */
  var `201`: ContentApplicationjsonGitpullurl
  
  var `304`: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.anon.Actionsrunnerlabelsreadonly['not_modified'] */ js.Any
  
  var `403`: Content36
  
  var `404`: Content36
  
  var `422`: Content346
}
object `201304403404422` {
  
  inline def apply(
    `201`: ContentApplicationjsonGitpullurl,
    `304`: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.anon.Actionsrunnerlabelsreadonly['not_modified'] */ js.Any,
    `403`: Content36,
    `404`: Content36,
    `422`: Content346
  ): `201304403404422` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("201")(`201`.asInstanceOf[js.Any])
    __obj.updateDynamic("304")(`304`.asInstanceOf[js.Any])
    __obj.updateDynamic("403")(`403`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`201304403404422`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `201304403404422`] (val x: Self) extends AnyVal {
    
    inline def set201(value: ContentApplicationjsonGitpullurl): Self = StObject.set(x, "201", value.asInstanceOf[js.Any])
    
    inline def set304(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.anon.Actionsrunnerlabelsreadonly['not_modified'] */ js.Any
    ): Self = StObject.set(x, "304", value.asInstanceOf[js.Any])
    
    inline def set403(value: Content36): Self = StObject.set(x, "403", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content36): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
    
    inline def set422(value: Content346): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
  }
}
