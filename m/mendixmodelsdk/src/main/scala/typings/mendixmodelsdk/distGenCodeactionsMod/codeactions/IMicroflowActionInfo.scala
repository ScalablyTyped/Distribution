package typings.mendixmodelsdk.distGenCodeactionsMod.codeactions

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenImagesMod.images.IImage
import typings.mendixmodelsdk.distGenMicroflowsMod.microflows.IMicroflow
import typings.mendixmodelsdk.distSdkInternalElementsMod.IElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * In version 7.21.0: introduced
  */
@js.native
trait IMicroflowActionInfo extends IElement {
  val caption: String = js.native
  val category: String = js.native
  val containerAsCodeAction: ICodeAction = js.native
  val containerAsMicroflow: IMicroflow = js.native
  val icon: IImage | Null = js.native
  val iconQualifiedName: String | Null = js.native
  @JSName("model")
  val model_IMicroflowActionInfo: IModel = js.native
}

