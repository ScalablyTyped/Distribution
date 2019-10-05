package typings.mendixmodelsdk.mendixmodelsdkMod.documenttemplates

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/style relevant section in reference guide}
  */
@JSImport("mendixmodelsdk", "documenttemplates.Style")
@js.native
class Style protected ()
  extends typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.documenttemplates.Style {
  def this(
    model: typings.mendixmodelsdk.distSdkInternalMod.AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: typings.mendixmodelsdk.distSdkInternalMod.ModelUnit,
    container: typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
  ) = this()
}

/* static members */
@JSImport("mendixmodelsdk", "documenttemplates.Style")
@js.native
object Style extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: typings.mendixmodelsdk.distGenDocumenttemplatesMod.StructureVersionInfo = js.native
  /**
    * Creates and returns a new Style instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typings.mendixmodelsdk.distGenDocumenttemplatesMod.documenttemplates.Style = js.native
  /**
    * Creates and returns a new Style instance in the SDK and on the server.
    * The new Style will be automatically stored in the 'style' property
    * of the parent DataGridCell element passed as argument.
    */
  def createInDataGridCellUnderStyle(container: typings.mendixmodelsdk.distGenDocumenttemplatesMod.documenttemplates.DataGridCell): typings.mendixmodelsdk.distGenDocumenttemplatesMod.documenttemplates.Style = js.native
  /**
    * Creates and returns a new Style instance in the SDK and on the server.
    * The new Style will be automatically stored in the 'style' property
    * of the parent DataGridColumn element passed as argument.
    */
  def createInDataGridColumnUnderStyle(container: typings.mendixmodelsdk.distGenDocumenttemplatesMod.documenttemplates.DataGridColumn): typings.mendixmodelsdk.distGenDocumenttemplatesMod.documenttemplates.Style = js.native
  /**
    * Creates and returns a new Style instance in the SDK and on the server.
    * The new Style will be automatically stored in the 'style' property
    * of the parent DocumentTemplate element passed as argument.
    */
  def createInDocumentTemplateUnderStyle(container: typings.mendixmodelsdk.distGenDocumenttemplatesMod.documenttemplates.DocumentTemplate): typings.mendixmodelsdk.distGenDocumenttemplatesMod.documenttemplates.Style = js.native
  /**
    * Creates and returns a new Style instance in the SDK and on the server.
    * The new Style will be automatically stored in the 'style' property
    * of the parent DynamicLabel element passed as argument.
    */
  def createInDynamicLabelUnderStyle(container: typings.mendixmodelsdk.distGenDocumenttemplatesMod.documenttemplates.DynamicLabel): typings.mendixmodelsdk.distGenDocumenttemplatesMod.documenttemplates.Style = js.native
  /**
    * Creates and returns a new Style instance in the SDK and on the server.
    * The new Style will be automatically stored in the 'style' property
    * of the parent Grid element passed as argument.
    */
  def createInGridUnderStyle(container: typings.mendixmodelsdk.distGenDocumenttemplatesMod.documenttemplates.Grid): typings.mendixmodelsdk.distGenDocumenttemplatesMod.documenttemplates.Style = js.native
  /**
    * Creates and returns a new Style instance in the SDK and on the server.
    * The new Style will be automatically stored in the 'style' property
    * of the parent StaticLabel element passed as argument.
    */
  def createInStaticLabelUnderStyle(container: typings.mendixmodelsdk.distGenDocumenttemplatesMod.documenttemplates.StaticLabel): typings.mendixmodelsdk.distGenDocumenttemplatesMod.documenttemplates.Style = js.native
  /**
    * Creates and returns a new Style instance in the SDK and on the server.
    * The new Style will be automatically stored in the 'style' property
    * of the parent TableCell element passed as argument.
    */
  def createInTableCellUnderStyle(container: typings.mendixmodelsdk.distGenDocumenttemplatesMod.documenttemplates.TableCell): typings.mendixmodelsdk.distGenDocumenttemplatesMod.documenttemplates.Style = js.native
  /**
    * Creates and returns a new Style instance in the SDK and on the server.
    * The new Style will be automatically stored in the 'style' property
    * of the parent Table element passed as argument.
    */
  def createInTableUnderStyle(container: typings.mendixmodelsdk.distGenDocumenttemplatesMod.documenttemplates.Table): typings.mendixmodelsdk.distGenDocumenttemplatesMod.documenttemplates.Style = js.native
  /**
    * Creates and returns a new Style instance in the SDK and on the server.
    * The new Style will be automatically stored in the 'style' property
    * of the parent Title element passed as argument.
    */
  def createInTitleUnderStyle(container: typings.mendixmodelsdk.distGenDocumenttemplatesMod.documenttemplates.Title): typings.mendixmodelsdk.distGenDocumenttemplatesMod.documenttemplates.Style = js.native
}

