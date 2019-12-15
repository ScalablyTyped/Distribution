package typings.mendixmodelsdk.distGenDocumenttemplatesMod.documenttemplates

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenDocumenttemplatesMod.StructureVersionInfo
import typings.mendixmodelsdk.distGenImagesMod.images.IImage
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/dynamic-image-(document-template) relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/dist/gen/documenttemplates", "documenttemplates.DynamicImageViewer")
@js.native
class DynamicImageViewer protected () extends EntityWidget {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FDynamicImageViewer: IModel = js.native
  def defaultImage(): IImage | Null = js.native
  def defaultImage(newValue: IImage): js.Any = js.native
  def defaultImageQualifiedName(): String | Null = js.native
  @JSName("defaultImage")
  def defaultImage_Any(): js.Any = js.native
  def height(): Double = js.native
  def height(newValue: Double): js.Any = js.native
  def useThumbnail(): Boolean = js.native
  def useThumbnail(newValue: Boolean): js.Any = js.native
  def width(): Double = js.native
  def width(newValue: Double): js.Any = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/documenttemplates", "documenttemplates.DynamicImageViewer")
@js.native
object DynamicImageViewer extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new DynamicImageViewer instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): DynamicImageViewer = js.native
  /**
    * Creates and returns a new DynamicImageViewer instance in the SDK and on the server.
    * The new DynamicImageViewer will be automatically stored in the 'toplevels' property
    * of the parent DocumentTemplate element passed as argument.
    */
  def createInDocumentTemplateUnderToplevels(container: DocumentTemplate): DynamicImageViewer = js.native
  /**
    * Creates and returns a new DynamicImageViewer instance in the SDK and on the server.
    * The new DynamicImageViewer will be automatically stored in the 'widget' property
    * of the parent DropZone element passed as argument.
    */
  def createInDropZoneUnderWidget(container: DropZone): DynamicImageViewer = js.native
}

