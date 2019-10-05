package typings.mendixmodelsdk.mendixmodelsdkMod

import typings.mendixmodelsdk.distSdkInternalAbstractDashModelMod.IAbstractModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk", "runInTransaction")
@js.native
object runInTransaction extends js.Object {
  def apply[T](model: IAbstractModel, action: js.Function0[js.Promise[T]]): js.Promise[T] = js.native
}

