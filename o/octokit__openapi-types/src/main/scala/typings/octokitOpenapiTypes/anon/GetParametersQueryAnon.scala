package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersQueryAnon extends StObject {
  
  /**
    * Lists contributors to the specified repository and sorts them by the number of commits per contributor in descending order. This endpoint may return information that is a few hours old because the GitHub REST API v3 caches contributor data to improve performance.
    *
    * GitHub identifies contributors by author email address. This endpoint groups contribution counts by GitHub user, which includes all associated email addresses. To improve performance, only the first 500 author email addresses in the repository link to GitHub users. The rest will appear as anonymous contributors without associated GitHub user information.
    */
  var get: ParametersQueryAnon
}
object GetParametersQueryAnon {
  
  inline def apply(get: ParametersQueryAnon): GetParametersQueryAnon = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersQueryAnon]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParametersQueryAnon] (val x: Self) extends AnyVal {
    
    inline def setGet(value: ParametersQueryAnon): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
