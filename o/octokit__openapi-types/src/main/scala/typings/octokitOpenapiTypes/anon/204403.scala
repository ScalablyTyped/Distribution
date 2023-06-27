package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `204403` extends StObject {
  
  var `204`: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.anon.Actionsrunnerlabels['no_content'] */ js.Any
  
  var `403`: Content41
  
  var `404`: Content41
  
  var `422`: Content414
  
  var `500`: Content41
}
object `204403` {
  
  inline def apply(
    `204`: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.anon.Actionsrunnerlabels['no_content'] */ js.Any,
    `403`: Content41,
    `404`: Content41,
    `422`: Content414,
    `500`: Content41
  ): `204403` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("204")(`204`.asInstanceOf[js.Any])
    __obj.updateDynamic("403")(`403`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.updateDynamic("422")(`422`.asInstanceOf[js.Any])
    __obj.updateDynamic("500")(`500`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`204403`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `204403`] (val x: Self) extends AnyVal {
    
    inline def set204(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.anon.Actionsrunnerlabels['no_content'] */ js.Any
    ): Self = StObject.set(x, "204", value.asInstanceOf[js.Any])
    
    inline def set403(value: Content41): Self = StObject.set(x, "403", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content41): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
    
    inline def set422(value: Content414): Self = StObject.set(x, "422", value.asInstanceOf[js.Any])
    
    inline def set500(value: Content41): Self = StObject.set(x, "500", value.asInstanceOf[js.Any])
  }
}
