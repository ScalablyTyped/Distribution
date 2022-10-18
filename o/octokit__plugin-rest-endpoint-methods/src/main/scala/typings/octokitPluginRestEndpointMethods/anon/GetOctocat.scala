package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.distTypesRequestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetOctocat extends StObject {
  
  /**
    * Returns meta information about GitHub, including a list of GitHub's IP addresses. For more information, see "[About GitHub's IP addresses](https://docs.github.com/articles/about-github-s-ip-addresses/)."
    *
    * **Note:** The IP addresses shown in the documentation's response are only example values. You must always query the API directly to get the latest list of IP addresses.
    */
  def get(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /meta']['response'] */ js.Any
  ]
  def get(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /meta']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /meta']['response'] */ js.Any
  ]
  
  /**
    * Get the octocat as ASCII art
    */
  def getOctocat(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /octocat']['response'] */ js.Any
  ]
  def getOctocat(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /octocat']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /octocat']['response'] */ js.Any
  ]
  /**
    * Get the octocat as ASCII art
    */
  @JSName("getOctocat")
  var getOctocat_Original: `356`
  
  /**
    * Get a random sentence from the Zen of GitHub
    */
  def getZen(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /zen']['response'] */ js.Any
  ]
  def getZen(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /zen']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /zen']['response'] */ js.Any
  ]
  /**
    * Get a random sentence from the Zen of GitHub
    */
  @JSName("getZen")
  var getZen_Original: `357`
  
  /**
    * Returns meta information about GitHub, including a list of GitHub's IP addresses. For more information, see "[About GitHub's IP addresses](https://docs.github.com/articles/about-github-s-ip-addresses/)."
    *
    * **Note:** The IP addresses shown in the documentation's response are only example values. You must always query the API directly to get the latest list of IP addresses.
    */
  @JSName("get")
  var get_Original: `355`
  
  /**
    * Get Hypermedia links to resources accessible in GitHub's REST API
    */
  def root(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /']['response'] */ js.Any
  ]
  def root(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /']['response'] */ js.Any
  ]
  /**
    * Get Hypermedia links to resources accessible in GitHub's REST API
    */
  @JSName("root")
  var root_Original: `358`
}
object GetOctocat {
  
  inline def apply(get: `355`, getOctocat: `356`, getZen: `357`, root: `358`): GetOctocat = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], getOctocat = getOctocat.asInstanceOf[js.Any], getZen = getZen.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetOctocat]
  }
  
  extension [Self <: GetOctocat](x: Self) {
    
    inline def setGet(value: `355`): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setGetOctocat(value: `356`): Self = StObject.set(x, "getOctocat", value.asInstanceOf[js.Any])
    
    inline def setGetZen(value: `357`): Self = StObject.set(x, "getZen", value.asInstanceOf[js.Any])
    
    inline def setRoot(value: `358`): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
  }
}
