package typings.mendixmodelsdk.allModelClassesMod.documenttemplates

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.documenttemplatesMod.StructureVersionInfo
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/style relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "documenttemplates.Style")
@js.native
class Style protected ()
  extends typings.mendixmodelsdk.documenttemplatesMod.documenttemplates.Style {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "documenttemplates.Style")
@js.native
object Style extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new Style instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typings.mendixmodelsdk.documenttemplatesMod.documenttemplates.Style = js.native
  /**
    * Creates and returns a new Style instance in the SDK and on the server.
    * The new Style will be automatically stored in the 'style' property
    * of the parent DataGridCell element passed as argument.
    */
  def createInDataGridCellUnderStyle(container: typings.mendixmodelsdk.documenttemplatesMod.documenttemplates.DataGridCell): typings.mendixmodelsdk.documenttemplatesMod.documenttemplates.Style = js.native
  /**
    * Creates and returns a new Style instance in the SDK and on the server.
    * The new Style will be automatically stored in the 'style' property
    * of the parent DataGridColumn element passed as argument.
    */
  def createInDataGridColumnUnderStyle(container: typings.mendixmodelsdk.documenttemplatesMod.documenttemplates.DataGridColumn): typings.mendixmodelsdk.documenttemplatesMod.documenttemplates.Style = js.native
  /**
    * Creates and returns a new Style instance in the SDK and on the server.
    * The new Style will be automatically stored in the 'style' property
    * of the parent DocumentTemplate element passed as argument.
    */
  def createInDocumentTemplateUnderStyle(container: typings.mendixmodelsdk.documenttemplatesMod.documenttemplates.DocumentTemplate): typings.mendixmodelsdk.documenttemplatesMod.documenttemplates.Style = js.native
  /**
    * Creates and returns a new Style instance in the SDK and on the server.
    * The new Style will be automatically stored in the 'style' property
    * of the parent DynamicLabel element passed as argument.
    */
  def createInDynamicLabelUnderStyle(container: typings.mendixmodelsdk.documenttemplatesMod.documenttemplates.DynamicLabel): typings.mendixmodelsdk.documenttemplatesMod.documenttemplates.Style = js.native
  /**
    * Creates and returns a new Style instance in the SDK and on the server.
    * The new Style will be automatically stored in the 'style' property
    * of the parent Grid element passed as argument.
    */
  def createInGridUnderStyle(container: typings.mendixmodelsdk.documenttemplatesMod.documenttemplates.Grid): typings.mendixmodelsdk.documenttemplatesMod.documenttemplates.Style = js.native
  /**
    * Creates and returns a new Style instance in the SDK and on the server.
    * The new Style will be automatically stored in the 'style' property
    * of the parent StaticLabel element passed as argument.
    */
  def createInStaticLabelUnderStyle(container: typings.mendixmodelsdk.documenttemplatesMod.documenttemplates.StaticLabel): typings.mendixmodelsdk.documenttemplatesMod.documenttemplates.Style = js.native
  /**
    * Creates and returns a new Style instance in the SDK and on the server.
    * The new Style will be automatically stored in the 'style' property
    * of the parent TableCell element passed as argument.
    */
  def createInTableCellUnderStyle(container: typings.mendixmodelsdk.documenttemplatesMod.documenttemplates.TableCell): typings.mendixmodelsdk.documenttemplatesMod.documenttemplates.Style = js.native
  /**
    * Creates and returns a new Style instance in the SDK and on the server.
    * The new Style will be automatically stored in the 'style' property
    * of the parent Table element passed as argument.
    */
  def createInTableUnderStyle(container: typings.mendixmodelsdk.documenttemplatesMod.documenttemplates.Table): typings.mendixmodelsdk.documenttemplatesMod.documenttemplates.Style = js.native
  /**
    * Creates and returns a new Style instance in the SDK and on the server.
    * The new Style will be automatically stored in the 'style' property
    * of the parent Title element passed as argument.
    */
  def createInTitleUnderStyle(container: typings.mendixmodelsdk.documenttemplatesMod.documenttemplates.Title): typings.mendixmodelsdk.documenttemplatesMod.documenttemplates.Style = js.native
}

