package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.distTypesRequestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAllCommonlyUsed extends StObject {
  
  def get(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /licenses/{license}']['response'] */ js.Any
  ]
  def get(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /licenses/{license}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /licenses/{license}']['response'] */ js.Any
  ]
  
  def getAllCommonlyUsed(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /licenses']['response'] */ js.Any
  ]
  def getAllCommonlyUsed(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /licenses']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /licenses']['response'] */ js.Any
  ]
  @JSName("getAllCommonlyUsed")
  var getAllCommonlyUsed_Original: `380`
  
  /**
    * This method returns the contents of the repository's license file, if one is detected.
    *
    * Similar to [Get repository content](https://docs.github.com/rest/reference/repos#get-repository-content), this method also supports [custom media types](https://docs.github.com/rest/overview/media-types) for retrieving the raw license content or rendered license HTML.
    */
  def getForRepo(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/license']['response'] */ js.Any
  ]
  def getForRepo(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/license']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/license']['response'] */ js.Any
  ]
  /**
    * This method returns the contents of the repository's license file, if one is detected.
    *
    * Similar to [Get repository content](https://docs.github.com/rest/reference/repos#get-repository-content), this method also supports [custom media types](https://docs.github.com/rest/overview/media-types) for retrieving the raw license content or rendered license HTML.
    */
  @JSName("getForRepo")
  var getForRepo_Original: `381`
  
  @JSName("get")
  var get_Original: `379`
}
object GetAllCommonlyUsed {
  
  inline def apply(get: `379`, getAllCommonlyUsed: `380`, getForRepo: `381`): GetAllCommonlyUsed = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], getAllCommonlyUsed = getAllCommonlyUsed.asInstanceOf[js.Any], getForRepo = getForRepo.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAllCommonlyUsed]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetAllCommonlyUsed] (val x: Self) extends AnyVal {
    
    inline def setGet(value: `379`): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setGetAllCommonlyUsed(value: `380`): Self = StObject.set(x, "getAllCommonlyUsed", value.asInstanceOf[js.Any])
    
    inline def setGetForRepo(value: `381`): Self = StObject.set(x, "getForRepo", value.asInstanceOf[js.Any])
  }
}
