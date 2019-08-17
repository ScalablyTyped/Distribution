package typings.mendixmodelsdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distMendixDashModelMod {
  import typings.mendixmodelsdk.distModelDashSdkDashClientMod.ModelSdkClientImpl

  type IModel = typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
  type ModelSdkClient = ModelSdkClientImpl[IModel, Model]
}
