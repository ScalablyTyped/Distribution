package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPathMigrationidQuery extends StObject {
  
  /**
    * List repositories in an organization migration
    * @description List all the repositories for this organization migration.
    */
  var get: ParametersPathMigrationidQuery
}
object GetParametersPathMigrationidQuery {
  
  inline def apply(get: ParametersPathMigrationidQuery): GetParametersPathMigrationidQuery = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPathMigrationidQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParametersPathMigrationidQuery] (val x: Self) extends AnyVal {
    
    inline def setGet(value: ParametersPathMigrationidQuery): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
