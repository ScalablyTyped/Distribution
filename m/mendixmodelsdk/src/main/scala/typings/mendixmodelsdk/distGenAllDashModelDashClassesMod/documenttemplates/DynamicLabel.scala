package typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.documenttemplates

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenDocumenttemplatesMod.StructureVersionInfo
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/dynamic-label-(document-template) relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "documenttemplates.DynamicLabel")
@js.native
class DynamicLabel protected ()
  extends typings.mendixmodelsdk.distGenDocumenttemplatesMod.documenttemplates.DynamicLabel {
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
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "documenttemplates.DynamicLabel")
@js.native
object DynamicLabel extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new DynamicLabel instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typings.mendixmodelsdk.distGenDocumenttemplatesMod.documenttemplates.DynamicLabel = js.native
  /**
    * Creates and returns a new DynamicLabel instance in the SDK and on the server.
    * The new DynamicLabel will be automatically stored in the 'toplevels' property
    * of the parent DocumentTemplate element passed as argument.
    */
  def createInDocumentTemplateUnderToplevels(container: typings.mendixmodelsdk.distGenDocumenttemplatesMod.documenttemplates.DocumentTemplate): typings.mendixmodelsdk.distGenDocumenttemplatesMod.documenttemplates.DynamicLabel = js.native
  /**
    * Creates and returns a new DynamicLabel instance in the SDK and on the server.
    * The new DynamicLabel will be automatically stored in the 'widget' property
    * of the parent DropZone element passed as argument.
    */
  def createInDropZoneUnderWidget(container: typings.mendixmodelsdk.distGenDocumenttemplatesMod.documenttemplates.DropZone): typings.mendixmodelsdk.distGenDocumenttemplatesMod.documenttemplates.DynamicLabel = js.native
}

