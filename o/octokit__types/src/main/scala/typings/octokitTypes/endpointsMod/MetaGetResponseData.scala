package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.MD5DSA
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MetaGetResponseData extends StObject {
  
  var api: js.Array[String]
  
  var git: js.Array[String]
  
  var hooks: js.Array[String]
  
  var importer: js.Array[String]
  
  var pages: js.Array[String]
  
  var ssh_key_fingerprints: MD5DSA
  
  var verifiable_password_authentication: Boolean
  
  var web: js.Array[String]
}
object MetaGetResponseData {
  
  inline def apply(
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
  
  extension [Self <: MetaGetResponseData](x: Self) {
    
    inline def setApi(value: js.Array[String]): Self = StObject.set(x, "api", value.asInstanceOf[js.Any])
    
    inline def setApiVarargs(value: String*): Self = StObject.set(x, "api", js.Array(value :_*))
    
    inline def setGit(value: js.Array[String]): Self = StObject.set(x, "git", value.asInstanceOf[js.Any])
    
    inline def setGitVarargs(value: String*): Self = StObject.set(x, "git", js.Array(value :_*))
    
    inline def setHooks(value: js.Array[String]): Self = StObject.set(x, "hooks", value.asInstanceOf[js.Any])
    
    inline def setHooksVarargs(value: String*): Self = StObject.set(x, "hooks", js.Array(value :_*))
    
    inline def setImporter(value: js.Array[String]): Self = StObject.set(x, "importer", value.asInstanceOf[js.Any])
    
    inline def setImporterVarargs(value: String*): Self = StObject.set(x, "importer", js.Array(value :_*))
    
    inline def setPages(value: js.Array[String]): Self = StObject.set(x, "pages", value.asInstanceOf[js.Any])
    
    inline def setPagesVarargs(value: String*): Self = StObject.set(x, "pages", js.Array(value :_*))
    
    inline def setSsh_key_fingerprints(value: MD5DSA): Self = StObject.set(x, "ssh_key_fingerprints", value.asInstanceOf[js.Any])
    
    inline def setVerifiable_password_authentication(value: Boolean): Self = StObject.set(x, "verifiable_password_authentication", value.asInstanceOf[js.Any])
    
    inline def setWeb(value: js.Array[String]): Self = StObject.set(x, "web", value.asInstanceOf[js.Any])
    
    inline def setWebVarargs(value: String*): Self = StObject.set(x, "web", js.Array(value :_*))
  }
}
