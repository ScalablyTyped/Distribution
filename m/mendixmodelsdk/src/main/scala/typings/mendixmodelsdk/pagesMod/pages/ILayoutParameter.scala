package typings.mendixmodelsdk.pagesMod.pages

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.elementsMod.IByNameReferrable
import typings.mendixmodelsdk.elementsMod.IElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ILayoutParameter
  extends IElement
     with IByNameReferrable {
  val containerAsLayout: ILayout = js.native
  @JSName("model")
  val model_ILayoutParameter: IModel = js.native
  val name: String = js.native
}

