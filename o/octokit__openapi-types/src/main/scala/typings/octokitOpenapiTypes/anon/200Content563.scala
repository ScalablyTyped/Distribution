package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200Content563` extends StObject {
  
  /** @description Response */
  var `200`: Content563
  
  var `304`: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.anon.Actionsrunnerlabels['not_modified'] */ js.Any
  
  var `403`: Content41
}
object `200Content563` {
  
  inline def apply(
    `200`: Content563,
    `304`: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.anon.Actionsrunnerlabels['not_modified'] */ js.Any,
    `403`: Content41
  ): `200Content563` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("304")(`304`.asInstanceOf[js.Any])
    __obj.updateDynamic("403")(`403`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200Content563`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200Content563`] (val x: Self) extends AnyVal {
    
    inline def set200(value: Content563): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set304(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.anon.Actionsrunnerlabels['not_modified'] */ js.Any
    ): Self = StObject.set(x, "304", value.asInstanceOf[js.Any])
    
    inline def set403(value: Content41): Self = StObject.set(x, "403", value.asInstanceOf[js.Any])
  }
}
