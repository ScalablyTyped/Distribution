package typings.mendixmodelsdk.datasetsMod.datasets

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.elementsMod.IByNameReferrable
import typings.mendixmodelsdk.elementsMod.IElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDataSetParameter
  extends IElement
     with IByNameReferrable {
  
  val containerAsDataSet: IDataSet = js.native
  
  @JSName("model")
  val model_IDataSetParameter: IModel = js.native
  
  val name: String = js.native
}
