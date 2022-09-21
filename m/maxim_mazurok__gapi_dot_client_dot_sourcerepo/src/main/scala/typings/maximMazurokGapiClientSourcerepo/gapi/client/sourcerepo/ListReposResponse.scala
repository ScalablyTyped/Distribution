package typings.maximMazurokGapiClientSourcerepo.gapi.client.sourcerepo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListReposResponse extends StObject {
  
  /** If non-empty, additional repositories exist within the project. These can be retrieved by including this value in the next ListReposRequest's page_token field. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** The listed repos. */
  var repos: js.UndefOr[js.Array[Repo]] = js.undefined
}
object ListReposResponse {
  
  inline def apply(): ListReposResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListReposResponse]
  }
  
  extension [Self <: ListReposResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setRepos(value: js.Array[Repo]): Self = StObject.set(x, "repos", value.asInstanceOf[js.Any])
    
    inline def setReposUndefined: Self = StObject.set(x, "repos", js.undefined)
    
    inline def setReposVarargs(value: Repo*): Self = StObject.set(x, "repos", js.Array(value*))
  }
}
