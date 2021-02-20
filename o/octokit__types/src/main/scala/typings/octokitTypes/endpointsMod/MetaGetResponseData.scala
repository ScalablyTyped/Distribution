package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.MD5DSA
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MetaGetResponseData extends StObject {
  
  var api: js.Array[String] = js.native
  
  var git: js.Array[String] = js.native
  
  var hooks: js.Array[String] = js.native
  
  var importer: js.Array[String] = js.native
  
  var pages: js.Array[String] = js.native
  
  var ssh_key_fingerprints: MD5DSA = js.native
  
  var verifiable_password_authentication: Boolean = js.native
  
  var web: js.Array[String] = js.native
}
object MetaGetResponseData {
  
  @scala.inline
  def apply(
    api: js.Array[String],
    git: js.Array[String],
    hooks: js.Array[String],
    importer: js.Array[String],
    pages: js.Array[String],
    ssh_key_fingerprints: MD5DSA,
    verifiable_password_authentication: Boolean,
    web: js.Array[String]
  ): MetaGetResponseData = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], git = git.asInstanceOf[js.Any], hooks = hooks.asInstanceOf[js.Any], importer = importer.asInstanceOf[js.Any], pages = pages.asInstanceOf[js.Any], ssh_key_fingerprints = ssh_key_fingerprints.asInstanceOf[js.Any], verifiable_password_authentication = verifiable_password_authentication.asInstanceOf[js.Any], web = web.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetaGetResponseData]
  }
  
  @scala.inline
  implicit class MetaGetResponseDataMutableBuilder[Self <: MetaGetResponseData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApi(value: js.Array[String]): Self = StObject.set(x, "api", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApiVarargs(value: String*): Self = StObject.set(x, "api", js.Array(value :_*))
    
    @scala.inline
    def setGit(value: js.Array[String]): Self = StObject.set(x, "git", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGitVarargs(value: String*): Self = StObject.set(x, "git", js.Array(value :_*))
    
    @scala.inline
    def setHooks(value: js.Array[String]): Self = StObject.set(x, "hooks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHooksVarargs(value: String*): Self = StObject.set(x, "hooks", js.Array(value :_*))
    
    @scala.inline
    def setImporter(value: js.Array[String]): Self = StObject.set(x, "importer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImporterVarargs(value: String*): Self = StObject.set(x, "importer", js.Array(value :_*))
    
    @scala.inline
    def setPages(value: js.Array[String]): Self = StObject.set(x, "pages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPagesVarargs(value: String*): Self = StObject.set(x, "pages", js.Array(value :_*))
    
    @scala.inline
    def setSsh_key_fingerprints(value: MD5DSA): Self = StObject.set(x, "ssh_key_fingerprints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerifiable_password_authentication(value: Boolean): Self = StObject.set(x, "verifiable_password_authentication", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeb(value: js.Array[String]): Self = StObject.set(x, "web", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebVarargs(value: String*): Self = StObject.set(x, "web", js.Array(value :_*))
  }
}
