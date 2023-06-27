package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.distTypesRequestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAllVersions extends StObject {
  
  /**
    * Returns meta information about GitHub, including a list of GitHub's IP addresses. For more information, see "[About GitHub's IP addresses](https://docs.github.com/articles/about-github-s-ip-addresses/)."
    *
    * The API's response also includes a list of GitHub's domain names.
    *
    * The values shown in the documentation's response are example values. You must always query the API directly to get the latest values.
    *
    * **Note:** This endpoint returns both IPv4 and IPv6 addresses. However, not all features support IPv6. You should refer to the specific documentation for each feature to determine if IPv6 is supported.
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
    * Get all supported GitHub API versions.
    */
  def getAllVersions(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /versions']['response'] */ js.Any
  ]
  def getAllVersions(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /versions']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /versions']['response'] */ js.Any
  ]
  /**
    * Get all supported GitHub API versions.
    */
  @JSName("getAllVersions")
  var getAllVersions_Original: `385`
  
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
  var getOctocat_Original: `386`
  
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
  var getZen_Original: `387`
  
  /**
    * Returns meta information about GitHub, including a list of GitHub's IP addresses. For more information, see "[About GitHub's IP addresses](https://docs.github.com/articles/about-github-s-ip-addresses/)."
    *
    * The API's response also includes a list of GitHub's domain names.
    *
    * The values shown in the documentation's response are example values. You must always query the API directly to get the latest values.
    *
    * **Note:** This endpoint returns both IPv4 and IPv6 addresses. However, not all features support IPv6. You should refer to the specific documentation for each feature to determine if IPv6 is supported.
    */
  @JSName("get")
  var get_Original: `384`
  
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
  var root_Original: `388`
}
object GetAllVersions {
  
  inline def apply(get: `384`, getAllVersions: `385`, getOctocat: `386`, getZen: `387`, root: `388`): GetAllVersions = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], getAllVersions = getAllVersions.asInstanceOf[js.Any], getOctocat = getOctocat.asInstanceOf[js.Any], getZen = getZen.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAllVersions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetAllVersions] (val x: Self) extends AnyVal {
    
    inline def setGet(value: `384`): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setGetAllVersions(value: `385`): Self = StObject.set(x, "getAllVersions", value.asInstanceOf[js.Any])
    
    inline def setGetOctocat(value: `386`): Self = StObject.set(x, "getOctocat", value.asInstanceOf[js.Any])
    
    inline def setGetZen(value: `387`): Self = StObject.set(x, "getZen", value.asInstanceOf[js.Any])
    
    inline def setRoot(value: `388`): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
  }
}
