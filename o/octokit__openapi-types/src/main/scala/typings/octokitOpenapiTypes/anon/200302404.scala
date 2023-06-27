package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200302404` extends StObject {
  
  /** @description Response */
  var `200`: ContentApplicationjsonDownloadcount
  
  var `302`: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.anon.Actionsrunnerlabels['found'] */ js.Any
  
  var `404`: Content41
}
object `200302404` {
  
  inline def apply(
    `200`: ContentApplicationjsonDownloadcount,
    `302`: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.anon.Actionsrunnerlabels['found'] */ js.Any,
    `404`: Content41
  ): `200302404` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("302")(`302`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200302404`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200302404`] (val x: Self) extends AnyVal {
    
    inline def set200(value: ContentApplicationjsonDownloadcount): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set302(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.anon.Actionsrunnerlabels['found'] */ js.Any
    ): Self = StObject.set(x, "302", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content41): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
  }
}
