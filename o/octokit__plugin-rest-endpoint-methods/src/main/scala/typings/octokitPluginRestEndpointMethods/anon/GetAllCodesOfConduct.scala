package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAllCodesOfConduct extends StObject {
  
  def getAllCodesOfConduct(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /codes_of_conduct']['response'] */ js.Any
  ]
  def getAllCodesOfConduct(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /codes_of_conduct']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /codes_of_conduct']['response'] */ js.Any
  ]
  @JSName("getAllCodesOfConduct")
  var getAllCodesOfConduct_Original: `120`
  
  def getConductCode(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /codes_of_conduct/:key']['response'] */ js.Any
  ]
  def getConductCode(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /codes_of_conduct/:key']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /codes_of_conduct/:key']['response'] */ js.Any
  ]
  @JSName("getConductCode")
  var getConductCode_Original: `121`
  
  /**
    * This method returns the contents of the repository's code of conduct file, if one is detected.
    */
  def getForRepo(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/community/code_of_conduct']['response'] */ js.Any
  ]
  def getForRepo(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/community/code_of_conduct']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /repos/:owner/:repo/community/code_of_conduct']['response'] */ js.Any
  ]
  /**
    * This method returns the contents of the repository's code of conduct file, if one is detected.
    */
  @JSName("getForRepo")
  var getForRepo_Original: `122`
}
object GetAllCodesOfConduct {
  
  @scala.inline
  def apply(getAllCodesOfConduct: `120`, getConductCode: `121`, getForRepo: `122`): GetAllCodesOfConduct = {
    val __obj = js.Dynamic.literal(getAllCodesOfConduct = getAllCodesOfConduct.asInstanceOf[js.Any], getConductCode = getConductCode.asInstanceOf[js.Any], getForRepo = getForRepo.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAllCodesOfConduct]
  }
  
  @scala.inline
  implicit class GetAllCodesOfConductMutableBuilder[Self <: GetAllCodesOfConduct] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetAllCodesOfConduct(value: `120`): Self = StObject.set(x, "getAllCodesOfConduct", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetConductCode(value: `121`): Self = StObject.set(x, "getConductCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetForRepo(value: `122`): Self = StObject.set(x, "getForRepo", value.asInstanceOf[js.Any])
  }
}
