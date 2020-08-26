package typings.mendixmodelsdk.pagesMod.pages

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.customwidgetsMod.customwidgets.WidgetValue
import typings.mendixmodelsdk.instancesMod.IList
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.menusMod.menus.MenuItem
import typings.mendixmodelsdk.microflowsMod.microflows.INanoflow
import typings.mendixmodelsdk.nativepagesMod.nativepages.BottomBarItem
import typings.mendixmodelsdk.pagesMod.StructureVersionInfo
import typings.mendixmodelsdk.textsMod.texts.Text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * In version 7.12.0: removed experimental
  * In version 7.8.0: introduced
  */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.CallNanoflowClientAction")
@js.native
class CallNanoflowClientAction protected () extends ClientAction {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FCallNanoflowClientAction: IModel = js.native
  def confirmationInfo: ConfirmationInfo | Null = js.native
  def confirmationInfo_=(newValue: ConfirmationInfo | Null): Unit = js.native
  /**
    * In version 7.10.0: introduced
    */
  def nanoflow: INanoflow | Null = js.native
  def nanoflowQualifiedName: String | Null = js.native
  def nanoflow_=(newValue: INanoflow | Null): Unit = js.native
  /**
    * In version 7.19.0: introduced
    */
  def parameterMappings: IList[NanoflowParameterMapping] = js.native
  def progressBar: ProgressBarType = js.native
  def progressBar_=(newValue: ProgressBarType): Unit = js.native
  def progressMessage: Text | Null = js.native
  def progressMessage_=(newValue: Text | Null): Unit = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.CallNanoflowClientAction")
@js.native
object CallNanoflowClientAction extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new CallNanoflowClientAction instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): CallNanoflowClientAction = js.native
  /**
    * Creates and returns a new CallNanoflowClientAction instance in the SDK and on the server.
    * The new CallNanoflowClientAction will be automatically stored in the 'action' property
    * of the parent ActionButton element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.8.0 and higher
    */
  def createInActionButtonUnderAction(container: ActionButton): CallNanoflowClientAction = js.native
  /**
    * Creates and returns a new CallNanoflowClientAction instance in the SDK and on the server.
    * The new CallNanoflowClientAction will be automatically stored in the 'action' property
    * of the parent ActionItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.8.0 and higher
    */
  def createInActionItemUnderAction(container: ActionItem): CallNanoflowClientAction = js.native
  /**
    * Creates and returns a new CallNanoflowClientAction instance in the SDK and on the server.
    * The new CallNanoflowClientAction will be automatically stored in the 'onChangeAction' property
    * of the parent AssociationWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.13.0 and higher
    */
  def createInAssociationWidgetUnderOnChangeAction(container: AssociationWidget): CallNanoflowClientAction = js.native
  /**
    * Creates and returns a new CallNanoflowClientAction instance in the SDK and on the server.
    * The new CallNanoflowClientAction will be automatically stored in the 'onChangeAction' property
    * of the parent AttributeWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.13.0 and higher
    */
  def createInAttributeWidgetUnderOnChangeAction(container: AttributeWidget): CallNanoflowClientAction = js.native
  /**
    * Creates and returns a new CallNanoflowClientAction instance in the SDK and on the server.
    * The new CallNanoflowClientAction will be automatically stored in the 'onEnterAction' property
    * of the parent AttributeWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.13.0 and higher
    */
  def createInAttributeWidgetUnderOnEnterAction(container: AttributeWidget): CallNanoflowClientAction = js.native
  /**
    * Creates and returns a new CallNanoflowClientAction instance in the SDK and on the server.
    * The new CallNanoflowClientAction will be automatically stored in the 'onLeaveAction' property
    * of the parent AttributeWidget element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.13.0 and higher
    */
  def createInAttributeWidgetUnderOnLeaveAction(container: AttributeWidget): CallNanoflowClientAction = js.native
  /**
    * Creates and returns a new CallNanoflowClientAction instance in the SDK and on the server.
    * The new CallNanoflowClientAction will be automatically stored in the 'action' property
    * of the parent nativepages.BottomBarItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  def createInBottomBarItemUnderAction(container: BottomBarItem): CallNanoflowClientAction = js.native
  /**
    * Creates and returns a new CallNanoflowClientAction instance in the SDK and on the server.
    * The new CallNanoflowClientAction will be automatically stored in the 'onClickAction' property
    * of the parent DivContainer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.3.0 and higher
    */
  def createInDivContainerUnderOnClickAction(container: DivContainer): CallNanoflowClientAction = js.native
  /**
    * Creates and returns a new CallNanoflowClientAction instance in the SDK and on the server.
    * The new CallNanoflowClientAction will be automatically stored in the 'clickAction' property
    * of the parent DynamicImageViewer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.18.0 and higher
    */
  def createInDynamicImageViewerUnderClickAction(container: DynamicImageViewer): CallNanoflowClientAction = js.native
  /**
    * Creates and returns a new CallNanoflowClientAction instance in the SDK and on the server.
    * The new CallNanoflowClientAction will be automatically stored in the 'action' property
    * of the parent GridActionButton element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.8.0 and higher
    */
  def createInGridActionButtonUnderAction(container: GridActionButton): CallNanoflowClientAction = js.native
  /**
    * Creates and returns a new CallNanoflowClientAction instance in the SDK and on the server.
    * The new CallNanoflowClientAction will be automatically stored in the 'clickAction' property
    * of the parent ListView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.8.0 and higher
    */
  def createInListViewUnderClickAction(container: ListView): CallNanoflowClientAction = js.native
  /**
    * Creates and returns a new CallNanoflowClientAction instance in the SDK and on the server.
    * The new CallNanoflowClientAction will be automatically stored in the 'pullDownAction' property
    * of the parent ListView element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.0.0 and higher
    */
  def createInListViewUnderPullDownAction(container: ListView): CallNanoflowClientAction = js.native
  /**
    * Creates and returns a new CallNanoflowClientAction instance in the SDK and on the server.
    * The new CallNanoflowClientAction will be automatically stored in the 'action' property
    * of the parent menus.MenuItem element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.8.0 and higher
    */
  def createInMenuItemUnderAction(container: MenuItem): CallNanoflowClientAction = js.native
  /**
    * Creates and returns a new CallNanoflowClientAction instance in the SDK and on the server.
    * The new CallNanoflowClientAction will be automatically stored in the 'onChangeAction' property
    * of the parent ReferenceSetSelector element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.13.0 and higher
    */
  def createInReferenceSetSelectorUnderOnChangeAction(container: ReferenceSetSelector): CallNanoflowClientAction = js.native
  /**
    * Creates and returns a new CallNanoflowClientAction instance in the SDK and on the server.
    * The new CallNanoflowClientAction will be automatically stored in the 'clickAction' property
    * of the parent StaticImageViewer element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.8.0 and higher
    */
  def createInStaticImageViewerUnderClickAction(container: StaticImageViewer): CallNanoflowClientAction = js.native
  /**
    * Creates and returns a new CallNanoflowClientAction instance in the SDK and on the server.
    * The new CallNanoflowClientAction will be automatically stored in the 'onEnterKeyPressAction' property
    * of the parent TextBox element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.7.0 and higher
    */
  def createInTextBoxUnderOnEnterKeyPressAction(container: TextBox): CallNanoflowClientAction = js.native
  /**
    * Creates and returns a new CallNanoflowClientAction instance in the SDK and on the server.
    * The new CallNanoflowClientAction will be automatically stored in the 'action' property
    * of the parent customwidgets.WidgetValue element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  7.19.0 and higher
    */
  def createInWidgetValueUnderAction(container: WidgetValue): CallNanoflowClientAction = js.native
}

