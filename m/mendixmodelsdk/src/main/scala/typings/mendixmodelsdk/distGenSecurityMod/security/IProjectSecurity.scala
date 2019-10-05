package typings.mendixmodelsdk.distGenSecurityMod.security

import typings.mendixmodelsdk.distGenProjectsMod.projects.IProjectDocument
import typings.mendixmodelsdk.distSdkInternalInstancesMod.IList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/project-security relevant section in reference guide}
  */
@js.native
trait IProjectSecurity extends IProjectDocument {
  val userRoles: IList[IUserRole] = js.native
}

