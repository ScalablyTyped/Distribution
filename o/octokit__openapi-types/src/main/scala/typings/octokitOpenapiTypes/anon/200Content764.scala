package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200Content764` extends StObject {
  
  /** @description Response */
  var `200`: Content764
  
  var `202`: ContentApplicationjsonRecord
  
  var `204`: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.anon.Actionsrunnerlabels['no_content'] */ js.Any
}
object `200Content764` {
  
  inline def apply(
    `200`: Content764,
    `202`: ContentApplicationjsonRecord,
    `204`: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.anon.Actionsrunnerlabels['no_content'] */ js.Any
  ): `200Content764` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("202")(`202`.asInstanceOf[js.Any])
    __obj.updateDynamic("204")(`204`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200Content764`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200Content764`] (val x: Self) extends AnyVal {
    
    inline def set200(value: Content764): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set202(value: ContentApplicationjsonRecord): Self = StObject.set(x, "202", value.asInstanceOf[js.Any])
    
    inline def set204(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.anon.Actionsrunnerlabels['no_content'] */ js.Any
    ): Self = StObject.set(x, "204", value.asInstanceOf[js.Any])
  }
}
