package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPathMigrationidOrgQuery250 extends StObject {
  
  /** List all the repositories for this organization migration. */
  var get: ParametersPathMigrationidOrgQuery250
}
object GetParametersPathMigrationidOrgQuery250 {
  
  inline def apply(get: ParametersPathMigrationidOrgQuery250): GetParametersPathMigrationidOrgQuery250 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPathMigrationidOrgQuery250]
  }
  
  extension [Self <: GetParametersPathMigrationidOrgQuery250](x: Self) {
    
    inline def setGet(value: ParametersPathMigrationidOrgQuery250): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
