package typings.octokitTypes.endpointsMod

import typings.node.Buffer
import typings.octokitTypes.anon.ContenttypeString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReposUploadReleaseAssetEndpoint extends StObject {
  
  /**
    * For https://api.github.com, set `baseUrl` to `https://uploads.github.com`. For GitHub Enterprise Server, set it to `<your hostname>/api/uploads`
    */
  var baseUrl: String
  
  /**
    * The raw file data
    */
  var data: String | Buffer
  
  var headers: ContenttypeString
  
  /**
    * label parameter
    */
  var label: js.UndefOr[String] = js.undefined
  
  /**
    * name parameter
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The URL origin (protocol + host name + port) is included in `upload_url` returned in the response of the "Create a release" endpoint
    */
  var origin: js.UndefOr[String] = js.undefined
  
  /**
    * owner parameter
    */
  var owner: String
  
  /**
    * release_id parameter
    */
  var release_id: Double
  
  /**
    * repo parameter
    */
  var repo: String
}
object ReposUploadReleaseAssetEndpoint {
  
  @scala.inline
  def apply(
    baseUrl: String,
    data: String | Buffer,
    headers: ContenttypeString,
    owner: String,
    release_id: Double,
    repo: String
  ): ReposUploadReleaseAssetEndpoint = {
    val __obj = js.Dynamic.literal(baseUrl = baseUrl.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], release_id = release_id.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposUploadReleaseAssetEndpoint]
  }
  
  @scala.inline
  implicit class ReposUploadReleaseAssetEndpointMutableBuilder[Self <: ReposUploadReleaseAssetEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBaseUrl(value: String): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData(value: String | Buffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaders(value: ContenttypeString): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
    
    @scala.inline
    def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelease_id(value: Double): Self = StObject.set(x, "release_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
  }
}
