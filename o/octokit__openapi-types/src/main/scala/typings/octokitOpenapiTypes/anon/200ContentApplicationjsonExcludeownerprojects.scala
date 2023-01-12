package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200ContentApplicationjsonExcludeownerprojects` extends StObject {
  
  /**
    * *   `pending`, which means the migration hasn't started yet.
    * *   `exporting`, which means the migration is in progress.
    * *   `exported`, which means the migration finished successfully.
    * *   `failed`, which means the migration failed.
    */
  var `200`: ContentApplicationjsonExcludeownerprojects
  
  var `404`: Content48
}
object `200ContentApplicationjsonExcludeownerprojects` {
  
  inline def apply(`200`: ContentApplicationjsonExcludeownerprojects, `404`: Content48): `200ContentApplicationjsonExcludeownerprojects` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("404")(`404`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200ContentApplicationjsonExcludeownerprojects`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200ContentApplicationjsonExcludeownerprojects`] (val x: Self) extends AnyVal {
    
    inline def set200(value: ContentApplicationjsonExcludeownerprojects): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set404(value: Content48): Self = StObject.set(x, "404", value.asInstanceOf[js.Any])
  }
}
