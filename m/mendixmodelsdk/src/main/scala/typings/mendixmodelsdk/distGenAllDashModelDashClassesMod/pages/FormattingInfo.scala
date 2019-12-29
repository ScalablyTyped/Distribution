package typings.mendixmodelsdk.distGenAllDashModelDashClassesMod.pages

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenDocumenttemplatesMod.documenttemplates.DataGridColumn
import typings.mendixmodelsdk.distGenDocumenttemplatesMod.documenttemplates.DynamicLabel
import typings.mendixmodelsdk.distGenPagesMod.StructureVersionInfo
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.FormattingInfo")
@js.native
class FormattingInfo protected ()
  extends typings.mendixmodelsdk.distGenPagesMod.pages.FormattingInfo {
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
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.FormattingInfo")
@js.native
object FormattingInfo extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new FormattingInfo instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typings.mendixmodelsdk.distGenPagesMod.pages.FormattingInfo = js.native
  /**
    * Creates and returns a new FormattingInfo instance in the SDK and on the server.
    * The new FormattingInfo will be automatically stored in the 'formattingInfo' property
    * of the parent ClientTemplateParameter element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.15.0 and higher
    */
  def createInClientTemplateParameterUnderFormattingInfo(container: typings.mendixmodelsdk.distGenPagesMod.pages.ClientTemplateParameter): typings.mendixmodelsdk.distGenPagesMod.pages.FormattingInfo = js.native
  /**
    * Creates and returns a new FormattingInfo instance in the SDK and on the server.
    * The new FormattingInfo will be automatically stored in the 'formattingInfo' property
    * of the parent documenttemplates.DataGridColumn element passed as argument.
    */
  def createInDataGridColumnUnderFormattingInfo(container: DataGridColumn): typings.mendixmodelsdk.distGenPagesMod.pages.FormattingInfo = js.native
  /**
    * Creates and returns a new FormattingInfo instance in the SDK and on the server.
    * The new FormattingInfo will be automatically stored in the 'formattingInfo' property
    * of the parent DatePicker element passed as argument.
    */
  def createInDatePickerUnderFormattingInfo(container: typings.mendixmodelsdk.distGenPagesMod.pages.DatePicker): typings.mendixmodelsdk.distGenPagesMod.pages.FormattingInfo = js.native
  /**
    * Creates and returns a new FormattingInfo instance in the SDK and on the server.
    * The new FormattingInfo will be automatically stored in the 'formattingInfo' property
    * of the parent documenttemplates.DynamicLabel element passed as argument.
    */
  def createInDynamicLabelUnderFormattingInfo(container: DynamicLabel): typings.mendixmodelsdk.distGenPagesMod.pages.FormattingInfo = js.native
  /**
    * Creates and returns a new FormattingInfo instance in the SDK and on the server.
    * The new FormattingInfo will be automatically stored in the 'formattingInfo' property
    * of the parent GridColumn element passed as argument.
    */
  def createInGridColumnUnderFormattingInfo(container: typings.mendixmodelsdk.distGenPagesMod.pages.GridColumn): typings.mendixmodelsdk.distGenPagesMod.pages.FormattingInfo = js.native
  /**
    * Creates and returns a new FormattingInfo instance in the SDK and on the server.
    * The new FormattingInfo will be automatically stored in the 'formattingInfo' property
    * of the parent ReferenceSelector element passed as argument.
    */
  def createInReferenceSelectorUnderFormattingInfo(container: typings.mendixmodelsdk.distGenPagesMod.pages.ReferenceSelector): typings.mendixmodelsdk.distGenPagesMod.pages.FormattingInfo = js.native
  /**
    * Creates and returns a new FormattingInfo instance in the SDK and on the server.
    * The new FormattingInfo will be automatically stored in the 'formattingInfo' property
    * of the parent TextBox element passed as argument.
    */
  def createInTextBoxUnderFormattingInfo(container: typings.mendixmodelsdk.distGenPagesMod.pages.TextBox): typings.mendixmodelsdk.distGenPagesMod.pages.FormattingInfo = js.native
}

