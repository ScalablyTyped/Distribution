package typings.mendixmodelsdk.distGenPagesMod.pages

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenMenusMod.menus.IMenuDocument
import typings.mendixmodelsdk.distGenPagesMod.StructureVersionInfo
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/pages", "pages.MenuDocumentSource")
@js.native
class MenuDocumentSource protected () extends MenuSource {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FMenuDocumentSource: IModel = js.native
  def menu(): IMenuDocument | Null = js.native
  def menu(newValue: IMenuDocument): js.Any = js.native
  def menuQualifiedName(): String | Null = js.native
  @JSName("menu")
  def menu_Any(): js.Any = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.MenuDocumentSource")
@js.native
object MenuDocumentSource extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new MenuDocumentSource instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): MenuDocumentSource = js.native
  /**
    * Creates and returns a new MenuDocumentSource instance in the SDK and on the server.
    * The new MenuDocumentSource will be automatically stored in the 'menuSource' property
    * of the parent MenuWidget element passed as argument.
    */
  def createIn(container: MenuWidget): MenuDocumentSource = js.native
}

