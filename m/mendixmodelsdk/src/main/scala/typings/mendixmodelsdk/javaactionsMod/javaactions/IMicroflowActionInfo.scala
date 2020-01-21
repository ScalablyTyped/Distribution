package typings.mendixmodelsdk.javaactionsMod.javaactions

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.elementsMod.IElement
import typings.mendixmodelsdk.imagesMod.images.IImage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * In version 7.21.0: deleted
  * In version 6.10.0: removed experimental
  * In version 6.6.0: introduced
  */
@js.native
trait IMicroflowActionInfo extends IElement {
  val caption: String = js.native
  val category: String = js.native
  val containerAsJavaAction: IJavaAction = js.native
  val icon: IImage | Null = js.native
  val iconQualifiedName: String | Null = js.native
  @JSName("model")
  val model_IMicroflowActionInfo: IModel = js.native
}

