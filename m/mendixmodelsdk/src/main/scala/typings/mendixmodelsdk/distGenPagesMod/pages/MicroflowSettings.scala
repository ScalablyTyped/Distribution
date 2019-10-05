package typings.mendixmodelsdk.distGenPagesMod.pages

import typings.mendixmodelsdk.distGenBaseDashModelMod.IModel
import typings.mendixmodelsdk.distGenMicroflowsMod.microflows.IMicroflow
import typings.mendixmodelsdk.distGenPagesMod.StructureVersionInfo
import typings.mendixmodelsdk.distGenTextsMod.texts.Text
import typings.mendixmodelsdk.distSdkInternalInstancesMod.IList
import typings.mendixmodelsdk.distSdkInternalMod.AbstractElement
import typings.mendixmodelsdk.distSdkInternalMod.AbstractModel
import typings.mendixmodelsdk.distSdkInternalMod.Element
import typings.mendixmodelsdk.distSdkInternalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/starting-microflows relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.MicroflowSettings")
@js.native
class MicroflowSettings protected () extends Element {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  var asynchronous: Boolean = js.native
  var confirmationInfo: ConfirmationInfo | Null = js.native
  val containerAsAssociationWidget: AssociationWidget = js.native
  val containerAsAttributeWidget: AttributeWidget = js.native
  val containerAsMicroflowClientAction: MicroflowClientAction = js.native
  val containerAsMicroflowSource: MicroflowSource = js.native
  val containerAsOnClickMicroflow: OnClickMicroflow = js.native
  val containerAsReferenceSetSelector: ReferenceSetSelector = js.native
  val containerAsSelectorMicroflowSource: SelectorMicroflowSource = js.native
  var formValidations: FormValidations = js.native
  var microflow: IMicroflow | Null = js.native
  val microflowQualifiedName: String | Null = js.native
  @JSName("model")
  var model_MicroflowSettings: IModel = js.native
  /**
    * In version 7.19.0: introduced
    */
  val parameterMappings: IList[MicroflowParameterMapping] = js.native
  var progressBar: ProgressBarType = js.native
  var progressMessage: Text | Null = js.native
  /**
    * In version 7.19.0: deleted
    */
  var useAllPages: Boolean = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.MicroflowSettings")
@js.native
object MicroflowSettings extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new MicroflowSettings instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): MicroflowSettings = js.native
  /**
    * Creates and returns a new MicroflowSettings instance in the SDK and on the server.
    * The new MicroflowSettings will be automatically stored in the 'onChangeMicroflowSettings' property
    * of the parent AssociationWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.12.0
    */
  def createInAssociationWidgetUnderOnChangeMicroflowSettings(container: AssociationWidget): MicroflowSettings = js.native
  /**
    * Creates and returns a new MicroflowSettings instance in the SDK and on the server.
    * The new MicroflowSettings will be automatically stored in the 'onChangeMicroflowSettings' property
    * of the parent AttributeWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.12.0
    */
  def createInAttributeWidgetUnderOnChangeMicroflowSettings(container: AttributeWidget): MicroflowSettings = js.native
  /**
    * Creates and returns a new MicroflowSettings instance in the SDK and on the server.
    * The new MicroflowSettings will be automatically stored in the 'onEnterMicroflowSettings' property
    * of the parent AttributeWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.12.0
    */
  def createInAttributeWidgetUnderOnEnterMicroflowSettings(container: AttributeWidget): MicroflowSettings = js.native
  /**
    * Creates and returns a new MicroflowSettings instance in the SDK and on the server.
    * The new MicroflowSettings will be automatically stored in the 'onLeaveMicroflowSettings' property
    * of the parent AttributeWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.12.0
    */
  def createInAttributeWidgetUnderOnLeaveMicroflowSettings(container: AttributeWidget): MicroflowSettings = js.native
  /**
    * Creates and returns a new MicroflowSettings instance in the SDK and on the server.
    * The new MicroflowSettings will be automatically stored in the 'microflowSettings' property
    * of the parent MicroflowClientAction element passed as argument.
    */
  def createInMicroflowClientActionUnderMicroflowSettings(container: MicroflowClientAction): MicroflowSettings = js.native
  /**
    * Creates and returns a new MicroflowSettings instance in the SDK and on the server.
    * The new MicroflowSettings will be automatically stored in the 'microflowSettings' property
    * of the parent MicroflowSource element passed as argument.
    */
  def createInMicroflowSourceUnderMicroflowSettings(container: MicroflowSource): MicroflowSettings = js.native
  /**
    * Creates and returns a new MicroflowSettings instance in the SDK and on the server.
    * The new MicroflowSettings will be automatically stored in the 'microflowSettings' property
    * of the parent OnClickMicroflow element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.17.0
    */
  def createInOnClickMicroflowUnderMicroflowSettings(container: OnClickMicroflow): MicroflowSettings = js.native
  /**
    * Creates and returns a new MicroflowSettings instance in the SDK and on the server.
    * The new MicroflowSettings will be automatically stored in the 'onChangeMicroflowSettings' property
    * of the parent ReferenceSetSelector element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.12.0
    */
  def createInReferenceSetSelectorUnderOnChangeMicroflowSettings(container: ReferenceSetSelector): MicroflowSettings = js.native
  /**
    * Creates and returns a new MicroflowSettings instance in the SDK and on the server.
    * The new MicroflowSettings will be automatically stored in the 'dataSourceMicroflowSettings' property
    * of the parent SelectorMicroflowSource element passed as argument.
    */
  def createInSelectorMicroflowSourceUnderDataSourceMicroflowSettings(container: SelectorMicroflowSource): MicroflowSettings = js.native
}

