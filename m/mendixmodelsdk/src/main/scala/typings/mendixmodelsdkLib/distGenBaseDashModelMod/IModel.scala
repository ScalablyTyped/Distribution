package typings
package mendixmodelsdkLib.distGenBaseDashModelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IModel extends IBaseModel {
  /**
       * The actual contents of the model.
       */
  var root: mendixmodelsdkLib.distGenProjectsMod.projectsNs.IProject = js.native
  /**
       * Given a qualified name, returns a Module.
       */
  def findModuleByQualifiedName(qualifiedName: java.lang.String): mendixmodelsdkLib.distGenProjectsMod.projectsNs.IModule | scala.Null = js.native
}

