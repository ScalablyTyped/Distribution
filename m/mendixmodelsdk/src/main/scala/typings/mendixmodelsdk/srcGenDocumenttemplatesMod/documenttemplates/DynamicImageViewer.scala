package typings.mendixmodelsdk.srcGenDocumenttemplatesMod.documenttemplates

import typings.mendixmodelsdk.srcGenBaseModelMod.IModel
import typings.mendixmodelsdk.srcGenDocumenttemplatesMod.StructureVersionInfo
import typings.mendixmodelsdk.srcGenImagesMod.images.IImage
import typings.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.ModelUnit
import typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide/dynamic-image-document-template relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/src/gen/documenttemplates", "documenttemplates.DynamicImageViewer")
@js.native
open class DynamicImageViewer protected () extends EntityWidget {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  def defaultImage: IImage | Null = js.native
  
  def defaultImageQualifiedName: String | Null = js.native
  
  def defaultImage_=(newValue: IImage | Null): Unit = js.native
  
  def height: Double = js.native
  def height_=(newValue: Double): Unit = js.native
  
  def useThumbnail: Boolean = js.native
  def useThumbnail_=(newValue: Boolean): Unit = js.native
  
  def width: Double = js.native
  def width_=(newValue: Double): Unit = js.native
}
object DynamicImageViewer {
  
  @JSImport("mendixmodelsdk/src/gen/documenttemplates", "documenttemplates.DynamicImageViewer")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new DynamicImageViewer instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): DynamicImageViewer = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[DynamicImageViewer]
  
  /**
    * Creates and returns a new DynamicImageViewer instance in the SDK and on the server.
    * The new DynamicImageViewer will be automatically stored in the 'toplevels' property
    * of the parent DocumentTemplate element passed as argument.
    */
  /* static member */
  inline def createInDocumentTemplateUnderToplevels(container: DocumentTemplate): DynamicImageViewer = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDocumentTemplateUnderToplevels")(container.asInstanceOf[js.Any]).asInstanceOf[DynamicImageViewer]
  
  /**
    * Creates and returns a new DynamicImageViewer instance in the SDK and on the server.
    * The new DynamicImageViewer will be automatically stored in the 'widget' property
    * of the parent DropZone element passed as argument.
    */
  /* static member */
  inline def createInDropZoneUnderWidget(container: DropZone): DynamicImageViewer = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDropZoneUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[DynamicImageViewer]
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/documenttemplates", "documenttemplates.DynamicImageViewer.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/documenttemplates", "documenttemplates.DynamicImageViewer.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
