package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Git
import typings.octokitTypes.anon.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LicensesGetForRepoResponseData extends StObject {
  
  var _links: Git = js.native
  
  var content: String = js.native
  
  var download_url: String = js.native
  
  var encoding: String = js.native
  
  var git_url: String = js.native
  
  var html_url: String = js.native
  
  var license: Key = js.native
  
  var name: String = js.native
  
  var path: String = js.native
  
  var sha: String = js.native
  
  var size: Double = js.native
  
  var `type`: String = js.native
  
  var url: String = js.native
}
object LicensesGetForRepoResponseData {
  
  @scala.inline
  def apply(
    _links: Git,
    content: String,
    download_url: String,
    encoding: String,
    git_url: String,
    html_url: String,
    license: Key,
    name: String,
    path: String,
    sha: String,
    size: Double,
    `type`: String,
    url: String
  ): LicensesGetForRepoResponseData = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], download_url = download_url.asInstanceOf[js.Any], encoding = encoding.asInstanceOf[js.Any], git_url = git_url.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], license = license.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LicensesGetForRepoResponseData]
  }
  
  @scala.inline
  implicit class LicensesGetForRepoResponseDataMutableBuilder[Self <: LicensesGetForRepoResponseData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDownload_url(value: String): Self = StObject.set(x, "download_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGit_url(value: String): Self = StObject.set(x, "git_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtml_url(value: String): Self = StObject.set(x, "html_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLicense(value: Key): Self = StObject.set(x, "license", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSha(value: String): Self = StObject.set(x, "sha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_links(value: Git): Self = StObject.set(x, "_links", value.asInstanceOf[js.Any])
  }
}
