package typings.mendixmodelsdk.distGenDocumenttemplatesMod.documenttemplates

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenDocumenttemplatesMod.StructureVersionInfo
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/template-grid-(document-template) relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/dist/gen/documenttemplates", "documenttemplates.TemplateGrid")
@js.native
class TemplateGrid protected () extends Grid {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FTemplateGrid: IModel = js.native
  def evenRowsContents(): TemplateGridContents | Null = js.native
  def evenRowsContents(newValue: TemplateGridContents): js.Any = js.native
  @JSName("evenRowsContents")
  def evenRowsContents_Any(): js.Any = js.native
  def numberOfColumns(): Double = js.native
  def numberOfColumns(newValue: Double): js.Any = js.native
  def oddRowsContents(): TemplateGridContents = js.native
  def oddRowsContents(newValue: TemplateGridContents): js.Any = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/documenttemplates", "documenttemplates.TemplateGrid")
@js.native
object TemplateGrid extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new TemplateGrid instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): TemplateGrid = js.native
  /**
    * Creates and returns a new TemplateGrid instance in the SDK and on the server.
    * The new TemplateGrid will be automatically stored in the 'toplevels' property
    * of the parent DocumentTemplate element passed as argument.
    */
  def createInDocumentTemplateUnderToplevels(container: DocumentTemplate): TemplateGrid = js.native
  /**
    * Creates and returns a new TemplateGrid instance in the SDK and on the server.
    * The new TemplateGrid will be automatically stored in the 'widget' property
    * of the parent DropZone element passed as argument.
    */
  def createInDropZoneUnderWidget(container: DropZone): TemplateGrid = js.native
}

