package typings.mendixmodelsdk.pagesMod.pages

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.imagesMod.images.IImage
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.pagesMod.StructureVersionInfo
import typings.mendixmodelsdk.textsMod.texts.Text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/pages", "pages.DropDownButtonItem")
@js.native
class DropDownButtonItem protected () extends ActionItem {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FDropDownButtonItem: IModel = js.native
  def caption: Text = js.native
  def caption_=(newValue: Text): Unit = js.native
  def image: IImage | Null = js.native
  def imageQualifiedName: String | Null = js.native
  def image_=(newValue: IImage | Null): Unit = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.DropDownButtonItem")
@js.native
object DropDownButtonItem extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new DropDownButtonItem instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): DropDownButtonItem = js.native
  /**
    * Creates and returns a new DropDownButtonItem instance in the SDK and on the server.
    * The new DropDownButtonItem will be automatically stored in the 'items' property
    * of the parent DropDownButton element passed as argument.
    */
  def createIn(container: DropDownButton): DropDownButtonItem = js.native
}

