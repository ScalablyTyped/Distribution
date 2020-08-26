package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAllTemplates extends js.Object {
  /**
    * List all templates available to pass as an option when [creating a repository](https://developer.github.com/v3/repos/#create-a-repository-for-the-authenticated-user).
    */
  @JSName("getAllTemplates")
  var getAllTemplates_Original: `154` = js.native
  /**
    * The API also allows fetching the source of a single template.
    *
    * Use the raw [media type](https://developer.github.com/v3/media/) to get the raw contents.
    */
  @JSName("getTemplate")
  var getTemplate_Original: `155` = js.native
  /**
    * List all templates available to pass as an option when [creating a repository](https://developer.github.com/v3/repos/#create-a-repository-for-the-authenticated-user).
    */
  def getAllTemplates(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /gitignore/templates']['response'] */ js.Any
  ] = js.native
  def getAllTemplates(
    params: RequestParameters with (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /gitignore/templates']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /gitignore/templates']['response'] */ js.Any
  ] = js.native
  /**
    * The API also allows fetching the source of a single template.
    *
    * Use the raw [media type](https://developer.github.com/v3/media/) to get the raw contents.
    */
  def getTemplate(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /gitignore/templates/:name']['response'] */ js.Any
  ] = js.native
  def getTemplate(
    params: RequestParameters with (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /gitignore/templates/:name']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /gitignore/templates/:name']['response'] */ js.Any
  ] = js.native
}

