package typings.mendixmodelsdk.mod.documenttemplates

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
  * See: {@link https://docs.mendix.com/refguide/dynamic-label-document-template relevant section in reference guide}
  */
@JSImport("mendixmodelsdk", "documenttemplates.DynamicLabel")
@js.native
open class DynamicLabel protected ()
  extends typings.mendixmodelsdk.srcGenAllModelClassesMod.documenttemplates.DynamicLabel {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object DynamicLabel {
  
  @JSImport("mendixmodelsdk", "documenttemplates.DynamicLabel")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new DynamicLabel instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): typings.mendixmodelsdk.srcGenDocumenttemplatesMod.documenttemplates.DynamicLabel = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDocumenttemplatesMod.documenttemplates.DynamicLabel]
  
  /**
    * Creates and returns a new DynamicLabel instance in the SDK and on the server.
    * The new DynamicLabel will be automatically stored in the 'toplevels' property
    * of the parent DocumentTemplate element passed as argument.
    */
  /* static member */
  inline def createInDocumentTemplateUnderToplevels(container: typings.mendixmodelsdk.srcGenDocumenttemplatesMod.documenttemplates.DocumentTemplate): typings.mendixmodelsdk.srcGenDocumenttemplatesMod.documenttemplates.DynamicLabel = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDocumentTemplateUnderToplevels")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDocumenttemplatesMod.documenttemplates.DynamicLabel]
  
  /**
    * Creates and returns a new DynamicLabel instance in the SDK and on the server.
    * The new DynamicLabel will be automatically stored in the 'widget' property
    * of the parent DropZone element passed as argument.
    */
  /* static member */
  inline def createInDropZoneUnderWidget(container: typings.mendixmodelsdk.srcGenDocumenttemplatesMod.documenttemplates.DropZone): typings.mendixmodelsdk.srcGenDocumenttemplatesMod.documenttemplates.DynamicLabel = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDropZoneUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDocumenttemplatesMod.documenttemplates.DynamicLabel]
  
  /* static member */
  @JSImport("mendixmodelsdk", "documenttemplates.DynamicLabel.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk", "documenttemplates.DynamicLabel.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
