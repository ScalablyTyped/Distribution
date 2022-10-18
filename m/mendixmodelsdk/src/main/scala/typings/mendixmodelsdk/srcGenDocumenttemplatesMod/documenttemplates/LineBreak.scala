package typings.mendixmodelsdk.srcGenDocumenttemplatesMod.documenttemplates

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
  * See: {@link https://docs.mendix.com/refguide/line-break-document-template relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/src/gen/documenttemplates", "documenttemplates.LineBreak")
@js.native
open class LineBreak protected () extends Widget {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object LineBreak {
  
  @JSImport("mendixmodelsdk/src/gen/documenttemplates", "documenttemplates.LineBreak")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new LineBreak instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): LineBreak = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[LineBreak]
  
  /**
    * Creates and returns a new LineBreak instance in the SDK and on the server.
    * The new LineBreak will be automatically stored in the 'toplevels' property
    * of the parent DocumentTemplate element passed as argument.
    */
  /* static member */
  inline def createInDocumentTemplateUnderToplevels(container: DocumentTemplate): LineBreak = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDocumentTemplateUnderToplevels")(container.asInstanceOf[js.Any]).asInstanceOf[LineBreak]
  
  /**
    * Creates and returns a new LineBreak instance in the SDK and on the server.
    * The new LineBreak will be automatically stored in the 'widget' property
    * of the parent DropZone element passed as argument.
    */
  /* static member */
  inline def createInDropZoneUnderWidget(container: DropZone): LineBreak = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDropZoneUnderWidget")(container.asInstanceOf[js.Any]).asInstanceOf[LineBreak]
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/documenttemplates", "documenttemplates.LineBreak.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/documenttemplates", "documenttemplates.LineBreak.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
