package typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.documenttemplates

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/static-image-(document-template) relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "documenttemplates.StaticImageViewer")
@js.native
class StaticImageViewer protected ()
  extends typings.mendixmodelsdk.distGenDocumenttemplatesMod.documenttemplates.StaticImageViewer {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "documenttemplates.StaticImageViewer")
@js.native
object StaticImageViewer extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: typings.mendixmodelsdk.distGenDocumenttemplatesMod.StructureVersionInfo = js.native
  /**
    * Creates and returns a new StaticImageViewer instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typings.mendixmodelsdk.distGenDocumenttemplatesMod.documenttemplates.StaticImageViewer = js.native
  /**
    * Creates and returns a new StaticImageViewer instance in the SDK and on the server.
    * The new StaticImageViewer will be automatically stored in the 'toplevels' property
    * of the parent DocumentTemplate element passed as argument.
    */
  def createInDocumentTemplateUnderToplevels(container: typings.mendixmodelsdk.distGenDocumenttemplatesMod.documenttemplates.DocumentTemplate): typings.mendixmodelsdk.distGenDocumenttemplatesMod.documenttemplates.StaticImageViewer = js.native
  /**
    * Creates and returns a new StaticImageViewer instance in the SDK and on the server.
    * The new StaticImageViewer will be automatically stored in the 'widget' property
    * of the parent DropZone element passed as argument.
    */
  def createInDropZoneUnderWidget(container: typings.mendixmodelsdk.distGenDocumenttemplatesMod.documenttemplates.DropZone): typings.mendixmodelsdk.distGenDocumenttemplatesMod.documenttemplates.StaticImageViewer = js.native
}

