package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Api extends StObject {
  
  /**
    * @example [
    *   "192.0.2.1"
    * ]
    */
  var actions: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * @example [
    *   "192.0.2.1"
    * ]
    */
  var api: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * @example [
    *   "192.0.2.1"
    * ]
    */
  var dependabot: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * @example [
    *   "192.0.2.1"
    * ]
    */
  var git: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * @example [
    *   "192.0.2.1"
    * ]
    */
  var hooks: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * @example [
    *   "192.0.2.1"
    * ]
    */
  var importer: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * @example [
    *   "192.0.2.1"
    * ]
    */
  var packages: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * @example [
    *   "192.0.2.1"
    * ]
    */
  var pages: js.UndefOr[js.Array[String]] = js.undefined
  
  var ssh_key_fingerprints: js.UndefOr[SHA256DSA] = js.undefined
  
  /**
    * @example [
    *   "ssh-ed25519 ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    * ]
    */
  var ssh_keys: js.UndefOr[js.Array[String]] = js.undefined
  
  /** @example true */
  var verifiable_password_authentication: Boolean
  
  /**
    * @example [
    *   "192.0.2.1"
    * ]
    */
  var web: js.UndefOr[js.Array[String]] = js.undefined
}
object Api {
  
  inline def apply(verifiable_password_authentication: Boolean): Api = {
    val __obj = js.Dynamic.literal(verifiable_password_authentication = verifiable_password_authentication.asInstanceOf[js.Any])
    __obj.asInstanceOf[Api]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Api] (val x: Self) extends AnyVal {
    
    inline def setActions(value: js.Array[String]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
    
    inline def setActionsVarargs(value: String*): Self = StObject.set(x, "actions", js.Array(value*))
    
    inline def setApi(value: js.Array[String]): Self = StObject.set(x, "api", value.asInstanceOf[js.Any])
    
    inline def setApiUndefined: Self = StObject.set(x, "api", js.undefined)
    
    inline def setApiVarargs(value: String*): Self = StObject.set(x, "api", js.Array(value*))
    
    inline def setDependabot(value: js.Array[String]): Self = StObject.set(x, "dependabot", value.asInstanceOf[js.Any])
    
    inline def setDependabotUndefined: Self = StObject.set(x, "dependabot", js.undefined)
    
    inline def setDependabotVarargs(value: String*): Self = StObject.set(x, "dependabot", js.Array(value*))
    
    inline def setGit(value: js.Array[String]): Self = StObject.set(x, "git", value.asInstanceOf[js.Any])
    
    inline def setGitUndefined: Self = StObject.set(x, "git", js.undefined)
    
    inline def setGitVarargs(value: String*): Self = StObject.set(x, "git", js.Array(value*))
    
    inline def setHooks(value: js.Array[String]): Self = StObject.set(x, "hooks", value.asInstanceOf[js.Any])
    
    inline def setHooksUndefined: Self = StObject.set(x, "hooks", js.undefined)
    
    inline def setHooksVarargs(value: String*): Self = StObject.set(x, "hooks", js.Array(value*))
    
    inline def setImporter(value: js.Array[String]): Self = StObject.set(x, "importer", value.asInstanceOf[js.Any])
    
    inline def setImporterUndefined: Self = StObject.set(x, "importer", js.undefined)
    
    inline def setImporterVarargs(value: String*): Self = StObject.set(x, "importer", js.Array(value*))
    
    inline def setPackages(value: js.Array[String]): Self = StObject.set(x, "packages", value.asInstanceOf[js.Any])
    
    inline def setPackagesUndefined: Self = StObject.set(x, "packages", js.undefined)
    
    inline def setPackagesVarargs(value: String*): Self = StObject.set(x, "packages", js.Array(value*))
    
    inline def setPages(value: js.Array[String]): Self = StObject.set(x, "pages", value.asInstanceOf[js.Any])
    
    inline def setPagesUndefined: Self = StObject.set(x, "pages", js.undefined)
    
    inline def setPagesVarargs(value: String*): Self = StObject.set(x, "pages", js.Array(value*))
    
    inline def setSsh_key_fingerprints(value: SHA256DSA): Self = StObject.set(x, "ssh_key_fingerprints", value.asInstanceOf[js.Any])
    
    inline def setSsh_key_fingerprintsUndefined: Self = StObject.set(x, "ssh_key_fingerprints", js.undefined)
    
    inline def setSsh_keys(value: js.Array[String]): Self = StObject.set(x, "ssh_keys", value.asInstanceOf[js.Any])
    
    inline def setSsh_keysUndefined: Self = StObject.set(x, "ssh_keys", js.undefined)
    
    inline def setSsh_keysVarargs(value: String*): Self = StObject.set(x, "ssh_keys", js.Array(value*))
    
    inline def setVerifiable_password_authentication(value: Boolean): Self = StObject.set(x, "verifiable_password_authentication", value.asInstanceOf[js.Any])
    
    inline def setWeb(value: js.Array[String]): Self = StObject.set(x, "web", value.asInstanceOf[js.Any])
    
    inline def setWebUndefined: Self = StObject.set(x, "web", js.undefined)
    
    inline def setWebVarargs(value: String*): Self = StObject.set(x, "web", js.Array(value*))
  }
}
