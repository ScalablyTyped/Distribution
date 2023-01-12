package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.git
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.mercurial
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.subversion
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.tfvc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Vcs extends StObject {
  
  /**
    * @description For a tfvc import, the name of the project that is being imported.
    * @example "project1"
    */
  var tfvc_project: js.UndefOr[String] = js.undefined
  
  /**
    * @description The type of version control system you are migrating from.
    * @example "git"
    * @enum {string}
    */
  var vcs: js.UndefOr[subversion | tfvc | git | mercurial] = js.undefined
  
  /** @description The password to provide to the originating repository. */
  var vcs_password: js.UndefOr[String] = js.undefined
  
  /** @description The username to provide to the originating repository. */
  var vcs_username: js.UndefOr[String] = js.undefined
}
object Vcs {
  
  inline def apply(): Vcs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Vcs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Vcs] (val x: Self) extends AnyVal {
    
    inline def setTfvc_project(value: String): Self = StObject.set(x, "tfvc_project", value.asInstanceOf[js.Any])
    
    inline def setTfvc_projectUndefined: Self = StObject.set(x, "tfvc_project", js.undefined)
    
    inline def setVcs(value: subversion | tfvc | git | mercurial): Self = StObject.set(x, "vcs", value.asInstanceOf[js.Any])
    
    inline def setVcsUndefined: Self = StObject.set(x, "vcs", js.undefined)
    
    inline def setVcs_password(value: String): Self = StObject.set(x, "vcs_password", value.asInstanceOf[js.Any])
    
    inline def setVcs_passwordUndefined: Self = StObject.set(x, "vcs_password", js.undefined)
    
    inline def setVcs_username(value: String): Self = StObject.set(x, "vcs_username", value.asInstanceOf[js.Any])
    
    inline def setVcs_usernameUndefined: Self = StObject.set(x, "vcs_username", js.undefined)
  }
}
