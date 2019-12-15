package typings.mendixmodelsdk.distGenDocumenttemplatesMod.documenttemplates

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenDocumenttemplatesMod.StructureVersionInfo
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/documenttemplates", "documenttemplates.TemplateGridContents")
@js.native
class TemplateGridContents protected () extends DropZone {
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
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/documenttemplates", "documenttemplates.TemplateGridContents")
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
    * The new TemplateGridContents will be automatically stored in the 'evenRowsContents' property
    * of the parent TemplateGrid element passed as argument.
    */
  def createInTemplateGridUnderEvenRowsContents(container: TemplateGrid): TemplateGridContents = js.native
  /**
    * Creates and returns a new TemplateGridContents instance in the SDK and on the server.
    * The new TemplateGridContents will be automatically stored in the 'oddRowsContents' property
    * of the parent TemplateGrid element passed as argument.
    */
  def createInTemplateGridUnderOddRowsContents(container: TemplateGrid): TemplateGridContents = js.native
}

