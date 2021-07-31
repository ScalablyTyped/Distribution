package typings.mendixmodelsdk.documenttemplatesMod.documenttemplates

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.documenttemplatesMod.StructureVersionInfo
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.Element
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.structuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide/columns-document-template relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/dist/gen/documenttemplates", "documenttemplates.DataGridCell")
@js.native
class DataGridCell protected () extends Element[IModel] {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  def containerAsDataGridColumn: DataGridColumn = js.native
  
  def style: Style = js.native
  def style_=(newValue: Style): Unit = js.native
}
object DataGridCell {
  
  @JSImport("mendixmodelsdk/dist/gen/documenttemplates", "documenttemplates.DataGridCell")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new DataGridCell instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @scala.inline
  def create(model: IModel): DataGridCell = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(model.asInstanceOf[js.Any]).asInstanceOf[DataGridCell]
  
  /**
    * Creates and returns a new DataGridCell instance in the SDK and on the server.
    * The new DataGridCell will be automatically stored in the 'evenRowsCell' property
    * of the parent DataGridColumn element passed as argument.
    */
  /* static member */
  @scala.inline
  def createInDataGridColumnUnderEvenRowsCell(container: DataGridColumn): DataGridCell = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDataGridColumnUnderEvenRowsCell")(container.asInstanceOf[js.Any]).asInstanceOf[DataGridCell]
  
  /**
    * Creates and returns a new DataGridCell instance in the SDK and on the server.
    * The new DataGridCell will be automatically stored in the 'oddRowsCell' property
    * of the parent DataGridColumn element passed as argument.
    */
  /* static member */
  @scala.inline
  def createInDataGridColumnUnderOddRowsCell(container: DataGridColumn): DataGridCell = ^.asInstanceOf[js.Dynamic].applyDynamic("createInDataGridColumnUnderOddRowsCell")(container.asInstanceOf[js.Any]).asInstanceOf[DataGridCell]
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/documenttemplates", "documenttemplates.DataGridCell.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/documenttemplates", "documenttemplates.DataGridCell.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
