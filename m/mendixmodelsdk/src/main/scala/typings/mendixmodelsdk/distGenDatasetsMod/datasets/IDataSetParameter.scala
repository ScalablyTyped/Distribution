package typings.mendixmodelsdk.distGenDatasetsMod.datasets

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distSdkInternalElementsMod.IByNameReferrable
import typings.mendixmodelsdk.distSdkInternalElementsMod.IElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDataSetParameter
  extends IElement
     with IByNameReferrable {
  val containerAsDataSet: IDataSet = js.native
  @JSName("model")
  val model_IDataSetParameter: IModel = js.native
  val name: String = js.native
}

