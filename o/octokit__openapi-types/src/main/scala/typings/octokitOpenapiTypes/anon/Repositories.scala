package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Repositories extends StObject {
  
  var repositories: js.Array[Advancedsecuritycommittersbreakdown]
  
  /** @example 25 */
  var total_advanced_security_committers: js.UndefOr[Double] = js.undefined
  
  /** @example 2 */
  var total_count: js.UndefOr[Double] = js.undefined
}
object Repositories {
  
  inline def apply(repositories: js.Array[Advancedsecuritycommittersbreakdown]): Repositories = {
    val __obj = js.Dynamic.literal(repositories = repositories.asInstanceOf[js.Any])
    __obj.asInstanceOf[Repositories]
  }
  
  extension [Self <: Repositories](x: Self) {
    
    inline def setRepositories(value: js.Array[Advancedsecuritycommittersbreakdown]): Self = StObject.set(x, "repositories", value.asInstanceOf[js.Any])
    
    inline def setRepositoriesVarargs(value: Advancedsecuritycommittersbreakdown*): Self = StObject.set(x, "repositories", js.Array(value*))
    
    inline def setTotal_advanced_security_committers(value: Double): Self = StObject.set(x, "total_advanced_security_committers", value.asInstanceOf[js.Any])
    
    inline def setTotal_advanced_security_committersUndefined: Self = StObject.set(x, "total_advanced_security_committers", js.undefined)
    
    inline def setTotal_count(value: Double): Self = StObject.set(x, "total_count", value.asInstanceOf[js.Any])
    
    inline def setTotal_countUndefined: Self = StObject.set(x, "total_count", js.undefined)
  }
}
