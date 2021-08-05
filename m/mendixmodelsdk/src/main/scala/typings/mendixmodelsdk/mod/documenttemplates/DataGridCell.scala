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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide/columns-document-template relevant section in reference guide}
  */
@JSImport("mendixmodelsdk", "documenttemplates.DataGridCell")
@js.native
class DataGridCell protected ()
  extends typings.mendixmodelsdk.allModelClassesMod.documenttemplates.DataGridCell {
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
  
  @JSImport("mendixmodelsdk", "documenttemplates.DataGridCell")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new DataGridCell instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  inline def create(model: IModel): typings.mendixmodelsdk.documenttemplatesMod.documenttemplates.DataGridCell = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.documenttemplatesMod.documenttemplates.DataGridCell]
  
  /**
    * Creates and returns a new DataGridCell instance in the SDK and on the server.
    * The new DataGridCell will be automatically stored in the 'evenRowsCell' property
    * of the parent DataGridColumn element passed as argument.
    */
  /* static member */
  inline def createInDataGridColumnUnderEvenRowsCell(container: typings.mendixmodelsdk.documenttemplatesMod.documenttemplates.DataGridColumn): typings.mendixmodelsdk.documenttemplatesMod.documenttemplates.DataGridCell = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDataGridColumnUnderEvenRowsCell")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.documenttemplatesMod.documenttemplates.DataGridCell]
  
  /**
    * Creates and returns a new DataGridCell instance in the SDK and on the server.
    * The new DataGridCell will be automatically stored in the 'oddRowsCell' property
    * of the parent DataGridColumn element passed as argument.
    */
  /* static member */
  inline def createInDataGridColumnUnderOddRowsCell(container: typings.mendixmodelsdk.documenttemplatesMod.documenttemplates.DataGridColumn): typings.mendixmodelsdk.documenttemplatesMod.documenttemplates.DataGridCell = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDataGridColumnUnderOddRowsCell")(container.asInstanceOf[js.Any]).asInstanceOf[typings.mendixmodelsdk.documenttemplatesMod.documenttemplates.DataGridCell]
  
  /* static member */
  @JSImport("mendixmodelsdk", "documenttemplates.DataGridCell.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  inline def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk", "documenttemplates.DataGridCell.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  inline def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
