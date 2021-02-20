package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReposUpdateInformationAboutPagesSiteEndpoint extends StObject {
  
  /**
    * Specify a custom domain for the repository. Sending a `null` value will remove the custom domain. For more about custom domains, see "[Using a custom domain with GitHub Pages](https://docs.github.com/articles/using-a-custom-domain-with-github-pages/)."
    */
  var cname: js.UndefOr[String] = js.native
  
  var owner: String = js.native
  
  var repo: String = js.native
  
  /**
    * Update the source for the repository. Must include the branch name and path.
    */
  var source: ReposUpdateInformationAboutPagesSiteParamsSource = js.native
}
object ReposUpdateInformationAboutPagesSiteEndpoint {
  
  @scala.inline
  def apply(owner: String, repo: String, source: ReposUpdateInformationAboutPagesSiteParamsSource): ReposUpdateInformationAboutPagesSiteEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposUpdateInformationAboutPagesSiteEndpoint]
  }
  
  @scala.inline
  implicit class ReposUpdateInformationAboutPagesSiteEndpointMutableBuilder[Self <: ReposUpdateInformationAboutPagesSiteEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCname(value: String): Self = StObject.set(x, "cname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCnameUndefined: Self = StObject.set(x, "cname", js.undefined)
    
    @scala.inline
    def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: ReposUpdateInformationAboutPagesSiteParamsSource): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
