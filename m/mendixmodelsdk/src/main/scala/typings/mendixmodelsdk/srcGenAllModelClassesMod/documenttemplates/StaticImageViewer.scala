package typings.mendixmodelsdk.srcGenAllModelClassesMod.documenttemplates

import typings.mendixmodelsdk.srcGenBaseModelMod.IModel
import typings.mendixmodelsdk.srcGenDocumenttemplatesMod.StructureVersionInfo
import typings.mendixmodelsdk.srcSdkInternalAbstractModelMod.IAbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.srcSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.srcSdkInternalMod.ModelUnit
import typings.mendixmodelsdk.srcSdkInternalStructuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide/static-image-document-template relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/src/gen/all-model-classes", "documenttemplates.StaticImageViewer")
@js.native
open class StaticImageViewer protected ()
  extends typings.mendixmodelsdk.srcGenDocumenttemplatesMod.documenttemplates.StaticImageViewer {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object StaticImageViewer {
  
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "documenttemplates.StaticImageViewer")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new StaticImageViewer instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): typings.mendixmodelsdk.srcGenDocumenttemplatesMod.documenttemplates.StaticImageViewer = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDocumenttemplatesMod.documenttemplates.StaticImageViewer]
  
  /**
    * Creates and returns a new StaticImageViewer instance in the SDK and on the server.
    * The new StaticImageViewer will be automatically stored in the 'toplevels' property
    * of the parent DocumentTemplate element passed as argument.
    */
  /* static member */
  inline def createInDocumentTemplateUnderToplevels(container: typings.mendixmodelsdk.srcGenDocumenttemplatesMod.documenttemplates.DocumentTemplate): typings.mendixmodelsdk.srcGenDocumenttemplatesMod.documenttemplates.StaticImageViewer = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDocumentTemplateUnderToplevels")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDocumenttemplatesMod.documenttemplates.StaticImageViewer]
  
  /**
    * Creates and returns a new StaticImageViewer instance in the SDK and on the server.
    * The new StaticImageViewer will be automatically stored in the 'widget' property
    * of the parent DropZone element passed as argument.
    */
  /* static member */
  inline def createInDropZoneUnderWidget(container: typings.mendixmodelsdk.srcGenDocumenttemplatesMod.documenttemplates.DropZone): typings.mendixmodelsdk.srcGenDocumenttemplatesMod.documenttemplates.StaticImageViewer = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDropZoneUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDocumenttemplatesMod.documenttemplates.StaticImageViewer]
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "documenttemplates.StaticImageViewer.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "documenttemplates.StaticImageViewer.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
