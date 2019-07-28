package typings.mendixmodelsdk.distGenBaseDashModelMod

import typings.mendixmodelsdk.distGenProjectsMod.projectsNs.IModule
import typings.mendixmodelsdk.distGenProjectsMod.projectsNs.IProject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IModel extends IBaseModel {
  /**
    * The actual contents of the model.
    */
  var root: IProject = js.native
  /**
    * Given a qualified name, returns a Module.
    */
  def findModuleByQualifiedName(qualifiedName: String): IModule | Null = js.native
}

