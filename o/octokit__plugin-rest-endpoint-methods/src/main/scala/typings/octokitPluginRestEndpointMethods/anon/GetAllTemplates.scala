package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.distTypesRequestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAllTemplates extends StObject {
  
  /**
    * List all templates available to pass as an option when [creating a repository](https://docs.github.com/rest/reference/repos#create-a-repository-for-the-authenticated-user).
    */
  def getAllTemplates(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /gitignore/templates']['response'] */ js.Any
  ]
  def getAllTemplates(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /gitignore/templates']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /gitignore/templates']['response'] */ js.Any
  ]
  /**
    * List all templates available to pass as an option when [creating a repository](https://docs.github.com/rest/reference/repos#create-a-repository-for-the-authenticated-user).
    */
  @JSName("getAllTemplates")
  var getAllTemplates_Original: `326`
  
  /**
    * The API also allows fetching the source of a single template.
    * Use the raw [media type](https://docs.github.com/rest/overview/media-types/) to get the raw contents.
    */
  def getTemplate(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /gitignore/templates/{name}']['response'] */ js.Any
  ]
  def getTemplate(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /gitignore/templates/{name}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /gitignore/templates/{name}']['response'] */ js.Any
  ]
  /**
    * The API also allows fetching the source of a single template.
    * Use the raw [media type](https://docs.github.com/rest/overview/media-types/) to get the raw contents.
    */
  @JSName("getTemplate")
  var getTemplate_Original: `327`
}
object GetAllTemplates {
  
  inline def apply(getAllTemplates: `326`, getTemplate: `327`): GetAllTemplates = {
    val __obj = js.Dynamic.literal(getAllTemplates = getAllTemplates.asInstanceOf[js.Any], getTemplate = getTemplate.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAllTemplates]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetAllTemplates] (val x: Self) extends AnyVal {
    
    inline def setGetAllTemplates(value: `326`): Self = StObject.set(x, "getAllTemplates", value.asInstanceOf[js.Any])
    
    inline def setGetTemplate(value: `327`): Self = StObject.set(x, "getTemplate", value.asInstanceOf[js.Any])
  }
}
