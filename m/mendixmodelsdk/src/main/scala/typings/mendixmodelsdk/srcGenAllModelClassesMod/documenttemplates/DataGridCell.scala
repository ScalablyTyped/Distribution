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
  * See: {@link https://docs.mendix.com/refguide/columns-document-template relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/src/gen/all-model-classes", "documenttemplates.DataGridCell")
@js.native
open class DataGridCell protected ()
  extends typings.mendixmodelsdk.srcGenDocumenttemplatesMod.documenttemplates.DataGridCell {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
}
object DataGridCell {
  
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "documenttemplates.DataGridCell")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new DataGridCell instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): typings.mendixmodelsdk.srcGenDocumenttemplatesMod.documenttemplates.DataGridCell = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDocumenttemplatesMod.documenttemplates.DataGridCell]
  
  /**
    * Creates and returns a new DataGridCell instance in the SDK and on the server.
    * The new DataGridCell will be automatically stored in the 'evenRowsCell' property
    * of the parent DataGridColumn element passed as argument.
    */
  /* static member */
  inline def createInDataGridColumnUnderEvenRowsCell(container: typings.mendixmodelsdk.srcGenDocumenttemplatesMod.documenttemplates.DataGridColumn): typings.mendixmodelsdk.srcGenDocumenttemplatesMod.documenttemplates.DataGridCell = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDataGridColumnUnderEvenRowsCell")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDocumenttemplatesMod.documenttemplates.DataGridCell]
  
  /**
    * Creates and returns a new DataGridCell instance in the SDK and on the server.
    * The new DataGridCell will be automatically stored in the 'oddRowsCell' property
    * of the parent DataGridColumn element passed as argument.
    */
  /* static member */
  inline def createInDataGridColumnUnderOddRowsCell(container: typings.mendixmodelsdk.srcGenDocumenttemplatesMod.documenttemplates.DataGridColumn): typings.mendixmodelsdk.srcGenDocumenttemplatesMod.documenttemplates.DataGridCell = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDataGridColumnUnderOddRowsCell")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.srcGenDocumenttemplatesMod.documenttemplates.DataGridCell]
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "documenttemplates.DataGridCell.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/src/gen/all-model-classes", "documenttemplates.DataGridCell.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
