package typings.mendixmodelsdk.securityMod.security

import typings.mendixmodelsdk.instancesMod.IList
import typings.mendixmodelsdk.projectsMod.projects.IProjectDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide/project-security relevant section in reference guide}
  */
@js.native
trait IProjectSecurity extends IProjectDocument {
  
  val userRoles: IList[IUserRole] = js.native
}
