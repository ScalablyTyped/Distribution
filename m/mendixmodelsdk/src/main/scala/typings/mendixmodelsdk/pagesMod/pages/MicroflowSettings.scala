package typings.mendixmodelsdk.pagesMod.pages

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.instancesMod.IList
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.Element
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.microflowsMod.microflows.IMicroflow
import typings.mendixmodelsdk.pagesMod.StructureVersionInfo
import typings.mendixmodelsdk.textsMod.texts.Text
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
  @JSName("model")
  var model_FMicroflowSettings: IModel = js.native
  def asynchronous(): Boolean = js.native
  def asynchronous(newValue: Boolean): js.Any = js.native
  def confirmationInfo(): js.Any = js.native
  def confirmationInfo(newValue: ConfirmationInfo): js.Any = js.native
  @JSName("confirmationInfo")
  def confirmationInfo_Union(): ConfirmationInfo | Null = js.native
  def containerAsAssociationWidget(): AssociationWidget = js.native
  def containerAsAttributeWidget(): AttributeWidget = js.native
  def containerAsMicroflowClientAction(): MicroflowClientAction = js.native
  def containerAsMicroflowSource(): MicroflowSource = js.native
  def containerAsOnClickMicroflow(): OnClickMicroflow = js.native
  def containerAsReferenceSetSelector(): ReferenceSetSelector = js.native
  def containerAsSelectorMicroflowSource(): SelectorMicroflowSource = js.native
  def formValidations(): FormValidations = js.native
  def formValidations(newValue: FormValidations): js.Any = js.native
  def microflow(): js.Any = js.native
  def microflow(newValue: IMicroflow): js.Any = js.native
  def microflowQualifiedName(): String | Null = js.native
  @JSName("microflow")
  def microflow_Union(): IMicroflow | Null = js.native
  /**
    * In version 7.19.0: introduced
    */
  def parameterMappings(): IList[MicroflowParameterMapping] = js.native
  def progressBar(): ProgressBarType = js.native
  def progressBar(newValue: ProgressBarType): js.Any = js.native
  def progressMessage(): js.Any = js.native
  def progressMessage(newValue: Text): js.Any = js.native
  @JSName("progressMessage")
  def progressMessage_Union(): Text | Null = js.native
  /**
    * In version 7.19.0: deleted
    */
  def useAllPages(): Boolean = js.native
  def useAllPages(newValue: Boolean): js.Any = js.native
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

