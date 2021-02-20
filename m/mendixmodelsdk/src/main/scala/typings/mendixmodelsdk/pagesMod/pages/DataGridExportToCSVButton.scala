package typings.mendixmodelsdk.pagesMod.pages

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.pagesMod.StructureVersionInfo
import typings.mendixmodelsdk.structuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide/control-bar relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.DataGridExportToCSVButton")
@js.native
class DataGridExportToCSVButton protected () extends GridControlBarButton {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  def decimalSeparator: String = js.native
  def decimalSeparator_=(newValue: String): Unit = js.native
  
  def delimiter: String = js.native
  def delimiter_=(newValue: String): Unit = js.native
  
  def generateExcelHint: Boolean = js.native
  def generateExcelHint_=(newValue: Boolean): Unit = js.native
  
  def groupSeparator: String = js.native
  def groupSeparator_=(newValue: String): Unit = js.native
  
  def maxNumberOfRows: Double = js.native
  def maxNumberOfRows_=(newValue: Double): Unit = js.native
  
  def useGridDateFormat: Boolean = js.native
  def useGridDateFormat_=(newValue: Boolean): Unit = js.native
}
object DataGridExportToCSVButton {
  
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.DataGridExportToCSVButton")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new DataGridExportToCSVButton instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.DataGridExportToCSVButton.create")
  @js.native
  def create(model: IModel): DataGridExportToCSVButton = js.native
  
  /**
    * Creates and returns a new DataGridExportToCSVButton instance in the SDK and on the server.
    * The new DataGridExportToCSVButton will be automatically stored in the 'items' property
    * of the parent ControlBar element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.DataGridExportToCSVButton.createIn")
  @js.native
  def createIn(container: ControlBar): DataGridExportToCSVButton = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.DataGridExportToCSVButton.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.DataGridExportToCSVButton.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
