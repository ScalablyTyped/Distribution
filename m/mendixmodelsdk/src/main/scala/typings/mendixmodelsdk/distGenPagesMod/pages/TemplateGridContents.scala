package typings.mendixmodelsdk.distGenPagesMod.pages

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenPagesMod.StructureVersionInfo
import typings.mendixmodelsdk.distSdkInternalInstancesMod.IList
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.Element
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/pages", "pages.TemplateGridContents")
@js.native
class TemplateGridContents protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FTemplateGridContents: IModel = js.native
  def containerAsTemplateGrid(): TemplateGrid = js.native
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
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.TemplateGridContents")
@js.native
object TemplateGridContents extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new TemplateGridContents instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): TemplateGridContents = js.native
  /**
    * Creates and returns a new TemplateGridContents instance in the SDK and on the server.
    * The new TemplateGridContents will be automatically stored in the 'contents' property
    * of the parent TemplateGrid element passed as argument.
    */
  def createIn(container: TemplateGrid): TemplateGridContents = js.native
}

