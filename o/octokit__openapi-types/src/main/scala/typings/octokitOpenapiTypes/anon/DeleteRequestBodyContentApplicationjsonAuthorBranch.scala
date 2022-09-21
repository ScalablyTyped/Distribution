package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteRequestBodyContentApplicationjsonAuthorBranch extends StObject {
  
  /**
    * Deletes a file in a repository.
    *
    * You can provide an additional `committer` parameter, which is an object containing information about the committer. Or, you can provide an `author` parameter, which is an object containing information about the author.
    *
    * The `author` section is optional and is filled in with the `committer` information if omitted. If the `committer` information is omitted, the authenticated user's information is used.
    *
    * You must provide values for both `name` and `email`, whether you choose to use `author` or `committer`. Otherwise, you'll receive a `422` status code.
    *
    * **Note:** If you use this endpoint and the "[Create or update file contents](https://docs.github.com/rest/reference/repos/#create-or-update-file-contents)" endpoint in parallel, the concurrent requests will conflict and you will receive errors. You must use these endpoints serially instead.
    */
  var delete: RequestBodyContentApplicationjsonAuthorBranch
  
  /**
    * Gets the contents of a file or directory in a repository. Specify the file path or directory in `:path`. If you omit
    * `:path`, you will receive the contents of the repository's root directory. See the description below regarding what the API response includes for directories.
    *
    * Files and symlinks support [a custom media type](https://docs.github.com/rest/reference/repos#custom-media-types) for
    * retrieving the raw content or rendered HTML (when supported). All content types support [a custom media
    * type](https://docs.github.com/rest/reference/repos#custom-media-types) to ensure the content is returned in a consistent
    * object format.
    *
    * **Notes**:
    * *   To get a repository's contents recursively, you can [recursively get the tree](https://docs.github.com/rest/reference/git#trees).
    * *   This API has an upper limit of 1,000 files for a directory. If you need to retrieve more files, use the [Git Trees
    * API](https://docs.github.com/rest/reference/git#get-a-tree).
    *  *  Download URLs expire and are meant to be used just once. To ensure the download URL does not expire, please use the contents API to obtain a fresh download URL for each download.
    * #### Size limits
    * If the requested file's size is:
    * * 1 MB or smaller: All features of this endpoint are supported.
    * * Between 1-100 MB: Only the `raw` or `object` [custom media types](https://docs.github.com/rest/repos/contents#custom-media-types-for-repository-contents) are supported. Both will work as normal, except that when using the `object` media type, the `content` field will be an empty string and the `encoding` field will be `"none"`. To get the contents of these larger files, use the `raw` media type.
    *  * Greater than 100 MB: This endpoint is not supported.
    *
    * #### If the content is a directory
    * The response will be an array of objects, one object for each item in the directory.
    * When listing the contents of a directory, submodules have their "type" specified as "file". Logically, the value
    * _should_ be "submodule". This behavior exists in API v3 [for backwards compatibility purposes](https://git.io/v1YCW).
    * In the next major version of the API, the type will be returned as "submodule".
    *
    * #### If the content is a symlink
    * If the requested `:path` points to a symlink, and the symlink's target is a normal file in the repository, then the
    * API responds with the content of the file (in the format shown in the example. Otherwise, the API responds with an object
    * describing the symlink itself.
    *
    * #### If the content is a submodule
    * The `submodule_git_url` identifies the location of the submodule repository, and the `sha` identifies a specific
    * commit within the submodule repository. Git uses the given URL when cloning the submodule repository, and checks out
    * the submodule at that specific commit.
    *
    * If the submodule repository is not hosted on github.com, the Git URLs (`git_url` and `_links["git"]`) and the
    * github.com URLs (`html_url` and `_links["html"]`) will have null values.
    */
  var get: ParametersPathOwnerPath
  
  /**
    * Creates a new file or replaces an existing file in a repository. You must authenticate using an access token with the `workflow` scope to use this endpoint.
    *
    * **Note:** If you use this endpoint and the "[Delete a file](https://docs.github.com/rest/reference/repos/#delete-file)" endpoint in parallel, the concurrent requests will conflict and you will receive errors. You must use these endpoints serially instead.
    */
  var put: Parameters219
}
object DeleteRequestBodyContentApplicationjsonAuthorBranch {
  
  inline def apply(
    delete: RequestBodyContentApplicationjsonAuthorBranch,
    get: ParametersPathOwnerPath,
    put: Parameters219
  ): DeleteRequestBodyContentApplicationjsonAuthorBranch = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteRequestBodyContentApplicationjsonAuthorBranch]
  }
  
  extension [Self <: DeleteRequestBodyContentApplicationjsonAuthorBranch](x: Self) {
    
    inline def setDelete(value: RequestBodyContentApplicationjsonAuthorBranch): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: ParametersPathOwnerPath): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPut(value: Parameters219): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
  }
}
