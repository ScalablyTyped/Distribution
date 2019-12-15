package typings.mendixmodelsdk.distGenDocumenttemplatesMod.documenttemplates

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenDocumenttemplatesMod.StructureVersionInfo
import typings.mendixmodelsdk.distGenPagesMod.pages.FormattingInfo
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/dynamic-label-(document-template) relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/dist/gen/documenttemplates", "documenttemplates.DynamicLabel")
@js.native
class DynamicLabel protected () extends AttributeWidget {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FDynamicLabel: IModel = js.native
  def formattingInfo(): FormattingInfo = js.native
  def formattingInfo(newValue: FormattingInfo): js.Any = js.native
  def renderXHTML(): Boolean = js.native
  def renderXHTML(newValue: Boolean): js.Any = js.native
  def style(): Style = js.native
  def style(newValue: Style): js.Any = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/documenttemplates", "documenttemplates.DynamicLabel")
@js.native
object DynamicLabel extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new DynamicLabel instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): DynamicLabel = js.native
  /**
    * Creates and returns a new DynamicLabel instance in the SDK and on the server.
    * The new DynamicLabel will be automatically stored in the 'toplevels' property
    * of the parent DocumentTemplate element passed as argument.
    */
  def createInDocumentTemplateUnderToplevels(container: DocumentTemplate): DynamicLabel = js.native
  /**
    * Creates and returns a new DynamicLabel instance in the SDK and on the server.
    * The new DynamicLabel will be automatically stored in the 'widget' property
    * of the parent DropZone element passed as argument.
    */
  def createInDropZoneUnderWidget(container: DropZone): DynamicLabel = js.native
}

