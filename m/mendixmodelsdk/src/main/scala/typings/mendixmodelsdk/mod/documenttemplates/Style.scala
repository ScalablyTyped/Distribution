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
  * See: {@link https://docs.mendix.com/refguide/style relevant section in reference guide}
  */
@JSImport("mendixmodelsdk", "documenttemplates.Style")
@js.native
open class Style protected ()
  extends typings.mendixmodelsdk.srcGenAllModelClassesMod.documenttemplates.Style {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object Style {
  
  @JSImport("mendixmodelsdk", "documenttemplates.Style")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new Style instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): typings.mendixmodelsdk.srcGenDocumenttemplatesMod.documenttemplates.Style = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDocumenttemplatesMod.documenttemplates.Style]
  
  /**
    * Creates and returns a new Style instance in the SDK and on the server.
    * The new Style will be automatically stored in the 'style' property
    * of the parent DataGridCell element passed as argument.
    */
  /* static member */
  inline def createInDataGridCellUnderStyle(container: typings.mendixmodelsdk.srcGenDocumenttemplatesMod.documenttemplates.DataGridCell): typings.mendixmodelsdk.srcGenDocumenttemplatesMod.documenttemplates.Style = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDataGridCellUnderStyle")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDocumenttemplatesMod.documenttemplates.Style]
  
  /**
    * Creates and returns a new Style instance in the SDK and on the server.
    * The new Style will be automatically stored in the 'style' property
    * of the parent DataGridColumn element passed as argument.
    */
  /* static member */
  inline def createInDataGridColumnUnderStyle(container: typings.mendixmodelsdk.srcGenDocumenttemplatesMod.documenttemplates.DataGridColumn): typings.mendixmodelsdk.srcGenDocumenttemplatesMod.documenttemplates.Style = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDataGridColumnUnderStyle")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDocumenttemplatesMod.documenttemplates.Style]
  
  /**
    * Creates and returns a new Style instance in the SDK and on the server.
    * The new Style will be automatically stored in the 'style' property
    * of the parent DocumentTemplate element passed as argument.
    */
  /* static member */
  inline def createInDocumentTemplateUnderStyle(container: typings.mendixmodelsdk.srcGenDocumenttemplatesMod.documenttemplates.DocumentTemplate): typings.mendixmodelsdk.srcGenDocumenttemplatesMod.documenttemplates.Style = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDocumentTemplateUnderStyle")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDocumenttemplatesMod.documenttemplates.Style]
  
  /**
    * Creates and returns a new Style instance in the SDK and on the server.
    * The new Style will be automatically stored in the 'style' property
    * of the parent DynamicLabel element passed as argument.
    */
  /* static member */
  inline def createInDynamicLabelUnderStyle(container: typings.mendixmodelsdk.srcGenDocumenttemplatesMod.documenttemplates.DynamicLabel): typings.mendixmodelsdk.srcGenDocumenttemplatesMod.documenttemplates.Style = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDynamicLabelUnderStyle")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDocumenttemplatesMod.documenttemplates.Style]
  
  /**
    * Creates and returns a new Style instance in the SDK and on the server.
    * The new Style will be automatically stored in the 'style' property
    * of the parent Grid element passed as argument.
    */
  /* static member */
  inline def createInGridUnderStyle(container: typings.mendixmodelsdk.srcGenDocumenttemplatesMod.documenttemplates.Grid): typings.mendixmodelsdk.srcGenDocumenttemplatesMod.documenttemplates.Style = ^.asInstanceOf[js.Dynamic].applyDynamic("createInGridUnderStyle")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDocumenttemplatesMod.documenttemplates.Style]
  
  /**
    * Creates and returns a new Style instance in the SDK and on the server.
    * The new Style will be automatically stored in the 'style' property
    * of the parent StaticLabel element passed as argument.
    */
  /* static member */
  inline def createInStaticLabelUnderStyle(container: typings.mendixmodelsdk.srcGenDocumenttemplatesMod.documenttemplates.StaticLabel): typings.mendixmodelsdk.srcGenDocumenttemplatesMod.documenttemplates.Style = ^.asInstanceOf[js.Dynamic].applyDynamic("createInStaticLabelUnderStyle")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDocumenttemplatesMod.documenttemplates.Style]
  
  /**
    * Creates and returns a new Style instance in the SDK and on the server.
    * The new Style will be automatically stored in the 'style' property
    * of the parent TableCell element passed as argument.
    */
  /* static member */
  inline def createInTableCellUnderStyle(container: typings.mendixmodelsdk.srcGenDocumenttemplatesMod.documenttemplates.TableCell): typings.mendixmodelsdk.srcGenDocumenttemplatesMod.documenttemplates.Style = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTableCellUnderStyle")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDocumenttemplatesMod.documenttemplates.Style]
  
  /**
    * Creates and returns a new Style instance in the SDK and on the server.
    * The new Style will be automatically stored in the 'style' property
    * of the parent Table element passed as argument.
    */
  /* static member */
  inline def createInTableUnderStyle(container: typings.mendixmodelsdk.srcGenDocumenttemplatesMod.documenttemplates.Table): typings.mendixmodelsdk.srcGenDocumenttemplatesMod.documenttemplates.Style = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTableUnderStyle")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDocumenttemplatesMod.documenttemplates.Style]
  
  /**
    * Creates and returns a new Style instance in the SDK and on the server.
    * The new Style will be automatically stored in the 'style' property
    * of the parent Title element passed as argument.
    */
  /* static member */
  inline def createInTitleUnderStyle(container: typings.mendixmodelsdk.srcGenDocumenttemplatesMod.documenttemplates.Title): typings.mendixmodelsdk.srcGenDocumenttemplatesMod.documenttemplates.Style = ^.asInstanceOf[js.Dynamic].applyDynamic("createInTitleUnderStyle")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDocumenttemplatesMod.documenttemplates.Style]
  
  /* static member */
  @JSImport("mendixmodelsdk", "documenttemplates.Style.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk", "documenttemplates.Style.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
