package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.distTypesRequestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateRepositorySnapshot extends StObject {
  
  /**
    * Create a new snapshot of a repository's dependencies. You must authenticate using an access token with the `repo` scope to use this endpoint for a repository that the requesting user has access to.
    */
  def createRepositorySnapshot(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/dependency-graph/snapshots']['response'] */ js.Any
  ]
  def createRepositorySnapshot(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/dependency-graph/snapshots']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /repos/{owner}/{repo}/dependency-graph/snapshots']['response'] */ js.Any
  ]
  /**
    * Create a new snapshot of a repository's dependencies. You must authenticate using an access token with the `repo` scope to use this endpoint for a repository that the requesting user has access to.
    */
  @JSName("createRepositorySnapshot")
  var createRepositorySnapshot_Original: `250`
  
  /**
    * Gets the diff of the dependency changes between two commits of a repository, based on the changes to the dependency manifests made in those commits.
    */
  def diffRange(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/dependency-graph/compare/{basehead}']['response'] */ js.Any
  ]
  def diffRange(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/dependency-graph/compare/{basehead}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/{owner}/{repo}/dependency-graph/compare/{basehead}']['response'] */ js.Any
  ]
  /**
    * Gets the diff of the dependency changes between two commits of a repository, based on the changes to the dependency manifests made in those commits.
    */
  @JSName("diffRange")
  var diffRange_Original: `251`
}
object CreateRepositorySnapshot {
  
  inline def apply(createRepositorySnapshot: `250`, diffRange: `251`): CreateRepositorySnapshot = {
    val __obj = js.Dynamic.literal(createRepositorySnapshot = createRepositorySnapshot.asInstanceOf[js.Any], diffRange = diffRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateRepositorySnapshot]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateRepositorySnapshot] (val x: Self) extends AnyVal {
    
    inline def setCreateRepositorySnapshot(value: `250`): Self = StObject.set(x, "createRepositorySnapshot", value.asInstanceOf[js.Any])
    
    inline def setDiffRange(value: `251`): Self = StObject.set(x, "diffRange", value.asInstanceOf[js.Any])
  }
}
