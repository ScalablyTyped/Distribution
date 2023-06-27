package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPath470 extends StObject {
  
  /**
    * Get a user migration status
    * @description Fetches a single user migration. The response includes the `state` of the migration, which can be one of the following values:
    *
    * *   `pending` - the migration hasn't started yet.
    * *   `exporting` - the migration is in progress.
    * *   `exported` - the migration finished successfully.
    * *   `failed` - the migration failed.
    *
    * Once the migration has been `exported` you can [download the migration archive](https://docs.github.com/rest/migrations/users#download-a-user-migration-archive).
    */
  var get: ParametersPath470
}
object GetParametersPath470 {
  
  inline def apply(get: ParametersPath470): GetParametersPath470 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPath470]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParametersPath470] (val x: Self) extends AnyVal {
    
    inline def setGet(value: ParametersPath470): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
