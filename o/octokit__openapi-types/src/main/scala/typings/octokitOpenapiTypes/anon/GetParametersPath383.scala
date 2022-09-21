package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPath383 extends StObject {
  
  /**
    * Fetches a single user migration. The response includes the `state` of the migration, which can be one of the following values:
    *
    * *   `pending` - the migration hasn't started yet.
    * *   `exporting` - the migration is in progress.
    * *   `exported` - the migration finished successfully.
    * *   `failed` - the migration failed.
    *
    * Once the migration has been `exported` you can [download the migration archive](https://docs.github.com/rest/reference/migrations#download-a-user-migration-archive).
    */
  var get: ParametersPath383
}
object GetParametersPath383 {
  
  inline def apply(get: ParametersPath383): GetParametersPath383 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPath383]
  }
  
  extension [Self <: GetParametersPath383](x: Self) {
    
    inline def setGet(value: ParametersPath383): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
