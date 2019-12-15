package typings.mendixmodelsdk.distGenPagesMod.pages

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenDomainmodelsMod.domainmodels.IEntity
import typings.mendixmodelsdk.distGenPagesMod.StructureVersionInfo
import typings.mendixmodelsdk.distSdkInternalInstancesMod.IList
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.Element
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/pages", "pages.ListViewTemplate")
@js.native
class ListViewTemplate protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FListViewTemplate: IModel = js.native
  def containerAsListView(): ListView = js.native
  def specialization(): IEntity = js.native
  def specialization(newValue: IEntity): js.Any = js.native
  def specializationQualifiedName(): String = js.native
  /**
    * In version 7.15.0: deleted
    */
  def widget(): Widget | Null = js.native
  def widget(newValue: Widget): js.Any = js.native
  @JSName("widget")
  def widget_Any(): js.Any = js.native
  /**
    * In version 7.15.0: introduced
    */
  def widgets(): IList[Widget] = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.ListViewTemplate")
@js.native
object ListViewTemplate extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new ListViewTemplate instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): ListViewTemplate = js.native
  /**
    * Creates and returns a new ListViewTemplate instance in the SDK and on the server.
    * The new ListViewTemplate will be automatically stored in the 'templates' property
    * of the parent ListView element passed as argument.
    */
  def createIn(container: ListView): ListViewTemplate = js.native
}

