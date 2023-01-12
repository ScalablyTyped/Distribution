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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParametersPathMigrationidQueryPage] (val x: Self) extends AnyVal {
    
    inline def setGet(value: ParametersPathMigrationidQueryPage): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
