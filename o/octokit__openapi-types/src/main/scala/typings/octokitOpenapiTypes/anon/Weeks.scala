package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Weeks extends StObject {
  
  var author: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['nullable-simple-user'] */ js.Any
  
  /** @example 135 */
  var total: Double
  
  /**
    * @example [
    *   {
    *     "w": "1367712000",
    *     "a": 6898,
    *     "d": 77,
    *     "c": 10
    *   }
    * ]
    */
  var weeks: js.Array[A]
}
object Weeks {
  
  inline def apply(
    author: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['nullable-simple-user'] */ js.Any,
    total: Double,
    weeks: js.Array[A]
  ): Weeks = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any], weeks = weeks.asInstanceOf[js.Any])
    __obj.asInstanceOf[Weeks]
  }
  
  extension [Self <: Weeks](x: Self) {
    
    inline def setAuthor(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['nullable-simple-user'] */ js.Any
    ): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    
    inline def setWeeks(value: js.Array[A]): Self = StObject.set(x, "weeks", value.asInstanceOf[js.Any])
    
    inline def setWeeksVarargs(value: A*): Self = StObject.set(x, "weeks", js.Array(value*))
  }
}
