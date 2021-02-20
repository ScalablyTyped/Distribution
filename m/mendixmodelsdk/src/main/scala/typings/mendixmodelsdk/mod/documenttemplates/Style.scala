package typings.mendixmodelsdk.mod.documenttemplates

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.documenttemplatesMod.StructureVersionInfo
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.structuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide/style relevant section in reference guide}
  */
@JSImport("mendixmodelsdk", "documenttemplates.Style")
@js.native
class Style protected ()
  extends typings.mendixmodelsdk.allModelClassesMod.documenttemplates.Style {
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
  @JSImport("mendixmodelsdk", "documenttemplates.Style.create")
  @js.native
  def create(model: IModel): typings.mendixmodelsdk.documenttemplatesMod.documenttemplates.Style = js.native
  
  /**
    * Creates and returns a new Style instance in the SDK and on the server.
    * The new Style will be automatically stored in the 'style' property
    * of the parent DataGridCell element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk", "documenttemplates.Style.createInDataGridCellUnderStyle")
  @js.native
  def createInDataGridCellUnderStyle(container: typings.mendixmodelsdk.documenttemplatesMod.documenttemplates.DataGridCell): typings.mendixmodelsdk.documenttemplatesMod.documenttemplates.Style = js.native
  
  /**
    * Creates and returns a new Style instance in the SDK and on the server.
    * The new Style will be automatically stored in the 'style' property
    * of the parent DataGridColumn element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk", "documenttemplates.Style.createInDataGridColumnUnderStyle")
  @js.native
  def createInDataGridColumnUnderStyle(container: typings.mendixmodelsdk.documenttemplatesMod.documenttemplates.DataGridColumn): typings.mendixmodelsdk.documenttemplatesMod.documenttemplates.Style = js.native
  
  /**
    * Creates and returns a new Style instance in the SDK and on the server.
    * The new Style will be automatically stored in the 'style' property
    * of the parent DocumentTemplate element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk", "documenttemplates.Style.createInDocumentTemplateUnderStyle")
  @js.native
  def createInDocumentTemplateUnderStyle(container: typings.mendixmodelsdk.documenttemplatesMod.documenttemplates.DocumentTemplate): typings.mendixmodelsdk.documenttemplatesMod.documenttemplates.Style = js.native
  
  /**
    * Creates and returns a new Style instance in the SDK and on the server.
    * The new Style will be automatically stored in the 'style' property
    * of the parent DynamicLabel element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk", "documenttemplates.Style.createInDynamicLabelUnderStyle")
  @js.native
  def createInDynamicLabelUnderStyle(container: typings.mendixmodelsdk.documenttemplatesMod.documenttemplates.DynamicLabel): typings.mendixmodelsdk.documenttemplatesMod.documenttemplates.Style = js.native
  
  /**
    * Creates and returns a new Style instance in the SDK and on the server.
    * The new Style will be automatically stored in the 'style' property
    * of the parent Grid element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk", "documenttemplates.Style.createInGridUnderStyle")
  @js.native
  def createInGridUnderStyle(container: typings.mendixmodelsdk.documenttemplatesMod.documenttemplates.Grid): typings.mendixmodelsdk.documenttemplatesMod.documenttemplates.Style = js.native
  
  /**
    * Creates and returns a new Style instance in the SDK and on the server.
    * The new Style will be automatically stored in the 'style' property
    * of the parent StaticLabel element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk", "documenttemplates.Style.createInStaticLabelUnderStyle")
  @js.native
  def createInStaticLabelUnderStyle(container: typings.mendixmodelsdk.documenttemplatesMod.documenttemplates.StaticLabel): typings.mendixmodelsdk.documenttemplatesMod.documenttemplates.Style = js.native
  
  /**
    * Creates and returns a new Style instance in the SDK and on the server.
    * The new Style will be automatically stored in the 'style' property
    * of the parent TableCell element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk", "documenttemplates.Style.createInTableCellUnderStyle")
  @js.native
  def createInTableCellUnderStyle(container: typings.mendixmodelsdk.documenttemplatesMod.documenttemplates.TableCell): typings.mendixmodelsdk.documenttemplatesMod.documenttemplates.Style = js.native
  
  /**
    * Creates and returns a new Style instance in the SDK and on the server.
    * The new Style will be automatically stored in the 'style' property
    * of the parent Table element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk", "documenttemplates.Style.createInTableUnderStyle")
  @js.native
  def createInTableUnderStyle(container: typings.mendixmodelsdk.documenttemplatesMod.documenttemplates.Table): typings.mendixmodelsdk.documenttemplatesMod.documenttemplates.Style = js.native
  
  /**
    * Creates and returns a new Style instance in the SDK and on the server.
    * The new Style will be automatically stored in the 'style' property
    * of the parent Title element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk", "documenttemplates.Style.createInTitleUnderStyle")
  @js.native
  def createInTitleUnderStyle(container: typings.mendixmodelsdk.documenttemplatesMod.documenttemplates.Title): typings.mendixmodelsdk.documenttemplatesMod.documenttemplates.Style = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk", "documenttemplates.Style.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk", "documenttemplates.Style.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
