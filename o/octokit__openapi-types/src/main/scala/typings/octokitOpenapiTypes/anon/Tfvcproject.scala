package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.git
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.mercurial
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.subversion
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.tfvc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Tfvcproject extends StObject {
  
  /** @description For a tfvc import, the name of the project that is being imported. */
  var tfvc_project: js.UndefOr[String] = js.undefined
  
  /**
    * @description The originating VCS type. Without this parameter, the import job will take additional time to detect the VCS type before beginning the import. This detection step will be reflected in the response.
    * @enum {string}
    */
  var vcs: js.UndefOr[subversion | git | mercurial | tfvc] = js.undefined
  
  /** @description If authentication is required, the password to provide to `vcs_url`. */
  var vcs_password: js.UndefOr[String] = js.undefined
  
  /** @description The URL of the originating repository. */
  var vcs_url: String
  
  /** @description If authentication is required, the username to provide to `vcs_url`. */
  var vcs_username: js.UndefOr[String] = js.undefined
}
object Tfvcproject {
  
  inline def apply(vcs_url: String): Tfvcproject = {
    val __obj = js.Dynamic.literal(vcs_url = vcs_url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tfvcproject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Tfvcproject] (val x: Self) extends AnyVal {
    
    inline def setTfvc_project(value: String): Self = StObject.set(x, "tfvc_project", value.asInstanceOf[js.Any])
    
    inline def setTfvc_projectUndefined: Self = StObject.set(x, "tfvc_project", js.undefined)
    
    inline def setVcs(value: subversion | git | mercurial | tfvc): Self = StObject.set(x, "vcs", value.asInstanceOf[js.Any])
    
    inline def setVcsUndefined: Self = StObject.set(x, "vcs", js.undefined)
    
    inline def setVcs_password(value: String): Self = StObject.set(x, "vcs_password", value.asInstanceOf[js.Any])
    
    inline def setVcs_passwordUndefined: Self = StObject.set(x, "vcs_password", js.undefined)
    
    inline def setVcs_url(value: String): Self = StObject.set(x, "vcs_url", value.asInstanceOf[js.Any])
    
    inline def setVcs_username(value: String): Self = StObject.set(x, "vcs_username", value.asInstanceOf[js.Any])
    
    inline def setVcs_usernameUndefined: Self = StObject.set(x, "vcs_username", js.undefined)
  }
}
