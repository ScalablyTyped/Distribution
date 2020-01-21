package typings.mendixmodelsdk.securityMod.security

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.instancesMod.IList
import typings.mendixmodelsdk.projectsMod.projects.IModule
import typings.mendixmodelsdk.unitsMod.IModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/module-security relevant section in reference guide}
  */
@js.native
trait IModuleSecurity extends IModelUnit {
  val containerAsModule: IModule = js.native
  @JSName("model")
  val model_IModuleSecurity: IModel = js.native
  val moduleRoles: IList[IModuleRole] = js.native
}

