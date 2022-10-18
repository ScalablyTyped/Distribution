package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.distTypesRequestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CheckIsStarred extends StObject {
  
  def checkIsStarred(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /gists/{gist_id}/star']['response'] */ js.Any
  ]
  def checkIsStarred(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /gists/{gist_id}/star']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /gists/{gist_id}/star']['response'] */ js.Any
  ]
  @JSName("checkIsStarred")
  var checkIsStarred_Original: `267`
  
  /**
    * Allows you to add a new gist with one or more files.
    *
    * **Note:** Don't name your files "gistfile" with a numerical suffix. This is the format of the automatic naming scheme that Gist uses internally.
    */
  def create(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /gists']['response'] */ js.Any
  ]
  def create(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /gists']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /gists']['response'] */ js.Any
  ]
  
  def createComment(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /gists/{gist_id}/comments']['response'] */ js.Any
  ]
  def createComment(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /gists/{gist_id}/comments']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /gists/{gist_id}/comments']['response'] */ js.Any
  ]
  @JSName("createComment")
  var createComment_Original: `269`
  
  /**
    * Allows you to add a new gist with one or more files.
    *
    * **Note:** Don't name your files "gistfile" with a numerical suffix. This is the format of the automatic naming scheme that Gist uses internally.
    */
  @JSName("create")
  var create_Original: `268`
  
  def delete(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /gists/{gist_id}']['response'] */ js.Any
  ]
  def delete(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /gists/{gist_id}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /gists/{gist_id}']['response'] */ js.Any
  ]
  
  def deleteComment(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /gists/{gist_id}/comments/{comment_id}']['response'] */ js.Any
  ]
  def deleteComment(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /gists/{gist_id}/comments/{comment_id}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /gists/{gist_id}/comments/{comment_id}']['response'] */ js.Any
  ]
  @JSName("deleteComment")
  var deleteComment_Original: `271`
  
  @JSName("delete")
  var delete_Original: `270`
  
  def fork(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /gists/{gist_id}/forks']['response'] */ js.Any
  ]
  def fork(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /gists/{gist_id}/forks']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['POST /gists/{gist_id}/forks']['response'] */ js.Any
  ]
  @JSName("fork")
  var fork_Original: `272`
  
  def get(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /gists/{gist_id}']['response'] */ js.Any
  ]
  def get(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /gists/{gist_id}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /gists/{gist_id}']['response'] */ js.Any
  ]
  
  def getComment(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /gists/{gist_id}/comments/{comment_id}']['response'] */ js.Any
  ]
  def getComment(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /gists/{gist_id}/comments/{comment_id}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /gists/{gist_id}/comments/{comment_id}']['response'] */ js.Any
  ]
  @JSName("getComment")
  var getComment_Original: `274`
  
  def getRevision(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /gists/{gist_id}/{sha}']['response'] */ js.Any
  ]
  def getRevision(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /gists/{gist_id}/{sha}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /gists/{gist_id}/{sha}']['response'] */ js.Any
  ]
  @JSName("getRevision")
  var getRevision_Original: `275`
  
  @JSName("get")
  var get_Original: `273`
  
  /**
    * Lists the authenticated user's gists or if called anonymously, this endpoint returns all public gists:
    */
  def list(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /gists']['response'] */ js.Any
  ]
  def list(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /gists']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /gists']['response'] */ js.Any
  ]
  
  def listComments(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /gists/{gist_id}/comments']['response'] */ js.Any
  ]
  def listComments(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /gists/{gist_id}/comments']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /gists/{gist_id}/comments']['response'] */ js.Any
  ]
  @JSName("listComments")
  var listComments_Original: `277`
  
  def listCommits(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /gists/{gist_id}/commits']['response'] */ js.Any
  ]
  def listCommits(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /gists/{gist_id}/commits']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /gists/{gist_id}/commits']['response'] */ js.Any
  ]
  @JSName("listCommits")
  var listCommits_Original: `278`
  
  /**
    * Lists public gists for the specified user:
    */
  def listForUser(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /users/{username}/gists']['response'] */ js.Any
  ]
  def listForUser(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /users/{username}/gists']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /users/{username}/gists']['response'] */ js.Any
  ]
  /**
    * Lists public gists for the specified user:
    */
  @JSName("listForUser")
  var listForUser_Original: `279`
  
  def listForks(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /gists/{gist_id}/forks']['response'] */ js.Any
  ]
  def listForks(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /gists/{gist_id}/forks']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /gists/{gist_id}/forks']['response'] */ js.Any
  ]
  @JSName("listForks")
  var listForks_Original: `280`
  
  /**
    * List public gists sorted by most recently updated to least recently updated.
    *
    * Note: With [pagination](https://docs.github.com/rest/overview/resources-in-the-rest-api#pagination), you can fetch up to 3000 gists. For example, you can fetch 100 pages with 30 gists per page or 30 pages with 100 gists per page.
    */
  def listPublic(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /gists/public']['response'] */ js.Any
  ]
  def listPublic(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /gists/public']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /gists/public']['response'] */ js.Any
  ]
  /**
    * List public gists sorted by most recently updated to least recently updated.
    *
    * Note: With [pagination](https://docs.github.com/rest/overview/resources-in-the-rest-api#pagination), you can fetch up to 3000 gists. For example, you can fetch 100 pages with 30 gists per page or 30 pages with 100 gists per page.
    */
  @JSName("listPublic")
  var listPublic_Original: `281`
  
  /**
    * List the authenticated user's starred gists:
    */
  def listStarred(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /gists/starred']['response'] */ js.Any
  ]
  def listStarred(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /gists/starred']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /gists/starred']['response'] */ js.Any
  ]
  /**
    * List the authenticated user's starred gists:
    */
  @JSName("listStarred")
  var listStarred_Original: `282`
  
  /**
    * Lists the authenticated user's gists or if called anonymously, this endpoint returns all public gists:
    */
  @JSName("list")
  var list_Original: `276`
  
  /**
    * Note that you'll need to set `Content-Length` to zero when calling out to this endpoint. For more information, see "[HTTP verbs](https://docs.github.com/rest/overview/resources-in-the-rest-api#http-verbs)."
    */
  def star(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /gists/{gist_id}/star']['response'] */ js.Any
  ]
  def star(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /gists/{gist_id}/star']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PUT /gists/{gist_id}/star']['response'] */ js.Any
  ]
  /**
    * Note that you'll need to set `Content-Length` to zero when calling out to this endpoint. For more information, see "[HTTP verbs](https://docs.github.com/rest/overview/resources-in-the-rest-api#http-verbs)."
    */
  @JSName("star")
  var star_Original: `283`
  
  def unstar(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /gists/{gist_id}/star']['response'] */ js.Any
  ]
  def unstar(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /gists/{gist_id}/star']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['DELETE /gists/{gist_id}/star']['response'] */ js.Any
  ]
  @JSName("unstar")
  var unstar_Original: `284`
  
  /**
    * Allows you to update or delete a gist file and rename gist files. Files from the previous version of the gist that aren't explicitly changed during an edit are unchanged.
    */
  def update(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /gists/{gist_id}']['response'] */ js.Any
  ]
  def update(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /gists/{gist_id}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /gists/{gist_id}']['response'] */ js.Any
  ]
  
  def updateComment(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /gists/{gist_id}/comments/{comment_id}']['response'] */ js.Any
  ]
  def updateComment(
    params: RequestParameters & (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /gists/{gist_id}/comments/{comment_id}']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['PATCH /gists/{gist_id}/comments/{comment_id}']['response'] */ js.Any
  ]
  @JSName("updateComment")
  var updateComment_Original: `286`
  
  /**
    * Allows you to update or delete a gist file and rename gist files. Files from the previous version of the gist that aren't explicitly changed during an edit are unchanged.
    */
  @JSName("update")
  var update_Original: `285`
}
object CheckIsStarred {
  
  inline def apply(
    checkIsStarred: `267`,
    create: `268`,
    createComment: `269`,
    delete: `270`,
    deleteComment: `271`,
    fork: `272`,
    get: `273`,
    getComment: `274`,
    getRevision: `275`,
    list: `276`,
    listComments: `277`,
    listCommits: `278`,
    listForUser: `279`,
    listForks: `280`,
    listPublic: `281`,
    listStarred: `282`,
    star: `283`,
    unstar: `284`,
    update: `285`,
    updateComment: `286`
  ): CheckIsStarred = {
    val __obj = js.Dynamic.literal(checkIsStarred = checkIsStarred.asInstanceOf[js.Any], create = create.asInstanceOf[js.Any], createComment = createComment.asInstanceOf[js.Any], delete = delete.asInstanceOf[js.Any], deleteComment = deleteComment.asInstanceOf[js.Any], fork = fork.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], getComment = getComment.asInstanceOf[js.Any], getRevision = getRevision.asInstanceOf[js.Any], list = list.asInstanceOf[js.Any], listComments = listComments.asInstanceOf[js.Any], listCommits = listCommits.asInstanceOf[js.Any], listForUser = listForUser.asInstanceOf[js.Any], listForks = listForks.asInstanceOf[js.Any], listPublic = listPublic.asInstanceOf[js.Any], listStarred = listStarred.asInstanceOf[js.Any], star = star.asInstanceOf[js.Any], unstar = unstar.asInstanceOf[js.Any], update = update.asInstanceOf[js.Any], updateComment = updateComment.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckIsStarred]
  }
  
  extension [Self <: CheckIsStarred](x: Self) {
    
    inline def setCheckIsStarred(value: `267`): Self = StObject.set(x, "checkIsStarred", value.asInstanceOf[js.Any])
    
    inline def setCreate(value: `268`): Self = StObject.set(x, "create", value.asInstanceOf[js.Any])
    
    inline def setCreateComment(value: `269`): Self = StObject.set(x, "createComment", value.asInstanceOf[js.Any])
    
    inline def setDelete(value: `270`): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setDeleteComment(value: `271`): Self = StObject.set(x, "deleteComment", value.asInstanceOf[js.Any])
    
    inline def setFork(value: `272`): Self = StObject.set(x, "fork", value.asInstanceOf[js.Any])
    
    inline def setGet(value: `273`): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setGetComment(value: `274`): Self = StObject.set(x, "getComment", value.asInstanceOf[js.Any])
    
    inline def setGetRevision(value: `275`): Self = StObject.set(x, "getRevision", value.asInstanceOf[js.Any])
    
    inline def setList(value: `276`): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
    
    inline def setListComments(value: `277`): Self = StObject.set(x, "listComments", value.asInstanceOf[js.Any])
    
    inline def setListCommits(value: `278`): Self = StObject.set(x, "listCommits", value.asInstanceOf[js.Any])
    
    inline def setListForUser(value: `279`): Self = StObject.set(x, "listForUser", value.asInstanceOf[js.Any])
    
    inline def setListForks(value: `280`): Self = StObject.set(x, "listForks", value.asInstanceOf[js.Any])
    
    inline def setListPublic(value: `281`): Self = StObject.set(x, "listPublic", value.asInstanceOf[js.Any])
    
    inline def setListStarred(value: `282`): Self = StObject.set(x, "listStarred", value.asInstanceOf[js.Any])
    
    inline def setStar(value: `283`): Self = StObject.set(x, "star", value.asInstanceOf[js.Any])
    
    inline def setUnstar(value: `284`): Self = StObject.set(x, "unstar", value.asInstanceOf[js.Any])
    
    inline def setUpdate(value: `285`): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
    
    inline def setUpdateComment(value: `286`): Self = StObject.set(x, "updateComment", value.asInstanceOf[js.Any])
  }
}
