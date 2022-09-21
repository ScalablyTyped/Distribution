package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPathMigrationidQueryPage extends StObject {
  
  /** List all the repositories for this organization migration. */
  var get: ParametersPathMigrationidQueryPage
}
object GetParametersPathMigrationidQueryPage {
  
  inline def apply(get: ParametersPathMigrationidQueryPage): GetParametersPathMigrationidQueryPage = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPathMigrationidQueryPage]
  }
  
  extension [Self <: GetParametersPathMigrationidQueryPage](x: Self) {
    
    inline def setGet(value: ParametersPathMigrationidQueryPage): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
