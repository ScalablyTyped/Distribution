package typings.mendixmodelsdk.pagesMod.pages

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.instancesMod.IList
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.Element
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.microflowsMod.microflows.IMicroflow
import typings.mendixmodelsdk.pagesMod.StructureVersionInfo
import typings.mendixmodelsdk.structuresMod.aliases.Container
import typings.mendixmodelsdk.textsMod.texts.Text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide/on-click-event relevant section in reference guide}
  */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.MicroflowSettings")
@js.native
class MicroflowSettings protected () extends Element[IModel] {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit[IAbstractModel],
    container: AbstractElement[IAbstractModel, Container]
  ) = this()
  
  def asynchronous: Boolean = js.native
  def asynchronous_=(newValue: Boolean): Unit = js.native
  
  def confirmationInfo: ConfirmationInfo | Null = js.native
  def confirmationInfo_=(newValue: ConfirmationInfo | Null): Unit = js.native
  
  def containerAsAssociationWidget: AssociationWidget = js.native
  
  def containerAsAttributeWidget: AttributeWidget = js.native
  
  def containerAsMicroflowClientAction: MicroflowClientAction = js.native
  
  def containerAsMicroflowSource: MicroflowSource = js.native
  
  def containerAsOnClickMicroflow: OnClickMicroflow = js.native
  
  def containerAsReferenceSetSelector: ReferenceSetSelector = js.native
  
  def containerAsSelectorMicroflowSource: SelectorMicroflowSource = js.native
  
  def formValidations: FormValidations = js.native
  def formValidations_=(newValue: FormValidations): Unit = js.native
  
  def microflow: IMicroflow | Null = js.native
  
  def microflowQualifiedName: String | Null = js.native
  
  def microflow_=(newValue: IMicroflow | Null): Unit = js.native
  
  /**
    * In version 7.19.0: introduced
    */
  def parameterMappings: IList[MicroflowParameterMapping] = js.native
  
  def progressBar: ProgressBarType = js.native
  def progressBar_=(newValue: ProgressBarType): Unit = js.native
  
  def progressMessage: Text | Null = js.native
  def progressMessage_=(newValue: Text | Null): Unit = js.native
  
  /**
    * In version 7.19.0: deleted
    */
  def useAllPages: Boolean = js.native
  def useAllPages_=(newValue: Boolean): Unit = js.native
}
object MicroflowSettings {
  
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.MicroflowSettings")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates and returns a new MicroflowSettings instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.MicroflowSettings.create")
  @js.native
  def create(model: IModel): MicroflowSettings = js.native
  
  /**
    * Creates and returns a new MicroflowSettings instance in the SDK and on the server.
    * The new MicroflowSettings will be automatically stored in the 'onChangeMicroflowSettings' property
    * of the parent AssociationWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.12.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.MicroflowSettings.createInAssociationWidgetUnderOnChangeMicroflowSettings")
  @js.native
  def createInAssociationWidgetUnderOnChangeMicroflowSettings(container: AssociationWidget): MicroflowSettings = js.native
  
  /**
    * Creates and returns a new MicroflowSettings instance in the SDK and on the server.
    * The new MicroflowSettings will be automatically stored in the 'onChangeMicroflowSettings' property
    * of the parent AttributeWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.12.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.MicroflowSettings.createInAttributeWidgetUnderOnChangeMicroflowSettings")
  @js.native
  def createInAttributeWidgetUnderOnChangeMicroflowSettings(container: AttributeWidget): MicroflowSettings = js.native
  
  /**
    * Creates and returns a new MicroflowSettings instance in the SDK and on the server.
    * The new MicroflowSettings will be automatically stored in the 'onEnterMicroflowSettings' property
    * of the parent AttributeWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.12.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.MicroflowSettings.createInAttributeWidgetUnderOnEnterMicroflowSettings")
  @js.native
  def createInAttributeWidgetUnderOnEnterMicroflowSettings(container: AttributeWidget): MicroflowSettings = js.native
  
  /**
    * Creates and returns a new MicroflowSettings instance in the SDK and on the server.
    * The new MicroflowSettings will be automatically stored in the 'onLeaveMicroflowSettings' property
    * of the parent AttributeWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.12.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.MicroflowSettings.createInAttributeWidgetUnderOnLeaveMicroflowSettings")
  @js.native
  def createInAttributeWidgetUnderOnLeaveMicroflowSettings(container: AttributeWidget): MicroflowSettings = js.native
  
  /**
    * Creates and returns a new MicroflowSettings instance in the SDK and on the server.
    * The new MicroflowSettings will be automatically stored in the 'microflowSettings' property
    * of the parent MicroflowClientAction element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.MicroflowSettings.createInMicroflowClientActionUnderMicroflowSettings")
  @js.native
  def createInMicroflowClientActionUnderMicroflowSettings(container: MicroflowClientAction): MicroflowSettings = js.native
  
  /**
    * Creates and returns a new MicroflowSettings instance in the SDK and on the server.
    * The new MicroflowSettings will be automatically stored in the 'microflowSettings' property
    * of the parent MicroflowSource element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.MicroflowSettings.createInMicroflowSourceUnderMicroflowSettings")
  @js.native
  def createInMicroflowSourceUnderMicroflowSettings(container: MicroflowSource): MicroflowSettings = js.native
  
  /**
    * Creates and returns a new MicroflowSettings instance in the SDK and on the server.
    * The new MicroflowSettings will be automatically stored in the 'microflowSettings' property
    * of the parent OnClickMicroflow element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.17.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.MicroflowSettings.createInOnClickMicroflowUnderMicroflowSettings")
  @js.native
  def createInOnClickMicroflowUnderMicroflowSettings(container: OnClickMicroflow): MicroflowSettings = js.native
  
  /**
    * Creates and returns a new MicroflowSettings instance in the SDK and on the server.
    * The new MicroflowSettings will be automatically stored in the 'onChangeMicroflowSettings' property
    * of the parent ReferenceSetSelector element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  6.0.0 to 7.12.0
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.MicroflowSettings.createInReferenceSetSelectorUnderOnChangeMicroflowSettings")
  @js.native
  def createInReferenceSetSelectorUnderOnChangeMicroflowSettings(container: ReferenceSetSelector): MicroflowSettings = js.native
  
  /**
    * Creates and returns a new MicroflowSettings instance in the SDK and on the server.
    * The new MicroflowSettings will be automatically stored in the 'dataSourceMicroflowSettings' property
    * of the parent SelectorMicroflowSource element passed as argument.
    */
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.MicroflowSettings.createInSelectorMicroflowSourceUnderDataSourceMicroflowSettings")
  @js.native
  def createInSelectorMicroflowSourceUnderDataSourceMicroflowSettings(container: SelectorMicroflowSource): MicroflowSettings = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.MicroflowSettings.structureTypeName")
  @js.native
  def structureTypeName: String = js.native
  @scala.inline
  def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk/dist/gen/pages", "pages.MicroflowSettings.versionInfo")
  @js.native
  def versionInfo: StructureVersionInfo = js.native
  @scala.inline
  def versionInfo_=(x: StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
}
