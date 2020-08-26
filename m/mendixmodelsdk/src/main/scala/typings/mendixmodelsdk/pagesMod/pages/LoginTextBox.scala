package typings.mendixmodelsdk.pagesMod.pages

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.pagesMod.StructureVersionInfo
import typings.mendixmodelsdk.textsMod.texts.Text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * In version 7.0.2: introduced
  */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.LoginTextBox")
@js.native
abstract class LoginTextBox protected () extends Widget {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FLoginTextBox: IModel = js.native
  def label: Text | Null = js.native
  def labelWidth: Double = js.native
  def labelWidth_=(newValue: Double): Unit = js.native
  def label_=(newValue: Text | Null): Unit = js.native
  def placeholder: Text = js.native
  def placeholder_=(newValue: Text): Unit = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.LoginTextBox")
@js.native
object LoginTextBox extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
}

