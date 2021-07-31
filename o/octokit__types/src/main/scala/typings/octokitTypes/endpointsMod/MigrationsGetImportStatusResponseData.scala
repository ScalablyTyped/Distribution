package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MigrationsGetImportStatusResponseData extends StObject {
  
  var authors_count: Double
  
  var authors_url: String
  
  var has_large_files: Boolean
  
  var html_url: String
  
  var large_files_count: Double
  
  var large_files_size: Double
  
  var repository_url: String
  
  var status: String
  
  var status_text: String
  
  var url: String
  
  var use_lfs: String
  
  var vcs: String
  
  var vcs_url: String
}
object MigrationsGetImportStatusResponseData {
  
  @scala.inline
  def apply(
    authors_count: Double,
    authors_url: String,
    has_large_files: Boolean,
    html_url: String,
    large_files_count: Double,
    large_files_size: Double,
    repository_url: String,
    status: String,
    status_text: String,
    url: String,
    use_lfs: String,
    vcs: String,
    vcs_url: String
  ): MigrationsGetImportStatusResponseData = {
    val __obj = js.Dynamic.literal(authors_count = authors_count.asInstanceOf[js.Any], authors_url = authors_url.asInstanceOf[js.Any], has_large_files = has_large_files.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], large_files_count = large_files_count.asInstanceOf[js.Any], large_files_size = large_files_size.asInstanceOf[js.Any], repository_url = repository_url.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], status_text = status_text.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], use_lfs = use_lfs.asInstanceOf[js.Any], vcs = vcs.asInstanceOf[js.Any], vcs_url = vcs_url.asInstanceOf[js.Any])
    __obj.asInstanceOf[MigrationsGetImportStatusResponseData]
  }
  
  @scala.inline
  implicit class MigrationsGetImportStatusResponseDataMutableBuilder[Self <: MigrationsGetImportStatusResponseData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthors_count(value: Double): Self = StObject.set(x, "authors_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthors_url(value: String): Self = StObject.set(x, "authors_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHas_large_files(value: Boolean): Self = StObject.set(x, "has_large_files", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtml_url(value: String): Self = StObject.set(x, "html_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLarge_files_count(value: Double): Self = StObject.set(x, "large_files_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLarge_files_size(value: Double): Self = StObject.set(x, "large_files_size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepository_url(value: String): Self = StObject.set(x, "repository_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus_text(value: String): Self = StObject.set(x, "status_text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUse_lfs(value: String): Self = StObject.set(x, "use_lfs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVcs(value: String): Self = StObject.set(x, "vcs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVcs_url(value: String): Self = StObject.set(x, "vcs_url", value.asInstanceOf[js.Any])
  }
}
