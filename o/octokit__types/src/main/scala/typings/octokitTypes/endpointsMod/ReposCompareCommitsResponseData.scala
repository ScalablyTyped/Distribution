package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Bloburl
import typings.octokitTypes.anon.Commentsurl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReposCompareCommitsResponseData extends StObject {
  
  var ahead_by: Double
  
  var base_commit: Commentsurl
  
  var behind_by: Double
  
  var commits: js.Array[Commentsurl]
  
  var diff_url: String
  
  var files: js.Array[Bloburl]
  
  var html_url: String
  
  var merge_base_commit: Commentsurl
  
  var patch_url: String
  
  var permalink_url: String
  
  var status: String
  
  var total_commits: Double
  
  var url: String
}
object ReposCompareCommitsResponseData {
  
  @scala.inline
  def apply(
    ahead_by: Double,
    base_commit: Commentsurl,
    behind_by: Double,
    commits: js.Array[Commentsurl],
    diff_url: String,
    files: js.Array[Bloburl],
    html_url: String,
    merge_base_commit: Commentsurl,
    patch_url: String,
    permalink_url: String,
    status: String,
    total_commits: Double,
    url: String
  ): ReposCompareCommitsResponseData = {
    val __obj = js.Dynamic.literal(ahead_by = ahead_by.asInstanceOf[js.Any], base_commit = base_commit.asInstanceOf[js.Any], behind_by = behind_by.asInstanceOf[js.Any], commits = commits.asInstanceOf[js.Any], diff_url = diff_url.asInstanceOf[js.Any], files = files.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], merge_base_commit = merge_base_commit.asInstanceOf[js.Any], patch_url = patch_url.asInstanceOf[js.Any], permalink_url = permalink_url.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], total_commits = total_commits.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposCompareCommitsResponseData]
  }
  
  @scala.inline
  implicit class ReposCompareCommitsResponseDataMutableBuilder[Self <: ReposCompareCommitsResponseData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAhead_by(value: Double): Self = StObject.set(x, "ahead_by", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBase_commit(value: Commentsurl): Self = StObject.set(x, "base_commit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBehind_by(value: Double): Self = StObject.set(x, "behind_by", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommits(value: js.Array[Commentsurl]): Self = StObject.set(x, "commits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommitsVarargs(value: Commentsurl*): Self = StObject.set(x, "commits", js.Array(value :_*))
    
    @scala.inline
    def setDiff_url(value: String): Self = StObject.set(x, "diff_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiles(value: js.Array[Bloburl]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilesVarargs(value: Bloburl*): Self = StObject.set(x, "files", js.Array(value :_*))
    
    @scala.inline
    def setHtml_url(value: String): Self = StObject.set(x, "html_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMerge_base_commit(value: Commentsurl): Self = StObject.set(x, "merge_base_commit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatch_url(value: String): Self = StObject.set(x, "patch_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermalink_url(value: String): Self = StObject.set(x, "permalink_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotal_commits(value: Double): Self = StObject.set(x, "total_commits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
