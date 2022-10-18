package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Stats extends StObject {
  
  var author: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['nullable-simple-user'] */ js.Any
  
  /**
    * Format: uri
    * @example https://api.github.com/repos/octocat/Hello-World/commits/6dcb09b5b57875f334f61aebed695e2e4193db5e/comments
    */
  var comments_url: String
  
  var commit: Tree
  
  var committer: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['nullable-simple-user'] */ js.Any
  
  var files: js.UndefOr[
    js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['diff-entry'] */ js.Any
    ]
  ] = js.undefined
  
  /**
    * Format: uri
    * @example https://github.com/octocat/Hello-World/commit/6dcb09b5b57875f334f61aebed695e2e4193db5e
    */
  var html_url: String
  
  /** @example MDY6Q29tbWl0NmRjYjA5YjViNTc4NzVmMzM0ZjYxYWViZWQ2OTVlMmU0MTkzZGI1ZQ== */
  var node_id: String
  
  var parents: js.Array[HtmlurlSha]
  
  /** @example 6dcb09b5b57875f334f61aebed695e2e4193db5e */
  var sha: String
  
  var stats: js.UndefOr[Deletions] = js.undefined
  
  /**
    * Format: uri
    * @example https://api.github.com/repos/octocat/Hello-World/commits/6dcb09b5b57875f334f61aebed695e2e4193db5e
    */
  var url: String
}
object Stats {
  
  inline def apply(
    author: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['nullable-simple-user'] */ js.Any,
    comments_url: String,
    commit: Tree,
    committer: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['nullable-simple-user'] */ js.Any,
    html_url: String,
    node_id: String,
    parents: js.Array[HtmlurlSha],
    sha: String,
    url: String
  ): Stats = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], comments_url = comments_url.asInstanceOf[js.Any], commit = commit.asInstanceOf[js.Any], committer = committer.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], parents = parents.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Stats]
  }
  
  extension [Self <: Stats](x: Self) {
    
    inline def setAuthor(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['nullable-simple-user'] */ js.Any
    ): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    inline def setComments_url(value: String): Self = StObject.set(x, "comments_url", value.asInstanceOf[js.Any])
    
    inline def setCommit(value: Tree): Self = StObject.set(x, "commit", value.asInstanceOf[js.Any])
    
    inline def setCommitter(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['nullable-simple-user'] */ js.Any
    ): Self = StObject.set(x, "committer", value.asInstanceOf[js.Any])
    
    inline def setFiles(
      value: js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['diff-entry'] */ js.Any
        ]
    ): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
    
    inline def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
    
    inline def setFilesVarargs(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['diff-entry'] */ js.Any)*
    ): Self = StObject.set(x, "files", js.Array(value*))
    
    inline def setHtml_url(value: String): Self = StObject.set(x, "html_url", value.asInstanceOf[js.Any])
    
    inline def setNode_id(value: String): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
    
    inline def setParents(value: js.Array[HtmlurlSha]): Self = StObject.set(x, "parents", value.asInstanceOf[js.Any])
    
    inline def setParentsVarargs(value: HtmlurlSha*): Self = StObject.set(x, "parents", js.Array(value*))
    
    inline def setSha(value: String): Self = StObject.set(x, "sha", value.asInstanceOf[js.Any])
    
    inline def setStats(value: Deletions): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
    
    inline def setStatsUndefined: Self = StObject.set(x, "stats", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
