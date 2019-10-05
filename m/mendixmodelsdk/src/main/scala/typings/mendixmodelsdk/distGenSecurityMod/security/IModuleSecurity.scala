package typings.mendixmodelsdk.distGenSecurityMod.security

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenProjectsMod.projects.IModule
import typings.mendixmodelsdk.distSdkInternalInstancesMod.IList
import typings.mendixmodelsdk.distSdkInternalUnitsMod.IModelUnit
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

